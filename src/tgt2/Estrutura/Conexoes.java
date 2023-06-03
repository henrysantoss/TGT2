
package tgt2.Estrutura;

public class Conexoes {
    private String noOrigem;
    private String noDestino;
    
    public Conexoes(String noOrigem, String noDestino){
        this.noOrigem = noOrigem;
        this.noDestino = noDestino;
    }
    
    public String getOrigem() {return noOrigem;}
    public String getDestino() {return noDestino;}
    public void setOrigem(String noOrigem) {this.noOrigem = noOrigem;}
    public void setDestino(String noDestino) {this.noDestino = noDestino;}
}
