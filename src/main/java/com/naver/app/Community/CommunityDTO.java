package com.naver.app.Community;

import java.sql.Date;

public class CommunityDTO {

	private Long num;
	private String title;
	private String name; 
	private String countents;
	private Date createTime;
	private Integer star;
	
	
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCountents() {
		return countents;
	}
	public void setCountents(String countents) {
		this.countents = countents;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getStar() {
		return star;
	}
	public void setStar(Integer star) {
		this.star = star;
	}
	
	
	
}
