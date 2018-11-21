package com.cp.mapper;

import com.cp.pojo.Blog;
import com.cp.vo.BlogVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 
 * todo:描述
 * Blog<br/>
 * 创建人:程程有小棉被啊<br/>
 * 时间：2018年11月20日 17:51:51 <br/>
 * @version 1.0.0<br/>
 *
 */
public interface BlogMapper {
	//添加
	public int saveBlog(Blog blog);
	//修改
	public int updateBlog(Blog blog);
	//删除
	public int deleteBlogById(@Param("id")Integer id);
	//查询单个
	public Blog getBlogById(@Param("id")Integer id);
	//查询所有
	public List<Blog> queryBlogAll(BlogVo blogVo);

	public List<Map<String,Object>> queryBlog();










}