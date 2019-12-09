package jsp_crud.com.board.bdi.dao;

import java.util.List;
import java.util.Map;

public interface BoardDAO {
	public List<Map<String,String>> selectBoardList(Map<String, String> board);
	public Map<String,String> selectBoard(Map<String,String> board);
	public int insertBoard(Map<String,String> board);
	public int updateBoard(Map<String,String> board);
	public int deleteBoard(Map<String,String> board);
}
