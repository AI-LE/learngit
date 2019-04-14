package com.hehevideo.db;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.hehevideo.model.Comment;
import com.hehevideo.model.User;

public class CommentDao {

	//向user表中添加数据
	public int insertIntoTComment(Comment comment) {
		int i=0;
		String sql="insert into t_comment (userId,videoId,comment,createTime) values('"+comment.getUserId()+"','"+comment.getVideoId()+"','"+comment.getComment()+"','"+LocalDate.now()+"')";
		i=mysqlUtil.add(sql);
		return i;				
	}
	//根据视频id查询comment表
	public List selectComment(int video){

		String sql="select * from t_comment where videoId='"+video+"'";
		List<Map<String,String>> list = mysqlUtil.sel(sql, MysqlConfig.COMMENT);
		return list;
	}
}
