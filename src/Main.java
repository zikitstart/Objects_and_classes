public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Отцы и дети", 1862);
        Book book2 = new Book("Мастер и Маргарита",1937);
        Author author1 = new Author("Иван","Сергеевич","Тургенев");
        Author author2 = new Author("Михаил","Афанасьевич","Булгаков");
        book1.setYear(1872);
        System.out.println(book1.getName() + " - " + author1.getFirstName() + " " + author1.getMiddleName() + " " + author1.getLastName() + " - " + book1.getYear());
        System.out.println(book2.getName() + " - " + author2.getFirstName() + " " + author2.getMiddleName() + " " + author2.getLastName() + " - " + book2.getYear());
    }
}