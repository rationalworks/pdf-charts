package com.rationalworks.pdfmaker.painter;

import java.awt.Color;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageContentStream;

import com.rationalworks.pdfcharts.VegaChart;
import com.rationalworks.pdfcharts.axes.PCAxis;
import com.rationalworks.pdfcharts.config.scale.PCAxisOrientation;

public class VegaAxisPainter implements PDFPainter {
	private VegaChart chart;

	public VegaAxisPainter(VegaChart chart) {
		this.chart = chart;
	}

	public void paint(PDDocument doc, PDPageContentStream stream) {
		List<PCAxis> axiss = chart.getAxes();
		Iterator<PCAxis> axisitr = axiss.iterator();
		try {
			while (axisitr.hasNext()) {
				PCAxis toDraw = axisitr.next();
				if (toDraw.getOrient().equals(PCAxisOrientation.TOP)) {
					stream.setNonStrokingColor(Color.DARK_GRAY);
					stream.moveTo(chart.getXposition() + chart.getPadding(), chart.getYposition() +chart.getHeight() - chart.getPadding());
					stream.lineTo(chart.getXposition() + chart.getWidth() - chart.getPadding(), chart.getYposition() +chart.getHeight() - chart.getPadding());
					stream.stroke();
				}
				if (toDraw.getOrient().equals(PCAxisOrientation.BOTTOM)) {
					stream.setNonStrokingColor(Color.DARK_GRAY);
					stream.moveTo(chart.getXposition() + chart.getPadding(), chart.getYposition() + chart.getPadding());
					stream.lineTo(chart.getXposition() + chart.getPadding() + chart.getWidth()-(2*chart.getPadding()), chart.getYposition() + chart.getPadding());
					stream.stroke();

				}
				if (toDraw.getOrient().equals(PCAxisOrientation.LEFT)) {
					stream.setNonStrokingColor(Color.DARK_GRAY);
					stream.moveTo(chart.getXposition()+ chart.getPadding(), chart.getYposition() + chart.getPadding());
					stream.lineTo(chart.getXposition()+ chart.getPadding(), chart.getYposition() +chart.getHeight()- chart.getPadding());
					stream.stroke();
				}
				if (toDraw.getOrient().equals(PCAxisOrientation.RIGHT)) {
					stream.setNonStrokingColor(Color.DARK_GRAY);
					stream.moveTo(chart.getXposition() +chart.getWidth() -  chart.getPadding(), chart.getYposition() + chart.getPadding());
					stream.lineTo(chart.getXposition() +chart.getWidth() -  chart.getPadding(), chart.getYposition() +chart.getHeight()- chart.getPadding());
					stream.stroke();
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
