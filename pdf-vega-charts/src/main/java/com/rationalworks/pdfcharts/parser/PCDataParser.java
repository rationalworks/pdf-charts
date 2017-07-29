package com.rationalworks.pdfcharts.parser;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.rationalworks.pdfcharts.data.PCData;
import com.rationalworks.pdfcharts.data.PCDataRow;

public class PCDataParser {
	private static Log log = LogFactory.getLog(PCDataParser.class);
	
	public static PCData getPCData(JsonNode node){
		PCData pcData = new PCData();
		if (node.isArray()) {
		    for (final JsonNode objNode : node) {
		        PCDataRow newRow = PCDataRowParser.getPCDataRow(objNode);
		        pcData.addData(newRow);
		    }
		}
		log.info("Parsed complete data field");
		return pcData;
		
	}

}
