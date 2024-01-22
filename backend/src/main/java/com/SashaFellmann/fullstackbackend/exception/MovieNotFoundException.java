package com.SashaFellmann.fullstackbackend.exception;

public class MovieNotFoundException extends RuntimeException{
    public MovieNotFoundException(Long id){
        super("Could not find the movie with id "+ id);
    }
}
