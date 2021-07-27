package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
//        uniLibrary.returnBook();
//        uniLibrary.getMagazine(1, 2);
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();

        Book book = context.getBean("book", Book.class);
//        uniLibrary.getBook(book);

        uniLibrary.getBook();
        uniLibrary.addBook("MMM", book);
        uniLibrary.addMagazine();
        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();
//        uniLibrary.addBook();


        context.close();

    }
}
