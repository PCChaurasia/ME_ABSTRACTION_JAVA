package pl_java.interface_.exercise_2;

import java.util.ArrayList;
import java.util.List;

import pl_java.interface_.exercise_2.question.Question;

public class Form {
    List<Question> questions;

    public Form(){
        this.questions = new ArrayList<>();
    }

    public void addQuestion(Question question){
        questions.add(question);
    }

    public void displayForm(){
        
    }
}
