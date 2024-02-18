package com.example.demo.controller;

import com.example.demo.service.ScoreCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/calculate")
public class ScoreController {

    private final ScoreCalculationService scoreCalculationService;

    @Autowired
    public ScoreController(ScoreCalculationService scoreCalculationService) {
        this.scoreCalculationService = scoreCalculationService;
    }

    @PostMapping
    @ResponseBody
    public String calculateScore(@RequestParam String collage, @RequestParam double grade) {
        double convertedScore = scoreCalculationService.calculateConvertedScore(collage, grade);
        return String.valueOf(convertedScore);
    }
}