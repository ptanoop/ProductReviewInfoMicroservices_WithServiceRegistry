package com.adidas.review.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Review implements Serializable {

    @Id
    private String productId;
    private Double averageReviewScore;
    private Integer numberOfReviews;

}