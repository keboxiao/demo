package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 柯博晓
 * @date 创建时间：2017年8月8日 下午3:51:05
 */

public class TableController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String myjson = "{\"d_update_time\":\"2017-08-03 14:46:40.0\",\"i_enum_id\":\"560\",\"i_enum_value\":\"1\",\"s_enum_meaning\":\"来自EMS采集\",\"s_enum_type\":\"DATA_SOURCE\",\"s_remark\":\"修改测试\"}";
		out.print(myjson);
		out.flush();
		out.close();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	
}
