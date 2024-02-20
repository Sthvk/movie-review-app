package dev.sathvik7.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepositoty movieRepositoty;
    public List<Movie> allMovies(){
        return movieRepositoty.findAll();
    }

    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return movieRepositoty.findMovieByImdbId(imdbId);
    }
}
