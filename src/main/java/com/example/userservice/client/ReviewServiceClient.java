package com.example.userservice.client;

import com.example.userservice.vo.RequestReview;
import com.example.userservice.vo.ResponseReview;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "review-service")
public interface ReviewServiceClient {

	@PostMapping("/review-service/{userId}")
	ResponseReview createReview(@PathVariable String userId, @RequestBody RequestReview review);
}
