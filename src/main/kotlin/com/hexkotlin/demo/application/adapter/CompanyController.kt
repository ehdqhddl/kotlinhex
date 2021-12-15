package com.hexkotlin.demo.application.adapter

import com.hexkotlin.demo.application.port.ServicePort
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CompanyController(private var companyService: ServicePort) {
    @GetMapping("/get")
    fun getId(): String{

        return companyService.getId(1L).name
    }
}