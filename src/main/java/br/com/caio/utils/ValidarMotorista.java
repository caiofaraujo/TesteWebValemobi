package br.com.caio.utils;

import br.com.caio.modelo.Motorista;

public class ValidarMotorista {
	public ValidarMotorista() {

	}

	public String validarMotorista(Motorista m) {
		String msgErro ;

		try {
			if (m.getNome() == null) {
				msgErro = "Informe o campo nome";
				return msgErro;
			} else if (m.getDataNasc() == null || m.getDataNasc().equals("")) {
				msgErro = "Informe o campo data de nascimento";
				return msgErro;
			} else if (m.getCpf() == null) {
				msgErro = "Informe o campo CPF";
				return msgErro;
			} 
			else if (m.getModeloCarro() == null) {
				msgErro = "Informe o campo modelo do carro";
				return msgErro;
			}
			else if (m.getSexo().equals("0")) {
				msgErro = "Informe o campo sexo";
				return msgErro;
			}

		} catch (Exception e) {
			System.out.println("Motorista inválido");
		}

		return null;
	}
}
