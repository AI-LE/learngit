package com.hehevideo.db;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import com.hehevideo.model.Video;

/** @version: 
* @Description: video操作
* @author: wx
* @date: 
*/ 
public class VideoDao {

	//向video表中添加数据,成功返回1
	public static int insertIntoTuser(Video video) {
		int i=0;
		String sql="insert into t_video (videoName,userId,playNum,videoUrl,videoInfo,status,videoTypeId,createTime) values('"+video.getVideoName()+"','"+video.getUserId()+"','"+video.getPlayNum()+"','"+video.getVideoUrl()+"','"+video.getVideoInfo()+"','"+video.getStatus()+"','"+video.getVideoTypeId()+"','"+video.getCreateTime()+"')";
		i=mysqlUtil.add(sql);
		return i;				
	}
	//更新视频审核状态(视频标号，视频状态)
	public static int updateVideoStatus(int videoid,int status)
	{
		int i=0;
		String sql="update t_video set status='"+status+"' where videoId='"+videoid+"'";
		i=mysqlUtil.update(sql);
		return i;
	}
	//通过视频编号删除
	public static int deleteVideo(int videoid)
	{
		int i=0;
		String sql="delete from t_video where videoId='"+videoid+"'";
		i=mysqlUtil.del(sql);
		return i;
	}
	//查询表内所有数据
	public static List selectAll()
	{
		String sql="select * from t_video";
	   List<Map<String, String>> list=mysqlUtil.sel(sql, MysqlConfig.VIDEO);
	   return list;
	}
	//查询表内一条数据
	public static String selectOne(int id)
	{
	  String sql="select * from t_video where videoId='"+id+"'";
	  System.err.println(sql);
	   List<Map<String, String>> list=mysqlUtil.sel(sql, MysqlConfig.VIDEO);
	   Video video = null;
	   DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");     
	   for(Map<String,String> map:list){
			video=new Video(Integer.valueOf(map.get("videoId")),map.get("videoName") , Integer.valueOf(map.get("userId")), Integer.valueOf(map.get("playNum")), map.get("videoUrl"), map.get("videoInfo"), Integer.valueOf(map.get("status")), Integer.valueOf(map.get("videoTypeId")),LocalDate.parse(map.get("createTime"),fmt));
		}
	   return video.toString();
	}
	//查询某种类型的视频
	public static List selectAll(int status,int typeid)
	{
		String sql="select * from t_video where videoTypeId='"+typeid+"'";
	   List<Map<String, String>> list=mysqlUtil.sel(sql, MysqlConfig.VIDEO);
	   return list;
	}
}
