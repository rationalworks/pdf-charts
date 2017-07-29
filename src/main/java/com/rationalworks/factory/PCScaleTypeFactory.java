package com.rationalworks.factory;

import com.rationalworks.pdfcharts.config.scale.type.PCScaleType;

public class PCScaleTypeFactory {
	public static PCScaleType getScaleType(String type)
	{
		if("band".equalsIgnoreCase(type))
		{
			return new PCScaleType();
		}
		return null;
	}
}
