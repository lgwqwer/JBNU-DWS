package java.spring.demo.dto;

public class ArticleForm {

    // index.html 속 form의 name과 동일하게 입력
    private String grade;
    private String distscore;

    public ArticleForm(String grade, String distscore) {
        this.grade = grade;
        this.distscore = distscore;
    }

    public String getGrade() {
        return grade;
    }

    public String getDistScore() {
        return distscore;
    }

}
