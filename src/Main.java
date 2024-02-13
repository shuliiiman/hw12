public class Main {
    public static void main(String[] args) {
        Author author = new Author("Роман", "Михайлов");
        Book book = new Book("Солнце", author,2028);
        System.out.print("Название книги - "+book.getName()+". ");
        System.out.print("Автор книги - "+author.getFirstName()+" "+author.getLastName()+". ");
        System.out.println("Год публикации книги - "+book.getYearOfPublication()+".");

        Author author1 = new Author("Глеб", "Горбовский");// объект по классу Author
        Book book1 = new Book("Учебник",author1, 70);
        book1.setYearOfPublication(57);//изменение года публикации одной из книг с помощью сеттера.
        System.out.print("Название книги - "+book1.getName()+". ");
        System.out.print("Автор книги - "+author1.getFirstName()+" "+author1.getLastName()+". ");
        System.out.println("Год публикации книги - "+book1.getYearOfPublication()+".");
    }
}