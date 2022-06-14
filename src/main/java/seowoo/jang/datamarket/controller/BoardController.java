package seowoo.jang.datamarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import seowoo.jang.datamarket.model.BoardDto;
import seowoo.jang.datamarket.service.BoardService;

import java.util.Date;

@Controller
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/board")
    public String getContents(Model model){
        model.addAttribute("boards", boardService.getAllContents());
        return "board/boardList";
    }

    @GetMapping("/board/{id}")
    public String getContent(Model model, @PathVariable String id){
        model.addAttribute("board", boardService.getContentById(Integer.valueOf(id)));
        return "board/boardContent";
    }

    @GetMapping("/board/new")
    public String newContent(){
        return "board/newContent";
    }

    @PostMapping("/board/new")
    public String saveNewContent(ContentForm form){
        BoardDto content = new BoardDto();
        content.setTitle(form.getTitle());
        content.setContent(form.getContent());
        content.setDatetime(new Date());

        boardService.registerNewContent(content);

        return "redirect:/board";
    }

}
