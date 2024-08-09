package com.example.controller;

import com.example.model.service.WorkerService;
import com.example.model.vo.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class WorkerAction {
    @Autowired
    private WorkerService service;
    @RequestMapping("login.action")
    public String login(){
        return "login";
    }

    @RequestMapping("loginDeal.action")
    public String loginDeal(Worker worker){
        boolean ret = service.login(worker);
        if(ret){
            return "success";
        }
        return "login";
    }

    @RequestMapping("regist.action")
    public String regist(){
        return "regist";
    }

    @RequestMapping("registDeal.action")
    public String registDeal(Worker worker){
        worker.setWid(service.showall().size()+1);
        service.regist(worker);
        return "login";
    }

    @RequestMapping("showall.action")
    public String showall(Model model){
        List<Worker> workers = service.showall();
        model.addAttribute("workers",workers);
        return "showall";
    }

    @RequestMapping("updateWorker.action")
    public String updateWorker(Integer wid, String username, String password){
        service.updateWorker(wid,username,password);
        return "showall";
    }

//    @ResponseBody
    @RequestMapping("deleteWorker.action")
    public String deleteWorker(Integer wid){
        service.deleteWorker(wid);
        return "showall";
    }

    @RequestMapping("registWorker.action")
    public String registWorker(Worker worker){
        service.regist(worker);
        return "showall";
    }


}
