/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.UsuarioModel;
import View.Login;

/**
 *
 * @author mtsfs
 */
public class LoginHelper implements iHelper{
    private final Login view;
    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public UsuarioModel obterModelo(){
        String nome = view.getCampoUsuario().getText();
        String senha = view.getCampoSenha().getText();
        
        UsuarioModel modelo = new UsuarioModel(0, nome, senha);
        return modelo;
    }
    
    public void setarModelo(UsuarioModel modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        view.getCampoUsuario().setText(nome);
        view.getCampoSenha().setText(senha);
       
    }
    
    public void limparTela(){
        view.getCampoUsuario().setText("");
        view.getCampoSenha().setText("");
    }
}