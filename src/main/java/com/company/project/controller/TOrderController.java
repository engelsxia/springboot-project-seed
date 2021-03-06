package com.company.project.controller;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.TOrder;
import com.company.project.service.TOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/03/11.
 */
@RestController
@RequestMapping("/t/order")
public class TOrderController {
    @Resource
    private TOrderService tOrderService;

    @PostMapping("/add")
    public Result add(TOrder tOrder) throws Exception {
        tOrderService.save(tOrder);
        if (tOrder.getId() % 2 == 0) {
            throw new Exception();
//            throw new ServiceException("add fail");
        }
        return ResultGenerator.genSuccessResult(tOrder);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        tOrderService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TOrder tOrder) {
        tOrderService.update(tOrder);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam("id") Long id) {
        TOrder tOrder = tOrderService.findById(id);
        return ResultGenerator.genSuccessResult(tOrder);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TOrder> list = tOrderService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
