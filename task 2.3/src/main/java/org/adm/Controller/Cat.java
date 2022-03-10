package org.adm.Controller;

import io.quarkus.runtime.Startup;
import org.hibernate.hql.internal.NameGenerator;

import javax.enterprise.context.ApplicationScoped;

class Cat implements Mammal {

    int mass = 0;
    String name = "";
    double speed = 1;


    public void changeMass(int newValue) {
        mass = newValue;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public void setSpeed(double newValue) {
        speed = newValue;
    }


    @Startup
    @ApplicationScoped
    public class EagerAppBean {
        EagerAppBean(NameGenerator generator) {
            System.out.println("Mammal uses");
        }
    }

}