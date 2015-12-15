package com.hr.util;

import java.util.ArrayList;
import java.util.List;

public class PageModel<T> {
	//共allRecord条记录
	private int allRecord;
	// 每页maxRecord条记录
	private int maxRecord;
	//共allPage页
	private int allPage;
	//第currPage页
	private int currPage;
	//本页的结果集
	private  List<T> resultList = new ArrayList<T>();;

	
	
	//取得第一页
	public int getFristPageNo(){
		return 1;
	}
	
	//取得上一页
	public int getPreviosPageNo(){
		if(currPage<=1){
			return 1;
		}
		return currPage -1;
	}
	
	//取得下一页
	public int getNextPageNo(){
		if(currPage>=getAllPage()){
			return getAllPage();
		}
		return currPage+1;
	}
	
	//取得最后一页
	public int getBottomPageNo(){
		return getAllPage();
	}
	public int getAllRecord() {
		return allRecord;
	}

	public void setAllRecord(int allRecord) {
		this.allRecord = allRecord;
	}

	public int getMaxRecord() {
		return maxRecord;
	}

	public void setMaxRecord(int maxRecord) {
		this.maxRecord = maxRecord;
	}
	//获得总页数
	public int getAllPage() {
		return (allRecord+maxRecord-1)/maxRecord;
	}
	public int getAllPage(int allRecord,int maxRecord) {
		return (allRecord+maxRecord-1)/maxRecord;
	}
	public void setAllPage(int allPage) {
		this.allPage = allPage;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public List<T> getResultList() {
		return resultList;
	}

	public void setResultList(List<T> resultList) {
		this.resultList = resultList;
	}

	@Override
	public String toString() {
		return "PageModel [allPage=" + allPage + ", allRecord=" + allRecord
				+ ", currPage=" + currPage + ", maxRecord=" + maxRecord
				+ ", resultList=" + resultList + "]";
	}
	
/*	<div class="pager">
	共${sessionScope.xxxForm.pageModel.allRecord}条记录
	 每页
	<html:text property="pageModel.maxRecord" size="2"></html:text>条
	第${sessionScope.xxxForm.pageModel.currPage}页/
	共${sessionScope.xxxForm.pageModel.allPage}页
	<a href="right.do?o=toUserList&param=firstPage">第一页</a>
	<a href="right.do?o=toUserList&param=previosPage">上一页</a>
	<a href="right.do?o=toUserList&param=nextPage">下一页</a>
	<a href="right.do?o=toUserList&param=lastPage">最后一页</a>
	转到
	<html:text property="pageModel.currPage" size="2"></html:text>页
	<button width="20" onclick="add();">GO</button>
</div>*/
	
}
