package com.Trackzilla.trackzilla.repository;

import com.Trackzilla.trackzilla.data.Application;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Scope("prototype")
public interface ApplicationRepository extends MongoRepository<Application, String> {

    List<Application> findByName(String name);
    Application findByDescriptionContaining(String keyword);

}
