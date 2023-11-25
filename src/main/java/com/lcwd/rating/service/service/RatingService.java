package com.lcwd.rating.service.service;

import com.lcwd.rating.service.entity.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //get all rating
    List<Rating> getAllRatings();

    //get all ratings by userId
    List<Rating> getAllRatingsByUserId(String userId);

    //get all ratings by hotelId
    List<Rating> getAllRatingsByHotelId(String hotelId);
}
