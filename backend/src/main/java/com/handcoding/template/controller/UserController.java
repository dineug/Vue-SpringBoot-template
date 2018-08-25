package com.handcoding.template.controller;

import java.util.ArrayList;
import java.util.List;

import com.handcoding.template.vo.ResponseVO;
import com.handcoding.template.vo.UserVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public ResponseVO<?> getUsers() {
        ResponseVO<List<UserVO>> resp = new ResponseVO<>();

        List<UserVO> list = new ArrayList<>();
        list.add(new UserVO("테스트", "010-1111-2222"));
        list.add(new UserVO("테스터", "010-4444-2222"));
        list.add(new UserVO("LSH", "010-9999-1111"));

        resp.setResponse(list);
        return resp;
    }

    @GetMapping("/{id}")
    public ResponseVO<?> getUser(@PathVariable int id) {
        ResponseVO<UserVO> resp = new ResponseVO<>();

        List<UserVO> list = new ArrayList<>();
        list.add(new UserVO("테스트", "010-1111-2222"));
        list.add(new UserVO("테스터", "010-4444-2222"));
        list.add(new UserVO("LSH", "010-9999-1111"));

        resp.setResponse(list.get(id));
        return resp;
    }

}