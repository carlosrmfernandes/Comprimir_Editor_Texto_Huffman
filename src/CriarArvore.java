
/**
 *
 * @author Carlos Fernandes
 */
abstract class CriarArvore implements Comparable<CriarArvore> {

    //frequencia da arvore
    final int frequencia;

    public CriarArvore(int frequencia) {
        this.frequencia = frequencia;
    }

    //comparas as frequencia
    public int compareTo(CriarArvore tree) {
        return frequencia - tree.frequencia;
    }
}
