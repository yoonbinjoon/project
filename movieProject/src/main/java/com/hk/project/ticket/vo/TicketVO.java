package com.hk.project.ticket.vo;

import java.util.Date;

public class TicketVO {
	
	private String id;
	private String ticketNo;
	private String screenDateNo;
	private String screenNo;
	private String seatNo;
	private String age;
	private String mid;
	//리뷰유무확인차
	private int score;
	//예매현황
	private Date screenTime;
	private String mTITLE;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
	public String getScreenDateNo() {
		return screenDateNo;
	}
	public void setScreenDateNo(String screenDateNo) {
		this.screenDateNo = screenDateNo;
	}
	public String getScreenNo() {
		return screenNo;
	}
	public void setScreenNo(String screenNo) {
		this.screenNo = screenNo;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Date getScreenTime() {
		return screenTime;
	}
	public void setScreenTime(Date screenTime) {
		this.screenTime = screenTime;
	}
	public String getmTITLE() {
		return mTITLE;
	}
	public void setmTITLE(String mTITLE) {
		this.mTITLE = mTITLE;
	}
	
	
	@Override
	public String toString() {
		return "TicketVO [id=" + id + ", ticketNo=" + ticketNo + ", screenDateNo=" + screenDateNo + ", screenNo="
				+ screenNo + ", seatNo=" + seatNo + ", age=" + age + ", mid=" + mid + ", score=" + score
				+ ", screenTime=" + screenTime + ", mTITLE=" + mTITLE + "]";
	}
	
	
	
	
	

}
