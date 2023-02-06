package com.cpan252.clotheswarehouse.model;
import org.springframework.data.annotation.Id;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cloth {
    @Id
    private Long id;
    @NotBlank
    private String name;
    private Brand brand;
    @Min(2022)
    private int yearofcreation;
    @DecimalMin(value = "1000.0", inclusive = true)
    private double price;

    public enum Brand {
        BALENCIAGA("Balenciaga"), STONEISLAND("Stone Island"), DIOR("Dior"), CHANEL("Chanel");

        private String brandname;

        private Brand(String brandname) {
            this.brandname = brandname;
        }

        public String getBrandname() {
            return brandname;
        }
    }
}
