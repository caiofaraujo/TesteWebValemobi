package br.com.caio.utils;

import br.com.caio.modelo.Passageiro;

public class ValidarPassageiro {
	
	public ValidarPassageiro() {
		
	}
	
	public String validarPassageiro(Passageiro p) {
		String msgErro ;
		
		try {
			if (p.getNome() == null) {
				msgErro = "Informe o campo nome";
				return msgErro;
			} else if (p.getDataNasc() == null || p.getDataNasc().equals("")) {
				msgErro = "Informe o campo data de nascimento";
				return msgErro;
			} else if (p.getCpf() == null) {
				msgErro = "Informe o campo CPF";
				return msgErro;
			} else if (p.getSexo().equals("0")) {
				msgErro = "Informe o campo sexo";
				return msgErro;
			}
			
		} catch (Exception e) {
			System.out.println("Passageiro inválido");
		}
		
		return null;
	}
}
