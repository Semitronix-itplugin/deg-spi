package com.semitronix.sdk.de.g.parser;

public class WaferSizeConfigVO {
    private String name;
    private float diameter = 300.0f;
    private float margin = 3.0f;
    private float dieWidth = 10.0f;
    private float dieHeight = 10.0f;
    private float dieOffsetX = 0f;
    private float dieOffsetY = 0f;
    private int reticleX = 3;
    private int reticleY = 3;
    private int retOffsetX = 0;
    private int retOffsetY = 0;
    private int notch = 1;
    private int xpositive = 1;
    private int ypositive = 1;
    private int centerX = 0;
    private int centerY = 0;
    private float scribeLineX = 0.08f;
    private float scribeLineY = 0.08f;
    private int offsetBy = 1;
    private Float rectOffsetXInMM = null;
    private Float rectOffsetYInMM = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getMargin() {
        return margin;
    }

    public void setMargin(float margin) {
        this.margin = margin;
    }

    public float getDieWidth() {
        return dieWidth;
    }

    public void setDieWidth(float dieWidth) {
        this.dieWidth = dieWidth;
    }

    public float getDieHeight() {
        return dieHeight;
    }

    public void setDieHeight(float dieHeight) {
        this.dieHeight = dieHeight;
    }

    public float getDieOffsetX() {
        return dieOffsetX;
    }

    public void setDieOffsetX(float dieOffsetX) {
        this.dieOffsetX = dieOffsetX;
    }

    public float getDieOffsetY() {
        return dieOffsetY;
    }

    public void setDieOffsetY(float dieOffsetY) {
        this.dieOffsetY = dieOffsetY;
    }

    public int getReticleX() {
        return reticleX;
    }

    public void setReticleX(int reticleX) {
        this.reticleX = reticleX;
    }

    public int getReticleY() {
        return reticleY;
    }

    public void setReticleY(int reticleY) {
        this.reticleY = reticleY;
    }

    public int getRetOffsetX() {
        return retOffsetX;
    }

    public void setRetOffsetX(int retOffsetX) {
        this.retOffsetX = retOffsetX;
    }

    public int getRetOffsetY() {
        return retOffsetY;
    }

    public void setRetOffsetY(int retOffsetY) {
        this.retOffsetY = retOffsetY;
    }

    public int getNotch() {
        return notch;
    }

    public void setNotch(int notch) {
        this.notch = notch;
    }

    public int getXpositive() {
        return xpositive;
    }

    public void setXpositive(int xpositive) {
        this.xpositive = xpositive;
    }

    public int getYpositive() {
        return ypositive;
    }

    public void setYpositive(int ypositive) {
        this.ypositive = ypositive;
    }

    public int getCenterX() {
        return centerX;
    }

    public void setCenterX(int centerX) {
        this.centerX = centerX;
    }

    public int getCenterY() {
        return centerY;
    }

    public void setCenterY(int centerY) {
        this.centerY = centerY;
    }

    public float getScribeLineX() {
        return scribeLineX;
    }

    public void setScribeLineX(float scribeLineX) {
        this.scribeLineX = scribeLineX;
    }

    public float getScribeLineY() {
        return scribeLineY;
    }

    public void setScribeLineY(float scribeLineY) {
        this.scribeLineY = scribeLineY;
    }

    public int getOffsetBy() {
        return offsetBy;
    }

    public void setOffsetBy(int offsetBy) {
        this.offsetBy = offsetBy;
    }

    public Float getRectOffsetXInMM() {
        return rectOffsetXInMM;
    }

    public void setRectOffsetXInMM(Float rectOffsetXInMM) {
        this.rectOffsetXInMM = rectOffsetXInMM;
    }

    public Float getRectOffsetYInMM() {
        return rectOffsetYInMM;
    }

    public void setRectOffsetYInMM(Float rectOffsetYInMM) {
        this.rectOffsetYInMM = rectOffsetYInMM;
    }
}
