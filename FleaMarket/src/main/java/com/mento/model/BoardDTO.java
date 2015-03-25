package com.mento.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class BoardDTO {

	private String mid;
	private int bid;
	private String category;
	private String title;
	private String btext;
	private String image;		//파일경로 저장
	private CommonsMultipartFile pic;	//파일 업로드하는데 필요
	
	
	@Override
	public String toString() {
		return "BoardDTO [mid=" + mid + ", bid=" + bid + ", category="
				+ category + ", title=" + title + ", btext=" + btext
				+ ", image=" + image + ", pic=" + pic + "]";
	}
	public CommonsMultipartFile getPic() {
		return pic;
	}
	public void setPic(CommonsMultipartFile pic) {
		this.pic = pic;
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
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	public BoardDTO(String mid, int bid, String category, String title,
			String btext, String image, CommonsMultipartFile pic) {
		super();
		this.mid = mid;
		this.bid = bid;
		this.category = category;
		this.title = title;
		this.btext = btext;
		this.image = image;
		this.pic = pic;
	}
	
	public BoardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
