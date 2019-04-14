package com.hehevideo.model;

import java.time.LocalDate;

/** @version: 
* @Description: 
* videoId	视频ID
* videoName	视频名称	
* userId	用户ID
* playNum	视频播放量
* videoUrl	视频路径
* videoInfo	视频信息
* status	视频状态1表示审核通过，0审核未通过，2表示未审核
* videoTypeId视频类型ID
* createTime视频创建时间
* @author: wx
* @date: 
*/ 
public class Video {
	@Override
	public String toString() {
		String json="{\"videoId\":\"" + videoId + "\", \"videoName\":\"" + videoName
				+ "\", \"userId\":\"" + userId + "\", \"playNum\":\"" + playNum + "\", \"videoUrl\":\""
				+ videoUrl + "\", \"videoInfo\":\"" + videoInfo + "\", \"status\":\"" + status
				+ "\", \"videoTypeId\":\"" + videoTypeId + "\", \"createTime\":\"" + createTime
				+ "\"},";
		return json;
		
	}
	private int videoId;
	private String videoName;
	private int userId;
	private int playNum;
	private String videoUrl;
	private String videoInfo;
	private int status;
	private int videoTypeId;
	private LocalDate createTime;
	public Video(String videoName, int userId, int playNum, String videoUrl,
			String videoInfo, int status, int videoTypeId, LocalDate createTime) {
		super();
		this.videoName = videoName;
		this.userId = userId;
		this.playNum = playNum;
		this.videoUrl = videoUrl;
		this.videoInfo = videoInfo;
		this.status = status;
		this.videoTypeId = videoTypeId;
		this.createTime = createTime;
	}
	

	public Video(int videoId, String videoName, int userId, int playNum,
			String videoUrl, String videoInfo, int status, int videoTypeId,
			LocalDate createTime) {
		super();
		this.videoId = videoId;
		this.videoName = videoName;
		this.userId = userId;
		this.playNum = playNum;
		this.videoUrl = videoUrl;
		this.videoInfo = videoInfo;
		this.status = status;
		this.videoTypeId = videoTypeId;
		this.createTime = createTime;
	}


	public Video(int videoId, String videoName) {
		super();
		this.videoId = videoId;
		this.videoName = videoName;
	}


	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getPlayNum() {
		return playNum;
	}
	public void setPlayNum(int playNum) {
		this.playNum = playNum;
	}
	public String getVideoUrl() {
		return videoUrl;
	}
	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}
	public String getVideoInfo() {
		return videoInfo;
	}
	public void setVideoInfo(String videoInfo) {
		this.videoInfo = videoInfo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getVideoTypeId() {
		return videoTypeId;
	}
	public void setVideoTypeId(int videoTypeId) {
		this.videoTypeId = videoTypeId;
	}
	public LocalDate getCreateTime() {
		return createTime;
	}
	public void setCreateTime(LocalDate createTime) {
		this.createTime = createTime;
	}
	
}
