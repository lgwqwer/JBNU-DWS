package GBSB.JBNU_DWS.dto;

public class ConversionForm {
    private String collage;
    private double grade;
    private int bonusPoint;
    private int minusPoint;
    private double distanceScore;
    private double conversionScore;

    public ConversionForm(String collage, double grade, int bonusPoint, int minusPoint, double distanceScore) {
        this.collage = collage;
        this.grade = grade;
        this.bonusPoint = bonusPoint;
        this.minusPoint = minusPoint;
        this.distanceScore = distanceScore;
    }

    public String getCollage() {
        return collage;
    }

    public double getGrade() {
        return grade;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public int getMinusPoint() {
        return minusPoint;
    }

    public double getDistanceScore() {
        return distanceScore;
    }

    public double getConversionScore() {
        double temp = ((grade + (bonusPoint * 0.009 - minusPoint * 0.009)) / 4.5) * 90 + distanceScore;
        this.conversionScore = (double)Math.round(temp * 100) / 100.0;  // 소수점 둘째 자리까지 반올림
        return conversionScore;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setBonusPoint(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void setMinusPoint(int minusPoint) {
        this.minusPoint = minusPoint;
    }

    public void setDistanceScore(double distanceScore) {
        this.distanceScore = distanceScore;
    }

    public void setConversionScore(double conversionScore) {
        this.conversionScore = conversionScore;
    }

    @Override
    public String toString() {
        return "ConversionForm{" +
                "collage='" + collage + '\'' +
                ", grade=" + grade +
                ", bonusPoint=" + bonusPoint +
                ", minusPoint=" + minusPoint +
                ", distanceScore=" + distanceScore +
                ", conversionScore=" + conversionScore +
                '}';
    }
}
