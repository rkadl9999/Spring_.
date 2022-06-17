package hyeonuk.board.Controller;

import hyeonuk.board.DTO.request.BoardDto;
import hyeonuk.board.Service.boardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BoardController {
    private final boardService boardService;
    @PostMapping("/posting")
    public Boolean create(@RequestBody BoardDto boardDto){
        boardService.createBoard(boardDto);
        return true;
    }
}
