package com.example.movie_opgaver.contoller;


import com.example.movie_opgaver.services.MovieService;
import com.example.movie_opgaver.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {

    private MovieService movieService;


    public MovieController(){
        this.movieService = new MovieService();
    }

    //øvelse 2

    @GetMapping("/getFirst")
    public Movie getFirst(){
        return movieService.getFirst();
    }

    @GetMapping("/getRandom")
    public Movie getRandom(){
        return movieService.getRandom();
    }

    @GetMapping("/get10Random")
    public ArrayList<Movie> get10Random(){
        return movieService.get10Random();
    }

    @GetMapping("/getaward")
    public int getAward(){
        return movieService.getAward();
    }
}
