package com.tns.ShopOwnerService;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopOwnerController 
{
  @Autowired(required=true)
  private ShopOwnerService service;
  
  @GetMapping("/adminservice")
  public java.util.List<ShopOwner>list()
  {
	  return service.listAll();
  }
  @GetMapping("/adminservice/{Id}")
  public ResponseEntity <ShopOwner> get(@PathVariable Integer Id)
  {
	  try
	  {
		ShopOwner admin = service.get(Id);
		return new ResponseEntity<ShopOwner>(admin,HttpStatus.OK);
	  }
	  catch(NoResultException e)
	  {
		  return new ResponseEntity<ShopOwner>(HttpStatus.NOT_FOUND);
	  }
   
  }
	  @PostMapping("/adminservice")
	  public void add(@RequestBody ShopOwner admin)
	  {
		  service.save(admin);
	  }
	  @PutMapping ("/adminservice/{admin_Id}")
	  public ResponseEntity<?> update(@RequestBody ShopOwner admin, @PathVariable Integer Id)
	  {
		  ShopOwner existadmin = service.get(Id);
		  service.save(existadmin);
		  return new ResponseEntity<>(HttpStatus.OK);
	  }
	  @DeleteMapping("/adminservice/{admin_Id}")
	  public void delete (@PathVariable Integer admin_Id)
	  {
		  service.delete(admin_Id);
	  }
   
}
