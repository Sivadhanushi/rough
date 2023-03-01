package com.zsgs.recruitmanagement.login;

import java.util.Scanner;

public class LoginView {
     private LoginController loginController;
     Scanner scanner = new Scanner(System.in);
     public LoginView(){
    	 loginController = new LoginController(this);
     }
     public static void main(String[] args) {
		LoginView loginView=new LoginView();
		loginView.menu();
	}
     public void menu() {
    	 boolean input = false;
    	 do {
    		 System.out.println("-----WELCOME TO LOGIN PAGE-----");
    		 System.out.println("\n1.Admin Login \n2.Recruiter Login\n3.Exit");
    		 System.out.println("\nEnter your choice ");
    		 int choice = scanner.nextInt();
    		 switch(choice) {
    		 case 1:
    			 adminLogin();
    			 break;
    		 case 2:
    			 recruiterLogin();
    			 break;
    		 case 3:
    			 input =true;
    			 break;
    		 default:
    			 System.out.println("INVALID OPTION...");
    		 }
    		 
    	 }while(input);
     }
	public void recruiterLogin() {
		System.out.println("Enter Name");
		String name = scanner.next();
		System.out.println("Enter email Id");
		String email=scanner.next();
		System.out.println("Enter Password");
		String password = scanner.next();
		loginController.recruitCredentials(name,email,password);
	}
	private void adminLogin() {
           System.out.println("Enter UserName");
           String username=scanner.next();
           System.out.println("Enter Password");
           String password=scanner.next();
           loginController.adminCredentials(username,password);
	}
	public void adminLoginSucess(String username) {
           System.out.println("Welcome"+username);
           System.out.println("Successfully Login");
	}
	public void loginFailure() {
            System.out.println("Failed to login..Try Again!!");		
	}
	public void addedSuccess(String name) {
        System.out.println("Welcome " +name);
        System.out.println("Successfully Login");
	}
	public void addedfail() {
        System.out.println("Failed to login..Try Again!!");		

	}
}
