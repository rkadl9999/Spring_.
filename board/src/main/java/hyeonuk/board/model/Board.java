package hyeonuk.board.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "BOARD")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String name;
    private String title;
    private String context;
}
