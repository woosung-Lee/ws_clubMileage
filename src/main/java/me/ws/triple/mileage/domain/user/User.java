package me.ws.triple.mileage.domain.user;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class User {

    @Id
    @Type(type = "uuid-char")
    private UUID id;
}
