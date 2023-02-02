/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import br.data.Cidade;
import br.ejb.EjbCidades;
import jakarta.ejb.EJB;
import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author default
 */
@Named(value = "jsfCidade")
@RequestScoped
public class JsfCidade {

    @EJB
    EjbCidades ejbCidades;
    /**
     * Creates a new instance of JsfCidade
     */
    public JsfCidade() {
    }
    
    public java.util.ArrayList<Cidade> getCidades(){
        return ejbCidades.getCidades();
    }
    
    @Getter @Setter
    private int codigo;
    @Getter @Setter
    private String nome;
    
    public void salvar(){
        ejbCidades.add(codigo, nome);
    }
}
