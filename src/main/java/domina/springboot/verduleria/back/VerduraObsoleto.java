package domina.springboot.verduleria.back;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public record VerduraObsoleto(
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        long id,
        String nombre,
        Double precio,
        boolean troceable) {
}
