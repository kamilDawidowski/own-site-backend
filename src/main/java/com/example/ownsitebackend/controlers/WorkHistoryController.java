package com.example.ownsitebackend.controlers;

import com.example.ownsitebackend.Repository.WorkHistoryRepository;
import com.example.ownsitebackend.entitis.WorkHistory;
import com.example.ownsitebackend.services.WorkHistoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "work")
@CrossOrigin(origins = "http://localhost:3000/")
public class WorkHistoryController {
    private final WorkHistoryRepository workHistoryRepository;
    private final WorkHistoryServices workHistoryServices;

    @Autowired
    public WorkHistoryController(WorkHistoryRepository workHistoryRepository,WorkHistoryServices workHistoryServices) {
        this.workHistoryRepository = workHistoryRepository;
        this.workHistoryServices = workHistoryServices;
    }

    @GetMapping("/getElement")
    public ResponseEntity<List<WorkHistory>> getWorkHistory() throws Exception {
        try {


            return new ResponseEntity<List<WorkHistory>>(workHistoryServices.getAllWorkHistory(), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }


//    @Autowired
//    private WorkHistoryRepository repository;
//
//    @GetMapping("/save")
//    public ResponseEntity<String> setWorkHistory() throws Exception {
//        try {
//
//            List<String> watList = new ArrayList<>();
//            watList.add("React Js");
//            watList.add("Firebase");
//
//            final WorkActivity watActivity1 = new WorkActivity("Praca Iżynierska", "Praca inzynierksa pod kierwnictwem mgr.inż Przemysława Czuby pdt. Traveling", watList, "developer");
//            final ArrayList<WorkActivity> watListActivity = new ArrayList<>();
//            watListActivity.add(watActivity1);
//
//
//            final WorkHistory wat = new WorkHistory("wat", "Wat 2018-2022", "worksElement", "true", "Warszawa", watListActivity);
//            final Mono<WorkHistory> saveWorkHistory = repository.save(wat);
//            final WorkHistory savedWat = saveWorkHistory.block();
//
//            List<String> accentureList = new ArrayList<>();
//            accentureList.add("Java");
//            final WorkActivity accentureActivity1 = new WorkActivity("Trade Finance", "Project Trade Finance", accentureList, "developer");
//            final ArrayList<WorkActivity> accentureListActivity = new ArrayList<>();
//            accentureListActivity.add(accentureActivity1);
//
//
//            final WorkHistory accenture = new WorkHistory("accenture", "Accenture 2021", "worksElement", "false", "Warszawa", accentureListActivity);
//            final Mono<WorkHistory> saveWorkHistoryAccenture = repository.save(accenture);
//            final WorkHistory savedAccenture = saveWorkHistoryAccenture.block();
//            List<String> goldenoreList = new ArrayList<>();
//            goldenoreList.add("Spring Boot");
//            goldenoreList.add("React Js");
//            goldenoreList.add("Kafka");
//            goldenoreList.add("Azure");
//
//            List<String> goldenoreList2 = new ArrayList<>();
//            goldenoreList2.add("React Js");
//
//            final WorkActivity goldenoreActivity1 = new WorkActivity("Goldenore CDC", "Replication", goldenoreList, "developer");
//            final WorkActivity goldenoreActivity2 = new WorkActivity("Premia for Workers", "Application to support organization in Corporation ", goldenoreList2, "developer");
//            final ArrayList<WorkActivity> goldenoreListActivity = new ArrayList<>();
//            goldenoreListActivity.add(goldenoreActivity1);
//            goldenoreListActivity.add(goldenoreActivity2);
//
//
//            final WorkHistory goldenore = new WorkHistory("goldenore", "Goldenore 2021 - Present", "worksElement", "true", "Warszawa", goldenoreListActivity);
//            final Mono<WorkHistory> saveWorkHistoryGoldenore = repository.save(goldenore);
//            final WorkHistory savedGoldenore = saveWorkHistoryGoldenore.block();
//
//
////            repository.deleteAll().block();
////
////
////            final User testUser = new User("testId3", "testFirstName5", "testLastName3", "test address line one");
////            final User testUser2 = new User("ccc", "cc", "cc", "cc");
////
////
////            final Mono<User> saveUserMono = repository.save(testUser2);
////            final User savedUser = saveUserMono.block();
//
///////////
////            final Optional<User> optionalUserResult = repository.findById("testId").blockOptional();
////            final User result = optionalUserResult.get();
////            System.out.println(result);
//            return new ResponseEntity<>("Success", HttpStatus.OK);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        return new ResponseEntity<>("Error", HttpStatus.OK);
//    }
//
//    @GetMapping("/getElement")
//    public ResponseEntity<List<WorkHistory>> getWorkHistory() throws Exception {
//        try {
//            final Flux<WorkHistory> test = repository.findAll();
//            test.collectList();
//
//
//            final Optional<WorkHistory> optionalWorkHistory = repository.findById("wat").blockOptional();
//            final WorkHistory result = optionalWorkHistory.get();
//
//            final Optional<WorkHistory> optionalWorkHistory2 = repository.findById("accenture").blockOptional();
//            final WorkHistory result2 = optionalWorkHistory2.get();
//
//            final Optional<WorkHistory> optionalWorkHistory3 = repository.findById("goldenore").blockOptional();
//            final WorkHistory result3 = optionalWorkHistory3.get();
//
//            List<WorkHistory> finalResult = new ArrayList<>();
//            finalResult.add(result);
//            finalResult.add(result2);
//            finalResult.add(result3);
//
//
//            return new ResponseEntity<List<WorkHistory>>(finalResult, HttpStatus.OK);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
//    }


}



