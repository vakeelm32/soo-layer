package com.soo;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("ping")
	String ping() {
		return "Pong : Today's Date " + new Date();
	}
}
