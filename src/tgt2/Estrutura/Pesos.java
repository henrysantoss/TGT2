
package tgt2.Estrutura;

public class Pesos {
    private String noOrigem;
    private String noDestino;
    private String distancia;
    
    public Pesos(String noOrigem, String noDestino, String distancia){
        this.noOrigem = noOrigem;
        this.noDestino = noDestino;
        this.distancia = distancia;
    }
    
    public String getOrigem() {return noOrigem;}
    public String getDestino() {return noDestino;}
    public String getDistancia() {return distancia;}
    public void setOrigem(String noOrigem) {this.noOrigem = noOrigem;}
    public void setDestino(String noDestino) {this.noDestino = noDestino;}
    public void setDistancia(String distancia) {this.distancia = distancia;}
}
