package com.jamesmhare.poc.springcloudmicroservice.config.properties;

import com.jamesmhare.poc.springcloudmicroservice.model.FootballTeam;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ConfigurationProperties(prefix = "config")
public class ApplicationProperties {

    private List<FootballTeam> footballTeams = new ArrayList<>();

}
