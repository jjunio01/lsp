package main;

import java.util.ArrayList;
import java.util.List;

/**
 * @author JJunio
 *
 */
public class ProcessadorDeInvestimentos {

	public static void main(String[] args) {

		List<Conta> contasBanco = new ArrayList<>();
		Conta contaComumUm = new ContaComum(100);
		Conta contaComumDois = new ContaComum(200);
		Conta contaEstudanteUm = new ContaEstudante(50);
		Conta contaEstudanteDois = new ContaEstudante(80);
		ContaComum contaComumTres = new ContaComum(500);
		contasBanco.add(contaComumUm);
		contasBanco.add(contaComumDois);
		contasBanco.add(contaEstudanteUm);
		contasBanco.add(contaEstudanteDois);
		contasBanco.add(contaComumTres);

		for (Conta conta : contasBanco) {
			if( conta instanceof ContaComum) {
				((ContaComum) conta).rende();
			}
			System.out.println(conta.getSaldo());
		}
	}

}
