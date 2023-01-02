package co.com.sofka.example.cuenta;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.example.cuenta.events.CorreoCambiado;
import co.com.sofka.example.cuenta.events.CuentaCreada;
import co.com.sofka.example.cuenta.events.NombreCambiado;

public class CuentaChange extends EventChange {
    public CuentaChange(Cuenta cuenta) {

        apply((CuentaCreada event) -> {
            cuenta.nombre = event.getNombre();
            cuenta.email = event.getEmail();
        });

        apply((CorreoCambiado event) -> {
            cuenta.email = event.getEmail();
        });

        apply((NombreCambiado event) -> {
            cuenta.nombre = event.getNombre();
        });

    }
}
