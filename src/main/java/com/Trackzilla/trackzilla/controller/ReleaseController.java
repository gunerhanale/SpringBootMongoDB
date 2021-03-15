package com.Trackzilla.trackzilla.controller;

import com.Trackzilla.trackzilla.data.Application;
import com.Trackzilla.trackzilla.data.Release;
import com.Trackzilla.trackzilla.service.ReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tza")
public class ReleaseController {

    @Autowired
    private ReleaseService releaseService;

    @RequestMapping(value = "/releases", method = RequestMethod.GET)
    public List<Release> getAllRelease(){
        return releaseService.findAll();
    }

}
