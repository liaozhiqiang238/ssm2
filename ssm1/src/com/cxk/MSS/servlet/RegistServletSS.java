package com.cxk.MSS.servlet;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class RegistServletSS{
	    @RequestMapping("/Upfile")
       	public String Upfile(MultipartFile zp,HttpServletRequest req) throws Exception, IOException{
       		String name=zp.getOriginalFilename();//��ȡԭʼ�ļ���
       		File file=new File(req.getRealPath("manage")+"/"+name);
       		zp.transferTo(file);//д�����
			return "index";
       		
       	}
}         
	  


