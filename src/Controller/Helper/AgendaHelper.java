/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.ClienteModel;
import Model.AgendamentoModel;
import Model.ServicoModel;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mtsfs
 */
public class AgendaHelper {
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Model.AgendamentoModel> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTabela1().getModel();
        tableModel.setNumRows(0);
        
        for (Model.AgendamentoModel agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getDataReservaFormatada(),
                agendamento.getDataEntregaFormatada(),
                agendamento.getHoraEntregaFormatada(),
                agendamento.getObservacao()
            });
        }
    }

    public void preencherClientes(ArrayList<ClienteModel> clientes) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getCampoCliente().getModel();
        
        for (ClienteModel cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
    }

    public void preencherServicos(ArrayList<ServicoModel> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getCampoServico().getModel();
        
        for (ServicoModel servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }
    
    public ClienteModel obterClientes(){
        return (ClienteModel) view.getCampoCliente().getSelectedItem();
    }
    
    public ServicoModel obterServicos(){
        return (ServicoModel) view.getCampoServico().getSelectedItem();
    }

    public void setarId(int id) {
        view.getCampoId().setText(Integer.toString(id));
    }

    public AgendamentoModel obterModelo() {
        String idString = view.getCampoId().getText();
        int id = Integer.parseInt(idString);
        
        ClienteModel cliente = obterClientes();
        ServicoModel servico = obterServicos();
        String dataReserva = view.getCampoDataReserva().getText();
        String dataEntrega = view.getCampoDataEntrega().getText();
        String hora = view.getCampoHora().getText();
        String dataHora = dataEntrega + " " + hora;
        String observacao = view.getObservacao1().getText();
        
        AgendamentoModel agendamento = new AgendamentoModel(id, cliente, servico, dataReserva, dataHora, observacao);
        return agendamento;
    }

    public void limparTela() {
       view.getCampoId().setText("0");
       view.getCampoDataReserva().setText("");
       view.getCampoDataEntrega().setText("");
       view.getCampoHora().setText("");
       view.getObservacao1().setText("");
    }
}