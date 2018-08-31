package com.taotao.service;




import com.taotao.pojo.TbItem;


public interface TbItemService {

   /* @Autowired
    TbItemMapper TB_ITEM_MAPPER = null ;*/
   /*@Autowired
   TbItemMapper TB_ITEM_MAPPER;*/

    TbItem selectByPrimaryKey(long id);







}

