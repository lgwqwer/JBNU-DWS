package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class ScoreCalculationServiceImpl implements ScoreCalculationService {

    @Override
    public double calculateConvertedScore(String collage, double grade) {
        double conversionFactor = 90;
        return (grade / 4.5) * conversionFactor;
    }
}