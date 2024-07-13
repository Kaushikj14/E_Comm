package com.telusko.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity // to create table
@Data // to get getter setter etc
@AllArgsConstructor // to create constuctors
@NoArgsConstructor // to create no arg constructors
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;

    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageDate;

//    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
//    private Date releaseDate;
//    private boolean available;
//    private int quantity;
//
//    private String imageName;
//    private String imageType;
//    @Lob
//    private byte[] imageDate;

    public void setImageName(String originalFilename) {
        this.imageName = originalFilename;
    }

    public void setImageType(String contentType) {
        this.imageType = contentType;
    }

    public void setImageDate(byte[] bytes) {
        this.imageDate = bytes;
    }

    public byte[] getImageDate() {
        return imageDate;
    }

    public void setImageData(byte[] imageDate) {
        this.imageDate = imageDate;
    }

    public String getImageType() {
        return imageType;
    }
}
