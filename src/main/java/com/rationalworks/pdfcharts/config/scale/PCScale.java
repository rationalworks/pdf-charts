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
	private Object[] domainRaw;
	private Object range;
	private boolean reverse;
	private boolean round;
	private boolean zero;

}
