package com.taotao.service.impl;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbItemServiceImpl implements TbItemService {

    @Autowired
    private TbItemMapper tbItemMapper;


    @Override
    public TbItem selectByPrimaryKey(long id) {
        return tbItemMapper.selectByPrimaryKey(id);
    }
}
