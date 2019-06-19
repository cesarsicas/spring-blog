package com.siqueira.julio.springblog.data.entities;

public enum RoleType {
    ADMIN(1, "ADMIN"), MEDICO(2, "MEDICO"), PACIENTE(3, "PACIENTE");

    private long cod;
    private String desc;

    private RoleType(long cod, String desc) {
        this.cod = cod;
        this.desc = desc;
    }

    public long getCod() {
        return cod;
    }

    public String getDesc() {
        return desc;
    }
}
