package com.zsgs.recruitmanagement.recruiter;

import java.util.ArrayList;
import java.util.List;

import com.zsgs.recruitmanagement.dao.Recruiter;

public class RecruiterModel {
	private RecruiterController recruiterController;

	public RecruiterModel(RecruiterController recruiterController) {
		this.recruiterController = recruiterController;
	}

	public RecruiterModel(String name, String email, int num, String qualify, float cgpa) {
	}

	List<Recruiter> candidates = new ArrayList<>();

	public void checkCredentials(String name, String email, int num, String qualify, float cgpa) {
		if (candidates.add(new Recruiter(name, email, num, qualify, cgpa))) {
			recruiterController.addCredentialSuccess();
		} else
			recruiterController.addCredentialFailed();
	}

	public void viewCandidates(List<Recruiter> candidates) {
		if (candidates.size() != 0) {
			recruiterController.foundCandidates(candidates);
		} else
			recruiterController.noCandidates();
	}
	   List<Recruiter> jobs=new ArrayList<>();
	public void addNewJobs(String title, String description, String experience) {
          if(jobs.add(new Recruiter(title,description,experience))) {
        	  recruiterController.addJobSuccess();
          }else
        	  recruiterController.addJobFail();
	}

}
