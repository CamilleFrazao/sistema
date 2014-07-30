/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.controller;

import br.com.sistema.dao.ClienteDAOImpl;
import br.com.sistema.model.Cliente;
import br.com.sistema.model.Endereco;
import br.com.sistema.model.Pessoa;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author John
 */
@ManagedBean
@RequestScoped
public class ClienteService {
    
    private String filtro;
    private Pessoa pessoa = new Pessoa();
    private Cliente cliente = new Cliente();
    private ClienteDAOImpl cdi = new ClienteDAOImpl();
    private List<Cliente> clientes;
    private Endereco endereco;
    
    public void Salvar() {
        cliente.setPessoa(pessoa);
        cdi.salvar(cliente);
        System.out.println("Salvo com sucesso");
       
    }
    
    public List<Cliente> ListarClientes() {
        if(filtro == null){
        this.clientes = cdi.getBeans();
        return clientes;
        
        }else{
        
        
        
        }
        this.clientes = cdi.getBeans();
        return clientes;
        
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public ClienteDAOImpl getCdi() {
        return cdi;
    }
    
    public void setCdi(ClienteDAOImpl cdi) {
        this.cdi = cdi;
    }
    
    public List<Cliente> getClientes() {
        
        return clientes;
    }
    
    public void setClientes(List<Cliente> clientes) {
        
        this.clientes = clientes;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }
    
    
    public ClienteService() {
    }
    
}
