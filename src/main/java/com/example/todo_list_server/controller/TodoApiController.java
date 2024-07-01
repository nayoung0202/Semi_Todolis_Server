package com.example.todo_list_server.controller;

import com.example.todo_list_server.dto.RequestTodo;

import com.example.todo_list_server.dto.ResponseTodo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TodoApiController {


    //등록
    @PostMapping("/save/{id}")
    public void save(@PathVariable RequestTodo requestTodo) {

    }

    //수정
    @PostMapping("/update")
    public void update(@PathVariable RequestTodo requestTodo) {

    }

    //조회
    @GetMapping("/read")
    public void read(@PathVariable ResponseTodo responseTodo) {

    }

    //삭제
    @DeleteMapping("/delete")
    public void delete(@PathVariable long content_id) {

    }

}
