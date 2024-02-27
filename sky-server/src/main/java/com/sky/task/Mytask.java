package com.sky.task;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.zip.DataFormatException;

/**
 * ClassName: Mytask
 * Package: com.sky.task
 * Description:
 *
 * @Author Submerge--WangDong
 * @Create 2024-02-27 8:29
 * @Version 1.0
 */
@Component
@Slf4j
public class Mytask {
    /**
     * 定时任务 每隔5秒执行一次
     */
//    @Scheduled(cron = "0/5 * * * * ?")
    public void executeTask() {
        log.info("定时任务开始执行：{}", new Date());
    }
}
