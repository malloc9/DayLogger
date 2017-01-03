package hu.malloc.controller;

import hu.malloc.entity.DayLog;
import hu.malloc.repository.DayLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DayLoggerController {

    @Autowired
    DayLogRepository dayLogRepository;

    @RequestMapping("/init")
    public String init() {
        dayLogRepository.save(new DayLog("testValue"));
        return "init successful";
    }

    @RequestMapping("/list")
    public String list() {
        return dayLogRepository.findAll().toString();
    }
}
