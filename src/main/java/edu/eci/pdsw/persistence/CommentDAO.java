package edu.eci.pdsw.persistence;

import java.util.List;

import edu.eci.pdsw.entities.Comment;

public interface CommentDAO {

	
	public List<Comment> load(String title) throws PersistenceException;
	
	public List<Comment> searchOffensiveComments() throws PersistenceException;
}
