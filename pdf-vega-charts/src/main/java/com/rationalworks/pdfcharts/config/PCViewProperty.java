package com.rationalworks.pdfcharts.config;

import java.awt.Color;

import com.rationalworks.pdfcharts.entity.PCAutoSize;
import com.rationalworks.pdfcharts.entity.PCGroup;

/* https://vega.github.io/vega/docs/config/#view */
public class PCViewProperty {
	PCAutoSize autosize;
	Color backbround;
	PCGroup group;
	
	public PCAutoSize getAutosize() {
		return autosize;
	}
	public void setAutosize(PCAutoSize autosize) {
		this.autosize = autosize;
	}
	public Color getBackbround() {
		return backbround;
	}
	public void setBackbround(Color backbround) {
		this.backbround = backbround;
	}
	public PCGroup getGroup() {
		return group;
	}
	public void setGroup(PCGroup group) {
		this.group = group;
	}
}
