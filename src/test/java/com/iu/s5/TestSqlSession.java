package com.iu.s5;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import com.iu.notice.NoticeDAO;
import com.iu.notice.NoticeSerivce;
import com.iu.qna.QnaDAO;
import com.iu.qna.QnaService;

public class TestSqlSession extends AbstractTest {

	@Inject
	private NoticeSerivce qnaDAO;
	
	@Test
	public void test() {
		assertNotNull(qnaDAO);
	}

}
