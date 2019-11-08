package com.cxk.MSS.entity;

import org.hibernate.validator.constraints.NotEmpty;

import com.cxk.MSS.seiver.AdminLogin;
import com.cxk.MSS.seiver.AdminRegist;

 

public class Easybuy_user {
	
     private Integer id;
     @NotEmpty(groups={AdminLogin.class,AdminRegist.class},message="�û�������Ϊ�գ�")
     private String loginName;
     @NotEmpty(groups={AdminRegist.class},message="��������Ϊ�գ�")
     private String userName;
     @NotEmpty(groups={AdminLogin.class,AdminRegist.class},message="���벻��Ϊ�գ�")
     private String password;
     @NotEmpty(groups={AdminLogin.class,AdminRegist.class},message="���벻��Ϊ�գ�")
     private String rpassword;
     @NotEmpty(groups={AdminRegist.class},message="�Ա���Ϊ��")
     private Integer sex;
     @NotEmpty(groups={AdminRegist.class},message="���֤����Ϊ��")
     private String identityCode;
     @NotEmpty(groups={AdminRegist.class},message="�����ַ����Ϊ��")
     private String email;
     @NotEmpty(groups={AdminRegist.class},message="�绰����Ϊ��")
     private String mobile;
     private Integer type;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRpassword() {
		return rpassword;
	}
	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getIdentityCode() {
		return identityCode;
	}
	public void setIdentityCode(String identityCode) {
		this.identityCode = identityCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	 
	 
     
}
