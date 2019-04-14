package com.hehevideo.db;

import java.util.List;
import java.util.Map;

import com.hehevideo.model.Videotips;

public class VideotipsDao {

	//向videotips表中添加数据
	public int insertIntoTvideotips(Videotips vtps) {
		int i=0;
		String sql="insert into t_videotips (videoId,tips) values('"+vtps.getVideoId()+"','"+vtps.gettips()+"')";
		i=mysqlUtil.add(sql);
		return i;				
	}
	//根据videoid查询标签
	public List name(int videoid) {
		String sql="select * from t_videotips where videoId='"+videoid+"'";
		List<Map<String,String>> list = mysqlUtil.sel(sql, MysqlConfig.VIDEOTIPS);
		return list;
	}
}
