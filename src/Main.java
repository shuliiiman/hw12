public class Main {
    public static void main(String[] args) {
        Author author = new Author("Роман", "Михайлов");
        Book book = new Book("Солнце", author,2028);
        System.out.println(book);

        Author author1 = new Author("Глеб", "Горбовский");// объект по классу Author.
        Book book1 = new Book("Учебник",author1, 70);
        book1.setYearOfPublication(57);//изменение года публикации одной из книг с помощью сеттера.
        System.out.println(book1);

        System.out.println(author.equals(author1));
        System.out.println(book.equals(book1));
    }
}