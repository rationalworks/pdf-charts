package com.rationalworks.pdfcharts.config.scale.sort;

public class PCSort {
	private PCSortingOperation op;
	private PCSortingOrder order;
	private String field;
	
	public PCSortingOperation getOp() {
		return op;
	}
	public void setOp(PCSortingOperation op) {
		this.op = op;
	}
	public PCSortingOrder getOrder() {
		return order;
	}
	public void setOrder(PCSortingOrder order) {
		this.order = order;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
}
