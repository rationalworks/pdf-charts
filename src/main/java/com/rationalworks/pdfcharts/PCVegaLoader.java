package com.rationalworks.pdfcharts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.github.fge.jackson.JsonLoader;

public class PCVegaLoader {
	private static Log log = LogFactory.getLog(PCVegaLoader.class);
	
	public static JsonNode  load(String filePath)
	{
		try {
			File config = new File(filePath);
			log.info("Loading configuration from "+ config.getAbsolutePath());
			return JsonLoader.fromFile(config);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static JsonNode  load(File jsonFile)
	{
		try {
			log.info("Loading configuration from "+ jsonFile.getAbsolutePath());
			return JsonLoader.fromFile(jsonFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
