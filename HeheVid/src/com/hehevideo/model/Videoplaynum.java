package com.hehevideo.model;

import java.time.LocalDate;

/** @version: 
* @Description: 
* playNumId	视频播放量ID
* videoId	视频ID
* playNum	视频播放数量
* playDate	该数量统计所在时间
* dateType	排行标识（0表示日排行，1表示周排行，2表示月排行，3表示季排行，4表示年排行）
* @author: wx
* @date: 
*/ 
public class Videoplaynum {
	private int playNumId;
	private int videoId;
	private int playNum;
	private LocalDate playDate;
	
	public Videoplaynum(int videoId, int playNum, LocalDate playDate,
			int dateType) {
		super();
		this.videoId = videoId;
		this.playNum = playNum;
		this.playDate = playDate;
		this.dateType = dateType;
	}
	private int dateType;
	public int getPlayNumId() {
		return playNumId;
	}
	public void setPlayNumId(int playNumId) {
		this.playNumId = playNumId;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public int getPlayNum() {
		return playNum;
	}
	public void setPlayNum(int playNum) {
		this.playNum = playNum;
	}
	public LocalDate getPlayDate() {
		return playDate;
	}
	public void setPlayDate(LocalDate playDate) {
		this.playDate = playDate;
	}
	public int getDateType() {
		return dateType;
	}
	public void setDateType(int dateType) {
		this.dateType = dateType;
	}
}
