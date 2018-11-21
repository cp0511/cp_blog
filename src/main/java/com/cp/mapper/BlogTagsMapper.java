package com.cp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cp.vo.BlogTagsVo;
import com.cp.pojo.BlogTags;

/**
 * 
 * todo:描述
 * BlogTags<br/>
 * 创建人:程程有小棉被啊<br/>
 * 时间：2018年11月21日 18:00:52 <br/>
 * @version 1.0.0<br/>
 *
 */
public interface BlogTagsMapper {
	//添加
	public int saveBlogTags(BlogTags blogtags);
	//修改
	public int updateBlogTags(BlogTags blogtags);
	//删除
	public int deleteBlogTagsById(@Param("id")Integer id);
	//查询单个
	public BlogTags getBlogTagsById(@Param("id")Integer id);
	//查询所有
	public List<BlogTags> queryBlogTagsAll(BlogTagsVo blogtagsVo);
}