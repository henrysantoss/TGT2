
package tgt2.Estrutura;

public class Trailer {
    private String somaLinhaConexoes;
    private String somaLinhaPesos;
    private String somaPesos;
    
    public Trailer(String somaLinhaConexoes, String somaLinhaPesos, String somaPesos){
        this.somaLinhaConexoes = somaLinhaConexoes;
        this.somaLinhaPesos = somaLinhaPesos;
        this.somaPesos = somaPesos;
    }
    
    public String getSomaLinhaConexoes() {return somaLinhaConexoes;}
    public String getSomaLinhaPesos() {return somaLinhaPesos;}
    public String getSomaPesos() {return somaPesos;}
    public void setSomaLinhaConexoes(String somaLinhaConexoes) {this.somaLinhaConexoes = somaLinhaConexoes;}
    public void setSomaLinhaPesos(String somaLinhaPesos) {this.somaLinhaPesos = somaLinhaPesos;}
    public void setSomaPesos(String somaPesos) {this.somaPesos = somaPesos;}
}
