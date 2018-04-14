package com.easyappsolution.examplemvp.ui.login.mvp;

public class LoginInteractor {
	
	
	private String nombre = "fulano";
	private String contra = "fulano";
	
	public LoginInteractor(){
		
	}
	
	public void makeLogin(
			String name,
			String pass,
			LoginContract.ModelResultListener listener){
		if(name.equals(nombre) && pass.equals(contra)){
			listener.onSuccess("se conecto");
		}else{
			listener.onFailed();
		}
	}

}
