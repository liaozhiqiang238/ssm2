package com.cxk.MSS.seiver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxk.MSS.dao.Easyubuy_userDao;
import com.cxk.MSS.entity.Easybuy_user;
import com.cxk.MSS.entity.Easybuy_user_address;

@Service
public class Easybuy_userServiceimpl implements Easybuy_userService{
	@Autowired	 
	public Easyubuy_userDao dao;
	public Easybuy_user Select(String loginName,String password) {
		 return dao.cx(loginName, password);
	}
	
	public int Insert(Easybuy_user user){
		 return dao.insert(user);
	 }
	
	public List<Easybuy_user> iii() {		 
		return dao.gun();
	}
	
	public int ass(Easybuy_user_address easy) {
		 
		return dao.ass(easy);
	}
	
    public Easyubuy_userDao getDao() {
		return dao;
	}

	public void setDao(Easyubuy_userDao dao) {
		this.dao = dao;
	}

	public int sb(String zh) {
		
		return dao.SB(zh);
	}

	public List<Easybuy_user> paging(Integer pageIndex, Integer pageSize,
			Easybuy_user user) {		 
		return dao.Paging(pageIndex, pageSize, user);
	}

	public int num() {
		 
		return dao.Count();
	}

	public int del(int id) {
		 
		return dao.Dele(id);
	}

	 

		
}
