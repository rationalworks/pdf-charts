package com.rationalworks.pdfcharts.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PCData {
	private List<PCDataRow> data;

	public void addData(PCDataRow dataRow) {
		if(null == data)
		{
			data = new ArrayList<PCDataRow>();
		}
		data.add(dataRow);
	}

	public List<PCDataRow> getData() {
		return data;
	}


	public void setData(List<PCDataRow> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<PCDataRow> dataItr = data.iterator();
		while(dataItr.hasNext())
		{
			sb.append(dataItr.next());
			sb.append("\n");
		}
		return sb.toString();
	}
}
