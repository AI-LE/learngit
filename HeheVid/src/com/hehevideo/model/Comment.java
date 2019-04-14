package com.hehevideo.model;

import java.time.LocalDate;

/** @version: 
* @Description: 
* commentId	评论ID
* userId	用户ID
* videoId	视频ID
* comment	评论内容
* createTime评论时间
* @author: wx
* @date: 
*/ 
public class Comment {
	private int commentId;
	private int userId;
	private int videoId;
	private String comment;
	private LocalDate createTime;
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public LocalDate getCreateTime() {
		return createTime;
	}
	public void setCreateTime(LocalDate createTime) {
		this.createTime = createTime;
	}
}
