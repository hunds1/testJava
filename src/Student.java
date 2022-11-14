import java.util.ArrayList;

public class Student extends People{

    private int curs;

    private String group;
    private ArrayList<String> subjects;

    public Student(String name, String surname, String direction, int curs){ // конструктор
        super(name, surname, direction);
        this.curs = curs;
        this.subjects = new ArrayList<>();
    }

    public ArrayList<String> getSubject(){ //предопределение абстр метода getSubject /
        return subjects;
    }
    public void addSubject(String subject){
        subjects.add(subject);
    }
}
