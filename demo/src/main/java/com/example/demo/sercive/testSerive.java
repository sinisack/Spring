package com.example.demo.sercive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.testEntity;
import com.example.demo.repo.testRepo;
@Service
public class testSerive {
    
@Autowired
private testRepo testRepo;


public void test() {
            testEntity entity = new testEntity();

            entity.setName("안녕");
            testRepo.save(entity);

}

}
