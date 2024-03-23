package com.moviecompany.movies.service;

import com.moviecompany.movies.model.Movie;
import com.moviecompany.movies.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findById(ObjectId id) {
        return movieRepository.findById(id);
    }

    public Optional<Movie> findByImdbId(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}
