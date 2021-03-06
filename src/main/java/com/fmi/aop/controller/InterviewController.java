package com.fmi.aop.controller;

import com.fmi.aop.dto.InterviewDTO;
import com.fmi.aop.service.IInterviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;


@RestController
@RequestMapping("/interview")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class InterviewController {

    private final IInterviewService interviewService;

    @GetMapping("/email")
    public Set<InterviewDTO> getInterviewByCandidateEmail(@RequestParam String email){
        return interviewService.getInterviewByCandidateEmail(email);
    }

    @GetMapping("/date")
    public Set<InterviewDTO> getInterviewsByDate(@RequestParam("date") String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime dateTime = LocalDate.parse(date, formatter).atStartOfDay();
        System.out.println(dateTime);

        return interviewService.getInterviewByDate(dateTime);
    }

    @GetMapping
    public Set<InterviewDTO> getInterviews(){
        return interviewService.getInterviews();
    }

}
