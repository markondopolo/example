package com.example.demo.web;

import com.example.demo.domain.Movie;
import com.example.demo.domain.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final MovieService movieService;

    public HelloController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, world!";
    }

    @GetMapping("/list/of/movies")
    public Iterable<String> listMovies() {
        return List.of("Hello", "World");
    }
}