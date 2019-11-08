package com.cxk.MSS.servlet;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
 import com.cxk.MSS.entity.Easybuy_user;
import com.cxk.MSS.entity.Easybuy_user_address;
import com.cxk.MSS.seiver.AdminLogin;
import com.cxk.MSS.seiver.AdminRegist;
import com.cxk.MSS.seiver.Easybuy_userService;
import com.cxk.MSS.toos.PageBean;

 

@Controller
public class LoginServlet{
	@Autowired
	Easybuy_userService ii;
 
     @RequestMapping("abc/login")
     public String login(@Validated(value={AdminLogin.class})Easybuy_user es,BindingResult r,HttpSession session,Model m){
    	 Easybuy_user ee=ii.Select(es.getLoginName(),es.getPassword());
    	 
    		 if(ee!=null){
    		 	 session.setAttribute("list","ee");
        		 m.addAttribute("dlcg","登录成功");
        		 return "main";
        	 }else{
        		 m.addAttribute("dlcg","登录失败");
        		 return "login";        	  
    	 }		 	 
     }
     
       @RequestMapping("/regist")
	   public String regist(@Validated(value={AdminRegist.class})Easybuy_user user,BindingResult r,Model m){
    	   user.setType(0);
    	   user.setSex(1);
    	   int a=ii.Insert(user);
 		   if(r.hasFieldErrors()){
 			   return "regist";
 		   }		  
		   if(a>0){
			    m.addAttribute("dlcg","注册成功");
	        	return "index";
	        }else{
	        	m.addAttribute("dlcg","注册失败");
	        	return "regist";
	        }         
	  }
       @RequestMapping("/intaddAddress")
       public String addAddress(){
    	   return "WEB-INF/pages/addAddress";
       }
       
       @RequestMapping("/addAddress")
       public String add(Easybuy_user_address adds,Model m){
    	    adds.setCreateTime(new Date());
    	    if(adds.getIsDefault()==null){
    	    	adds.setIsDefault(0);
    	    }
    	    int a=ii.ass(adds);
    	    if(a>0){
    	    	m.addAttribute("dlcg","添加成功");
    	    }else{
    	    	m.addAttribute("dlcg", "添加失败");
    	    }
			return "WEB-INF/pages/addAddress";
       }
       
       @ModelAttribute("userlist")
       public List<Easybuy_user> getd(){
    	   List<Easybuy_user> list=ii.iii();
		return list;   	   
       }
     
     //AJAX验证用户名
       @RequestMapping("/checkLoginName")
       public @ResponseBody String checkLoginName(String zh){
    	   int a=ii.sb(zh);
    	   String rs=null; 
    	   if(a>0){
    		   rs="{\"mag\":1}";
    	   }else{
    		   rs="{\"mag\":0}";
    	   }
    	   return rs;
       }
     @RequestMapping("/eees") 
     public @ResponseBody String Rees(){
    	 List<Easybuy_user> ea=ii.iii();
    	 String json=JSON.toJSONString(ea);
    	 return json;
     }
     @RequestMapping("/userN/{a}/{b}")
     public String UserN(@PathVariable("a") Integer id,@PathVariable("b") Integer userName){
    	 System.out.println(id);
    	 return "index";
     }
     
     @RequestMapping("fye")
     public String Fye(@RequestParam(defaultValue="1")Integer pageIndex,Easybuy_user user,Model m){
    	 int pageSize=2;
    	 int count=ii.num();
    	 int pageCount=(count%pageSize==0)?count/pageSize:count/pageSize+1;
    	 if(pageIndex<1 || pageIndex>pageCount){
    		 pageIndex=1;
    	 }
    	 PageBean pa=new PageBean();
    	 pa.setPageIndex(pageIndex);   	 
    	 pa.setPageCount(pageCount);
    	 pa.setCount(count);
    	 List<Easybuy_user> lista=ii.paging((pageIndex-1)*pageSize, pageSize, user);
    	 pa.setList(lista);
    	 m.addAttribute("pagebean",pa);
    	 return "WEB-INF/pages/list";
     }
     @RequestMapping("/scc/{a}")
     public String Dele(@PathVariable("a") Integer id,Model m){
    	 int dele=ii.del(id);
    	 if(dele>0){
    		 m.addAttribute("sc","删除成功");
    		 return "WEB-INF/pages/list";
    	 }else{
    		 m.addAttribute("sc","删除失败");
    		 return "WEB-INF/pages/list";
    	 }
    	 
     }
     
}

 
