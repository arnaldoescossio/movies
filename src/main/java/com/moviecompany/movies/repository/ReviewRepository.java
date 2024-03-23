package com.moviecompany.movies.repository;

import com.moviecompany.movies.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
//    Optional<Review> findByImdbId(String imdbId);
}
