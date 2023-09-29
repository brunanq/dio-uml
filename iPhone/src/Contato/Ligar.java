package Contato;

import java.util.HashMap;
import java.util.Map;

public class Ligar {
    private Map<String, String> contatoList;

    public Ligar() {
        this.contatoList = new HashMap<>();
    }

    public void addContato(String nome, String telefone){
        contatoList.put(nome, telefone);
    }

    public void procurarNumeroContato(String nome){
        contatoList.get(nome);
    }

    public void deletarContato(String nome){
        contatoList.remove(nome);
    }
        
}
