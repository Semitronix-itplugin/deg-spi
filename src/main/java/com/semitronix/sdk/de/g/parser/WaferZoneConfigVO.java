package com.semitronix.sdk.de.g.parser;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class WaferZoneConfigVO {
    private String id;
    private String name;
    private String waferConfig;
    private float diameter = 300f;
    private float margin = 3f;
    private float dieWidth = 2.234f;
    private float dieHeight = 4.52f;
    private int reticuleSizeX = 11;
    private int reticuleSizeY = 7;
    private float dieOffsetX = 0f;
    private float dieOffsetY = 0f;
    private int reticuleOffsetX = 0;
    private int reticuleOffsetY = 0;
    private int notch = 1;
    private Float scribeLineX = 0.08f;
    private Float scribeLineY = 0.08f;
    private List<ZoneDieVO> dies = new ArrayList<>();
}
