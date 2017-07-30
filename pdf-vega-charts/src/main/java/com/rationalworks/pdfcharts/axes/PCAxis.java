package com.rationalworks.pdfcharts.axes;

import com.rationalworks.pdfcharts.config.scale.PCAxisOrientation;

/* https://vega.github.io/vega/docs/axes/ */
public class PCAxis {
	private String scale;
	private PCAxisOrientation orient;
	private boolean domain;
	private String format;
	private boolean grid;
	private String gridScale;
	private boolean labels;
	private float labelPadding;
	private boolean labelOverlap;
	private float minExtent;
	private float maxExtent;
	private float offset;
	private float position;
	private boolean ticks;
	private float tickCount;
	private float tickSize;
	private String title;
	private float titlePadding;
	
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public PCAxisOrientation getOrient() {
		return orient;
	}
	public void setOrient(PCAxisOrientation orient) {
		this.orient = orient;
	}
	public boolean isDomain() {
		return domain;
	}
	public void setDomain(boolean domain) {
		this.domain = domain;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public boolean isGrid() {
		return grid;
	}
	public void setGrid(boolean grid) {
		this.grid = grid;
	}
	public String getGridScale() {
		return gridScale;
	}
	public void setGridScale(String gridScale) {
		this.gridScale = gridScale;
	}
	public boolean isLabels() {
		return labels;
	}
	public void setLabels(boolean labels) {
		this.labels = labels;
	}
	public float getLabelPadding() {
		return labelPadding;
	}
	public void setLabelPadding(float labelPadding) {
		this.labelPadding = labelPadding;
	}
	public boolean isLabelOverlap() {
		return labelOverlap;
	}
	public void setLabelOverlap(boolean labelOverlap) {
		this.labelOverlap = labelOverlap;
	}
	public float getMinExtent() {
		return minExtent;
	}
	public void setMinExtent(float minExtent) {
		this.minExtent = minExtent;
	}
	public float getMaxExtent() {
		return maxExtent;
	}
	public void setMaxExtent(float maxExtent) {
		this.maxExtent = maxExtent;
	}
	public float getOffset() {
		return offset;
	}
	public void setOffset(float offset) {
		this.offset = offset;
	}
	public float getPosition() {
		return position;
	}
	public void setPosition(float position) {
		this.position = position;
	}
	public boolean isTicks() {
		return ticks;
	}
	public void setTicks(boolean ticks) {
		this.ticks = ticks;
	}
	public float getTickCount() {
		return tickCount;
	}
	public void setTickCount(float tickCount) {
		this.tickCount = tickCount;
	}
	public float getTickSize() {
		return tickSize;
	}
	public void setTickSize(float tickSize) {
		this.tickSize = tickSize;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getTitlePadding() {
		return titlePadding;
	}
	public void setTitlePadding(float titlePadding) {
		this.titlePadding = titlePadding;
	}
	@Override
	public String toString() {
		return "PCAxis [scale=" + scale + ", orient=" + orient + ", domain=" + domain + ", format=" + format + ", grid="
				+ grid + ", gridScale=" + gridScale + ", labels=" + labels + ", labelPadding=" + labelPadding
				+ ", labelOverlap=" + labelOverlap + ", minExtent=" + minExtent + ", maxExtent=" + maxExtent
				+ ", offset=" + offset + ", position=" + position + ", ticks=" + ticks + ", tickCount=" + tickCount
				+ ", tickSize=" + tickSize + ", title=" + title + ", titlePadding=" + titlePadding + "]";
	}
	
}
