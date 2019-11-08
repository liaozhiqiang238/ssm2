package com.cxk.MSS.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cxk.MSS.entity.Easybuy_user;
import com.cxk.MSS.entity.Easybuy_user_address;

public interface Easyubuy_userDao {
     public Easybuy_user cx(@Param("loginName")String loginName,@Param("password")String password);
     public int insert(Easybuy_user user);
     public int SB(String loginName);
     public List<Easybuy_user> gun();
     public int ass(Easybuy_user_address easy);
     public List<Easybuy_user> Paging(@Param("pageIndex")Integer pageIndex,@Param("pageSize")Integer pageSize,@Param("u") Easybuy_user user);
     public int Count();
     public int Dele(int id);
} 
