package com.hehevideo.model;

/** @version: 
* @Description: 
* videoTypeId	视频类型ID
* videoType		视频类型
* @author: wx
* @date: 
*/ 
public class Videotype {
	private int videoTypeId;
	private String videoType;
	public int getVideoTypeId() {
		return videoTypeId;
	}
	public void setVideoTypeId(int videoTypeId) {
		this.videoTypeId = videoTypeId;
	}
	public Videotype(int videoTypeId, String videoType) {
		super();
		this.videoTypeId = videoTypeId;
		this.videoType = videoType;
	}
	public String getVideoType() {
		return videoType;
	}
	public void setVideoType(String videoType) {
		this.videoType = videoType;
	}
	
}
