package solution.mapper;


import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BoardMapper {
	
	String selectTest() throws Exception;
	
}
	