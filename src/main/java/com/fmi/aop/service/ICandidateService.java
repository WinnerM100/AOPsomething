package com.fmi.aop.service;

import com.fmi.aop.dto.CandidateDTO;

import java.util.Set;

public interface ICandidateService {
    Set<CandidateDTO> getAllCandidates();
}
