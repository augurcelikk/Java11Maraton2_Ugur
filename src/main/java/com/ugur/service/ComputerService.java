package com.ugur.service;

import com.ugur.repository.ComputerRepository;
import com.ugur.repository.entity.Computer;

public class ComputerService {
    ComputerRepository computerRepository;
    public ComputerService(){
        this.computerRepository= new ComputerRepository();
    }

    public Computer save(Computer computer) {
        return computerRepository.save(computer);
    }
}
