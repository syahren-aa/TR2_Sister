/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sister.TR2.Restful.repositories;

import com.sister.TR2.Restful.entities.TbKamus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author acer
 */
@Repository
public interface KamusRepository extends JpaRepository<TbKamus, Integer>{
    
}
