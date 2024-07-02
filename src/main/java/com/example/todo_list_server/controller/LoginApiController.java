package com.example.todo_list_server.controller;

import com.example.todo_list_server.Mapper.TodoMapper;
import com.example.todo_list_server.dto.RequestTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class LoginApiController {

    @Autowired
    TodoMapper todoMapper;


    //회원가입
    @PostMapping("/join")
    public void saveMember(@RequestBody RequestTodo requestTodo) {

    }

    //로그인
    @PostMapping("/login")
    public void readMember(@RequestBody RequestTodo requestTodo) {

    }

    //로그아웃
    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}
