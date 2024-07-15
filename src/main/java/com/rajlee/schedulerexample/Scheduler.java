package com.rajlee.schedulerexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Slf4j
//@EnableAsync
public class Scheduler {

    //@Async  // strat the task execution parallelly
    //@Scheduled(fixedDelay = 1000)
    //@Scheduled(fixedRate = 1000)
    //@Scheduled(cron="0 0 20 * * TUE")
    @Scheduled(cron = "${cron.application.value}")
    public void Scheduler() throws InterruptedException{
        LocalDateTime current=LocalDateTime.now();
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime=current.format(format);
        log.info("Scheduler time "+formattedDateTime);
        Thread.sleep(1000);
    }
}
