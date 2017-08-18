package hu.malloc.controller;

import hu.malloc.entity.DayLog;
import hu.malloc.repository.DayLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DayLoggerController {

    @Autowired
    DayLogRepository dayLogRepository;

    @GetMapping(value="/")
    public String homepage(){
        return "index";
    }

    @GetMapping("/init")
    public void init() {
        dayLogRepository.save(new DayLog("testValue"));
    }

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<DayLog> list() {
        return dayLogRepository.findAll();
    }
}
