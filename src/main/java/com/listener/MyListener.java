package com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/** 
* @author �²���
* @date ����ʱ�䣺2017��8��8�� ����2:20:50  
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
