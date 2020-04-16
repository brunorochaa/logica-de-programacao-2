public class Computador implements IMemoria, IProcessador, IPlacaMae, IComputador {
    //Atributos
    private String marca;
    private String modelo;
    private String tipo;
    private String statusRaid;
    private String statusComputador;
    
    //Get&Set
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = this.modelo;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo() {
        this.tipo = this.tipo;
    }
    
    public void setStatusRaid(String statusRaid) {
        this.statusRaid = statusRaid;
    }
    
    public void setStatusComputador(String statusComputador) {
        this.statusComputador = statusComputador;
    }
    
    //Métodos Memória
    @Override
    public String mostrarQuantidadeDeMemoria() {
        return mostrarQuantidadeDeMemoria();
    }

    @Override
    public String mostrarMarca() {
        return mostrarMarca();
    }
    
    //Set
    public void setMostrarQuantidadeDeMemoria(String mostrarQuantidadeDeMemoria) {
        mostrarQuantidadeDeMemoria = mostrarQuantidadeDeMemoria;
    }
    
    public void setMostrarMarca(String mostrarMarca) {
        mostrarMarca = mostrarMarca;
    }
    
    //Métodos Processador
    @Override
    public String mostrarVelocidade() {
        return mostrarVelocidade();
    }
    
    /*@Override
    public String mostrarMarca() {
        return mostrarMarca();
    }*/
    
    @Override
    public String mostrarModelo() {
        return mostrarModelo();
    }
    
    @Override
    public String mostrarGeracao() {
        return mostrarGeracao();
    }
    
    //Set
    public void setMostrarVelocidade(String mostrarVelocidade) {
        mostrarVelocidade = mostrarVelocidade;
    }
    
    public void setMostrarModelo(String mostrarModelo) {
        mostrarModelo = mostrarModelo;
    }
    
    public void setMostrarGeracao(String mostrarGeracao) {
        mostrarGeracao = mostrarGeracao;
    }
    
    //Métodos Placa-Mãe
    @Override
    public String mostrarTipoPlacaMae() {
        return mostrarTipoPlacaMae();
    }
    
    @Override
    public String mostrarFabricante() {
        return mostrarFabricante();
    }
    
    @Override
    public int mostrarQuantidadeControladorasSata() {
        return mostrarQuantidadeControladorasSata();
    }
    
    @Override
    public int mostrarQuantidadeUSBs() {
        return mostrarQuantidadeUSBs();
    }
    
    @Override
    public void ativarRaid() {
        statusRaid = "Raid Ativado";
    }
    
    @Override
    public void desativarRaid() {
        statusRaid = "Raid Desativado";
    }
    
    //Set
    public void setMostrarTipoPlacaMae(String mostrarTipoPlacaMae) {
        mostrarTipoPlacaMae = mostrarTipoPlacaMae;
    }
    
    public void setMostrarFabricante(String mostrarFabricante) {
        mostrarFabricante = mostrarFabricante;
    }
    
    public void setMostrarQuantidadeControladorasSata(String mostrarQuantidadeControladorasSata) {
        mostrarQuantidadeControladorasSata = mostrarQuantidadeControladorasSata;
    }
    
    public void setNostrarQuantidadeUSBs(String mostrarQuantidadeUSBs) {
        mostrarQuantidadeUSBs = mostrarQuantidadeUSBs;
    }
    
    //Métodos Computador
    @Override
    public void on() {
        statusComputador = "Computador Ligado";
    }
    
    @Override
    public void off() {
        statusComputador = "Computador Desligado";
    }
    
    @Override
    public void restart() {
        statusComputador = "Computador Reiniciado";
    }
    
    @Override
    public void hibernate() {
        statusComputador = "Computador Hibernando";
    }
    
    //toString
    @Override
    public String toString() {
        return "### Computador ###"+
               "\nMarca: " +getMarca()+
               "\nModelo: " +getModelo()+
               "\nTipo: " +getTipo()+
               "\nStatus Raid: " +statusRaid+
               "\nStatus Computador: " +statusComputador;
    }
}