package com.nvc.spring.newton.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    @ManyToOne
    @JoinColumn(name = "camera_id")
    private Camera camera;
    private int amount;
    private LocalDateTime created_at ;
    
    public Event(Camera camera, int amount, LocalDateTime created_at) {
        this.camera = camera;
        this.amount = amount;
        this.created_at = created_at;
    }  

    
    
}
