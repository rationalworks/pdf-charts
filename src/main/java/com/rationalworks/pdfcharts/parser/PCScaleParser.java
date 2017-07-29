package com.rationalworks.pdfcharts.parser;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.rationalworks.factory.PCScaleTypeFactory;
import com.rationalworks.pdfcharts.config.scale.PCDomain;
import com.rationalworks.pdfcharts.config.scale.PCScale;

public class PCScaleParser {

private static Log log = LogFactory.getLog(PCDataParser.class);
	
	public static List<PCScale> getPcScale(JsonNode node){
		List<PCScale> scales = new ArrayList<PCScale>();
		
		if (node.isArray()) {
		    for (final JsonNode objNode : node) {
		    	PCScale scale = new PCScale();
		    	scale.setName(objNode.path("name").asText());
		    	scale.setType(PCScaleTypeFactory.getScaleType(objNode.path("type").asText()));
		    	scale.setRound(objNode.path("round").asBoolean());
		    	scale.setPadding(objNode.path("padding").asDouble());
		    	scale.setNice(objNode.path("nice").asBoolean());
		    	PCDomain domain = PCDomainParser.getDomain(objNode.path("domain"));
		    	scale.setDomain(domain);
		    	scales.add(scale);
		    	log.info("Parsed a sacle "+scale);
		    }
		}
		return scales;
	}
}
