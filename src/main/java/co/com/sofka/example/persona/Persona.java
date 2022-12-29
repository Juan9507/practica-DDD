package co.com.sofka.example.persona;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.example.cuenta.values.CuentaId;
import co.com.sofka.example.persona.events.PersonaCreada;
import co.com.sofka.example.persona.values.Nombre;
import co.com.sofka.example.persona.values.PersonaId;

import java.util.Set;

/**
 *  como es una entidad y es el agregado root extiende de AggregateEvent
 *  pasandole su identificacion unica
 */
public class Persona extends AggregateEvent<PersonaId> {

    protected Nombre nombre;
    protected Set<Funcion> funciones;
    protected CuentaId cuentaId;

    /**
     * Constructor con los parametros que se necesitan al crear el
     * agregado persona
     */
    public Persona(PersonaId entityId, Nombre nombre) {
        super(entityId);
        /* Cueando un caso de uso utilice es agregado al crearlo la consecuencia
           seria lanzar este evento
           Se le dice al agregado que lance un evento de personacreada y que
           se aplica en este contexto
        */
        appendChange(new PersonaCreada(nombre)).apply();
    }
}
