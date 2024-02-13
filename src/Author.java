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
    @Override
    public boolean equals(Object other) { //метод equals
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;//(сравнение объекта класса  с другими объектами этого класса)
        return firstName.equals(author.firstName);//(сравниваемое свойство)
    }
    @Override
    public int hashCode() {//Метод hashCode
        return java.util.Objects.hash(firstName);
    }
}
