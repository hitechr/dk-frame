package com.daikuan.common.service;

import org.springframework.stereotype.Service;

import com.daikuan.common.domain.LogDO;
import com.daikuan.common.domain.PageDO;
import com.daikuan.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
