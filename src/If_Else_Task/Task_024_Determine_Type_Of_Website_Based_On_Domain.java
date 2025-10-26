package If_Else_Task;

import java.util.Arrays;
import java.util.Scanner;

public class Task_024_Determine_Type_Of_Website_Based_On_Domain {
    /*
    * Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
:- take the Site URL input from the user
Example Scenarios
Input: example.com
Output: The website type is: Commercial website
Input: example.org
Output: The website type is: Non-profit organization
Input: example.edu
Output: The website type is: Educational institution
Input: example.gov
Output: The website type is: Government website
Input: example.net
Output: The website type is: Network-related website
Input: example.info
Output: The website type is: Informational website
Input: example.xyz
Output: The website type is: Unknown or other types of websites*/
    public static void main(String[] args) {
        System.out.println("Enter the URL:");
        Scanner sc=new Scanner(System.in);
        String url=sc.nextLine();
        //split the string based on dot into string array
        String[] url_array=url.split("\\.");
        //System.out.println("How array looks like"+ Arrays.toString(url_array));
        switch (url_array[url_array.length-1].toLowerCase())
        {
            case "com":
                System.out.println("The website type is: Commercial website");
                break;
            case "org":
                System.out.println("The website type is: Non-profit organization");
                break;
            case "edu":
                System.out.println("The website type is: Educational institution");
                break;
            case "net":
                System.out.println("The website type is: Network-related website");
                break;
            case "gov":
                System.out.println("The website type is: Government website");
                break;
            case "info":
                System.out.println("The website type is: Informational website");
                break;
            default:
                System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
