public class Book {
    private String name;//поле класса.
    private Author author;
    private int yearOfPublication;
    public Book(String name, Author author, int yearOfPublication) {//метод конструктор.
        this.name=name;
        this.author=author;
        this.yearOfPublication=yearOfPublication;
    }
    public String getName() {//геттер.
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getYearOfPublication() {
        return this.yearOfPublication;
    }
    public void setYearOfPublication(int yearOfPublication) {//создание сеттера

        this.yearOfPublication = yearOfPublication;
    }
    @Override
    public String toString(){
        return "Название книги - " + this.getName() + ". " +
                "Автор книги - " + this.author + ". " +
                "Год публикации книги - " + this.yearOfPublication + ". ";
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return name.equals(book.name);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }

}
