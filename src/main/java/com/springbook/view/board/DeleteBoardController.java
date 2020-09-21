package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.view.controller.Controller;

public class DeleteBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// 1. ����� �Է� ���� ����
		String seq = request.getParameter("seq");

		// 2. DB ���� ó��
		BoardDAO boardDAO = new BoardDAO();
		BoardVO vo = new BoardVO();
		
		vo.setSeq(Integer.parseInt(seq));
		boardDAO.deleteBoard(vo);
		
		// 3. ȭ�� �׺���̼�
		return "getBoardList.do";
	}

}