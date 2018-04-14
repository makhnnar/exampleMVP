package com.easyappsolution.examplemvp.ui.login.mvp;

public class LoginPresenter implements LoginContract.Presenter, LoginContract.ModelResultListener{

	
	private LoginContract.View view;
	private LoginInteractor interactor;
	
	
	public LoginPresenter(LoginContract.View view){
		this.view = view;
		interactor = new LoginInteractor();
	}
	

	@Override
	public void onSuccess(String token) {
		view.onLoginSuccess();	
	}

	@Override
	public void onFailed() {
		view.onLoginFailed();
	}

	@Override
	public void onMakeLogin(String name, String pass) {
		interactor.makeLogin(name, pass, this);
	}

}
