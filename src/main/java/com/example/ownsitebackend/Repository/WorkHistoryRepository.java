package com.example.ownsitebackend.Repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import com.example.ownsitebackend.entitis.workHistory.WorkHistory;
import reactor.core.publisher.Flux;

public interface WorkHistoryRepository extends ReactiveCosmosRepository<WorkHistory, String> {
    Flux<WorkHistory> findWorkHistoryById(String id);
    @Override
    Flux<WorkHistory> findAll();
}
