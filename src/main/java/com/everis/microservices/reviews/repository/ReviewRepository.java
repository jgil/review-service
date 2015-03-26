package com.everis.microservices.reviews.repository;

import com.everis.microservices.reviews.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by jordi on 26/03/15.
 */
public interface ReviewRepository extends MongoRepository<Review, String> {

    List<Review> findByimdbID(@Param("imdbID") String imdbID);

    List<Review> findByuserName(@Param("userName") String userName);
}
