package com.Trackzilla.trackzilla.service;

import com.Trackzilla.trackzilla.data.Release;

import java.util.List;
import java.util.Optional;

public interface ReleaseService {

    public List<Release> findAll();
    Optional<Release> findById(String id);
    Release save(Release release);
    void deleteById(String id);
    void insert(Release release);
    List<Release> getReleaseByTicketStatus(String status);
}
