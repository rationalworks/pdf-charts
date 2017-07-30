package com.rationalworks.pdfmaker;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;

import com.fasterxml.jackson.databind.JsonNode;
import com.rationalworks.pdfcharts.PCVegaLoader;
import com.rationalworks.pdfcharts.VegaChart;
import com.rationalworks.pdfcharts.parser.PCVegaChartParser;
import com.rationalworks.pdfmaker.painter.PDFPainter;
import com.rationalworks.pdfmaker.painter.VegaChartPainter;

public class Test {

	public static void main(String[] args) {
		// ResLoader.class.getResource("bar-chart.json").getFile();
		File configf = new File("G:/Projects/pdf-charts/pdf-vega-charts/src/test/java/com/rationalworks/pdfcharts/res/"
				+ "bar-chart.json");
		JsonNode doc = PCVegaLoader.load(configf);
		
		VegaChart c = PCVegaChartParser.getVegaChart(doc);
		PDFPainter painter = new VegaChartPainter(c);
		
		
		
		PDDocument pdoc = new PDDocument();
		PDPage page = new PDPage();
		pdoc.addPage(page);
		try {
			PDPageContentStream stream = new PDPageContentStream(pdoc,page);
			painter.paint(pdoc, stream);;
			stream.close();
			pdoc.save("save.pdf");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
