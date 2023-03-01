package com.zsgs.recruitmanagement.recruiter;

import java.util.List;

import com.zsgs.recruitmanagement.dao.Recruiter;

public class RecruiterController {
 	 RecruiterView recruiterView;
      RecruiterModel recruiterModel;
    
    public RecruiterController(RecruiterView recruiterView) {
    	this.recruiterView=recruiterView;
    	this.recruiterModel=new RecruiterModel(this);
}

	public void checkCredentials(String name, String email, int num, String qualify, float cgpa) {
            recruiterModel.checkCredentials(name,email,num,qualify,cgpa);		
	}

	public void addCredentialSuccess() {
		recruiterView.addCredentialSuccess();
	}

	public void addCredentialFailed() {
		recruiterView.addCredentialFailed();
	}

	

	
	public void viewCandidates() {
         	recruiterModel.viewCandidates();	
	}

	public void addNewJobs(String title, String description, String experience) {
             recruiterModel.addNewJobs(title,description,experience);	
	}

	public void addJobSuccess() {
          recruiterView.addJobSuccess();		
	}

	public void addJobFail() {
        recruiterView.addJobFail();		
	
	}

	public void foundCandidates(List<Recruiter> candidates) {
          recruiterView.foundCandidates(candidates);		
	}

	





}
