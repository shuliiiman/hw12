import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;
    public Author (String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() { //создание геттера.
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    @Override
    public String toString(){//метод toString
        return
                this.firstName + " " + this.lastName + ". ";
    }
    /*@Override
    public boolean equals(Object author) {переопределение иквалс. Object?
        if (this==author) return true;если сравниваемый объект = объекту в параметрах-true?
        if (author==null||getClass()!=author.getClass()) return false;

        Author that = (Author) author;

        return Objects.equals(firstName, that.firstName);//Objects?
    }*/
    @Override
    public int hashCode(){return java.util.Objects.hash(firstName,lastName);}
}
