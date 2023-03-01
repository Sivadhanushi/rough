package com.zsgs.recruitmanagement.login;



public class LoginController {
    private LoginView loginView;
    private LoginModel loginModel;
 

	public LoginController(LoginView loginView) {
		this.loginView=loginView;
		this.loginModel=new LoginModel(this);
	}
	public void adminCredentials(String username, String password) {
		loginModel.adminCredentials(username,password);
	}
	public void adminLoginSucess(String username) {
		loginView.adminLoginSucess(username);
	}
	public void loginFailure() {
		loginView.loginFailure();
	}
	
	public void addedSuccess(String name) {
		loginView.addedSuccess(name);		
	}
	public void addedfail() {
		loginView.addedfail();
	}
	public void recruitCredentials(String name, String email, String password) {
		loginModel.recruitCredentials(name,email,password);		
	}
	
}
