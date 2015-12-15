package com.hr.biz;

import java.util.List;

import com.hr.biz.imp.IMajorChangeService;
import com.hr.dao.mapper.MajorChangeMapper;
import com.hr.entity.MajorChange;
import com.hr.entity.MajorChangeWithBLOBs;

public class MajorChangeService implements IMajorChangeService {

		private MajorChangeMapper majorChangeDAO;

		public MajorChangeMapper getMajorChangeDAO() {
			return majorChangeDAO;

		}

		public void setMajorChangeDAO(MajorChangeMapper majorChangeDAO) {
			this.majorChangeDAO = majorChangeDAO;

		}

		public List<MajorChange> selectByIII () throws Exception
		{

			return majorChangeDAO.selectByIII();

		}

		public MajorChangeWithBLOBs selectById(int id) throws Exception {
			
			return majorChangeDAO.selectById(id);
		}

		public int selectCount() throws Exception {
			// TODO Auto-generated method stub
			return majorChangeDAO.selectCount();
		}
}
