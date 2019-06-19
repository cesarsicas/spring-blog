package com.siqueira.julio.springblog.data.entities;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role  extends AbstractEntity<Long>  {
    @Column(name = "description", nullable = false, unique = true)
    private String desc;

    public Role() {
        super();
    }

    public Role(Long id) {
        super.setId(id);
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
