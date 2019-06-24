package guru.springframework.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Doa on 24-6-2019.
 */
@Entity
public class Ingredient {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;

    private String description;
    private BigDecimal amount;

    @OneToOne (fetch = FetchType.EAGER) // here eager is JPA2.1 default, so redundant, but we use it here to show intent
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public UnitOfMeasure getUom() {
        return uom;
    }

    public void setUom(UnitOfMeasure uom) {
        this.uom = uom;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
