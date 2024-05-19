/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.AgendamentoModel;
import Model.ClienteModel;
import Model.ServicoModel;
import Model.UsuarioModel;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author mtsfs
 */
public class Banco {
    public static ArrayList<UsuarioModel> usuario;
    public static ArrayList<ClienteModel> cliente;
    public static ArrayList<ServicoModel> servico;
    public static ArrayList<AgendamentoModel> agendar;
    
    
    public static void inicia() throws ParseException{
    
        //Instancia os Objetos
        usuario = new ArrayList<UsuarioModel>();
        cliente = new ArrayList<ClienteModel>();
        servico = new ArrayList<ServicoModel>();
        agendar = new ArrayList<AgendamentoModel>();
        
        //criando elementos
        
        UsuarioModel usuario1 = new UsuarioModel(1, "Marco Tulio Salvador", "adm1", "administrador", "31990905050", "adm1@alunouna.com");
        UsuarioModel usuario2 = new UsuarioModel(2, "Daniel Jones", "func1", "funcionario", "31980804040", "func1@alunouna.com");
        
        ClienteModel cliente1 = new ClienteModel(1, "Alan Figueiredo", "31950506060", "alan@test.com", "Engenharia do Produto");
        ClienteModel cliente2 = new ClienteModel(2, "Judite Oliveira", "31980807070", "judite@test.com", "Produção");
        ClienteModel cliente3 = new ClienteModel(3, "Pedro Ramos", "31940406060", "pedro@test.com", "Montagem Final");
        ClienteModel cliente4 = new ClienteModel(4, "Chico Moedas", "31990804050", "chico@tentei.com", "Tentativa");
        
        ServicoModel servico1 = new ServicoModel(1, "Projetor");
        ServicoModel servico2 = new ServicoModel(2, "Tela para Projetor");
        ServicoModel servico3 = new ServicoModel(3, "Mouse e Teclado");
        ServicoModel servico4 = new ServicoModel(4, "Sala de Reunião");
        ServicoModel servico5 = new ServicoModel(5, "Monitor");
        ServicoModel servico6 = new ServicoModel(6, "Impressora");

        AgendamentoModel agendar1 = new AgendamentoModel(1, cliente1, servico2, "26/04/2024", "29/04/2024 08:30");
        AgendamentoModel agendar2 = new AgendamentoModel(2, cliente2, servico4, "26/04/2024", "29/04/2024 10:30");
        AgendamentoModel agendar3 = new AgendamentoModel(3, cliente3, servico1, "26/04/2024", "29/04/2024 13:00");
        AgendamentoModel agendar4 = new AgendamentoModel(4, cliente4, servico3, "26/04/2024", "29/04/2024 19:00");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        
        servico.add(servico1);
        servico.add(servico2);
        servico.add(servico3);
        servico.add(servico4);
        servico.add(servico5);
        servico.add(servico6);
        
        agendar.add(agendar1);
        agendar.add(agendar2);
        agendar.add(agendar3);
        agendar.add(agendar4);
    }
}