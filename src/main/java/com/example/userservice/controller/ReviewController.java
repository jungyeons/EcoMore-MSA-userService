package com.example.userservice.controller;

import com.example.userservice.client.ReviewServiceClient;
import com.example.userservice.service.UserService;
import com.example.userservice.vo.RequestReview;
import com.example.userservice.vo.ResponseReview;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-service/review") // 엔드 포인트 앞의 공통된 부분
@RequiredArgsConstructor
public class ReviewController {
	private final UserService userService;
	private final ReviewServiceClient reviewServiceClient;

	@PostMapping("/{userId}")
	public ResponseEntity createReview(@PathVariable String userId, @RequestBody RequestReview review) {
		System.out.println("create review In User");
		ResponseReview review1 = reviewServiceClient.createReview(userId, review);
		return ResponseEntity.ok(review1);
	}
}
