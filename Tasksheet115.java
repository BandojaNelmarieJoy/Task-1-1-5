/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksheet1.pkg1.pkg5;

/**
 *
 * @author NelJoy
 */
import java.util.*;
public class Tasksheet115
{
public static void main(String args[])
{
   
Scanner scanner =new Scanner(System.in);
System.out.print("Please Enter a Word: ");
String input =scanner.nextLine();

if(isPalindrome(input)){
    System.out.println("The Word you enter is a Palindrome.");
    } else {
    System.out.println("The Word you enter is not a Palindrome.");
}
} public static boolean isPalindrome(String str){
    StringBuilder reversed=new StringBuilder(str).reverse();
    return str.equals(reversed.toString());
}
}
