package com.fmi.aop.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interviewer")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class InterviewerController {
}
