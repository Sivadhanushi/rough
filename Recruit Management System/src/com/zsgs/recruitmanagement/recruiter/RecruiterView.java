package com.zsgs.recruitmanagement.recruiter;

import java.util.List;
import java.util.Scanner;
import com.zsgs.recruitmanagement.dao.Recruiter;

public class RecruiterView {
      RecruiterController recruiterController;
      Scanner scanner = new Scanner(System.in);

      public RecruiterView(){
    	   recruiterController=new RecruiterController(this);
      }
      
      public static void main(String[] args) {
    	  RecruiterView recruiterView = new RecruiterView();
    	  recruiterView.displayMenu();
	}
      
      public void displayMenu() {
    	  boolean input=true;
    	  do {
        	  System.out.println("WELCOME TO RECRUIT MANAGEMENT");
               System.out.println("------------------------------");
               System.out.println("1.Add candidates");
               System.out.println("2.View candidates");
               System.out.println("3.Add Job Postings");
               System.out.println("4.View Job Postings ");
               System.out.println("5.EXIT");
               System.out.println("Enter your Choice");
               int choice = scanner.nextInt();
               switch(choice) {
               case 1:
            	   addCandidates();
            	   break;
               case 2:
            	   viewCandidates();
            	   break;
               case 3:
            	   addJobs();
            	   break;
               case 4:
            	   viewjobs();
            	   break;
               case 5:
            	   input=false;
            	   break;
               default:
            	   System.out.println("INVALID OPTION");
               }
    	  }while(input);
    	  
      }

	private void viewjobs() {
		
	}

	private void addJobs() {
		System.out.println("Enter Job Title");
		String title=scanner.next();
		System.out.println("Enter Description");
		String description=scanner.next();
		System.out.println(" Experience ");
		String experience = scanner.next();
		recruiterController.addNewJobs(title,description,experience);
		
	}

	public void viewCandidates() {
		System.out.println("-----------------");
		recruiterController.viewCandidates();
	}

	public void addCandidates() {
		System.out.println("Enter Candidate Name");
		String name =scanner.next();
		System.out.println("Enter Email ID");
		String email=scanner.next();
		System.out.println("Contact Number");
		int num = scanner.nextInt();
		System.out.println("Enter Qualification");
		String qualify=scanner.next();
		System.out.println("CGPA");
		float cgpa=scanner.nextFloat();
		recruiterController.checkCredentials(name,email,num,qualify,cgpa);
	}

	public void addCredentialSuccess() {
        System.out.println("Candidate Added Successfully..");		
	}

	public void addCredentialFailed() {
       System.out.println("Failed to add Candidate..");		
	}

	
	public void foundCandidates(List<Recruiter> candidates) {
		if(candidates.isEmpty())
			System.out.println("No Candidates Found");
		else {
			
		System.out.println("----------Candidates List----------");
       		for(Recruiter ur:candidates) {
       			System.out.println(ur.getName()+" "+ur.getEmail()+" "+ur.getNum()+" "+ur.getQualify()+ " "+ur.getCgpa());
       		}
       			
		}
	}

	public void addJobSuccess() {
		 System.out.println("New Job Added Sucessfully!!!");
	}

	public void addJobFail() {
        System.out.println("Sorry Try Again!!");		
	}
      
}
