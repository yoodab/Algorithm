import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numtext  = sc.nextLine();

        StringBuffer sb = new StringBuffer(numtext);
        String reverse = sb.reverse().toString();

        String[] splitrev = reverse.split(" ");
        System.out.print(Integer.parseInt(splitrev[0])>Integer.parseInt(splitrev[1])?splitrev[0]:splitrev[1]);
           
    }
}