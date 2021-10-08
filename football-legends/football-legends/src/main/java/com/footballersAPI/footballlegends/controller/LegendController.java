package com.footballersAPI.footballlegends.controller;

import com.footballersAPI.footballlegends.entity.Legend;
import com.footballersAPI.footballlegends.repository.LegendRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LegendController {

        private final LegendRepository repository = new LegendRepository();

        // index route to find all legends
        // GET /legends
    @GetMapping("/legends")
    public ResponseEntity<List<Legend>> getAllLegends() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(repository.findAllLegends());
    }
}
