package com.hexkotlin.demo.infrastructure.port

import com.hexkotlin.demo.domain.Company

interface PersistencePort {
    fun getId(id:Long): Company
    fun addId(company: Company)
}