package com.example.demo.domain;

import java.time.LocalDate;

public record Movie(
        Long id,
        String title,
        String genre,
        Integer duration,
        LocalDate releaseDate
) {}