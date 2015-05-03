package com.bpel.libos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Functions {

    public void executarVoid() {
        System.out.println("void Executa");
        
        
    }

    public String executarString() {
        return "String sem Parametro Retornada";
    }

    public String executarStringParameters(String par) {
        
        try {
            File arquivo;

            arquivo = new File("arquivo.txt");
            FileOutputStream fos;
            fos = new FileOutputStream(arquivo);
            
            fos.write(par.getBytes());
            fos.close();
        } catch (Exception e) {
            System.out.println("Erro "+e.toString());
        }
        
        return "Retornando " + par;
    }
}
