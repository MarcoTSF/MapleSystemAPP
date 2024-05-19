/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.AgendamentoModel;
import java.util.ArrayList;

/**
 *
 * @author mtsfs
 */
public class AgendaDAO {
    /**
     * Insere uma reserva dentro do banco de dados
     * @param agendar
     */
    public void insert(AgendamentoModel agendar){
          
        if(agendar.getId() == 0){
            agendar.setId(proximoId());
            Banco.agendar.add(agendar);
        }
        
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param agendar
     * @return 
     */
    public boolean update(AgendamentoModel agendar){
        
        for (int i = 0; i < Banco.agendar.size(); i++) {
            if(idSaoIguais(Banco.agendar.get(i),agendar)){
                Banco.agendar.set(i, agendar);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param agendar
     * @return 
     */
    public boolean delete(AgendamentoModel agendar){
        for (AgendamentoModel agendaLista : Banco.agendar) {
            if(idSaoIguais(agendaLista,agendar)){
                Banco.agendar.remove(agendaLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<AgendamentoModel> selectAll(){
        return Banco.agendar;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param agendar
     * @param agendaAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(AgendamentoModel agendar, AgendamentoModel agendaAComparar) {
        return agendar.getId() ==  agendaAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (AgendamentoModel agendar : Banco.agendar) {           
           int id = agendar.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
        }
        return maiorId + 1;
    }
}