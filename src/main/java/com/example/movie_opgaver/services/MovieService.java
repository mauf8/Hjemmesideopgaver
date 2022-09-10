package com.example.movie_opgaver.services;

import com.example.movie_opgaver.model.Movie;
import com.example.movie_opgaver.repository.MovieRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MovieService {



    private Random random = new Random();


    private MovieRepository movierepo;

    public MovieService(){
        this.movierepo = new MovieRepository();
    }

    public Movie getFirst(){
        return movierepo.getOne(0);
    }

    public Movie getRandom(){
        return movierepo.getOne(random.nextInt(1500)+1);
    }


    public int getAward(){
        int i = 0;
        for (Movie m : movierepo.getMovies()){

            if (m.getAwards().equals("Yes")){
                i++;
                System.out.println("how many movies have won an award: " + i);
            }

        }
        return i;
    }


    public ArrayList<Movie> get10Random(){
        ArrayList<Movie> liste = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            Movie m1 = movierepo.getOne(random.nextInt(1500)+1);
            liste.add(m1);
        }
        Collections.sort(liste);
        return liste;


    }

}
