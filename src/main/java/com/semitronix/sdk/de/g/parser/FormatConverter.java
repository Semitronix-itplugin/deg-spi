package com.semitronix.sdk.de.g.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用于从文件中导出单个table的数据转换接口
 */
public interface FormatConverter {
    /**
     * 将输入数据文件转换成标准的csv格式数据文件
     * 
     * @param inputs 数据文件的路径
     * @param output 输出csv的路径
     */
    void convert(String[] inputs, String output) throws Exception;

    /**
     * 指定列类型
     */
    default Map<String, Integer> getUserDefinedColumnTypes() {
        return new HashMap<>();
    }

    /**
     * 返回定制Parser绑定的用户名
     */
    default String getCustomer() {
        return "";
    }

    /**
     * 返回定制Parser的id
     */
    default String getId() {
        return this.getClass().getCanonicalName();
    }

    /**
     * 获取定制Parser的显示名
     */
    String getDisplayName();

    /**
     * file chooser是否要对文件进行过滤
     * 
     * @return 空表示可以选择任意扩展名的文件，不为空， 表示选择指定扩展名的文件
     */
    default List<String> getFileFilters() {
        return new ArrayList<>();
    }

    /**
     * 实际支持文件选择框多选
     * 
     * @return true代表支持，false代表不支持
     */
    default boolean isAllMultiple() {
        return true;
    }
}
