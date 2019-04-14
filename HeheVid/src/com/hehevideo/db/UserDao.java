package com.hehevideo.db;

import java.util.List;
import java.util.Map;

import com.hehevideo.model.User;

public class UserDao {


	//向user表中添加数据
	public static int insertIntoTuser(User user) {
		int i=0;
		String sql = "insert into t_user(userName,pwd";
		if(!user.getTel().equals(""))
			sql += ",tel";
		sql += ",gender";
		if(!user.getBirthDay().equals(""))
			sql += ",birthday";
		sql += ",status,isAdmin,createTime)" +"values(";     
		sql +="'" + user.getUserName() + "',";
		sql +="'" + user.getPwd() + "',";
		if(!user.getTel().equals(""))
			sql +="'" + user.getBirthDay() + "',";
		sql += user.isGender() + ",";
		if(!user.getBirthDay().equals(""))
			sql += "'" + user.getBirthDay() + "',";
		sql += "1,1,'" + user.getCreateTime() + "')";                      
//		String sql="insert into t_user (userName,pwd,tel,gender,birthDay,status,isAdmin,createTime) values('"+user.getUserName()+"','"+user.getPwd()+"','"+user.getTel()+"','"+user.isGender()+"','"+user.getBirthDay()+"','"+user.isStatus()+"','"+user.isAdmin()+"','"+user.getCreateTime()+"')";
		i=mysqlUtil.add(sql);
		return i;
	}
	//更新user表中的数据
	public static int updateTuser(User user) {
		int i=0;
		String sql="update t_user set tel='"+user.getTel()+"', birthday='"+user.getBirthDay()+"',gender='"+user.isGender()+"'  where userName='"+user.getUserName()+"'";
		i=mysqlUtil.update(sql);
		return i;
	}

	/**
	 * 用户登录方法
	 * @return
	 * 0登录失败 1登录成功 2 密码错误
	 */
	public static int login(User user){
		int i=0;
		String sql="select pwd from t_user where userName='"+user.getUserName() +"'";
		String pwdString=mysqlUtil.getInstance(sql, "pwd");
		if(user.getPwd().equals(pwdString))
		{
			i=1;
		}else{
			i=2;
		}
		return i;
	}
	/**
	 * 查询用户信息，通过用户名查出用户所有信息
	 * @return
	 * user
	 */
	public static List selectOne(User user){

		String sql="select * from t_user where userName='"+user.getUserName()+"'";
		List<Map<String,String>> list = mysqlUtil.sel(sql, MysqlConfig.USER);
		return list;
	}
}
