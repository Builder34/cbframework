package cn.lcb.cbframework.service.impl;

import cn.lcb.cbframework.dao.ManagerDao;
import cn.lcb.cbframework.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Builder34 on 2015-10-24.
 */
@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    public ManagerDao managerDao ;
    public ManagerDao getManagerDao() {
        return managerDao;
    }
    public void setManagerDao(ManagerDao managerDao) {
        this.managerDao = managerDao;
    }

    @Override
    public boolean checkLogin(String nickname, String password) {
        int result = this.managerDao.checkLogin(nickname,password) ;
        if (result > 0) {
            return true ;
        }
        return false ;
    }
}
