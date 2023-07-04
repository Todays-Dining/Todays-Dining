package com.dining.start;

import java.io.Serializable;
import java.util.List;

public class Protocol implements Serializable{
	// cmd 0번 종료 , 1번 로그인
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
