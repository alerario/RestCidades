/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatefulEjbClass.java to edit this template
 */
package br.ejb;

import br.data.Cidade;
import jakarta.ejb.Singleton;
import java.util.ArrayList;

/**
 *
 * @author default
 */
@Singleton
public class EjbCidades  {

    public EjbCidades() {
        lcidade = new ArrayList<>();
    }

    private java.util.ArrayList<Cidade> lcidade;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public java.util.ArrayList<Cidade> getCidades(){
        return lcidade;
    }
    public void add(int codigo, String nome){
        lcidade.add(new Cidade(codigo, nome));
    }
    
}
