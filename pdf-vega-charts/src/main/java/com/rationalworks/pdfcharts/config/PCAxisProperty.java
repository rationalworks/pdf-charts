package com.rationalworks.pdfcharts.config;

import java.awt.Color;

import org.apache.pdfbox.pdmodel.font.PDFont;

/* https://vega.github.io/vega/docs/config/#axes */
public class PCAxisProperty {
	private float bandPosition;
	private boolean domain;
	private Color domainColor;
	private float domainWidth;
	private boolean grid;
	private Color gridColor;
	private float[] gridDash;
	private float gridOpacity;
	private float gridWidth;
	private boolean labels;
	private float labelAngle;
	private Color labelColor;
	private PDFont labelFont;
	private float labelFontSize;
	private float labelLimit;
	private float labelPadding;
	private float maxExtent;
	private float minExtent;
	private boolean ticks;
	private Color tickColor;
	private boolean tickExtra;
	private float tickOffset;
	private boolean tickRound;
	private float tickSize;
	private float tickWidth;
	private String titleAlign;
	private float titleAngle;
	private String titleBaseline;
	private String titleColor;
	private PDFont titleFont;
	private float titleFontSize;
	private float titleFontWeight;
	private float titleLimit;
	private float titlePadding;
	private float titleX;
	private float titleY;
	
	public float getBandPosition() {
		return bandPosition;
	}
	public void setBandPosition(float bandPosition) {
		this.bandPosition = bandPosition;
	}
	public boolean isDomain() {
		return domain;
	}
	public void setDomain(boolean domain) {
		this.domain = domain;
	}
	public Color getDomainColor() {
		return domainColor;
	}
	public void setDomainColor(Color domainColor) {
		this.domainColor = domainColor;
	}
	public float getDomainWidth() {
		return domainWidth;
	}
	public void setDomainWidth(float domainWidth) {
		this.domainWidth = domainWidth;
	}
	public boolean isGrid() {
		return grid;
	}
	public void setGrid(boolean grid) {
		this.grid = grid;
	}
	public Color getGridColor() {
		return gridColor;
	}
	public void setGridColor(Color gridColor) {
		this.gridColor = gridColor;
	}
	public float[] getGridDash() {
		return gridDash;
	}
	public void setGridDash(float[] gridDash) {
		this.gridDash = gridDash;
	}
	public float getGridOpacity() {
		return gridOpacity;
	}
	public void setGridOpacity(float gridOpacity) {
		this.gridOpacity = gridOpacity;
	}
	public float getGridWidth() {
		return gridWidth;
	}
	public void setGridWidth(float gridWidth) {
		this.gridWidth = gridWidth;
	}
	public boolean isLabels() {
		return labels;
	}
	public void setLabels(boolean labels) {
		this.labels = labels;
	}
	public float getLabelAngle() {
		return labelAngle;
	}
	public void setLabelAngle(float labelAngle) {
		this.labelAngle = labelAngle;
	}
	public Color getLabelColor() {
		return labelColor;
	}
	public void setLabelColor(Color labelColor) {
		this.labelColor = labelColor;
	}
	public PDFont getLabelFont() {
		return labelFont;
	}
	public void setLabelFont(PDFont labelFont) {
		this.labelFont = labelFont;
	}
	public float getLabelFontSize() {
		return labelFontSize;
	}
	public void setLabelFontSize(float labelFontSize) {
		this.labelFontSize = labelFontSize;
	}
	public float getLabelLimit() {
		return labelLimit;
	}
	public void setLabelLimit(float labelLimit) {
		this.labelLimit = labelLimit;
	}
	public float getLabelPadding() {
		return labelPadding;
	}
	public void setLabelPadding(float labelPadding) {
		this.labelPadding = labelPadding;
	}
	public float getMaxExtent() {
		return maxExtent;
	}
	public void setMaxExtent(float maxExtent) {
		this.maxExtent = maxExtent;
	}
	public float getMinExtent() {
		return minExtent;
	}
	public void setMinExtent(float minExtent) {
		this.minExtent = minExtent;
	}
	public boolean isTicks() {
		return ticks;
	}
	public void setTicks(boolean ticks) {
		this.ticks = ticks;
	}
	public Color getTickColor() {
		return tickColor;
	}
	public void setTickColor(Color tickColor) {
		this.tickColor = tickColor;
	}
	public boolean isTickExtra() {
		return tickExtra;
	}
	public void setTickExtra(boolean tickExtra) {
		this.tickExtra = tickExtra;
	}
	public float getTickOffset() {
		return tickOffset;
	}
	public void setTickOffset(float tickOffset) {
		this.tickOffset = tickOffset;
	}
	public boolean isTickRound() {
		return tickRound;
	}
	public void setTickRound(boolean tickRound) {
		this.tickRound = tickRound;
	}
	public float getTickSize() {
		return tickSize;
	}
	public void setTickSize(float tickSize) {
		this.tickSize = tickSize;
	}
	public float getTickWidth() {
		return tickWidth;
	}
	public void setTickWidth(float tickWidth) {
		this.tickWidth = tickWidth;
	}
	public String getTitleAlign() {
		return titleAlign;
	}
	public void setTitleAlign(String titleAlign) {
		this.titleAlign = titleAlign;
	}
	public float getTitleAngle() {
		return titleAngle;
	}
	public void setTitleAngle(float titleAngle) {
		this.titleAngle = titleAngle;
	}
	public String getTitleBaseline() {
		return titleBaseline;
	}
	public void setTitleBaseline(String titleBaseline) {
		this.titleBaseline = titleBaseline;
	}
	public String getTitleColor() {
		return titleColor;
	}
	public void setTitleColor(String titleColor) {
		this.titleColor = titleColor;
	}
	public PDFont getTitleFont() {
		return titleFont;
	}
	public void setTitleFont(PDFont titleFont) {
		this.titleFont = titleFont;
	}
	public float getTitleFontSize() {
		return titleFontSize;
	}
	public void setTitleFontSize(float titleFontSize) {
		this.titleFontSize = titleFontSize;
	}
	public float getTitleFontWeight() {
		return titleFontWeight;
	}
	public void setTitleFontWeight(float titleFontWeight) {
		this.titleFontWeight = titleFontWeight;
	}
	public float getTitleLimit() {
		return titleLimit;
	}
	public void setTitleLimit(float titleLimit) {
		this.titleLimit = titleLimit;
	}
	public float getTitlePadding() {
		return titlePadding;
	}
	public void setTitlePadding(float titlePadding) {
		this.titlePadding = titlePadding;
	}
	public float getTitleX() {
		return titleX;
	}
	public void setTitleX(float titleX) {
		this.titleX = titleX;
	}
	public float getTitleY() {
		return titleY;
	}
	public void setTitleY(float titleY) {
		this.titleY = titleY;
	}
}
