package com.example.todo_list_server.controller;

import com.example.todo_list_server.Mapper.TodoMapper;
import com.example.todo_list_server.dto.RequestTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/login")
public class LoginApiController {

    @Autowired
    TodoMapper todoMapper;


    //회원가입
    @PostMapping("/join")
    public void saveMember(@RequestBody RequestTodo requestTodo) {

    }

}
