package com.mento.model;

public class MemberDTO {

	private String mid;
	private String pwd;
	private String name;
	private int phonenumber;
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public MemberDTO(String mid, String pwd, String name, int phonenumber) {
		super();
		this.mid = mid;
		this.pwd = pwd;
		this.name = name;
		this.phonenumber = phonenumber;
	}
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MemberDTO [mid=" + mid + ", pwd=" + pwd + ", name=" + name
				+ ", phonenumber=" + phonenumber + "]";
	}
	
}
