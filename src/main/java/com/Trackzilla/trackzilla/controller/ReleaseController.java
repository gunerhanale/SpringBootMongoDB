package com.Trackzilla.trackzilla.controller;

import com.Trackzilla.trackzilla.data.Release;
import com.Trackzilla.trackzilla.service.ReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tza")
public class ReleaseController {

    @Autowired
    private ReleaseService releaseService;

    @RequestMapping(value = "/releases", method = RequestMethod.GET)
    public List<Release> getAllRelease(){
        return releaseService.findAll();
    }

    @RequestMapping(value = "/releases/{id}", method = RequestMethod.GET)
    public Optional<Release> getReleaseById(@PathVariable("id") String id){
        return releaseService.findById(id);
    }

    @RequestMapping(value = "/releases", method = RequestMethod.POST)
    public Release addNewRelease(@RequestBody Release release){
        return releaseService.save(release);
    }

    @RequestMapping(value = "/releases/{id}", method = RequestMethod.PUT)
    public Release updateRelease(@PathVariable("id") String id, @RequestBody Release release){
        release.setId(id);
        return releaseService.save(release);
    }

    @RequestMapping(value = "/releases/{id}", method = RequestMethod.DELETE)
    public void deleteRelease(@PathVariable("id") String id){
        releaseService.deleteById(id);
    }

    @RequestMapping(value = "/releases/template", method = RequestMethod.POST)
    public void addNewReleaseWTemplate(@RequestBody Release release){
        releaseService.insert(release);
    }

    @RequestMapping(value = "/releases/status/{status}", method = RequestMethod.GET)
    public List<Release> getReleaseByTicketStatus(@PathVariable("status") String status){
        return releaseService.getReleaseByTicketStatus(status);
    }

}
