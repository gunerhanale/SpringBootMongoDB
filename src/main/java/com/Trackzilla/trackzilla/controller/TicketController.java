package com.Trackzilla.trackzilla.controller;

import com.Trackzilla.trackzilla.data.Ticket;
import com.Trackzilla.trackzilla.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tza")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/tickets", method = RequestMethod.GET)
    public List<Ticket> getAllTickets(){
        return ticketService.findAll();
    }

    @RequestMapping(value = "/tickets/{id}", method = RequestMethod.GET)
    public Optional<Ticket> getTicketById(@PathVariable("id") String id){
        return ticketService.findById(id);
    }

    @RequestMapping(value = "/tickets", method = RequestMethod.POST)
    public Ticket addNewTicket(@RequestBody Ticket ticket){
        return ticketService.save(ticket);
    }

    @RequestMapping(value = "/tickets/{id}", method = RequestMethod.DELETE)
    public void deleteTicket(@PathVariable("id") String id){
        ticketService.deleteById(id);
    }

    @RequestMapping(value = "/tickets/status/{status}", method = RequestMethod.GET)
    public List<Ticket> findByStatus(@PathVariable("status") String status){
        return ticketService.findByStatus(status);
    }

    @RequestMapping(value = "/tickets/count", method = RequestMethod.GET)
    public Long countAllTickets(){
        return ticketService.countAllTickets();
    }

    @RequestMapping(value = "/tickets/appId/{appId}", method = RequestMethod.GET)
    public List<Ticket> findByAppId(@PathVariable("appId") String appId){
        return ticketService.findByAppId(appId);
    }
}
