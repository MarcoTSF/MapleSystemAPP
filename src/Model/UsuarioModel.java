/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author mtsfs
 */
public class UsuarioModel extends PessoaModel {
    protected String senha;
    protected String nivelAcesso;

    public UsuarioModel(int id, String nome,String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public UsuarioModel(int id, String nome, String senha, String nivelAcesso, String telefone, String email) {
        super(id, nome, telefone, email);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}
