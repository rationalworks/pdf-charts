package com.rationalworks.pdfcharts.parser;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.rationalworks.pdfcharts.entity.PCSpecification;

public class PCSpecificationParser {
	private static Log log = LogFactory.getLog(PCSpecificationParser.class);
	
	public static PCSpecification getPCSpecification(JsonNode rootNode)
	{
		PCSpecification spec = new PCSpecification();
		spec.setSchema(rootNode.path("$schema").textValue());
		log.info("Setting specification schema to "  + spec.getSchema());
		spec.setWidth(rootNode.path("width").floatValue());
		log.info("Setting specification width to "  + spec.getWidth());
		spec.setHeight(rootNode.path("height").floatValue());
		log.info("Setting specification height to "  + spec.getHeight());
		spec.setPadding(rootNode.path("padding").floatValue());
		log.info("Setting specification padding to "  + spec.getPadding());
		return spec;
	}
}
