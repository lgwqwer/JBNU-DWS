package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class ScoreCalculationServiceImpl implements ScoreCalculationService {

    @Override
    public double calculateConvertedScore(String collage, double grade) {
        // 여기에 선택한 단과대학과 학점에 따른 환산 점수를 계산하는 로직을 구현합니다.
        // 간단하게, 환산 점수를 계산하기 위해 90이라는 상수 변환 요소를 사용하겠습니다.
        double conversionFactor = 90;
        return (grade / 4.5) * conversionFactor;
    }
}