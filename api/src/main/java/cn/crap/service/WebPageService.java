package cn.crap.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.crap.framework.base.BaseService;
import cn.crap.framework.base.IBaseDao;
import cn.crap.inter.dao.IWebPageDao;
import cn.crap.inter.service.ILuceneService;
import cn.crap.inter.service.IWebPageService;
import cn.crap.model.WebPage;

@Service
public class WebPageService extends BaseService<WebPage>
		implements IWebPageService,ILuceneService<WebPage> {
	@Resource(name="webPageDao")
	IWebPageDao webPageDao;

	@Resource(name="webPageDao")
	public void setDao(IBaseDao<WebPage> dao) {
		super.setDao(dao, new WebPage());
	}

	@Override
	@Transactional
	public List<WebPage> getAll() {
		return webPageDao.findByMap(null, null, null);
	}
	
	
	
}
