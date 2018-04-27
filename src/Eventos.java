
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Carlos Fernandes
 */
public class Eventos implements ActionListener {

    SetGet s = new SetGet();
    TelaPrincipal telaprincipal;
    File file2;

    public Eventos(TelaPrincipal telaprincipal) {
        this.telaprincipal = telaprincipal;
    }

    public void Abrir() throws IOException {
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter arquivo = new FileNameExtensionFilter("Arquivo de Texto", "txt");
        file.setFileFilter(arquivo);
        int retorno = file.showOpenDialog(telaprincipal);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            file2 = new File(file.getSelectedFile().getAbsolutePath());
            telaprincipal.N_A(file2);

            try {
                FileReader fis = new FileReader(file2);
                BufferedReader bis = new BufferedReader(fis);

                String linha = bis.readLine();

                while (linha != null) {
                    telaprincipal.jTextArea.append(linha + "\n");
                    linha = bis.readLine();

                }
                bis.close();
                fis.close();
            } catch (FileNotFoundException e) {

            } catch (IOException e) {

            }

        }

    }

    public void salvarcomo() {
        JFileChooser file = new JFileChooser();
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter arquivo = new FileNameExtensionFilter("Arquivo de Texto", "txt");
        file.setFileFilter(arquivo);
        int retorno = file.showSaveDialog(telaprincipal);
        try {
            FileWriter escreve;
            escreve = new FileWriter(file.getSelectedFile().getAbsolutePath() + ".txt");
            escreve.write(telaprincipal.jTextArea.getText());
            escreve.close();
            file2 = new File(file.getSelectedFile().getAbsolutePath() + ".txt");
            telaprincipal.N_A(file2);
        } catch (Exception erro) {

        }
    }

    public void salvar() throws IOException {

        if (file2 == null) {
            salvarcomo();

        } else {

            FileWriter arq = new FileWriter(file2);

            PrintWriter gravar = new PrintWriter(arq);
            gravar.printf(telaprincipal.jTextArea.getText());

            gravar.close();
        }
    }

    public void novo() {
        s.setArea(telaprincipal.jTextArea.getText());
        if (s.area.isEmpty()) {
            return;
        }

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja criar novo Texto ? Att : voce perderá tudo que foi "
                + "\nDigitado até o momento.");

        if (escolha == 0) {
            telaprincipal.jTextArea.setText("");
            file2 = null;
            telaprincipal.N_A(file2);
        }
    }

    public void sair() {
        s.setArea(telaprincipal.jTextArea.getText());
        if (s.area.isEmpty()) {
            System.exit(0);

        } else {
            int escolha = JOptionPane.showConfirmDialog(null, "Voce esta perto de encerrar o seu programa Att : voce perderá tudo que foi "
                    + "\nDigitado até o momento.");

            if (escolha == 0) {
                System.exit(0);

            }
        }

    }

    public void actionPerformed(ActionEvent e) {
        if ("sair".equals(e.getActionCommand())) {
            sair();

        }
        if ("novo".equals(e.getActionCommand()) || "btnovo".equals(e.getActionCommand())) {
            novo();
            file2 = null;
        }

        if ("abrir".equals(e.getActionCommand()) || "btabrir".equals(e.getActionCommand())) {
            try {
                s.setArea(telaprincipal.jTextArea.getText());
                if (s.area.isEmpty()) {
                    Abrir();
                } else {
                    int escolha = JOptionPane.showConfirmDialog(null, "Deseja Abrir novo Texto ? Att : Salve para vocé não Perder os seu Dados "
                            + "\nDigitado até o momento."
                            + "\nDeseja Continuar");

                    if (escolha == 0) {
                        telaprincipal.jTextArea.setText("");
                        Abrir();
                    }
                }
            } catch (IOException ex) {

            }
        }
        if ("salvarcomo".equals(e.getActionCommand()) || "btsalvacomo".equals(e.getActionCommand())) {
            file2 = null;
            salvarcomo();

        }
        if ("salvar".equals(e.getActionCommand()) || "btsalvar".equals(e.getActionCommand())) {
            try {
                salvar();
            } catch (IOException ex) {
                Logger.getLogger(Eventos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("btcompactar".equals(e.getActionCommand())) {
            s.setArea(telaprincipal.jTextArea.getText());
            String Tex = s.area;

            String texto = Tex;
            int[] frequencia = new int[256];

            //cirar um vetor de frequencia
            for (char f : texto.toCharArray()) {
                frequencia[f]++;
            }
            CriarArvore arv = contruirarvore(frequencia);

            StringBuffer prefixo = new StringBuffer();
            cabecalho(arv, prefixo);

            String codigo = compactar(arv, Tex);
            String textoCabeca = prefixo.toString();

            JFileChooser file = new JFileChooser();
            file.setFileSelectionMode(JFileChooser.FILES_ONLY);
            FileNameExtensionFilter arquivo = new FileNameExtensionFilter("Arquivo de Texto", "txt");
            file.setFileFilter(arquivo);
            int retorno = file.showSaveDialog(telaprincipal);
            try {
                FileWriter escreve;
                escreve = new FileWriter(file.getSelectedFile().getAbsolutePath() + ".huf");
                escreve.write(textoCabeca);
                escreve.write("\r");
                escreve.write(codigo);
                escreve.close();

            } catch (Exception erro) {

            }

        }

        if ("descompactar".equals(e.getActionCommand())) {
        }

    }

    public static void cabecalho(CriarArvore arv, StringBuffer prefixo) {
        if (arv instanceof ArvoreFolha) {
            prefixo.append(1);
            prefixo.append(((ArvoreFolha) arv).valor);
            return;
        }
        ArvoreNo arvore = (ArvoreNo) arv;
        prefixo.append(0);
        cabecalho(arvore.esquerda, prefixo);
        cabecalho(arvore.direita, prefixo);
    }

    public static CriarArvore contruirarvore(int[] charFreqs) {

        // Cria uma Fila de Prioridade criado pela ordem de frequência da letra no texto
        PriorityQueue<CriarArvore> arvore = new PriorityQueue<CriarArvore>();

        // criando as Folhas  para cada letra 
        for (int i = 0; i < charFreqs.length; i++) {
            if (charFreqs[i] > 0) {
                // Inser afolha, na fila de prioridade
                arvore.offer(new ArvoreFolha(charFreqs[i], (char) i));
            }
        }

        // Criando a árvore 
        for (int i = arvore.size(); i > 1; i--) {
            // Pega os dois nós com menor frequência
            CriarArvore no1 = arvore.poll();
            CriarArvore no2 = arvore.poll();

            // Criar os nós da árvore binária
            arvore.offer(new ArvoreNo(no1, no2));
        }

        return arvore.poll();
    }

    //compatar a string
    public static String compactar(CriarArvore arv, String textocomp) {
        assert arv != null;

        String textocomp1 = "";
        for (char frq : textocomp.toCharArray()) {
            textocomp1 += (codigo(arv, new StringBuffer(), frq));
        }
        return textocomp1; // Retorna o texto Compactado
    }

    public static String codigo(CriarArvore arv, StringBuffer prefixo, char caracter) {
        assert arv != null;

        if (arv instanceof ArvoreFolha) {
            ArvoreFolha folha = (ArvoreFolha) arv;

            // Retorna o texto compactado da letra
            if (folha.valor == caracter) {
                return prefixo.toString();
            }

        } else if (arv instanceof ArvoreNo) {
            ArvoreNo arvore = (ArvoreNo) arv;

            // Percorre a esquerda
            prefixo.append('0');
            String esquerda = codigo(arvore.esquerda, prefixo, caracter);
            prefixo.deleteCharAt(prefixo.length() - 1);

            // Percorre a direita
            prefixo.append('1');
            String direita = codigo(arvore.direita, prefixo, caracter);
            prefixo.deleteCharAt(prefixo.length() - 1);

            if (esquerda == null) {
                return direita;
            } else {
                return esquerda;
            }
        }
        return null;
    }

}
