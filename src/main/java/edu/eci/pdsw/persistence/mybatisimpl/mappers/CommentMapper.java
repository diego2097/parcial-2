package edu.eci.pdsw.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import edu.eci.pdsw.entities.Comment;

public interface CommentMapper {

	List<Comment> getCommentsByTitle(@Param("title") String title);
	
	List<Comment> searchOffensiveComments();

}
