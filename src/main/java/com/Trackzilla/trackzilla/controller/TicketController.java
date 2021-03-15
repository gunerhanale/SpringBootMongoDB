package com.Trackzilla.trackzilla.controller;

import com.Trackzilla.trackzilla.data.Release;
import com.Trackzilla.trackzilla.data.Ticket;
import com.Trackzilla.trackzilla.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tza")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/tickets", method = RequestMethod.GET)
    public List<Ticket> getAllRelease(){
        return ticketService.findAll();
    }

}
