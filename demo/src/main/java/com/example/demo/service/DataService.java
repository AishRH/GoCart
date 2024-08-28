package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Category;
import com.example.demo.repo.CategoryRepository;
@Service
public class DataService {
    @Autowired 
    private CategoryRepository dataRepo;

    public Category saveData(Category data){
        return dataRepo.save(data);
    }


}
