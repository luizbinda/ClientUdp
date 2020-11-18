/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author luizn
 */
public class Prontuario extends Object implements Serializable{
    private String doenca;
    private ArrayList<String> sintomas; 

    public Prontuario(ArrayList sintomas, String deoenco) {
        this.sintomas = sintomas;
        this.doenca = deoenco;
    }    

    public Prontuario(ArrayList<String> sintomas) {
        this.sintomas = sintomas;
        this.doenca = "";
    }
    

    public ArrayList<String> getSintomas() {
        return sintomas;
    }

    public void setSintomas(ArrayList sintomas) {
        this.sintomas = sintomas;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    @Override
    public String toString() {
        String message = doenca;
        for (String sintoma: sintomas) {
            message = message.concat(" - ").concat(sintoma);
        }
        return message;
    }
    
}
