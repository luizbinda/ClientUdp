/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import java.util.ArrayList;

/**
 *
 * @author luizn
 */
public class ModelMensagem {
    private String doenca;
    private ArrayList<String> sintomas; 

    public ModelMensagem(ArrayList sintomas, String deoenco) {
        this.sintomas = sintomas;
        this.doenca = deoenco;
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

    
}
