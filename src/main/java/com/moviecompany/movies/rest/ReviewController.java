package com.moviecompany.movies.rest;

import com.moviecompany.movies.model.Review;
import com.moviecompany.movies.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> save(@RequestBody Map<String, String> reviewPayload) {
        return new ResponseEntity<>(
                reviewService.save(reviewPayload.get("body"), reviewPayload.get("imdbId")),
                HttpStatus.OK
        );
    }

}
