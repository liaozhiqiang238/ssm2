package com.cxk.MSS.toos;

import java.util.List;

import com.cxk.MSS.entity.Easybuy_user;

public class PageBean {
    private Integer pageIndex;
    private Integer pageCount;
    private Integer count;
    private List<Easybuy_user> list;
	public Integer getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	 
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<Easybuy_user> getList() {
		return list;
	}
	public void setList(List<Easybuy_user> list) {
		this.list = list;
	}
    
}
