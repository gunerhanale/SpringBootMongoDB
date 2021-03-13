package com.Trackzilla.trackzilla.repository;

import com.Trackzilla.trackzilla.data.Release;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleaseRepository extends MongoRepository<Release, String> {


}
