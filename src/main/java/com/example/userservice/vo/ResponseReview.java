package com.example.userservice.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseReview {
    private String reviewId;
    private String reviewTitle;
    private String reviewContent;
    private Date createdAt;

    private String userId;
}
