package com.aluracurso.record.models;

import java.util.Objects;

public final class Telefono {
    private final String codigoDeArea;
    private final String numero;

    public Telefono(String codigoDeArea, String numero) {
        this.codigoDeArea = codigoDeArea;
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoDeArea, numero);
    }

    public String getCodigoDeArea() {
        return codigoDeArea;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Telefono)) {
            return false;
        } else {
            Telefono other = (Telefono) obj;
            return Objects.equals(codigoDeArea, other.codigoDeArea)
                    && Objects.equals(numero, other.numero);
        }
    }

}
