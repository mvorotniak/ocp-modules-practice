package ocp.review.questions;

import java.util.Map;

public class Question {

    private int number;

    private String question;

    private Map<Character, String> answers;

    public Question(int number, String question, Map<Character, String> answers) {
        this.number = number;
        this.question = question;
        this.answers = answers;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Map<Character, String> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Character, String> answers) {
        this.answers = answers;
    }
}
