/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.sistema.dao;

import br.com.sistema.model.Cliente;
import java.io.Serializable;


public class ClienteDAOImpl extends GenericDAO<Cliente, Long> implements ClienteDAO, Serializable {
    
    public ClienteDAOImpl(){
    
    }
    
}
