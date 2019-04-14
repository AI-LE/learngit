package com.aile.heheVideo;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aile.db.mysqlUtil;
import com.hehevideo.db.UserDao;
import com.hehevideo.model.User;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json; charset=utf-8");
		String Account = request.getParameter("Account");//获取到 html 中传过来的account的值
		String Password = request.getParameter("Password");
		String Tel = request.getParameter("Tel");
		int Gender = Integer.parseInt(request.getParameter("gender"));
		String date = request.getParameter("date");
		LocalDate createTime = LocalDate.now();
		User user = new User(Account,Password,Tel,Gender,date,1,1,createTime);
		int i = UserDao.insertIntoTuser(user);
		if(i == 1)
			response.getWriter().write("{\"data\":[]}");
		else
			response.getWriter().write("");
//		String sql = "insert into t_user(userName,pwd";
//		if(!Tel.equals(""))
//			sql += ",tel";
//		sql += ",gender";
//		if(!date.equals(""))
//			sql += ",birthday";
//		sql += ",status,isAdmin,createTime)" +"values(";     
//		sql +="'" + Account + "',";
//		sql +="'" + Password + "',";
//		if(!Tel.equals(""))
//			sql +="'" + Tel + "',";
//		sql += Gender + ",";
//		if(!date.equals(""))
//			sql += "'" + date + "',";
//		sql += "1,1,'" + createTime + "')";                                                                                                    ;
//		mysqlUtil.add(sql);
//		String json = "{\"data\":[";
//		List<Map<String, String>> list = mysqlUtil.show(sql, new String[] { "userName","Pwd" });
//		for (Map<String, String> m : list)
//		{ 
//			  json += "{";
//		      for (String k : m.keySet()) 
//		      { 
//		        json += "\"" + k + "\" :\"" + m.get(k) + "\","; 
//		      } 
//		      json = json.substring(0, json.length() - 1);
//		      json += "},";
//		}
//		json = json.substring(0, json.length() - 1);
//		json += "]}";
//		System.out.println(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
