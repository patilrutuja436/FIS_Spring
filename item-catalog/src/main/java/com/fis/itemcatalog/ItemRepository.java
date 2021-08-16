package com.fis.itemcatalog;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository  extends JpaRepository<Item, Long> 
{

}
