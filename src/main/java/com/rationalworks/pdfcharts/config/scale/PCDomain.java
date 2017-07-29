package com.rationalworks.pdfcharts.config.scale;

import com.rationalworks.pdfcharts.config.scale.sort.PCSort;
import com.rationalworks.pdfcharts.data.PCData;

/* https://vega.github.io/vega/docs/scales/#domain */
public class PCDomain {
	private PCData data;
	private String field;
	private PCSort sort;
	
	public PCData getData() {
		return data;
	}
	public void setData(PCData data) {
		this.data = data;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public PCSort getSort() {
		return sort;
	}
	public void setSort(PCSort sort) {
		this.sort = sort;
	}
}
