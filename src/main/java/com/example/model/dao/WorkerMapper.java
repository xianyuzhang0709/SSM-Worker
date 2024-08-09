package com.example.model.dao;

import com.example.model.vo.Worker;

import java.util.List;

public interface WorkerMapper {
    Worker selectByNameAndPwd(Worker worker);

    void insertWorker(Worker worker);

    List<Worker> getAllWorkers();

    void updateWorker(Worker worker);

    void deleteWorker(Integer wid);
}
