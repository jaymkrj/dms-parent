package org.ap.dms.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateful;

import org.ap.dms.dao.DmsDao;
import org.ap.dms.models.entity.DmsRequestDo;

@Stateful
public class DmsServicesImpl implements DmsServices{

	@EJB
	private DmsDao dao;

	public void addDms(DmsRequestDo dms) throws Exception {
		dao.addDms(dms);
	}

	public void deleteDms(long id) throws Exception {
		dao.deleteDms(id);
	}

	public List<DmsRequestDo> getAllDms() throws Exception {
		return dao.getAllDms();
	}

}
