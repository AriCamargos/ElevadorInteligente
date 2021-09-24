package elevador;
/**
*@author AriCamargos
*@version 8.0 (Sept 24, 2021)
* exercício de um Elevador Inteligente com algumas regras:
Entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
Sair: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
Subir: para subir um andar (não deve subir se já estiver no último andar);
Descer: para descer um andar (não deve descer se já estiver no térreo);
Obs.: Encapsular todos os atributos da classe (criar os métodos set e get).
**/
public class ElevadorExecucao {
    public static void main(String[] args) {
        Elevador e1 = new Elevador(0, 10, 5, 0, true);
        e1.inicializar();
        e1.descer();
        e1.subir();
        e1.sair();
    }   
}
