package com.rationalworks.pdfcharts.config.scale.type;

public class PCBandScaleType extends PCDiscreteScaleType{
	private double align = 0.5;
	private double padding;
	private double paddingInner;
	private double paddingOuter;
	
	public double getAlign() {
		return align;
	}
	public void setAlign(double align) {
		this.align = align;
	}
	public double getPadding() {
		return padding;
	}
	public void setPadding(double padding) {
		this.padding = padding;
	}
	public double getPaddingInner() {
		return paddingInner;
	}
	public void setPaddingInner(double paddingInner) {
		this.paddingInner = paddingInner;
	}
	public double getPaddingOuter() {
		return paddingOuter;
	}
	public void setPaddingOuter(double paddingOuter) {
		this.paddingOuter = paddingOuter;
	}
}
