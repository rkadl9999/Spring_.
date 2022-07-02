package hyeonuk.board.DTO.request;

import hyeonuk.board.model.Board;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardDto {

    private Long id;

    private String name;

    private String title;

    private String context;

    public Board toEntity() {
        return Board.builder()
                .id(id)
                .name(name)
                .title(title)
                .context(context)
                .build();
    }
}
