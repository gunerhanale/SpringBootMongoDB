package com.Trackzilla.trackzilla.service;

import com.Trackzilla.trackzilla.data.Release;
import com.Trackzilla.trackzilla.data.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {

    public List<Ticket> findAll();
    Optional<Ticket> findById(String id);
    Ticket save(Ticket ticket);
    void deleteById(String id);
    void insert(Ticket ticket);
}
