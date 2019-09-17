package voronovo.koi2019.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Score {
    @Id
    private Long id;
    private LocalTime time;
    private LocalDate date;
    private String name;
}
