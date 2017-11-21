package com.aoyang.health.admin.quartz;

import java.util.Date;

public class TestQuartz {

	public void run() {
		System.out.println(new Date() + " : 执行定时任务！");
	}
}
