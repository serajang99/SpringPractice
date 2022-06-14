package seowoo.jang.datamarket.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import seowoo.jang.datamarket.model.BoardDto;

import java.util.List;

@Mapper
public interface BoardRepository {
    public BoardDto findContentById(@Param("id") Integer id);

    public List<BoardDto> findContentAll();

    public Integer insertNewContent(@Param("board") BoardDto board);
}
