package com.test;

import java.util.Timer;
import java.util.TimerTask;

/** 
* @author 柯博晓
* @date 创建时间：2017年10月12日 下午3:14:54  
*/

public class ShowTimer {
	private Timer timer;
	private TimerTask timerTask;
	private int tc;
	
	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	public TimerTask getTimerTask() {
		return timerTask;
	}

	public void setTimerTask(TimerTask timerTask) {
		this.timerTask = timerTask;
	}

	public int getTc() {
		return tc;
	}

	public void setTc(int tc) {
		this.tc = tc;
	}


	public ShowTimer() {
		tc = 0;
		timer = new Timer();
		timerTask = new TimerTask() {
			@Override
			public void run() {
				System.out.println("This is the "+tc+"that print!!!");
				tc++;
			}
		};
		timer.schedule(timerTask, 0, 1000);
	}

}
