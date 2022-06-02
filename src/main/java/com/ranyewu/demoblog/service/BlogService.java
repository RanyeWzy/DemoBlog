package com.ranyewu.demoblog.service;

import com.ranyewu.demoblog.po.Blog;
import com.ranyewu.demoblog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {
    Blog getBlog(Long id);
    Blog getAndConvert(Long id);
    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);
    Page<Blog> listBlog(Pageable pageable, String query);
    Page<Blog> listBlog(Pageable pageable);
    Page<Blog> listBlog(Pageable pageable,Long tagId);
    Map<String,List<Blog>> archiveBlog();
    Blog saveBlog(Blog blog);
    Blog updateBlog(Long id,Blog blog);
    void deleteBlog(Long id);
    List<Blog> listRecommendBlogTop(Integer size);
    Long countBlog();
}
