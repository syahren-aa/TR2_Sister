/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sister.TR2.Restful.services;

import com.sister.TR2.Restful.entities.TbKamus;
import com.sister.TR2.Restful.repositories.KamusRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KamusService {
    
    @Autowired
    KamusRepository repository;
    
    public List<TbKamus> getAll(){
        return repository.findAll();
    }
    
     public boolean save(TbKamus kamus){
        try {
            repository.save(kamus);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean delete(int id){
        try{
        repository.deleteById(id);
        return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public TbKamus getById(int id){
        return repository.findById(id).get();
    }
    
    public boolean update(int id, TbKamus kamus){
        try{
            kamus.setId(id);
            kamus.setIndonesia(kamus.getIndonesia());
            kamus.setInggris(kamus.getInggris());
            kamus.setJawa(kamus.getJawa());
            repository.save(kamus);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
