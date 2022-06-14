package seowoo.jang.datamarket.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import seowoo.jang.datamarket.model.BoardDto;
import seowoo.jang.datamarket.model.UserDto;
import seowoo.jang.datamarket.repository.BoardRepository;
import seowoo.jang.datamarket.repository.UserRepository;

import java.util.List;

@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public BoardDto getContentById(Integer id){
        return this.boardRepository.findContentById(id);
    }

    public List<BoardDto> getAllContents(){
        return this.boardRepository.findContentAll();
    }

    public Integer registerNewContent(BoardDto board) {
        return this.boardRepository.insertNewContent(board);
    }
}
