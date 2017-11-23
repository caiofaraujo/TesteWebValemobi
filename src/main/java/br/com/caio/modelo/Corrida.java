package br.com.caio.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="motorista_corrida")
public class Corrida {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double valor;
	@OneToOne(cascade = CascadeType.ALL, targetEntity = Motorista.class)
	private Motorista motorista;
	@OneToOne(cascade = CascadeType.ALL, targetEntity = Passageiro.class)
	private Passageiro passageiro;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValor() {	
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Motorista getMotorista() {
		return motorista;
	}
	public void setMotorista(Motorista motorista) {
		this.motorista = motorista;
	}
	public Passageiro getPassageiro() {
		return passageiro;
	}
	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}
	
	
}
