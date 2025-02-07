package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(max=100, message = "Character limit: 100")
    public String location;

    @OneToMany(mappedBy = "employer")
    @JoinColumn(name="employer_id")
    private final List<Job> jobs = new ArrayList<>();

    public Employer() {
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public @NotNull @Size(max = 100, message = "Character limit: 100") String getLocation() {
        return location;
    }

    public void setLocation(@NotNull @Size(max = 100, message = "Character limit: 100") String location) {
        this.location = location;
    }
}
