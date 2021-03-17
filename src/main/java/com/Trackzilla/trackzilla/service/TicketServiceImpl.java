package com.Trackzilla.trackzilla.service;

import com.Trackzilla.trackzilla.data.Ticket;
import com.Trackzilla.trackzilla.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    @Override
    public Optional<Ticket> findById(String id) {
        return ticketRepository.findById(id);
    }


    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteById(String id) {
        ticketRepository.deleteById(id);
    }

    @Override
    public Long countAllTickets(){
        Stream<Ticket> stream = ticketRepository.findAllByCustomQuery("open");
        Long count = stream.count();
        stream.close();
        return count;
    }

    @Override
    public List<Ticket> findByStatus(String status) {
        return ticketRepository.findByStatus(status);
    }

    @Override
    public List<Ticket> findByAppId(String appId) {
        return ticketRepository.findByAppId(appId);
    }

    @Override
    public void insert(Ticket ticket) {
        ticketRepository.insert(ticket);
    }

}
