package com.andreluiskg.reserva;

import com.andreluiskg.cliente.Cliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reserva {

	private Cliente cliente;

	private Reserva(Cliente cliente) {
		this.cliente = cliente;
	}

	public static Reserva of(Cliente cliente) {
		return new Reserva(cliente);
	}

}
