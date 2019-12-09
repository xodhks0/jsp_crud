package jsp_crud.com.board.bdi.service;

import java.util.List;
import java.util.Map;

public interface BoardService {
	public List<Map<String, String>> getBoardList (Map<String,String> board);
	public Map<String, String> getBoard(Map<String, String> board);
	public Map<String, String> insertBoard(Map<String, String> board);
	public Map<String, String> updateBoard(Map<String, String> board);
	public Map<String, String> deleteBoard(Map<String, String> board);
	
}
