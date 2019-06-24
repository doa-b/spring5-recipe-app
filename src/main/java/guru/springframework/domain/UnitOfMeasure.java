package guru.springframework.domain;

import javax.persistence.*;


/**
 * Created by Doa on 24-6-2019.
 */
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
