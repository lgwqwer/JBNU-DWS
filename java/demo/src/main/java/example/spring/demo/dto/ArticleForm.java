package example.spring.demo.dto;

import example.spring.demo.db.DBManager;
import java.sql.*;
public class ArticleForm {

    //index.html 속 form의 name과 동일하게 입력
    private String collage;
    private double grade;
    private int bonusPoint;
    private int minusPoint;
    private String province;
    private String city;
    private double distanceScore;
    private double conversionScore;

    public ArticleForm(String collage, double grade, int bonusPoint, int minusPoint, String province, String city) {
        this.collage = collage;
        this.grade = grade;
        this.bonusPoint = bonusPoint;
        this.minusPoint = minusPoint;
        this.province = province;
        this.city = city;
    }

    public String getCollage() {return collage;}
    public double getGrade() {return grade;}
    public int getBonusPoint() {return bonusPoint;}
    public int getMinusPoint() {return minusPoint;}
    public String getProvince() {return province;}
    public double getDistanceScore() {
        this.distanceScore = DBManager.getScore(province, city);
        return distanceScore;
    }
    public String getCity() { return city;}

    public double getConversionScore() {
        double result = ((grade + (bonusPoint * 0.009 - minusPoint * 0.009)) / 4.5) * 90 + getDistanceScore();
        this.conversionScore = (double)Math.round(result * 100) / 100.0;
        return conversionScore;
    }
    public void setCollage(String collage) { this.collage = collage;}
    public void setGrade(double grade) { this.grade = grade;}
    public void setBonusPoint(int bonusPoint) {this.bonusPoint = bonusPoint;}
    public void setMinusPoint(int minusPoint){this.minusPoint = minusPoint;}
    public void setDistanceScore(double distanceScore){this.distanceScore = distanceScore;}
    public void setCity(String city) { this.city = city;}
    public void setConversionScore(double conversionScore){this.conversionScore = conversionScore;}


    @Override
    public String toString() {
        return "ConversionForm{" +
                "collage='" + collage + '\'' +
                ", grade=" + grade +
                ", bonusPoint=" + bonusPoint +
                ", minusPoint=" + minusPoint +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", distanceScore=" + distanceScore +
                ", conversionScore=" + conversionScore +
                '}';
    }

}
