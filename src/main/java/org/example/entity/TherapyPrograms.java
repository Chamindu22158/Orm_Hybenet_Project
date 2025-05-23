package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TherapyPrograms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String duration;
    private double cost;
    private String description;
    @OneToMany(mappedBy = "therapyPrograms")
    private List<TherapySessions> therapySessions;

    public TherapyPrograms(String name, String duration, double cost, String description) {
        this.name=name;
        this.duration=duration;
        this.cost=cost;
        this.description=description;
    }

    public TherapyPrograms(int id, String name, String duration, double cost, String description) {
        this.id=id;
        this.name=name;
        this.duration=duration;
        this.cost=cost;
        this.description=description;
    }
}
