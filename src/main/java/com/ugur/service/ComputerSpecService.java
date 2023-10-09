package com.ugur.service;

import com.ugur.repository.ComputerSpecRepository;
import com.ugur.repository.entity.ComputerSpec;

public class ComputerSpecService {

    ComputerSpecRepository computerSpecRepository;
    public ComputerSpecService(){
        this.computerSpecRepository= new ComputerSpecRepository();
    }

    public ComputerSpec save(ComputerSpec computerSpec) {
        return computerSpecRepository.save(computerSpec);
    }
}
