package com.dining.start;

import java.io.Serializable;
import java.util.List;

public class Protocol implements Serializable{
	// cmd 0번 종료 , 1번 로그인
	public int cmd ;
	public int result;
	public db_VO vo;
	public List<db_VO> list;
	
	// 재훈 페이지 넘버 
	public int page_number ;
	// 재훈 가게이름 담기
	private String store_name ;
	
	// 재훈 검색기능으로 인한 서치 추가 (검색여부 확인후 다시 정보를 불러서 가야하기 때문에 무조건 있어야함)
	private String search ;
	
	// 재훈 이미지 이름값 전달
	private String imgname ;
	
	
	public int getPage_number() {
		return page_number;
	}
	public void setPage_number(int page_number) {
		this.page_number = page_number;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	public int getCmd() {
		return cmd;
	}
	public void setCmd(int cmd) {
		this.cmd = cmd;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public db_VO getVo() {
		return vo;
	}
	public void setVo(db_VO vo) {
		this.vo = vo;
	}
	public List<db_VO> getList() {
		return list;
	}
	public void setList(List<db_VO> list) {
		this.list = list;
	}
}