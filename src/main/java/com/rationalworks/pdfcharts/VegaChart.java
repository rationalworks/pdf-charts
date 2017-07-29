package com.rationalworks.pdfcharts;

import com.rationalworks.pdfcharts.data.PCData;
import com.rationalworks.pdfcharts.entity.PCAutoSize;

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
	private float padding;
	private PCAutoSize autosize;
	
	/* Not required */
	//private PCSignals signals;
	
	private PCData[] data;
}
