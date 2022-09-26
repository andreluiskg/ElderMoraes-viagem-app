package com.andreluiskg.reserva;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@Readiness
public class ReadinessCheck implements HealthCheck {

	@Override
	public HealthCheckResponse call() {

		if (Reserva.listAll() == null) {
			return HealthCheckResponse.down("AGENCIA-MICRO-RESERVA não está pronto");
		} else {
			return HealthCheckResponse.up("AGENCIA-MICRO-RESERVA está pronto");
		}

	}

}
