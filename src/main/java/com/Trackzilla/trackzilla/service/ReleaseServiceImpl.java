package com.Trackzilla.trackzilla.service;

import com.Trackzilla.trackzilla.data.Release;
import com.Trackzilla.trackzilla.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReleaseServiceImpl implements ReleaseService{

    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public List<Release> getReleaseByTicketStatus(String status) {

        Query query = new Query();
        query.addCriteria(Criteria.where("tickets.status").is(status));

        return mongoTemplate.find(query, Release.class);
    }

    @Override
    public List<Release> findAll() {
        return releaseRepository.findAll();
    }

    @Override
    public Optional<Release> findById(String id) {
        return releaseRepository.findById(id);
    }

    @Override
    public Release save(Release release) {
        return releaseRepository.save(release);
    }

    @Override
    public void deleteById(String id) {
        releaseRepository.deleteById(id);
    }

    @Override
    public void insert(Release release) {
        releaseRepository.save(release);
    }
}
