package com.taotao.service;


import com.taotao.mapper.TbItemMapper;

import com.taotao.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface TbItemService {

   /* @Autowired
    TbItemMapper TB_ITEM_MAPPER = null ;*/
   /*@Autowired
   TbItemMapper TB_ITEM_MAPPER;*/

    TbItem selectByPrimaryKey(long id);




}

