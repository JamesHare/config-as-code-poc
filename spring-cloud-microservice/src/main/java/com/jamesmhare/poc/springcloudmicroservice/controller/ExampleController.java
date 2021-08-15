package com.jamesmhare.poc.springcloudmicroservice.controller;

import com.jamesmhare.poc.springcloudmicroservice.model.FootballTeam;
import com.jamesmhare.poc.springcloudmicroservice.service.ExampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/show-config-values")
public class ExampleController {

    private final ExampleService service;

    public ExampleController(final ExampleService service) {
        this.service = service;
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<FootballTeam>> getConfigValues() {
        return ResponseEntity.ok(service.getFootballTeams());
    }

}
