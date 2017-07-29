package com.rationalworks.pdfcharts;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rationalworks.pdfcharts.data.PCData;
import com.rationalworks.pdfcharts.data.PCDataRow;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Log log = LogFactory.getLog(App.class);
	
    public static void main( String[] args )
    {
    	log.info("Begin");
    	PCDataRow r1 = new PCDataRow();
    	r1.setName("table");
    	r1.addValue(1, "category", "A");
    	r1.addValue(1, "amount", 28);
    	r1.addValue(2, "category", "B");
    	r1.addValue(2, "amount", 55);
    	r1.addValue(2, "category", "C");
    	r1.addValue(2, "amount", 34);
    	r1.addValue(2, "category", "D");
    	r1.addValue(2, "amount", 56);
    	r1.addValue(2, "category", "E");
    	r1.addValue(2, "amount", 24);
    	r1.addValue(2, "category", "F");
    	r1.addValue(2, "amount", 35);
    
    	
    
    	PCData data  = new PCData();
    	data.addData(r1);
    	System.out.println(data);
    	log.info("End");
    	
    }
}
