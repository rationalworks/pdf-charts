package com.rationalworks.pdfcharts.parser;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.rationalworks.pdfcharts.axes.PCAxis;

public class PCAxesParser {
	private static Log log = LogFactory.getLog(PCAxesParser.class);
	
	public static List<PCAxis> getPCAxis(JsonNode node)
	{
		List<PCAxis> axiss = new ArrayList<PCAxis>();
		if (node.isArray()) {
		    for (final JsonNode objNode : node) {
		    	PCAxis axis = new PCAxis();
		    	axis.setOrient(objNode.path("orient").asText());
		    	axis.setScale(objNode.path("scale").asText());
		        axiss.add(axis);
		        log.info("Loaded axis with scale " + axis.getScale());
		    }
		}
		return axiss;
	}
}
