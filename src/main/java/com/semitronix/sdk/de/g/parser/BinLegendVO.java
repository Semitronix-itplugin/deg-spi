package com.semitronix.sdk.de.g.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinLegendVO {
    private List<String> binColumns = new ArrayList<>();
    private Map<Map<String, String>, String> color = new HashMap<>();

    public List<String> getBinColumns() {
        return binColumns;
    }

    public void setBinColumns(List<String> binColumns) {
        this.binColumns = binColumns;
    }

    public Map<Map<String, String>, String> getColor() {
        return color;
    }

    public void setColor(Map<Map<String, String>, String> color) {
        this.color = color;
    }
}
