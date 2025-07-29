package com.semitronix.sdk.de.g.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class FormatConverterProvider {
    /**
     * 获取所有的format converter实现
     * 
     * @return 返回FormatConverter 实现列表
     */
    public static List<FormatConverter> converters() {
        List<FormatConverter> services = new ArrayList<>();
        ServiceLoader<FormatConverter> loader = ServiceLoader.load(FormatConverter.class);
        loader.forEach(services::add);
        return services;
    }

    /**
     * 获取指定的format convert 实现
     * 
     * @param converterName format convert 实现名, 类名
     * @return 返回 format convert 实现，如果没有找到，则返回null
     */
    public static FormatConverter converter(String converterName) {
        ServiceLoader<FormatConverter> loader = ServiceLoader.load(FormatConverter.class);
        for (FormatConverter provider : loader) {
            if (converterName.equals(provider.getClass().getName())) {
                return provider;
            }
        }

        return null;
    }
}
