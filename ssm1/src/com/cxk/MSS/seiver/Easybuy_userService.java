package com.cxk.MSS.seiver;

import java.util.List;

import com.cxk.MSS.entity.Easybuy_user;
import com.cxk.MSS.entity.Easybuy_user_address;


 
public interface Easybuy_userService {
	public Easybuy_user Select(String loginName,String password);
    public int Insert(Easybuy_user user);
    public List<Easybuy_user> iii();
    public int ass(Easybuy_user_address easy);
    
    public int sb(String loginName);
    public List<Easybuy_user> paging(Integer pageIndex,Integer pageSize,Easybuy_user user);
    public int num();
    public int del(int id);
} 
