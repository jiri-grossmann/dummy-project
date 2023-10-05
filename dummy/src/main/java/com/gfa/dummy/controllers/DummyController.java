package com.gfa.dummy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DummyController {
    @GetMapping({"/foo","/"})
    public ResponseEntity<?> helloDummy() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "bar");
        return ResponseEntity.ok(response);
    }
}
