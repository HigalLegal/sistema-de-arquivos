package utils;

public interface ListaEncadeada<T, D> {
	
	void adicionar(T chave, D valor);
	void remover(int posicao);
	void alterarValor(int posicao, D novoValor);
	void alterarChave(int posicao, T novaChave);
	int tamanho();
	T getChave(int posicao);
	D getValor(int posicao);
	void imprimirChavesComValores();

}
