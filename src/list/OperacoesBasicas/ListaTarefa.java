package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo
    private List<Tarefa> tarefaList;
    // método Construtor -> indica que eu quero receber uma lista de Tarefa então como não quero receber apago o que está entre( )
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    // Método adicionarTarefa
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    // Método removerTarefa
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : tarefaList) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    // Método obterNumerosToralTarefas
    public int obterNumerosToralTarefas() {
        return tarefaList.size();
    }// Método obterDescricoesTarefas
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList );
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa =  new ListaTarefa();
        System.out.println("O número total de elementes na lista é: " + listaTarefa.obterNumerosToralTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 5");

        System.out.println("O número total de elementes na lista é: " + listaTarefa.obterNumerosToralTarefas());

        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("O número total de elementes na lista é: " + listaTarefa.obterNumerosToralTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
