package com.rationalworks.pdfcharts.config.scale;

import com.rationalworks.pdfcharts.config.scale.sort.PCSort;
import com.rationalworks.pdfcharts.data.PCData;

/* https://vega.github.io/vega/docs/scales/#domain */
public class PCDomain {
	private String data;
	private String field;
	private PCSort sort;
	
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
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "PCDomain [data=" + data + ", field=" + field + ", sort=" + sort + "]";
	}
}
