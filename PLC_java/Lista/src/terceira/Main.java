package terceira;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static double cargaTrabalhoTotal(ArrayList<Tarefa<MembroEquipe>> tarefas, MembroEquipe membroEquipe){
        int contador = 0;
        for (Tarefa<MembroEquipe> tarefa : tarefas){
            if (tarefa.getResponsavel().getNome().equals(membroEquipe.getNome()))
                contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        MembroEquipe membro = new MembroEquipe("Camila");
        MembroEquipe membro1 = new MembroEquipe("Pedro");
        LiderEquipe lider = new LiderEquipe("Lucas");

        Tarefa<MembroEquipe> tarefa1 = new Tarefa<>("desenvolvimento de código do front", membro);
        Tarefa<MembroEquipe> tarefa2 = new Tarefa<>("desenvolvimento de código do back", membro);
        Tarefa<MembroEquipe> tarefa3 = new Tarefa<>("correção de bugs", membro);
        Tarefa<MembroEquipe> tarefa4 = new Tarefa<>("desenvolvimento de código", membro1);
        Tarefa<LiderEquipe>  tarefa5 = new Tarefa<>(" revisão de código", lider);

        ArrayList<Tarefa<MembroEquipe>> tarefas = new ArrayList<>();
        tarefas.add(tarefa1);
        tarefas.add(tarefa2);
        tarefas.add(tarefa3);
        tarefas.add(tarefa4);

        double cargeCamila = cargaTrabalhoTotal(tarefas,membro);
        double cargePedro = cargaTrabalhoTotal(tarefas,membro1);


        System.out.println("Lider: " +lider.getNome());
        System.out.println("Membros: " +membro.getNome()+ ", " + membro1.getNome());
        System.out.println("Carga de trabalho de Camila: "+ cargeCamila + " tarefa(s)");
        System.out.println("Carga de trabalho de Pedro: "+ cargePedro + " tarefa(s)");


    }
}
