package com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/** 
* @author 柯博晓
* @date 创建时间：2017年8月8日 下午2:20:50  
*/

public class MyListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext sct=sce.getServletContext();
		sct.setAttribute("test", "my_test");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

}
