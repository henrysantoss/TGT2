package tgt2.Estrutura;

public class Config {
    private String pastaProcessado;
    private String pastaNaoProcessado;
    
    public Config(String pastaP, String pastaNP) {
        this.pastaProcessado = pastaP;
        this.pastaNaoProcessado = pastaNP;
    } 
    
    public String getProcessado() {return pastaProcessado;}
    public String getNaoProcessado() {return pastaNaoProcessado;}
    public void setProcessado(String pastaP) {this.pastaProcessado = pastaP;}
    public void setNaoProcessado(String pastaNP) {this.pastaNaoProcessado = pastaNP;}
}
