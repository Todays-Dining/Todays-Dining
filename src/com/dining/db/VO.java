package com.dining.db;

import java.io.Serializable;

public class VO implements Serializable {
//	private String custid, name, address, phone;
	private String diner_no, diner_name, favorited_number, opening_hours, menu, phone_number,
	parking_or_not, food_category, region, address;

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

	public String getparking_or_not() {
		return parking_or_not;
	}

	public void setparking_or_not(String parking_or_not) {
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
	
	
}
