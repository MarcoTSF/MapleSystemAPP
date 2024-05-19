/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.DAO.AgendaDAO;
import Model.AgendamentoModel;
import Model.ClienteModel;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.ServicoModel;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author mtsfs
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
    
        AgendaDAO agendaDAO = new AgendaDAO();
        ArrayList<Model.AgendamentoModel> agenda = agendaDAO.selectAll();
        
        helper.preencherTabela(agenda);
    }
    
    public void atualizaCliente(){
        ClienteDAO cliente = new ClienteDAO();
        ArrayList<ClienteModel> selectAll = cliente.selectAll();
        
        helper.preencherClientes(selectAll);
    }
    
    public void atualizaServico(){
        
        ServicoDAO servicoDAO = new ServicoDAO();   
        ArrayList<ServicoModel> servicos = servicoDAO.selectAll();
        
        helper.preencherServicos(servicos);
    }
    
    public void atualizaId(){
            ClienteModel cliente = helper.obterClientes();
            helper.setarId(cliente.getId());
        }
    
    public void agendar(){
            AgendamentoModel agendamento = helper.obterModelo();
            new AgendaDAO().insert(agendamento);
            atualizaTabela();
            helper.limparTela();
    }
}