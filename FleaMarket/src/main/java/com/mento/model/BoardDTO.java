package com.mento.model;

public class BoardDTO {

	private String mid;
	private int bid;
	private String category;
	private String title;
	private String btext;
	@Override
	public String toString() {
		return "BoardDTO [mid=" + mid + ", bid=" + bid + ", category="
				+ category + ", title=" + title + ", btext=" + btext + "]";
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBtext() {
		return btext;
	}
	public void setBtext(String btext) {
		this.btext = btext;
	}
	public BoardDTO(String mid, int bid, String category, String title,
			String btext) {
		super();
		this.mid = mid;
		this.bid = bid;
		this.category = category;
		this.title = title;
		this.btext = btext;
	}
	public BoardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
