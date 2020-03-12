package com.company.project.service.impl;

import com.company.project.dao.TOrderMapper;
import com.company.project.model.TOrder;
import com.company.project.service.TOrderService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/03/11.
 */
@Service
@Transactional
public class TOrderServiceImpl extends AbstractService<TOrder> implements TOrderService {
    @Resource
    private TOrderMapper tOrderMapper;

}
