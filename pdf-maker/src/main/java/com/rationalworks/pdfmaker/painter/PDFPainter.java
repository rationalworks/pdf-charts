package com.rationalworks.pdfmaker.painter;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPageContentStream;

public interface PDFPainter {
	void paint(PDDocument doc, PDPageContentStream stream);
}
