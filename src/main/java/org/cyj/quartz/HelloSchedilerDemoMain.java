package org.cyj.quartz;

import org.quartz.*;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

public class HelloSchedilerDemoMain {
    public static void main(String[] args) throws SchedulerException, InterruptedException {
    	// 1:调度器（Scheduler），从工厂中获取
        SchedulerFactory schedFact = new org.quartz.impl.StdSchedulerFactory();
        Scheduler sched = schedFact.getScheduler();

        sched.start();

        //2：任务实例（JobDetail）
        JobDetail job = JobBuilder.newJob(HelloJob.class)
                .withIdentity("myJob", "group1") // name "myJob", group "group1"
                .build();
        //3：触发器（Trriger）
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("myTrigger", "group1")
                .startNow()//马上启动
                .withSchedule(simpleSchedule()
                        .withIntervalInSeconds(10)
                        .repeatForever())
                .build();

        sched.scheduleJob(job, trigger);
        Thread.sleep(20000);
        sched.scheduleJob(job, trigger);

        Thread.sleep(40000);

        sched.shutdown();
    }
}
