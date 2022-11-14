import java.util.List;

public abstract class People {

    private String name; //имя
    private String surname; //фамилия
    private String direction; // направление
    private int age;

    public People(String name, String surname, String direction){
        this.name = name;
        this.surname = surname;
        this.direction = direction;
    }

    public String GetName(){
        return name;
    }
    public String GetSurname() {return surname;}
    public String getDirection(){  //ввывод напраления
        return direction;
    }

    public int GetAge(){return age;}
}
