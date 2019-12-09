package jsp_crud.com.board.bdi.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jsp_crud.com.board.bdi.dao.BoardDAO;
import jsp_crud.com.board.bdi.dao.impl.BoardDAOImpl;
import jsp_crud.com.board.bdi.service.BoardService;

public class BoardServiceImpl implements BoardService {
	private BoardDAO bdao = new BoardDAOImpl();
	
	@Override
	public List<Map<String, String>> getBoardList(Map<String, String> board) {
		return bdao.selectBoardList(board);
	}

	@Override
	public Map<String, String> getBoard(Map<String, String> board) {
		return bdao.selectBoard(board);
	}

	@Override
	public Map<String, String> insertBoard(Map<String, String> board) {
		Map<String, String> rMap = new HashMap<>();
		int result = bdao.insertBoard(board);
		if(result==1) {
			rMap.put("msg", "완료");
			rMap.put("url", "/board/list");
		} else{
			rMap.put("msg", "실패");
			rMap.put("url", "/views/board/insert");
		}
		
		return rMap;
	}

	@Override
	public Map<String, String> updateBoard(Map<String, String> board) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> deleteBoard(Map<String, String> board) {
		// TODO Auto-generated method stub
		return null;
	}

}
