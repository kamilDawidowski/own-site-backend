package com.example.ownsitebackend.controlers;

import com.example.ownsitebackend.Repository.UserRepository;
import com.example.ownsitebackend.Repository.WorkHistoryRepository;
import com.example.ownsitebackend.entitis.User;
import com.example.ownsitebackend.entitis.workHistory.WorkActivity;
import com.example.ownsitebackend.entitis.workHistory.WorkHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping(path = "work")
@CrossOrigin(origins = "http://localhost:3000/")
public class WorkHistoryController {
    @Autowired
    private WorkHistoryRepository repository;
    @GetMapping("/save")
    public ResponseEntity<String> setWorkHistory() throws Exception {
        try{
            final WorkActivity watActivity1=new WorkActivity("Projekt","qqq","sss","ss");
            final WorkActivity watActivity2=new WorkActivity("Projekt","qqq","sss","ss");
            final ArrayList<WorkActivity> watListActivity = new ArrayList<>();
            watListActivity.add(watActivity1);
            watListActivity.add(watActivity2);

            final WorkHistory wat=new WorkHistory("wat","Wat 2018-2020","worksElement","true","Warszawa",watListActivity);
            final Mono<WorkHistory> saveWorkHistory = repository.save(wat);
            final WorkHistory savedWat = saveWorkHistory.block();
//            repository.deleteAll().block();
//
//
//            final User testUser = new User("testId3", "testFirstName5", "testLastName3", "test address line one");
//            final User testUser2 = new User("ccc", "cc", "cc", "cc");
//
//
//            final Mono<User> saveUserMono = repository.save(testUser2);
//            final User savedUser = saveUserMono.block();

/////////
//            final Optional<User> optionalUserResult = repository.findById("testId").blockOptional();
//            final User result = optionalUserResult.get();
//            System.out.println(result);
            return new ResponseEntity<>("Success", HttpStatus.OK);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        return new ResponseEntity<>("Error", HttpStatus.OK);
    }

}



