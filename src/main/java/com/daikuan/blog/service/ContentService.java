package com.daikuan.blog.service;

import com.daikuan.blog.domain.ContentDO;

import java.util.List;
import java.util.Map;

/**
 * 文章内容
 * 
 * @author daikuan
 * @email
 * @date daikuan 10:03:34
 */
public interface ContentService {
	
	ContentDO get(Long cid);
	
	List<ContentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ContentDO bContent);
	
	int update(ContentDO bContent);
	
	int remove(Long cid);
	
	int batchRemove(Long[] cids);
}
