package br.com.caio.utils;

import br.com.caio.modelo.Corrida;
import br.com.caio.modelo.Motorista;

public class ValidarCorrida {

	public ValidarCorrida() {

	}

	public String validarCorrida(Corrida c) {
		String msgErro;
		
		try {
			if (c.getMotorista().getNome().equals("Selecione") || c.getMotorista().getNome() == null) {
				msgErro = "Selecione o campo motorista";
				return msgErro;
			} else if (c.getPassageiro().getNome().equals("Selecione") || c.getPassageiro().getNome() == null) {
				msgErro = "Selecione o campo passageiro";
				return msgErro;
			} else if (c.getValor() == 0) {
				msgErro = "Informe o campo valor";
				return msgErro;
			}				
			
		} catch (Exception e) {
			System.out.println("Corrida inválida");
		}

		return null;
	}

}
