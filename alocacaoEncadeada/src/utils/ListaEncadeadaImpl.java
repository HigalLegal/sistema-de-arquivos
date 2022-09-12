package utils;

import java.util.ArrayList;
import java.util.List;

public class ListaEncadeadaImpl<T, D> implements ListaEncadeada<T, D> {
	
	private List<T> chaves = new ArrayList<>();
	private List<D> valores = new ArrayList<>();
	
	// ------------------------------------------------------------------------------------
	
	@Override
	public void adicionar(T chave, D valor) {
		chaves.add(chave);
		valores.add(valor);
	}
	
	@Override
	public void remover(int posicao) {
		chaves.remove(posicao);
		valores.remove(posicao);
	}
	
	@Override
	public void alterarValor(int posicao, D novoValor) {
		valores.set(posicao, novoValor);
	}
	
	@Override
	public void alterarChave(int posicao, T novaChave) {
		chaves.set(posicao, novaChave);
	}
	
	@Override
	public int tamanho() {
		return chaves.size();
	}
	
	@Override
	public T getChave(int posicao) {
		return chaves.get(posicao);
	}

	@Override
	public D getValor(int posicao) {
		return valores.get(posicao);
	}
	
	@Override
	public void imprimirChavesComValores() {
		System.out.println(chaves.get(0) + " || " +  valores.get(0));
		
		for(int i = 1; i < chaves.size(); i ++) {
			System.out.println(chaves.get(i) + " || " +  valores.get(i));
		}
	}
}














