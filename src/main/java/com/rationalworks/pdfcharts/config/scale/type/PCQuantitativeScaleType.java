package com.rationalworks.pdfcharts.config.scale.type;

/* https://vega.github.io/vega/docs/scales/#quantitative */
public class PCQuantitativeScaleType {

	private boolean clamp;
	private String interpolate;
	private boolean nice;
	private boolean zero;
	
	
	public boolean isClamp() {
		return clamp;
	}
	public void setClamp(boolean clamp) {
		this.clamp = clamp;
	}
	public String getInterpolate() {
		return interpolate;
	}
	public void setInterpolate(String interpolate) {
		this.interpolate = interpolate;
	}
	public boolean isNice() {
		return nice;
	}
	public void setNice(boolean nice) {
		this.nice = nice;
	}
	public boolean isZero() {
		return zero;
	}
	public void setZero(boolean zero) {
		this.zero = zero;
	}
}
