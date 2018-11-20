package com.cp.service.blog;


import com.cp.mapper.BlogMapper;
import com.cp.pojo.Blog;
import com.cp.vo.BlogVo;
import com.cp.vo.ServerResponse;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * 
 * todo:描述Service实现类
 * BlogServiceImpl<br/>
 * 作者:程程有小棉被啊<br/>
 * 创建时间：2018年11月20日 17:51:51 <br/>
 * @version 1.0.0<br/>
 *
 */
@Service
public class BlogServiceImpl implements IBlogService  {

	@Autowired
	private BlogMapper blogMapper;
	
	public ServerResponse queryBlogAll(BlogVo blogVo){
		PageHelper.startPage(blogVo.getPageNo(), blogVo.getPageSize());
		List<Blog> blogs = blogMapper.queryBlogAll(blogVo);
		PageInfo<Blog> pageInfo = new PageInfo<>(blogs);
		return ServerResponse.createBySuccess(pageInfo);
	}

	@Override
	public ServerResponse queryBlog(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo, pageSize);
	    List<Map<String, Object>> maps = blogMapper.queryBlog();
        PageInfo pageInfo = new PageInfo(maps);
        return ServerResponse.createBySuccess(pageInfo);
	}

	@Override
	public ServerResponse saveBlog(BlogVo blogVo) {
		Blog blog = new Blog();
		BeanUtils.copyProperties(blogVo, blog);
		int count = blogMapper.saveBlog(blog);
		return count>0?ServerResponse.createBySuccess(blog):ServerResponse.createByError();
	}

	
	@Override
	public ServerResponse updateBlog(BlogVo blogVo) {
		Blog blog = new Blog();
		BeanUtils.copyProperties(blogVo, blog);
		int count = blogMapper.updateBlog(blog);
		return count>0?ServerResponse.createBySuccess(blog):ServerResponse.createByError();
	}

	
	@Override
	public ServerResponse deleteBlogById(Integer id) {
		int count = blogMapper.deleteBlogById(id);
		return count>0?ServerResponse.createBySuccess():ServerResponse.createByError();
	}

	
	@Override
	public ServerResponse getBlogById(Integer id) {
		Blog blog = blogMapper.getBlogById(id);
		return blog!=null?ServerResponse.createBySuccess(blog):ServerResponse.createByError();
	}
	
	
}
