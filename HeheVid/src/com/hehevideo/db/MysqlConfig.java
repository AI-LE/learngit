package com.hehevideo.db;

public class MysqlConfig {
	
	public final static String [] COMMENT = {"commentId","userId","videoId","comment","createTime"};
	public final static String [] USER = {"userId","userName","pwd","tel","gender","birthDay","gender","status","isAdmin","createTime"};
	public final static String [] VIDEO = {"videoId","videoName","userId","playNum","videoUrl","videoInfo","status","videoTypeId","createTime"};
	public final static String [] VIDEOPLAYNUM = {"playNumId","videoId","playNum","playDate","dateType"};
	public final static String [] VIDEOTIPS = {"videoTipsId","videoId","tip"};
	public final static String [] VIDEOTYPE = {"videoTypeId","videoType"};
}
