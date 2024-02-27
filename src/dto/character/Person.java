package dto.character;

public class Person {
    private String name;
    private String lastname;
    private Character sex;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", sex=" + sex +
                '}';
    }

    public Person(String name, String lastname, Character sex) {
        this.name = name;
        this.lastname = lastname;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null && obj instanceof Person){
        Person person = (Person)obj;
            return person.name.equals(this.name) && person.lastname.equals(this.lastname)&&person.sex.equals(this.sex);
        }
        return super.equals(obj);
    }
}
