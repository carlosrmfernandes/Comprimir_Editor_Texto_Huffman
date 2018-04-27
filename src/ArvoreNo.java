
/**
 *
 * @author Carlos Fernandes
 */
public class ArvoreNo extends CriarArvore {

    // criar uma sub arvore
    final CriarArvore esquerda, direita;

    public CriarArvore getEsquerda() {
        return esquerda;
    }

    public CriarArvore getDireita() {
        return direita;
    }

    ArvoreNo(CriarArvore esq, CriarArvore dir) {
        super(esq.frequencia + dir.frequencia);
        esquerda = esq;
        direita = dir;

    }
}
