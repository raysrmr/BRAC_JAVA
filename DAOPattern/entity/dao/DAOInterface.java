package entity.dao;
import entity.Stu;
import java.util.*;
public interface DAOInterface
{
	public void insert(Stu st)throws Exception;
	public ArrayList showAll() throws Exception;
	public ArrayList showByID(int id) throws Exception;
	public int updateByID(int id) throws Exception;
	public int deleteByID(int id) throws Exception;
}