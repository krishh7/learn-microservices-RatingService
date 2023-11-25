package com.lcwd.rating.service.controller;

import com.lcwd.rating.service.entity.Rating;
import com.lcwd.rating.service.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    //create
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    //get all ratings
    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings() {
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRatings());
    }

    //get all ratings by userId
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getAllRatingsByUserId(@PathVariable String userId) {
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRatingsByUserId(userId));
    }

    //get all ratings by hotelId
    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getAllRatingsByHotelId(@PathVariable String hotelId) {
        return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRatingsByHotelId(hotelId));
    }
}
