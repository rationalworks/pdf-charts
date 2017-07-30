package com.rationalworks.pdfmaker.painter;

import java.awt.Color;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageContentStream;

import com.rationalworks.pdfcharts.VegaChart;

public class VegaChartPainter implements PDFPainter {

	private VegaChart chart;

	public VegaChartPainter(VegaChart chart) {
		this.chart = chart;
	}

	public void paint(PDDocument doc, PDPageContentStream stream) {
		try {
			stream.setNonStrokingColor(Color.DARK_GRAY);
			stream.addRect(chart.getXposition(), chart.getYposition(), chart.getWidth(), chart.getHeight());
			stream.stroke();
			//stream.addRect(chart.getXposition() + chart.getPadding(), chart.getYposition() + chart.getPadding(),
			//		chart.getWidth() - (chart.getPadding() * 2), chart.getHeight() - (chart.getPadding() * 2));
			//stream.stroke();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		VegaAxisPainter ap = new VegaAxisPainter(chart);
		ap.paint(doc, stream);

	}
}
