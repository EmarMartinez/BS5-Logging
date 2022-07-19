package com.bosonit.BS5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class controller {

    @GetMapping("/testerror")
    public void giveError() {
        log.error("Error en controller");
    }
    @GetMapping("/testwarning")
    public void giveWarning() {
        log.warn("Warning en controller");
    }
    @GetMapping("/testinfo")
    public void giveInfo() {
        log.info("Info en controller");
    }

}
