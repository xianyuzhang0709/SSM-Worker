package com.example.model.service;

import com.example.model.dao.WorkerMapper;
import com.example.model.vo.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    @Autowired
    private WorkerMapper mapper; //接口这里没有写注解，但是也不报错，因为在配置文件里已经关联过了
    public boolean login(Worker worker) {
        Worker wo = mapper.selectByNameAndPwd(worker);
        if(wo!=null){
            return true;
        }
        return false;
    }

    public void regist(Worker worker) {
        mapper.insertWorker(worker);
    }

    public List<Worker> showall() {
        return mapper.getAllWorkers();
    }

    public void updateWorker(Integer wid, String username, String password) {
        Worker worker = new Worker(wid,username,password);
        mapper.updateWorker(worker);
    }

    public void deleteWorker(Integer wid) {
        mapper.deleteWorker(wid);
    }
}
