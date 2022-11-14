import java.util.ArrayList;

public class Worker extends People{
    private String direction; // архитектура
    private double salary; //зарплата
    private ArrayList<String> responsibilities;

    public Worker(String name, String surname,  String direction, double salary){  // конструктор
        super(name, surname, direction);
        this.salary = salary;
        this.responsibilities = new ArrayList<>();
    }
    public double getSalary(){
        return salary;
    }
    public ArrayList<String> getResponsibilities(){
        return responsibilities;
    }
    public void addResponsibilities(String responsibility){
        responsibilities.add(responsibility);
    }

}
