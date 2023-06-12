package nl.itvitae.spartans.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Stage {
    @Id
    private  int id;
    public String description;
}
