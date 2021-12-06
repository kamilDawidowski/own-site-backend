package com.example.ownsitebackend.Repository;


import com.example.ownsitebackend.entitis.WorkHistory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WorkHistoryRepository extends CrudRepository<WorkHistory, Long> {
    @Query("SELECT '*' FROM WorkHistory ")
    List<WorkHistory> getAllWorkHistory();



}
