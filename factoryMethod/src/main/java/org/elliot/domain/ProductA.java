package org.elliot.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data

public class ProductA {

    private String name;

    private LocalDate createDate;

    private BigDecimal price;

    private ProductA(ProductABuilder builder){
        this.name=builder.name;
        this.createDate=builder.createDate;
        this.price=builder.price;
    }
    
    public static ProductABuilder builder() {
        return new ProductABuilder();
    }





    public static class ProductABuilder  {
        private String name;

        private LocalDate createDate;

        private BigDecimal price;



        public ProductABuilder(){
            //设置默认值
            this.name = "ProductA";
            this.createDate = LocalDate.now();
            this.price = new BigDecimal(100);
        }
        public ProductABuilder name(String name){
            this.name=name;
            return this;
        }

        public ProductABuilder createDate(LocalDate createDate){
            this.createDate=createDate;
            return this;
        }

        public ProductABuilder price(BigDecimal price){
            this.price=price;
            return this;
        }

        public ProductA build(){
            return new ProductA(this);
        }
    }

}
