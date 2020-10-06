
public class ProdutosIterator implements Iterator {

	Produto[] itens;
	int posicao = 0;

	public ProdutosIterator(Produto[] itens) {
		this.itens = itens;
	}

	public Object next() {
		Produto produto = itens[posicao];
		posicao++;
		return produto;
	}

	public boolean hasNext() {
		if (posicao >= itens.length || itens[posicao] == null) {
			return false;
		} else {
			return true;
		}
	}

}