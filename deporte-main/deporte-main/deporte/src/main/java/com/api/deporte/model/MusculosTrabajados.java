package com.api.deporte.model;

import java.util.List;

public class MusculosTrabajados {

    private List<String> principales;
    private List<String> secundarios;

    public List<String> getPrincipales() {
        return principales;
    }

    public void setPrincipales(List<String> principales) {
        this.principales = principales;
    }

    public List<String> getSecundarios() {
        return secundarios;
    }

    public void setSecundarios(List<String> secundarios) {
        this.secundarios = secundarios;
    }
}
