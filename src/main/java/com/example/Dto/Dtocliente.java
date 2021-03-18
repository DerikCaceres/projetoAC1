package com.example.Dto;

import org.springframework.aop.aspectj.annotation.SingletonMetadataAwareAspectInstanceFactory;

public class Dtocliente {

    private String name;
    private long id;

    public Dtocliente()
    {

    }
    public Dtocliente(String name, long id)
    {
        setName(name);
        setId(id);
    }

    public Dtocliente(Cliente cliente)
    {
        setName(cliente.getName());
        setId(cliente.getId());
    }
    public Dtocliente(long nid, String nname) {
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }
    
}
