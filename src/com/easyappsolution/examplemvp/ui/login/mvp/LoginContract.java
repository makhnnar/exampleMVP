package com.easyappsolution.examplemvp.ui.login.mvp;

public class LoginContract {
	
	public interface View{
		
		void onLoginSuccess();
		void onLoginFailed();
		
	}
	
	public interface Presenter{
		
		void onMakeLogin(String name,String pass);
		
	}
	
	public interface ModelResultListener{
		
		void onSuccess(String token);
		void onFailed();
		
	}

}
