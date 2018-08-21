package com.taotao.controller;

import com.taotao.pojo.TbItem;
import com.taotao.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TbItemController {
    @Autowired
    private TbItemService tbItemService;

    @ResponseBody
    @RequestMapping(value = "/item/{itemid}",method = RequestMethod.GET)
    public TbItem getItemById(@PathVariable(value = "itemid") long itemid){

        TbItem item = tbItemService.selectByPrimaryKey(itemid);

        System.out.println("====================================================已经进入方法");

        return item;
    }
}
