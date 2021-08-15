package com.jamesmhare.poc.springcloudmicroservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FootballTeam {

    private String name;
    private String conference;
    private String headCoach;

}
