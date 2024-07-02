package com.example.todo_list_server.controller;

import com.example.todo_list_server.Mapper.TodoMapper;
import com.example.todo_list_server.dto.RequestTodo;

import com.example.todo_list_server.dto.ResponseTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoApiController {

    // REST API 표준 준수해서 만들기
    // { } - json
    // vue로 보내면 됌


    // /api/todos - GET 조회 (전체)
    // /api/todos - POST 등록
    // /api/todos/{id} - PUT 업데이트
    // /api/todos/{id} - DELETE 삭제
    // /api/todos/2


    @Autowired
    TodoMapper todoMapper;

    @Autowired
    public TodoApiController(TodoMapper todoMapper) {
        this.todoMapper = todoMapper;
    }


    //등록
    @PostMapping("")
    public void save(RequestTodo requestTodo) {

    }

    //수정
    @PutMapping("/{id}")
    public ArrayList<ResponseTodo> update(@PathVariable long id, @RequestBody RequestTodo requestTodo) {
        return todoMapper.getById(id);
    }

    //조회 (내용)
    @GetMapping("")
    public ArrayList<ResponseTodo> readAll() {
        System.out.println(todoMapper.getAllContent());
        return todoMapper.getAllContent();
    }

    //특정 조회
    @GetMapping("/{id}")
    public ArrayList<ResponseTodo> read(@PathVariable long id) {
        System.out.println(todoMapper.getById(id));
        return todoMapper.getById(id);

    }

    //삭제
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {

    }

}
