package com.rationalworks.pdfcharts.entity;

public class PCSpecification {

	private String schema;
	private String description;
	private float width;
	private float height;
	private float padding;
	private PCAutoSize autosize;
	
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
	public float getPadding() {
		return padding;
	}
	public void setPadding(float padding) {
		this.padding = padding;
	}
	public PCAutoSize getAutosize() {
		return autosize;
	}
	public void setAutosize(PCAutoSize autosize) {
		this.autosize = autosize;
	}
	
	/*
	"signals": [],
	  "data": [],
	  "scales": [],
	  "projections": [],
	  "axes": [],
	  "legends": [],
	  "marks": []
	  */
}
