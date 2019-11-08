package com.cxk.MSS.seiver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//日期格式转换
import org.springframework.core.convert.converter.Converter;

public class AdminDate implements  Converter<String, Date> {
    
	public Date convert(String arg0) {
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-mm-dd");
		try {
			Date d=sim.parse(arg0);
			return d;
		} catch (ParseException e) {
			 
			e.printStackTrace();
		}
		return null;
	}
}
