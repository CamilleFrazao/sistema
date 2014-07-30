/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.auxiliares;

import br.com.sistema.model.Bairro;
import br.com.sistema.model.Cliente;
import br.com.sistema.model.Endereco;
import br.com.sistema.model.Pessoa;
import br.com.sistema.model.Rua;
import br.com.sistema.model.Usuario;
import br.com.sistema.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author John
 */
public class Executar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Endereco end = new Endereco();
        Bairro bairro = new Bairro();
//        bairro.setNome("MARCO");
//        end.setBairro(bairro);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

//        pessoa.setCpf("981237192");
//        pessoa.setNome("JOHN GOMES");
//        session.save(pessoa);
//       
//        Usuario usuario = new Usuario();
//        usuario.setNome("Felipe Emin");
//        usuario.setSenha("admin");
//        usuario.setEmail("rodrigo@admin.com.br");
       

        

       //TESTE DE BUSCA DO ENDEREÇO POR CEP 
//        String buscaCep = "66095580";
//        Rua ruaTemp = (Rua) session.createCriteria(Rua.class).add(Restrictions.eq("cep", buscaCep)).uniqueResult();
//        System.out.println(ruaTemp.getNome()+" "+ruaTemp.getBairro().getNome()+" "+ruaTemp.getBairro().getCidade().getNome()+" "+ ruaTemp.getBairro().getCidade().getEstado().getSigla());
//        end.setRua(ruaTemp);
//        end.setBairro(ruaTemp.getBairro());
//        end.setCidade(ruaTemp.getBairro().getCidade());
//        end.setEstado(ruaTemp.getBairro().getCidade().getEstado());
//        session.save(end);
//        pessoa.setCpf("00377432288");
//        pessoa.setNome("JOHN GOMES DA SILVA");
//        pessoa.setEndereco(end);
//        session.save(pessoa);
         
//        //Gerar banco de dados
//        AnnotationConfiguration ac = new AnnotationConfiguration();
//        ac.addAnnotatedClass(Autorizacao.class);
//        ac.addAnnotatedClass(Usuario.class);
//        ac.configure();
//        SchemaExport se = new SchemaExport(ac);
//        se.create(true, true);

        tx.commit();
        session.close();

    }

}
