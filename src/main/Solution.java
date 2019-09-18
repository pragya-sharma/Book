package main;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n==0){
            System.out.println("N/A");
        }
        else{
            in.nextLine();
            Book[] arraybooks = new Book[n];
            for(int i = 0;i<n;i++){
                String bookName = in.nextLine();
                String authorName = in.nextLine();
                String isbn = in.nextLine();
                arraybooks[i] = new Book(bookName,authorName,isbn);
            }
            for(int i=0;i<n;i++){
                System.out.print(arraybooks[i]);
            }
        }
    }
}
