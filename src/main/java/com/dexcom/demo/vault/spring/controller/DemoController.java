package com.dexcom.demo.vault.spring.controller;

import com.dexcom.demo.vault.spring.config.DemoProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    private final DemoProperties demoProperties;

    public DemoController(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    @GetMapping(
            path = "/log-demo-properties"
    )
    public ResponseEntity<Void> logDemoProperties() {
        logger.info("Demo properties username: {}", demoProperties.getUsername());
        logger.info("Demo properties password: {}", demoProperties.getPassword());

        return ResponseEntity.ok().build();
    }
}
