package com.rationalworks.pdfcharts.config.scale;

import com.rationalworks.pdfcharts.config.scale.type.PCScaleType;

/* https://vega.github.io/vega/docs/scales/ */
public class PCScale {
	private String name;
	private PCScaleType type;
	private PCDomain domain;
	private float domainMax;
	private float domainMin;
	private float domainMid;
	private PCScaleRange range;
	private boolean reverse;
	private boolean round;
	private boolean zero;
	private double padding; 
	private boolean nice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PCScaleType getType() {
		return type;
	}
	public void setType(PCScaleType type) {
		this.type = type;
	}
	public PCDomain getDomain() {
		return domain;
	}
	public void setDomain(PCDomain domain) {
		this.domain = domain;
	}
	public float getDomainMax() {
		return domainMax;
	}
	public void setDomainMax(float domainMax) {
		this.domainMax = domainMax;
	}
	public float getDomainMin() {
		return domainMin;
	}
	public void setDomainMin(float domainMin) {
		this.domainMin = domainMin;
	}
	public float getDomainMid() {
		return domainMid;
	}
	public void setDomainMid(float domainMid) {
		this.domainMid = domainMid;
	}
	public PCScaleRange getRange() {
		return range;
	}
	public void setRange(PCScaleRange range) {
		this.range = range;
	}
	public boolean isReverse() {
		return reverse;
	}
	public void setReverse(boolean reverse) {
		this.reverse = reverse;
	}
	public boolean isRound() {
		return round;
	}
	public void setRound(boolean round) {
		this.round = round;
	}
	public boolean isZero() {
		return zero;
	}
	public void setZero(boolean zero) {
		this.zero = zero;
	}
	public double getPadding() {
		return padding;
	}
	public void setPadding(double padding) {
		this.padding = padding;
	}
	public boolean isNice() {
		return nice;
	}
	public void setNice(boolean nice) {
		this.nice = nice;
	}
	@Override
	public String toString() {
		return "PCScale [name=" + name + ", type=" + type + ", domain=" + domain + ", domainMax=" + domainMax
				+ ", domainMin=" + domainMin + ", domainMid=" + domainMid + ", range=" + range + ", reverse=" + reverse
				+ ", round=" + round + ", zero=" + zero + ", padding=" + padding + ", nice=" + nice + "]";
	}

}
