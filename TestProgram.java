public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("Juan Dela Cruz");

        Book book = new Book("Java Tutorial");
        Journal journal = new Journal("The Journals of Sylvia Plath");
        Library thesis = new Thesis("Role of human-computer interaction");

        student.borrowResource(book);
        student.borrowResource(journal);
        student.borrowResource(thesis);

        System.out.println();

        student.returnResource(book);
        student.returnResource(journal);
        student.returnResource(thesis);

    }
}