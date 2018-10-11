package edu.eci.pdsw.persistence.mybatisimpl;

import java.util.List;

import com.google.inject.Inject;

import edu.eci.pdsw.entities.Comment;
import edu.eci.pdsw.persistence.CommentDAO;
import edu.eci.pdsw.persistence.PersistenceException;
import edu.eci.pdsw.persistence.mybatisimpl.mappers.CommentMapper;


public class MyBatisCommentDAO implements CommentDAO{


	@Inject
	CommentMapper commentMapper;

	@Override
	public List<Comment> load(String title) throws PersistenceException {
		try {
			return commentMapper.getCommentsByTitle(title);
		}
		catch(Exception e) {
			throw new PersistenceException("Load all persistence error");
		}
	}

	@Override
	public List<Comment> searchOffensiveComments() throws PersistenceException {
		try {
			return commentMapper.searchOffensiveComments();
		}
		catch(Exception e) {
			throw new PersistenceException("Load all persistence error");
		}
	}
}
