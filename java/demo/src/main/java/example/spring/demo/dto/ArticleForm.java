package example.spring.demo.dto;
public class ArticleForm {

    //index.html 속 form의 name과 동일하게 입력
    private String collage;
    private double grade;
    private int bonusPoint;
    private int minusPoint;
    private double distanceScore;
    private String gender;
    private double conversionScore;

    static boolean isStringEmpty(String str) {return str == null || str.isEmpty();}

    public ArticleForm(String collage, double grade, int bonusPoint, int minusPoint, double distanceScore, String gender) {
        this.collage = collage;
        this.grade = grade;
        this.distanceScore = distanceScore;
        this.bonusPoint = bonusPoint;
        this.minusPoint = minusPoint;
        this.gender = gender;
    }

    public String getCollage() {return collage;}
    public double getGrade() {return grade;}
    public int getBonusPoint() {return bonusPoint;}
    public int getMinusPoint() {return minusPoint;}
    public double getDistScore() {return distanceScore;}
    public String getGender() { return gender;}

    public void setCollage(String collage) { this.collage = collage;}
    public void setGrade(double grade) { this.grade = grade;}
    public void setBonusPoint(int bonusPoint) {this.bonusPoint = bonusPoint;}
    public void setMinusPoint(int minusPoint){this.minusPoint = minusPoint;}
    public void setDistanceScore(double distanceScore){this.distanceScore = distanceScore;}
    public void setGender(String gender) { this.gender = gender;}
    public void setConversionScore(double conversionScore){this.conversionScore = conversionScore;}



}
