package com.rationalworks.pdfcharts.parser;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.rationalworks.pdfcharts.VegaChart;
import com.rationalworks.pdfcharts.axes.PCAxis;
import com.rationalworks.pdfcharts.config.scale.PCScale;
import com.rationalworks.pdfcharts.data.PCData;

public class PCVegaChartParser {
	private static Log log = LogFactory.getLog(PCVegaChartParser.class);
	
	public static VegaChart getVegaChart(JsonNode node)
	{
		VegaChart chart  = new VegaChart();
		chart.setSchema(node.path("$schema").asText());
		chart.setWidth((float)node.path("width").asDouble());
		chart.setHeight((float)node.path("height").asDouble());
		chart.setXposition((float)node.path("xposition").asDouble());
		chart.setYposition((float)node.path("yposition").asDouble());
		chart.setPadding((float)node.path("padding").asDouble());
		
		PCData data = PCDataParser.getPCData(node.path("data"));
		chart.setData(data);
		
		List<PCScale> scales  = PCScaleParser.getPcScale(node.path("scales"));
		chart.setScales(scales);
		
		List<PCAxis> axiss = PCAxesParser.getPCAxis(node.path("axes")) ;
		chart.setAxes(axiss);
		
		log.info("Loaded chart from json "+ chart);
		return chart;
	}
}
