package com.rationalworks.pdfcharts.parser;

import com.fasterxml.jackson.databind.JsonNode;
import com.rationalworks.pdfcharts.config.scale.PCDomain;

public class PCDomainParser {
	public static PCDomain getDomain(JsonNode node)
	{
		PCDomain domain = new PCDomain();
		domain.setData(node.path("data").asText());
		domain.setField(node.path("field").asText());
		return domain;
		
	}
}
