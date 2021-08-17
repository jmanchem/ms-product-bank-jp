package com.example.msproduct.model.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "product")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
public class Product {
    @Id
    private String productId;
    @Field(name = "productName")
    private String productName;
    @Field(name = "productType") // Pasivo (cuenta corriente, cuenta de ahorro,plazo fijo) o activo (creditos)
    private String productType;
    @Field(name = "rules") //Tipo de customer (PERSONAL-EMPRESARIAL)
    private Rules rules;
}
