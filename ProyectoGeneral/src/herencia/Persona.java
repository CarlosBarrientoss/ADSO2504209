package herencia;

public class Persona{

    protected String name;
    protected char gender;
    protected String direction;

    public Persona(){

    }

    public Persona(String name){
        this.name = name;
    }

    public Persona(String name, char gender, String direction){
        this.name = name;
        this.gender = gender;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", gender=" + gender + ", direction=" + direction + '}';
    }


}
