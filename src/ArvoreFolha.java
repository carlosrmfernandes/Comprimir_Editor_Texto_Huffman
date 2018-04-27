
/**
 *
 * @author Carlos Fernandes
 */
class ArvoreFolha extends CriarArvore {

    //inseri a letra a um no da folha
    public final char valor;
    
    public char getValor() {
        return valor;
    }

    public ArvoreFolha(int frequencia, char valor) {
        super(frequencia);
        this.valor = valor;
    }
}
