package br.com.willalves.microservicespoc.spendmoney.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Table
public class Expense {

    @Id
    private Long id;

    @NotNull(message = "Description is required")
    private String description;

    @NotNull(message = "Value is required")
    private Double value;

    @NotNull(message = "Date is required")
    private Date date;

    @JsonIgnore
    private String owner;
}
