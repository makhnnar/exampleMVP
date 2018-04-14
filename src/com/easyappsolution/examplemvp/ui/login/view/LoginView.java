package com.easyappsolution.examplemvp.ui.login.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.easyappsolution.examplemvp.ui.login.mvp.*;
import com.easyappsolution.examplemvp.utils.*;

public class LoginView extends JFrame implements LoginContract.View, ActionListener {

	
	private static final long serialVersionUID = 1L;
	
	
	private JButton boton;
	private JTextField campo_user;
	private JPasswordField campo_pass;
	private JTextField campo_ip;
	
	private JLabel etq1;
	private JLabel etq2;
	private JLabel etq3;
	private JLabel etq4;
	
	private LoginPresenter presenter;
	
	
	public LoginView(){
		presenter = new LoginPresenter(this);
		Dimension display = Toolkit.getDefaultToolkit().getScreenSize(); 
		Valores.ancho = (int)display.getWidth()-1;
		Valores.alto = (int)display.getHeight()-30;
		this.setSize(Valores.ancho,Valores.alto);
		this.setLayout(null);
		this.setResizable(false);
		this.setTitle(Valores.titulo);
		this.Componentes();
		this.setVisible(true);//lo debemos invocar al querer visualizar la ventana
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void Componentes(){
		int anchoMedio = (Valores.ancho/2) - 140;
		int altoMedio = (Valores.alto/2) - 65;
		etq1 = new JLabel("USERNAME:");
		etq1.setBounds(anchoMedio, altoMedio, 100, 30);
		this.add(etq1);
		
		campo_user = new JTextField();
		campo_user.setBounds(anchoMedio+120, altoMedio, 160, 30);
		this.add(campo_user);
	
		etq2 = new JLabel("PASSWORD:");
		etq2.setBounds(anchoMedio, altoMedio+50, 100, 30);
		this.add(etq2);
		
		campo_pass = new JPasswordField();
		campo_pass.setBounds(anchoMedio+120, altoMedio+50, 160, 30);
		this.add(campo_pass);
		
		boton = new JButton("INGRESAR");
		boton.setBounds(anchoMedio+80, altoMedio+100, 120, 30);
		boton.addActionListener(this);
		this.add(boton);
		
		etq3 = new JLabel("Bienvenido a RPGDemo");
		etq3.setBounds(anchoMedio+20, Valores.alto-70, 220, 30);
		etq3.setHorizontalAlignment((int)CENTER_ALIGNMENT);
		this.add(etq3);
		
		etq4 = new JLabel("IP SERVER:");
		etq4.setBounds(anchoMedio, altoMedio-50, 100, 30);
		this.add(etq4);
		
		campo_ip = new JTextField();
		campo_ip.setBounds(anchoMedio+120, altoMedio-50, 160, 30);
		this.add(campo_ip);
		
	}
	
	

	@Override
	public void onLoginSuccess() {
		System.out.println("CONECTO");
	}

	@Override
	public void onLoginFailed() {
		System.out.println("No CONECTO");
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(boton)){
			presenter.onMakeLogin(campo_user.getText(), campo_pass.getText());
		}
	}
	

}
