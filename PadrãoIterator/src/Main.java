public class Main {
	public static void main(String args []) {
 
	Produto [] Itens = new Produto[3];

	Itens[0] = new Produto("Arroz");
	Itens[1] = new Produto("�leo");
	Itens[2] = new Produto("�leo");
	
	Iterator ItensIterator = new ProdutosIterator(Itens);

	while (ItensIterator.hasNext()) {
		Produto produto = (Produto)ItensIterator.next();
		System.out.println(produto.nome);
		}

}
}

