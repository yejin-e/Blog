package com.gdsc.blog.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Parameter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Tag(name = "user", description = "사용자 관련 API")
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    @ResponseBody
    @Operation(summary = "로그인", description = "사용자 로그인")
    public String getLoginPage() {
        return "user/login";
    }

    @PostMapping("/login")
    @ResponseBody
    @Operation(summary = "로그인", description = "사용자 로그인")
    public String login(
        @Parameter(name="이름", description="유저 아이디") String username,
        @Parameter(name="비번", description="유저 비밀번호") String password
    ) {
        return "user/login";
    }
}
