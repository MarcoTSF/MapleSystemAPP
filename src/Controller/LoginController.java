/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.UsuarioModel;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author mtsfs
 */
public class LoginController {
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        UsuarioModel usuario = helper.obterModelo();
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        UsuarioModel usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
           MenuPrincipal menuprincipal = new MenuPrincipal();
           menuprincipal.setVisible(true);
           view.dispose();
       }else{
           view.exibeMensagem("Usuario ou senha Invalidos");
       }
    }
}