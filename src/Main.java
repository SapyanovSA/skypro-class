public class Main {

    public static void main(String[] args) {

        Author author1 = new Author("Стивин", "Кинг");
        Author author2 = new Author("Лев", "Толстой");

        Book book1 = new Book("Тихая башня", author1, 2020);
        Book book2 = new Book("Война и мир", author2, 2025);

        System.out.println("book1 = " + book1.getBookName() +
                "; Name and secondName - " + book1.getAuthor().getName() +
                " " + book1.getAuthor().getSecondName() +
                "; Year of publication - " + book1.getYearOfPublication());

        System.out.println("book2 = " + book2.getBookName() +
                "; Name and secondName - " + book2.getAuthor().getName() +
                " " + book2.getAuthor().getSecondName()+
                "; Year of publication - " + book2.getYearOfPublication());

        book1.setYearOfPublication(2010);
        System.out.println("book1 = " + book1.getBookName() +
                "; Name and secondName - " + book1.getAuthor().getName() +
                " " + book1.getAuthor().getSecondName() +
                "; Year of publication - " + book1.getYearOfPublication());
        System.out.println();

        //Задание 1 вывод методов из класса Author
        System.out.println("Задание 1");
        // toString
        System.out.println("Работает ли метод toString ?");
        System.out.println("Вывод: " + new Author("Автор", "Автор"));
        System.out.println();
        // equals
        Author author3 = new Author("Алексей", "Смирнов");
        Author author4 = new Author("Александр", "Смирнов");
        System.out.println("Проверка метода equals: " + author3 + " == " + author4 + " ?");
        System.out.println("Вывод: " + author3.equals(author4));
        System.out.println();

        //Задание 2 вывод методов из класса Book, чтобы toString вызывал метод из класса Author
        System.out.println("Задание 2");
        Author newAuthor = new Author("Сергей", "Майвезер");
        // toString
        System.out.println(new Book("Высота", newAuthor, book1.getYearOfPublication()));
        // equals
        Book newBook1 = new Book("Темная башня", author3, book1.getYearOfPublication());
        Book newBook2 = new Book("Темная башня", author3, book1.getYearOfPublication());
        System.out.println("Проверка на одинаковые названия книг: " + newBook1 + " == " + newBook2 + " ?");
        System.out.println("Вывод: " + newBook1.equals(newBook2));
    }

}
