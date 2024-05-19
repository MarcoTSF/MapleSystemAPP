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
public class ClienteModel extends PessoaModel {
    protected String setor;

    public ClienteModel(int id, String nome, String telefone, String email, String setor) {
        super(id, nome, telefone, email);
        this.setor = setor;
    }

    public ClienteModel(int id, String nome, String setor) {
        super(id, nome);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    @Override
    public String toString(){
        return getNome();
    }
}