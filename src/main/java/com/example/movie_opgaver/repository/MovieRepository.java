package com.example.movie_opgaver.repository;

import com.example.movie_opgaver.model.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieRepository {


    public ArrayList<Movie> getMovies() {
        return movies;
    }

    private ArrayList<Movie> movies;


    public MovieRepository() {
        this.movies = new ArrayList<>();
        genereateMoviesList();
    }

    private void genereateMoviesList() {
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Marcus\\Desktop\\Datamatiker\\Opgaver\\Movie opgaver\\src\\main\\resources\\movie.csv"));
            scanner.useDelimiter(";|\n");


            while (scanner.hasNext()) {
                String year = scanner.next();
                String length = scanner.next();
                String title = scanner.next();
                String subject = scanner.next();
                String popularity = scanner.next();
                String awards = scanner.next();
                Movie movie = new Movie(year, length, title, subject, popularity, awards);
                movies.add(movie);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public Movie getOne(int index){
        return movies.get(index);
    }
}