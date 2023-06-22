package com.dining.db;

import java.io.Serializable;
import java.util.List;
import com.dining.db.VO;

public class Protocol implements Serializable {
	// 0: 전체보기
	int cmd;
	int result;
	List<VO> list;
	// 프로토콜에 들어있는 VO가 정답이 아닐까?
	// public인데 왜 getter, setter 있나?
	VO vo;
	
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
	public List<VO> getList() {
		return list;
	}
	public void setList(List<VO> list) {
		this.list = list;
	}
	public VO getVo() {
		return vo;
	}
	public void setVo(VO vo) {
		this.vo = vo;
	}
}
