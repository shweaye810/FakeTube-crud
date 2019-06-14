package com.shwe.faketube.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.shwe.faketube.model.User;
import com.shwe.faketube.model.Video;

//@RepositoryRestResource()
@CrossOrigin(origins = "http://localhost:4200")
public interface VideoRepo extends MongoRepository<Video, String>{

}
