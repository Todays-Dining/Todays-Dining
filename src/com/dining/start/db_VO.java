package com.dining.start;

import java.io.Serializable;

public class db_VO implements Serializable {
	private String status, id, password, name, email, birthday, password_search_q, password_search_a,
			favorite_list, reported_count, deleted_time, review_number, old_pw, new_pw, update_id, id_for_pwchk,
			pw_for_pwchk, review_score, review_content2;
	private String diner_no, diner_name, favorited_number, opening_hours, menu, phone_number, 
			parking_or_not, food_category, region, address;
	private String review_content, star;
	// 재훈 검색기능으로 인한 서치 추가
	private String search;
	
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getReview_number() {
		return review_number;
	}
	public void setReview_number(String review_number) {
		this.review_number = review_number;
	}
	private String recents;
	
	// password 찾기용으로 만든 변수 (김상우)
	public String getId_for_pwchk() {
		return id_for_pwchk;
	}
	public void setId_for_pwchk(String id_for_pwchk) {
		this.id_for_pwchk = id_for_pwchk;
	}
	public String getPw_for_pwchk() {
		return pw_for_pwchk;
	}
	public void setPw_for_pwchk(String pw_for_pwchk) {
		this.pw_for_pwchk = pw_for_pwchk;
	}
	public String getReview_score() {
		return review_score;
	}
	public void setReview_score(String review_score) {
		this.review_score = review_score;
	}
	public String getReview_content2() {
		return review_content2;
	}
	public void setReview_content2(String review_content2) {
		this.review_content2 = review_content2;
	}
	public String getUpdate_id() {
		return update_id;
	}
	public void setUpdate_id(String update_id) {
		this.update_id = update_id;
	}
	public String getOld_pw() {
		return old_pw;
	}
	public void setOld_pw(String old_pw) {
		this.old_pw = old_pw;
	}
	public String getNew_pw() {
		return new_pw;
	}
	public void setNew_pw(String new_pw) {
		this.new_pw = new_pw;
	}
	
	// 
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPassword_search_q() {
		return password_search_q;
	}
	public void setPassword_search_q(String password_search_q) {
		this.password_search_q = password_search_q;
	}
	public String getPassword_search_a() {
		return password_search_a;
	}
	public void setPassword_search_a(String password_search_a) {
		this.password_search_a = password_search_a;
	}
	public String getFavorite_list() {
		return favorite_list;
	}
	public void setFavorite_list(String favorite_list) {
		this.favorite_list = favorite_list;
	}
	public String getReported_count() {
		return reported_count;
	}
	public void setReported_count(String reported_count) {
		this.reported_count = reported_count;
	}
	public String getDeleted_time() {
		return deleted_time;
	}
	public void setDeleted_time(String deleted_time) {
		this.deleted_time = deleted_time;
	}
	
	public String getDiner_no() {
		return diner_no;
	}
	public void setDiner_no(String diner_no) {
		this.diner_no = diner_no;
	}
	public String getDiner_name() {
		return diner_name;
	}
	public void setDiner_name(String diner_name) {
		this.diner_name = diner_name;
	}
	public String getFavorited_number() {
		return favorited_number;
	}
	public void setFavorited_number(String favorited_number) {
		this.favorited_number = favorited_number;
	}
	public String getOpening_hours() {
		return opening_hours;
	}
	public void setOpening_hours(String opening_hours) {
		this.opening_hours = opening_hours;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getParking_or_not() {
		return parking_or_not;
	}
	public void setParking_or_not(String parking_or_not) {
		this.parking_or_not = parking_or_not;
	}
	public String getFood_category() {
		return food_category;
	}
	public void setFood_category(String food_category) {
		this.food_category = food_category;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReview_content() {
		return review_content;
	}
	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}
	public String getStar() {
		return star;
	}
	public void setStar(String star) {
		this.star = star;
	}
	public String getRecents() {
		return recents;
	}
	public void setRecents(String recents) {
		this.recents = recents;
	}		
}