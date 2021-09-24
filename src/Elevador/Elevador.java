package elevador;
public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int qntUsuarios;
    private boolean ligado;
    
    //construtor
    public Elevador(int andarAtual, int totalAndares, int capacidadeElevador, int qntUsuarios, boolean ligado ) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.qntUsuarios = qntUsuarios;
        this.ligado = true;
    }
    
    //receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
    public void inicializar(){
        if(this.isLigado()) {
            System.out.println(" ==  ELEVADOR INTELIGENTE == ");
            System.out.println("Olá querido usuário ♥ ");
            System.out.println("O prédio tem o total de " + this.getTotalAndares() + " e eu capacidade máxima de "+ this.getCapacidadeElevador()+ " por vez");
        }else{
            System.out.println("Elevador desligado");
        }
    }
    
    //para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço) 
    public void entrar(){
        if(this.getQntUsuarios()>= this.getCapacidadeElevador()){
            System.out.println("Você não pode entrar");           
        }else if(this.getQntUsuarios()< this.getCapacidadeElevador()){
            System.out.println("Você pode entrar");
        }else{
            System.out.println("Invalido");
        }
    }
    
    //para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele)
    public void sair(){
        if(this.getQntUsuarios() == this.getCapacidadeElevador() || this.getQntUsuarios() == 0){
            System.out.println("Você não pode sair");
        }else if(this.getQntUsuarios()< this.getCapacidadeElevador() ){
            System.out.println("Você já pode sair");
        }else{
            System.out.println("Inválido");
        }
    }
    
    //para subir um andar (não deve subir se já estiver no último andar);
    public void subir(){
        if(this.getTotalAndares() == this.getAndarAtual()){
            System.out.println("Não tem mais andares para subir");
        }else{
            System.out.println("Subindo ...");
        }
    }
    
    public void descer(){
        if(this.getAndarAtual()== 0){
            System.out.println("Não tem mais andares para descer");
        }else{
            System.out.println("Descendo ..");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public int getQntUsuarios() {
        return qntUsuarios;
    }

    public void setQntUsuarios(int qntUsuarios) {
        this.qntUsuarios = qntUsuarios;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
}

