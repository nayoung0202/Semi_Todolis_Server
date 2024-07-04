package com.example.todo_list_server.controller;

import com.example.todo_list_server.Mapper.TodoMapper;
import com.example.todo_list_server.Mapper.UserMapper;
import com.example.todo_list_server.dto.Member;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class LoginApiController {

    @Autowired
    UserMapper userMapper;

    //생성자 생성(필수)
    @Autowired
    public LoginApiController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    //회원가입
    @PostMapping("/signup")
    public String saveMember(@RequestBody Member member) {
        // 기존 회원이면 가입 안됨
        Member findMember = userMapper.findMember(member);
        if (findMember != null){
            return "이미 있습니다.";
        }

        userMapper.SignUp(member);

        return "success";
    }

    //로그인
    @PostMapping("/login")
    public Long readMember(@RequestBody Member member, HttpServletRequest request) {
        String email = member.getEmail();
        String passwd = member.getPasswd();

        Member findMember = userMapper.findMember(member);
        if (findMember.getEmail().equals(email) && findMember.getPasswd().equals(passwd)) {
            HttpSession session = request.getSession(true); //세션 생성
            session.setAttribute("member", findMember.getEmail());
        }

        return null;
    }

    //로그아웃
    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return "success";
    }
}
