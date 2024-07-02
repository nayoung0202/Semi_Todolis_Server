package com.example.todo_list_server.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestTodo {
    //클라이언트에서 서버로 요청할 때 필요
   long id;
   String name;
   String content_id;
   String content;

}
