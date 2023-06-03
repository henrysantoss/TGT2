package tgt2;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TGT2 {
    private static final long serialVersionUID = 1L;
    public static void main(String[] args) {
        final TrayIcon trayIcon;
        try {
            boolean arquivoExiste;
            String pastaTeste = "C:\\Teste\\Configuracao";
            try {
              File f = new File(pastaTeste+"\\rota.txt");
              arquivoExiste = f.exists();
            } catch(Exception e) {
                arquivoExiste = false;
            }
            if (!arquivoExiste) {
                System.out.println(pastaTeste+"\\rota.txt");
                new File(pastaTeste).mkdirs();
                FileWriter writer = new FileWriter(pastaTeste+"\\rota.txt");
                writer.write("0");
                writer.write("\nIr para configuração");
                writer.close();
            }
            
            String rota = "";
            File reader = new File(pastaTeste+"\\rota.txt");
            BufferedReader br = new BufferedReader(new FileReader(reader));
            String st;
            int linhas = 0;
            while ((st = br.readLine()) != null) {
                if (linhas == 0) {
                    rota = st;
                }
                linhas++;
            }
            br.close();
            
            if (linhas > 1) {
                Configurador configurador = new Configurador();
                configurador.setLocationRelativeTo(null);
                configurador.setVisible(true);
            } else  {
                // Criação do arquivo de saída
                FileOutputStream arquivo = new FileOutputStream("pastas.dat");
                ObjectOutputStream outputStream = new ObjectOutputStream(arquivo);
                List<String> pastas = new ArrayList<>();
                File config = new File(pastaTeste+"\\config.txt");
                BufferedReader leitor = new BufferedReader(new FileReader(config));
                String linha;
                int numeroLinha = 0;
                while ((linha = leitor.readLine()) != null) {
                    numeroLinha++;
                    String pastaConfig = linha;
                    pastas.add(pastaConfig);
                }
                outputStream.writeObject(pastas);
                outputStream.close();
                arquivo.close();
                
                if (rota.equals("0")) {
                    Tela tela = new Tela();
                    tela.setLocationRelativeTo(null);
                    tela.setVisible(true);
                } else {
                    addTray();
                    Timer timer = new Timer();
                    TimerTask task = new ThreadTimer();
                    long delay = 0;
                    long interval = 5000;
                    timer.scheduleAtFixedRate(task, delay, interval);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }  
    }
    
    public static void addTray() {
        TrayIcon trayIcon = null;
        SystemTray tray = SystemTray.getSystemTray();
        Path path = Paths.get("src/tgt2/img/giphy.gif");
        Image image = Toolkit.getDefaultToolkit().getImage(path.toAbsolutePath().toString());
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };
        PopupMenu popup = new PopupMenu();
        MenuItem defaultItem = new MenuItem("Fechar");
        defaultItem.addActionListener(listener);
        popup.add(defaultItem);
        trayIcon = new TrayIcon(image, "Tray TGT2", popup);
        trayIcon.setImageAutoSize(true);
        trayIcon.addActionListener(listener);
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.err.println(e);
        }
    }

    public static class ThreadTimer extends TimerTask {
        @Override
        public void run() {
            Tela func = new Tela();
            try {
                File folder = new File("C:\\Teste");
                File[] listaArquivos = folder.listFiles();
                
                for (int i = 0; i < listaArquivos.length; i++) {
                    if (listaArquivos[i].isFile()) {
                        String verifica = func.verificaArquivo(listaArquivos[i].getPath());
                        if (verifica.isEmpty()) {
                            if (func.buscaRotas(listaArquivos[i].getPath(), false)) {
                                func.processaArquivoAutomatico(listaArquivos[i].getPath());
                                String verificar = func.geraArquivoProcessado(listaArquivos[i].getPath());
                                if (!verificar.isEmpty()) {throw new Exception("Erro ao gerar arquivo processado");}
                            } else {
                                func.geraArquivoNaoProcessado(listaArquivos[i].getPath());
                            }
                        } 
                    }
                  }
            } catch (Exception e) {
                func.geraErro(e.getMessage());
            }
        }
    }
    
}
