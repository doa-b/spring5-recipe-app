package guru.springframework.domain;

import lombok.Data;

import javax.persistence.*;


/**
 * Created by Doa on 24-6-2019.
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
}
