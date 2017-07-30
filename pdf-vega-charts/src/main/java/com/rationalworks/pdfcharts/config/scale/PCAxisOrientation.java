package com.rationalworks.pdfcharts.config.scale;

public enum PCAxisOrientation {
		TOP, BOTTOM, LEFT, RIGHT, UNKNOWN;
	
	public static PCAxisOrientation mapPCAxisOrientation (String pcScaleRange){
			if("top".equalsIgnoreCase(pcScaleRange))
			{
				return PCAxisOrientation.TOP;
			}
			if("bottom".equalsIgnoreCase(pcScaleRange))
			{
				return PCAxisOrientation.BOTTOM;
			}
			if("left".equalsIgnoreCase(pcScaleRange))
			{
				return PCAxisOrientation.LEFT;
			}
			if("right".equalsIgnoreCase(pcScaleRange))
			{
				return PCAxisOrientation.RIGHT;
			}
			return PCAxisOrientation.UNKNOWN;
		}
}
