package main.java.list.Financas;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Lancamentos {
    private List<Receita> listaDeReceitas;
    private List<Despesa> listaDeDespesas;

    public Lancamentos() {
        this.listaDeReceitas = new ArrayList<>();
        this.listaDeDespesas = new ArrayList<>();
    }


    public void adicionaReceita(String descricao, double valor){
        Receita novaReceita = new Receita(valor, descricao);
        this.listaDeReceitas.add(novaReceita);
    }

    public void adicionaDespesa(String descricao, double valor) {
        Despesa novaDespesa = new Despesa(valor, descricao);
        this.listaDeDespesas.add(novaDespesa);
    }


}
