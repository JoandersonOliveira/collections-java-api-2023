package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados2 {
    private Set<Convidado2> convidadoSet;

    public ConjuntoConvidados2() {
        this.convidadoSet = new HashSet<>();
    }

    public void adionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado2(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado2 convidadoParaRemover = null;
        for(Convidado2 c : convidadoSet){
            if(c.getCodigoConvidado() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}
