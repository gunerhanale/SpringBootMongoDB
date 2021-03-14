package com.Trackzilla.trackzilla.controller;

import com.Trackzilla.trackzilla.data.Application;
import com.Trackzilla.trackzilla.service.ApplicationService;
import com.Trackzilla.trackzilla.service.ReleaseService;
import com.Trackzilla.trackzilla.service.TicketService;
import com.Trackzilla.trackzilla.service.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tza")
public class Controller {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private ApplicationService applicationService;

    @Autowired
    private ReleaseService releaseService;

    @RequestMapping(value = "/applications", method = RequestMethod.GET)
    public List<Application> getAllApp(){

        return applicationService.findAll();
    }

    @RequestMapping(value = "/applications/{id}", method = RequestMethod.GET)
    public Optional<Application> getApplicationById(@PathVariable("id") String id){

        return applicationService.findById(id);
    }

}
