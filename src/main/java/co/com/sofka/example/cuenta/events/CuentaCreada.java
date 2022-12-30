package co.com.sofka.example.cuenta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.example.cuenta.values.Email;
import co.com.sofka.example.cuenta.values.Nombre;

public class CuentaCreada extends DomainEvent {
    private final Nombre nombre;
    private final Email email;

    public CuentaCreada(Nombre nombre, Email email) {
        super("sofka.cuenta.cuentacreada");
        this.nombre = nombre;
        this.email = email;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }
}
