package solution.first.mapper;


import org.apache.ibatis.annotations.Select;


public interface FirstMapper {
	@Select("select user_name from member WHERE user_id = \"vive1\"")
    public String getList();
}
