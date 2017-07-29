package com.rationalworks.pdfcharts;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.rationalworks.pdfcharts.data.PCData;
import com.rationalworks.pdfcharts.data.PCDataRow;
import com.rationalworks.pdfcharts.entity.PCSpecification;
import com.rationalworks.pdfcharts.parser.PCDataParser;
import com.rationalworks.pdfcharts.parser.PCSpecificationParser;
import com.rationalworks.pdfcharts.res.ResLoader;

public class PCVegaLoaderTest {

	String configFile = ResLoader.class.getResource("bar-chart.json").getFile();
	JsonNode doc = PCVegaLoader.load(configFile);
	
	@Test
	public void testLoadingJsoConfiguration() {
		
		JsonNode nameNode = doc.path("$schema");
		Assert.assertEquals("https://vega.github.io/schema/vega/v3.0.json", nameNode.asText());
	}
	
	@Test
	public void testSpecificationParsing() {
		PCSpecification spec = PCSpecificationParser.getPCSpecification(doc);
		Assert.assertEquals(400, spec.getWidth(), 0.1);
		Assert.assertEquals(200, spec.getHeight(), 0.1);
		Assert.assertEquals(5, spec.getPadding(), 0.1);
	}
	
	@Test
	public void testDataParsing() {
		JsonNode data = doc.path("data");
		PCData pcData = PCDataParser.getPCData(data);
		PCDataRow row = pcData.getData().get(0);
		Assert.assertEquals(row.getName(),"table");
		
	}

}
