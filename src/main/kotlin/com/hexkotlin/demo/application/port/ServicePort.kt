package com.hexkotlin.demo.application.port

import com.hexkotlin.demo.domain.Company

interface ServicePort {
    fun getId(id: Long): Company
    fun addId(company: Company)
}