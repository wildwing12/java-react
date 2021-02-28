package com.java.javareact.controller;

import com.java.javareact.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping("/api")
@Slf4j
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/login")
    public ResponseEntity<?> loginApi(@RequestBody Map<String,Object> param, HttpSession session) throws Exception {
        long start = System.currentTimeMillis();
        log.debug("Login logic started...");
        Map<String,Object> loginResult = memberService.login(param, session);
        long end = System.currentTimeMillis();
        double time = (end-start)/1000.0;
        log.debug("Login logic took {}",(time)+" seconds.");
        log.debug("Login logic ended...");

        return new ResponseEntity<>(loginResult, HttpStatus.OK);
    }

}
