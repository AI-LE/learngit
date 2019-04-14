package com.hehevideo.model;

/** @version: 
* @Description: 
* videotipssId	视频标签ID
* videoId		视频ID
* tips			标签
* @author: wx
* @date: 
*/ 
public class Videotips {
	private int videotipssId;
	private int videoId;
	private String tips;
	public int getVideotipssId() {
		return videotipssId;
	}
	public Videotips(int videoId, String tips) {
		super();
		this.videoId = videoId;
		this.tips = tips;
	}
	public void setVideotipssId(int videotipssId) {
		this.videotipssId = videotipssId;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String gettips() {
		return tips;
	}
	public void settips(String tips) {
		this.tips = tips;
	}
}
