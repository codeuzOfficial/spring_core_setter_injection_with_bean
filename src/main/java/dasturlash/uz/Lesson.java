package dasturlash.uz;

public class Lesson {
    private String name;
    private Professor professor;
    private Assistant assistant;


    public void setName(String name) {
        this.name = name;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", professor=" + professor +
                ", assistant=" + assistant +
                '}';
    }
}
