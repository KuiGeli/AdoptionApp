package com.sda.adoptionapp.service;

import com.sda.adoptionapp.model.Contract;
import com.sda.adoptionapp.repository.ContractRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractService {

    ContractRep contractRep;

    @Autowired
    public ContractService(ContractRep contractRep) {
        this.contractRep = contractRep;
    }

    public Contract findById(Long id){
        return contractRep.findById(id).get();
    }

    public void save(Contract contract){
        contractRep.save(contract);
    }

    public List<Contract> findAll(){
        return (List<Contract>) contractRep.findAll();
    }

    public void deleteById(Long id){
        contractRep.deleteById(id);
    }

}
