package com.example.todo_list_server.Mapper;import com.example.todo_list_server.dto.RequestTodo;import com.example.todo_list_server.dto.ResponseTodo;import org.apache.ibatis.annotations.Mapper;import org.springframework.stereotype.Repository;import java.util.ArrayList;@Mapper@Repositorypublic interface TodoMapper {    ArrayList<ResponseTodo> getById(long id);    ArrayList<ResponseTodo> getAllContent();    void TodoDelete(long content_id);    void addTodo(RequestTodo todo);    int TodoUpdate(RequestTodo requestTodo);}