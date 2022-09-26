package com.andreluiskg.cliente;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@Readiness
public class ReadinessCheck implements HealthCheck {

	@Override
	public HealthCheckResponse call() {

		if (Cliente.listAll() == null) {
			return HealthCheckResponse.down("AGENCIA-MICRO-CLIENTE não está pronto");
		} else {
			return HealthCheckResponse.up("AGENCIA-MICRO-CLIENTE está pronto");
		}

	}

}
