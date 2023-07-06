package com.dining.start;

import java.io.Serializable;
import java.util.List;

public class Protocol implements Serializable{
	// cmd 0번 종료 , 1번 로그인 
	//41~50번 관리자 페이지 41 리뷰페이지 리뷰 모두 불러오기 42 리뷰페이지 가게이름 검색 불러오기 , 43 리뷰페이지 회원 아이디 검색 불러오기
	public int cmd ;
	public int result;
	public db_VO vo;
	public List<db_VO> list;
	
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
