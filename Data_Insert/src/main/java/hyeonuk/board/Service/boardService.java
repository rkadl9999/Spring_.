package hyeonuk.board.Service;

import hyeonuk.board.DTO.request.BoardDto;
import hyeonuk.board.model.Board;
import hyeonuk.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class boardService {
    private final BoardRepository BoardRepository;
    @Transactional
    public void createBoard(BoardDto boardDto){
        Board board = boardDto.toEntity();
        BoardRepository.save(board);
    }
}
