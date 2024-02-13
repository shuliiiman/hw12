public class Book {
    private String name;//поле класса
    private Author firstAndLastName;
    private int yearOfPublication;
    public Book(String name, Author firstAndLastName, int yearOfPublication) {//метод конструктор
        this.name=name;
        this.firstAndLastName=firstAndLastName;
        this.yearOfPublication=yearOfPublication;
    }
    public String getName() {//геттер
        return this.name;
    }
    public Author getAuthor() {
        return this.firstAndLastName;
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {//создание сеттера

        this.yearOfPublication = yearOfPublication;
    }
}
