package kh.spring.dto;

import java.sql.Date;

public class DirectoryDTO {
	private int dirID;
	private String userID;
	private String directoryName;
	private int parentID;
	private int lv;
	private Date crtDate;
	public DirectoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DirectoryDTO(int dirID, String userID, String directoryName, int parentID, int lv, Date crtDate) {
		super();
		this.dirID = dirID;
		this.userID = userID;
		this.directoryName = directoryName;
		this.parentID = parentID;
		this.lv = lv;
		this.crtDate = crtDate;
	}
	public int getDirID() {
		return dirID;
	}
	public void setDirID(int dirID) {
		this.dirID = dirID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getDirectoryName() {
		return directoryName;
	}
	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
	}
	public int getParentID() {
		return parentID;
	}
	public void setParentID(int parentID) {
		this.parentID = parentID;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	public Date getCrtDate() {
		return crtDate;
	}
	public void setCrtDate(Date crtDate) {
		this.crtDate = crtDate;
	}
	
}
