/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sister.TR2.Restful.controller;

import com.sister.TR2.Restful.entities.TbKamus;
import com.sister.TR2.Restful.services.KamusService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KamusController {
    
    @Autowired
    KamusService service;
    
//    @ResponseBody
    @GetMapping("")
    public List<TbKamus> index(){
        return service.getAll();
    }
    
    @PostMapping("")
    public Boolean save(@RequestBody TbKamus kamus){
        boolean result;
        result = service.save(kamus);
        return result;
    }
    
    @DeleteMapping("{id}")
      public boolean delete(@PathVariable("id") int id){
        boolean result;
        result = service.delete(id);
        return result;
    }
      
    @GetMapping("{id}")
    public TbKamus getById(@PathVariable("id") int id){
        return service.getById(id);
    }
    
    @PutMapping("{id}")
    public void update(@PathVariable("id") int id,@RequestBody TbKamus kamus){
        boolean result;
        result = service.update(id,kamus);
    }
}
