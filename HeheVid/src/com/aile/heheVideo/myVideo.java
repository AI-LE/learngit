package com.aile.heheVideo;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aile.db.mysqlUtil;

/**
 * Servlet implementation class myVideo
 */
@WebServlet("/myVideo")
public class myVideo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myVideo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json; charset=utf-8");
		String sql = "select * from t_video";
		String json = "{\"data\":[";
		List<Map<String, String>> list = mysqlUtil.show(sql, new String[] { "videoUrl" });
		for (Map<String, String> m : list)
		{ 
			  json += "{";
		      for (String k : m.keySet()) 
		      { 
		        json += "\"" + k + "\" :\"" + m.get(k) + "\","; 
		      } 
		      json = json.substring(0, json.length() - 1);
		      json += "},";
		}
		json = json.substring(0, json.length() - 1);
		json += "]}";
//		String json = "{\"d\":[{\"name\":\"lisi\"}]}";
		System.out.println(json);
		response.getWriter().write(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
