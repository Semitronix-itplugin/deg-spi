package com.semitronix.sdk.de.g.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class CustomizeDataSourceConnectorProvider {
    /**
     * 获取所有的 ICustomizeDataSourceConnector 实现
     * 
     * @return 返回 ICustomizeDataSourceConnector 实现列表
     */
    public static List<ICustomizeDataSourceConnector> connectors() {
        List<ICustomizeDataSourceConnector> services = new ArrayList<>();
        ServiceLoader<ICustomizeDataSourceConnector> loader = ServiceLoader.load(ICustomizeDataSourceConnector.class);
        loader.forEach(services::add);
        return services;
    }

    /**
     * 获取指定的format convert 实现
     * 
     * @param connectorName ICustomizeDataSourceConnector 实现名, 类名
     * @return 返回 ICustomizeDataSourceConnector 实现，如果没有找到，则返回null
     */
    public static ICustomizeDataSourceConnector connector(String connectorName) {
        ServiceLoader<ICustomizeDataSourceConnector> loader = ServiceLoader.load(ICustomizeDataSourceConnector.class);
        for (ICustomizeDataSourceConnector provider : loader) {
            if (connectorName.equals(provider.getId())) {
                return provider;
            }
        }

        return null;
    }
}
