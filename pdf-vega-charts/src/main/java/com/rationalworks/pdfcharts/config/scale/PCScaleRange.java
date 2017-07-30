package com.rationalworks.pdfcharts.config.scale;

public enum PCScaleRange {
		WIDTH, HEIGHT, SYMBOL, CATEGORY, DIVERGING, ORDINAL, RAMP, HEATMAP, UNKNOWN;
	
	public static PCScaleRange mapPCScaleRange (String pcScaleRange){
			if("width".equalsIgnoreCase(pcScaleRange))
			{
				return PCScaleRange.WIDTH;
			}
			if("height".equalsIgnoreCase(pcScaleRange))
			{
				return PCScaleRange.HEIGHT;
			}
			if("symbol".equalsIgnoreCase(pcScaleRange))
			{
				return PCScaleRange.SYMBOL;
			}
			if("category".equalsIgnoreCase(pcScaleRange))
			{
				return PCScaleRange.CATEGORY;
			}
			if("diverging".equalsIgnoreCase(pcScaleRange))
			{
				return PCScaleRange.DIVERGING;
			}
			if("ordinal".equalsIgnoreCase(pcScaleRange))
			{
				return PCScaleRange.ORDINAL;
			}
			if("ramp".equalsIgnoreCase(pcScaleRange))
			{
				return PCScaleRange.RAMP;
			}
			if("heatmap".equalsIgnoreCase(pcScaleRange))
			{
				return PCScaleRange.HEATMAP;
			}
			return PCScaleRange.UNKNOWN;
		}
}
