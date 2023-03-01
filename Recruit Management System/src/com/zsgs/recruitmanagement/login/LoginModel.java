package com.zsgs.recruitmanagement.login;

import java.util.ArrayList;

import com.zsgs.recruitmanagement.dao.Login;

public class LoginModel {
        private LoginController loginController;
	public LoginModel(LoginController loginController) {
		this.loginController=loginController;
	}
	
	ArrayList<Login> recruitCredentials = new ArrayList<>();
	public void adminCredentials(String username, String password) {
		if (username.equals("SIVASK") && password.equals("0000")) {
			loginController.adminLoginSucess(username);
		} else
			loginController.loginFailure();
	}
	public LoginModel(String name, String email, String password) {
	}
	public void recruitCredentials(String name, String email, String password) {
            		if(recruitCredentials.add(new Login(name,email,password))) {
            			loginController.addedSuccess(name);
            		}else
            			loginController.addedfail();

	}	
	}
	


