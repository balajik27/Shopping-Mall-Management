package com.tns.ShopOwnerService;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ShopOwnerService 

{
  @Autowired
  private ShopOwnerRepository repo;
        
      public List<ShopOwner> listAll()
      {
    	  return repo.findAll();
      }
      
      public void save(ShopOwner admin)
      {
    	  repo.save(admin);
      }
      
      public ShopOwner get(Integer Id)
      {
    	  return repo.findById(Id).get();
      }
      
      public void delete(Integer Id)
      {
    	  repo.deleteById(Id);
      }
  
}
