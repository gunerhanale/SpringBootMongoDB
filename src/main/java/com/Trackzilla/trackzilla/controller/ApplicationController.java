package com.Trackzilla.trackzilla.controller;

import com.Trackzilla.trackzilla.data.Application;
import com.Trackzilla.trackzilla.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tza")
public class ApplicationController {


    @Autowired
    private ApplicationService applicationService;

    @RequestMapping(value = "/applications", method = RequestMethod.GET)
    public List<Application> getAllApp(){

        return applicationService.findAll();
    }

    @RequestMapping(value = "/applications/{id}", method = RequestMethod.GET)
    public Optional<Application> getApplicationById(@PathVariable("id") String id){

        return applicationService.findById(id);
    }

    @RequestMapping(value = "/applications", method = RequestMethod.POST)
    public Application addNewApplication(@RequestBody Application application){
        return applicationService.save(application);
    }

    @RequestMapping(value = "/applications/{id}", method = RequestMethod.PUT)
    public Application updateApplication(@PathVariable("id") String id, @RequestBody Application application){
        return applicationService.save(application);
    }

    @RequestMapping(value = "/applications/{id}", method = RequestMethod.DELETE)
    public void deleteApplication(@PathVariable("id") String id){
        applicationService.deleteById(id);
    }

    @RequestMapping(value = "/applications/name/{name}", method = RequestMethod.GET)
    public List<Application> findByName(@PathVariable("name") String name){
        return applicationService.findByName(name);
    }


}
