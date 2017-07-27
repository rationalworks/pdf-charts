package com.rationalworks.pdfcharts.data;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class PCDataRow {
	private String name;
	private Table<Integer, String, Object> values;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Table<Integer, String, Object> getValues() {
		return values;
	}
	public void setValues(Table<Integer, String, Object> values) {
		this.values = values;
	}
	public void addValue(Integer rowSequence, String columnName, Object value)
	{
		if(null == values)
		{
			values = HashBasedTable.create();
		}
		values.put(rowSequence, columnName, value);
	}
	@Override
	public String toString() {
		return "PCDataRow [name=" + name + ", values=" + values + "]";
	}
}
