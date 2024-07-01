package com.example.todo_list_server.Mapper;

import com.example.todo_list_server.dto.RequestTodo;
import com.example.todo_list_server.dto.ResponseTodo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoMapper {
    ResponseTodo findById(long member_id);
    void save(RequestTodo requestTodo);
    void update(RequestTodo requestTodo);
    void deleteById(long member_id);
    void signUp(String email, String passwd);
}
