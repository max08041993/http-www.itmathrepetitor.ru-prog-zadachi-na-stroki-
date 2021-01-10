package old.Get_Set_Constructor6;

import java.util.Random;

public class Teatcher {
    public Teatcher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String subject;

    Student student = new Student("Иван");

    void evaluate(String name){
        student.setName(name);
        Random random = new Random();
        int value = random.nextInt(4)+2;
        String var = "Не известно";
        switch (value){
            case 2 :
                var = "неудовлетворительно";
                break;
            case 3:
                var= "удовлетворительно";
                break;
            case 4 :
                var = "хорошо";
                break;
            case 5:
                var= "отлично";
                break;
        }
            System.out.println("Преподаватель " + getName() + " оценил студента с именем " + student.getName() + " по предмету " + getSubject() + " на оценку " + var);
    }

}
