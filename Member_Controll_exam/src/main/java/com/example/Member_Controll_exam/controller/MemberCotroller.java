package com.example.Member_Controll_exam.controller;

import com.example.Member_Controll_exam.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberCotroller {
    private final MemberService memberService;

    @Autowired
    public MemberCotroller(MemberService memberService) {
        this.memberService = memberService;
    }
}
