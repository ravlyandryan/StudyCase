package com.domain.models.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbl_product")
public class Product implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int stockRemaining;

    private String description;

    private String seriesNumbers;

    public Product(Long id, String name, int stockRemaining, String description, String seriesNumbers) {
        this.id = id;
        this.name = name;
        this.stockRemaining = stockRemaining;
        this.description = description;
        this.seriesNumbers = seriesNumbers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockRemaining() {
        return stockRemaining;
    }

    public void setStockRemaining(int stockRemaining) {
        this.stockRemaining = stockRemaining;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeriesNumbers() {
        return seriesNumbers;
    }

    public void setSeriesNumbers(String seriesNumbers) {
        this.seriesNumbers = seriesNumbers;
    }


}
