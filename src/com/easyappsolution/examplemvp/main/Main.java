package com.easyappsolution.examplemvp.main;

import com.easyappsolution.examplemvp.ui.login.view.LoginView;

public class Main {

	private LoginView login;
	
	
	public Main(){
		
		login = new LoginView();
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();

	}

}
