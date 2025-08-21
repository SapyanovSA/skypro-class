public class Main {

    public static void main(String[] args) {

        // Задание 6
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

        // Задание 7
        book1.setYearOfPublication(2010);
        System.out.println("book1 = " + book1.getBookName() +
                "; Name and secondName - " + book1.getAuthor().getName() +
                " " + book1.getAuthor().getSecondName() +
                "; Year of publication - " + book1.getYearOfPublication());

    }

}
