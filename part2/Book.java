package part2;

public class Book {
    static int totalBooks;
    String title;
    String author;
    String isBn;
    Boolean isBorrowed;

    static {
        totalBooks=0;
    }

    Book(String title,String author,String isBn){

        this.title=title;
        this.author=author;
        this.isBn=isBn;

    }

    Book(){};

    {
        totalBooks++;
    }


    public static int getTotalBooks(){

        return totalBooks;

    }

    public void borrowBook(){

        if(isBorrowed){
            System.out.println("This Book is Already Borrowed");
        } else {
            isBorrowed=true;
            System.out.println("Enjoy with your Book");
        }

    }

    public void returnBook(){
        if(!isBorrowed){
            System.out.println("This book is Already in Library");
        }else{
            isBorrowed=false;
        }

    }



    public static void main(String[] args) {



    }

}
