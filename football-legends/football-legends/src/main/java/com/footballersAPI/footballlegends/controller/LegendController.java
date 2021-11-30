package com.footballersAPI.footballlegends.controller;

import com.footballersAPI.footballlegends.entity.Legend;
import com.footballersAPI.footballlegends.repository.ILegendRepository;
import com.footballersAPI.footballlegends.repository.LegendRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LegendController {

    private final LegendRepository repository = new LegendRepository();

        // INDEX ROUTE - to find all legends
        // GET /legends
    @GetMapping("/legends")
    public ResponseEntity<List<Legend>> indexLegends() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(repository.findAllLegends());
    }

        // SHOW ROUTE - find legend by id
        // GET /legends/{id}
    @GetMapping("/legends/{id}")
    public ResponseEntity<Legend> showLegend(@PathVariable int id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(repository.findLegendById(id));
    }

        // CREATE ROUTE - create a new legend
        // POST /add/legend
    @PostMapping("/add/legend")
    public ResponseEntity<Legend> createLegend(@RequestBody Legend newLegend) {
        repository.addLegend(newLegend);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newLegend);
    }

        // UPDATE ROUTE - edit an existing legend using its id
        // PUT or PATCH /edit/legend/{id}
    @PutMapping("/edit/legend/{id}")
    public ResponseEntity<Legend> updateLegendById(@PathVariable int id, @RequestBody Legend updatedLegend) {
        Legend editedLegend = repository.editLegendById(id, updatedLegend);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(editedLegend);
    }

    // DELETE ROUTE - Remove a legend with a specific id
    // DELETE /legend/{id}
    @DeleteMapping("/remove/legend/{id}")
    public ResponseEntity<Legend> deleteLegend(@PathVariable int id) {
        Legend response = repository.removeLegendById(id);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(response);
    }
}
