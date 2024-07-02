package com.example.todo_list_server.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseTodo {
    //서버에서 클라이언트로데이터를 보낼 때 사용
    long id;
    String content_id;
    String content;

}
