package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull
    @Size(max=1000, message = "Character limit: 1000")
    public String description;

    public Skill() {
    }

    public @NotNull @Size(max = 1000, message = "Character limit: 1000") String getDescription() {
        return description;
    }

    public void setDescription(@NotNull @Size(max = 1000, message = "Character limit: 1000") String description) {
        this.description = description;
    }
}
