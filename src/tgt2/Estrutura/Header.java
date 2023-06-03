
package tgt2.Estrutura;

public class Header {
    private String nosGrafos;
    private String somaPesos;
    
    public Header(String nosGrafos, String somaPesos){
        this.nosGrafos = nosGrafos;
        this.somaPesos = somaPesos;
    }
    
    public String getNos() {return nosGrafos;}
    public String getPesos() {return somaPesos;}
    public void setNos(String nosGrafos) {this.nosGrafos = nosGrafos;}
    public void setPesos(String somaPesos) {this.somaPesos = somaPesos;}
}
