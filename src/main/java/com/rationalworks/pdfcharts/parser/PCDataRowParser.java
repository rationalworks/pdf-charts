package com.rationalworks.pdfcharts.parser;

import java.util.Iterator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.rationalworks.pdfcharts.data.PCDataRow;

public class PCDataRowParser {
	private static Log log = LogFactory.getLog(PCDataRowParser.class);

	public static PCDataRow getPCDataRow(JsonNode node) {
		PCDataRow pcData = new PCDataRow();
		pcData.setName(node.path("name").textValue());
		JsonNode nodeValues = node.path("values");
		if (nodeValues.isArray()) {
			int i = 0;
			for (final JsonNode objNode : nodeValues) {
				Iterator<String> el = objNode.fieldNames();
				while (el.hasNext()) {
					String elementKey = el.next();
					if(objNode.path(elementKey).isNumber())
					{
						pcData.addValue(i, elementKey, objNode.path(elementKey).asDouble());
					}else if(objNode.path(elementKey).isTextual())
					{
						pcData.addValue(i, elementKey, objNode.path(elementKey).asText());
					}
					
				}
				i++;
			}
			log.info(i-1 + " rows detected for data field with name " + pcData.getName());
		}
		
		return pcData;

	}
}
