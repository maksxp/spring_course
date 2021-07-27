package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
//    @Override
    public void getBook (){
        System.out.println("we get book from UniLibrary");
        System.out.println("___________________________________________");
    }

//    public void addBook (){
//        System.out.println("we add book to UniLibrary");
//    }

    public void addBook (String personName, Book book){
        System.out.println("we add book to UniLibrary");
        System.out.println("___________________________________________");
    }

//    public void getBook (String bookName){
//        System.out.println("we get book from UniLibrary: "+bookName);
//    }

//    public void getBook (Book book){
//        System.out.println("we get book from UniLibrary: "+book.getName());
//    }

//    public void returnBook (){
//        System.out.println("we return book to UniLibrary");
//        System.out.println("___________________________________________");
//    }


    public String returnBook (){
        int a = 10/0;
        System.out.println("we return book to UniLibrary");
        return "__OK__";
    }

    public void getMagazine(){
        System.out.println("we get magazine from UniLibrary");
        System.out.println("___________________________________________");
    }

    public void addMagazine (){
        System.out.println("we add magazine to UniLibrary");
        System.out.println("___________________________________________");
    }

    public void returnMagazine (){
        System.out.println("we return magazine to UniLibrary");
        System.out.println("___________________________________________");
    }
}
