package com.andreluiskg.cliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

	private long id;
	private String nome;

	private Cliente(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public static Cliente of(long id, String nome) {
		return new Cliente(id, nome);
	}

}
