package com.jamesmhare.poc.springcloudmicroservice.service;

import com.jamesmhare.poc.springcloudmicroservice.config.properties.ApplicationProperties;
import com.jamesmhare.poc.springcloudmicroservice.model.FootballTeam;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExampleService {

    private final List<FootballTeam> footballTeams;

    public ExampleService(final ApplicationProperties properties) {
        this.footballTeams = properties.getFootballTeams();
    }

    public List<FootballTeam> getFootballTeams() {
        return footballTeams;
    }

}
