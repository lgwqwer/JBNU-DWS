package com.example.dormwebservice.dto;

public class ConversionForm {

    private String collage;
    private double grade;
    private double bonusPoint;
    private double minusPoint;
//    private String province;
    private String gender;

    public ConversionForm(String collage, double grade, double bonusPoint, double minusPoint, String province, String gender) {
        this.collage = collage;
        this.grade = grade;
        this.bonusPoint = bonusPoint;
        this.minusPoint = minusPoint;
//        this.province = province;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ConversionForm{" +
                "collage='" + collage + '\'' +
                ", grade=" + grade +
                ", bonusPoint=" + bonusPoint +
                ", minusPoint=" + minusPoint +
//                ", province='" + province + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
