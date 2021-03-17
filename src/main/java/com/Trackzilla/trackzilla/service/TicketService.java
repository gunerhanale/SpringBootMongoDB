package com.Trackzilla.trackzilla.service;

import com.Trackzilla.trackzilla.data.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    List<Ticket> findAll();
    Optional<Ticket> findById(String id);
    Ticket save(Ticket ticket);
    void deleteById(String id);
    void insert(Ticket ticket);
    Long countAllTickets();
    List<Ticket> findByStatus(String status);
    List<Ticket> findByAppId(String appId);
}
