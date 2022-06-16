package me.ws.triple.mileage.domain.place;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Place {

    @Id
    @Type(type = "uuid-char")
    private UUID id;
}
