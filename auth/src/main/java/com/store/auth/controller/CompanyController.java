package com.store.auth.controller;

import com.store.auth.domain.Company;
import com.store.auth.service.CompanyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/company")
public class CompanyController extends GenericController<Company>{
    public CompanyController(CompanyService service){ super(service); }
}
