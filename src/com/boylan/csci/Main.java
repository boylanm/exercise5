package com.boylan.csci;

import java.util.*;

//made by Michael Boylan 2/19/2019

public class Main {
    //Display Menu
    static void menu(){
        System.out.println("Please choose an option: \n(1)Add an Contact Info\n(2)Display Contact\n(3)Look Up Contact\n(0)Exit");
    }

    public static void main(String[] args) {
        person Dolan = new person("Rachel Alucard","alucard@gmail.com");

        System.out.println(Dolan.toString());
        //Address Book
        List<String> addressNames = new ArrayList<>();
        List<String> addressEmails = new ArrayList<>();

        //Loop for asking all the required info
        while(true) {
            menu();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            if(choice==0){
                System.out.println("Goodbye!");
                System.exit(0);
            }else if(choice == 1){
                //Asking information to put into the Address Book
                Scanner input1 = new Scanner(System.in);
                System.out.println("Please enter a First Name: ");
                String fName = input1.nextLine();
                System.out.println("Please enter an E-mail Address: ");
                Scanner input2 = new Scanner(System.in);
                String emailA = input2.nextLine();

                //create using Person Class
                person nameless = new person(fName, emailA);

                //Adding the information into the Arrays
                addressNames.add(nameless.getName());
                addressEmails.add(nameless.getEmail());

                //Displays all contact info
            }else if(choice == 2){
                for(int i = 0; i < addressNames.size(); i++){
                    System.out.println(addressNames.get(i)+ " "+ addressEmails.get(i));
                }

                //Looks up a specific persons contact info
            }else if(choice == 3){
                System.out.println("Please type the First Name: ");
                Scanner input3 = new Scanner(System.in);
                String lookup = input3.nextLine();
                if(addressNames.contains(lookup)==false){
                    System.out.println("No such name exists in the List or misspelled");
                    break;
                }else{
                    int position = addressNames.indexOf(lookup);
                    System.out.println(addressNames.get(position)+ " "+addressEmails.get(position));
                }

            }

        }

    }
}
