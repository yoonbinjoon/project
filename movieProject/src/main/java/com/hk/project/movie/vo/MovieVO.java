package com.hk.project.movie.vo;

public class MovieVO {

	private String mid;
	private String poster;
	private String link;
	private String title;
	private String content;
	private String genre;
	private int runTime;
	private String director;
	private String cast;
	private String age;
	private String type;
	private String openDate;
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getRunTime() {
		return runTime;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOpenDate() {
		return openDate;
	}
	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}
	@Override
	public String toString() {
		return "MovieVO [mid=" + mid + ", poster=" + poster + ", link=" + link + ", title=" + title + ", content="
				+ content + ", genre=" + genre + ", runTime=" + runTime + ", director=" + director + ", cast=" + cast
				+ ", age=" + age + ", type=" + type + ", openDate=" + openDate + "]";
	}
	
	public MovieVO() {}
}
