package com.dining.start;

import java.io.Serializable;

public class db_VO implements Serializable {
	public String status, id, password, name, email, birthday, password_search_q, password_search_a,
			favorite_list, reported_count, deleted_time, review_no;
	private String diner_no, diner_name, favorited_number, opening_hour, menu, phone_number, 
			parking_or_not, food_category, region, address;
	private String review_content, star;
	private String recents;
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
	public String getReview_no() {
		return review_no;
	}
	public void setReview_no(String review_no) {
		this.review_no = review_no;
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
	public String getOpening_hour() {
		return opening_hour;
	}
	public void setOpening_hour(String opening_hour) {
		this.opening_hour = opening_hour;
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
