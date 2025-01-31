package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(max=100, message = "Character limit: 100")
    public String location;

    public Employer() {
    }

    public @NotNull @Size(max = 100, message = "Character limit: 100") String getLocation() {
        return location;
    }

    public void setLocation(@NotNull @Size(max = 100, message = "Character limit: 100") String location) {
        this.location = location;
    }
}
