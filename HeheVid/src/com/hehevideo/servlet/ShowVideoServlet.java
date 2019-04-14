package com.hehevideo.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hehevideo.db.VideoDao;
import com.hehevideo.model.Video;

/**
 * Servlet implementation class ShowVideoServlet
 */
@WebServlet("/ShowVideoServlet")
public class ShowVideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowVideoServlet() {
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
			String s=request.getParameter("typeid");
			List<Map<String,String>> list=null;
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			String json="{\"data\":[";

			if (s.equals("")) {
				list=VideoDao.selectAll();
			}
			else{
				list=VideoDao.selectAll(0,Integer.valueOf(s));
			}
			
			if (list.size()!=0) {
				for(Map<String,String> map:list){
						
					Video video=new Video(Integer.valueOf(map.get("videoId")),map.get("videoName") , Integer.valueOf(map.get("userId")), Integer.valueOf(map.get("playNum")), map.get("videoUrl"), map.get("videoInfo"), Integer.valueOf(map.get("status")), Integer.valueOf(map.get("videoTypeId")),LocalDate.parse(map.get("createTime"),fmt));
					json+=video.toString();
				}
				json=json.substring(0,json.length()-1);
			}

			json+="]}";
			response.getWriter().write(json);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
