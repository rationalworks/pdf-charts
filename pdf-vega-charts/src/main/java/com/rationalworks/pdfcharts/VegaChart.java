package com.rationalworks.pdfcharts;

import java.util.List;

import com.rationalworks.pdfcharts.axes.PCAxis;
import com.rationalworks.pdfcharts.config.scale.PCScale;
import com.rationalworks.pdfcharts.data.PCData;

/* https://vega.github.io/vega/docs/specification/ */

/*
 * 
 * {
  "$schema": "https://vega.github.io/schema/vega/v3.0.json",
  "description": "A specification outline example.",
  "width": 500,
  "height": 200,
  "padding": 5,
  "autosize": "pad",

  "signals": [],
  "data": [],
  "scales": [],
  "projections": [],
  "axes": [],
  "legends": [],
  "marks": []
	}
 */
public class VegaChart {
	private String schema;
	private String description;
	private float width;
	private float height;
	private float xposition;
	private float yposition;
	private float padding;
	private PCData data;
	private List<PCScale> scales;
	private List<PCAxis> axes;
	
	public String getSchema() {
		return schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getXposition() {
		return xposition;
	}
	public void setXposition(float xposition) {
		this.xposition = xposition;
	}
	public float getYposition() {
		return yposition;
	}
	public void setYposition(float yposition) {
		this.yposition = yposition;
	}
	public float getPadding() {
		return padding;
	}
	public void setPadding(float padding) {
		this.padding = padding;
	}
	public PCData getData() {
		return data;
	}
	public void setData(PCData data) {
		this.data = data;
	}
	public List<PCScale> getScales() {
		return scales;
	}
	public void setScales(List<PCScale> scales) {
		this.scales = scales;
	}
	public List<PCAxis> getAxes() {
		return axes;
	}
	public void setAxes(List<PCAxis> axes) {
		this.axes = axes;
	}
	@Override
	public String toString() {
		return "VegaChart [schema=" + schema + ", description=" + description + ", width=" + width + ", height="
				+ height + ", xposition=" + xposition + ", yposition=" + yposition + ", padding=" + padding + ", data="
				+ data + ", scales=" + scales + ", axes=" + axes + "]";
	}
}
