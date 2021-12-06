package com.example.ownsitebackend.services;

import com.example.ownsitebackend.Repository.WorkHistoryRepository;
import com.example.ownsitebackend.entitis.WorkHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkHistoryServices {
    private final WorkHistoryRepository workHistoryRepository;

    @Autowired
    public WorkHistoryServices(WorkHistoryRepository workHistoryRepository) {
        this.workHistoryRepository = workHistoryRepository;
    }

    public List<WorkHistory> getAllWorkHistory() {
        return (List<WorkHistory>) workHistoryRepository.findAll();

    }
}
