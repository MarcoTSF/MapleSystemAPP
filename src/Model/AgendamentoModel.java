/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mtsfs
 */
public class AgendamentoModel {
    private int id;
    private ClienteModel cliente;
    private ServicoModel servico;
    private Date dataReserva;
    private Date dataEntrega;
    private String observacao;

    public AgendamentoModel(int id, ClienteModel cliente, ServicoModel servico, String dataReserva, String dataEntrega) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        try {
            this.dataReserva = new SimpleDateFormat("dd/MM/yyyy").parse(dataReserva);
        } catch (ParseException ex) {
            Logger.getLogger(AgendamentoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.dataEntrega = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataEntrega);
        } catch (ParseException ex) {
            Logger.getLogger(AgendamentoModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public AgendamentoModel(int id, ClienteModel cliente, ServicoModel servico, String dataReserva, String dataEntrega, String observacao) {
        this(id, cliente, servico, dataReserva, dataEntrega);
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public void setColaborador(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public ServicoModel getServico() {
        return servico;
    }

    public void setServico(ServicoModel servico) {
        this.servico = servico;
    }

    public Date getDataReserva() {
        return dataReserva;
    }
    
    public String getDataReservaFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(dataReserva);
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }
    
    public String getDataEntregaFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(dataEntrega);
    }
    
    public String getHoraEntregaFormatada(){
        return new SimpleDateFormat("HH:mm").format(dataEntrega);
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}