package com.hexkotlin.demo.application.service

import com.hexkotlin.demo.application.port.ServicePort
import com.hexkotlin.demo.domain.Company
import com.hexkotlin.demo.infrastructure.port.PersistencePort
import org.springframework.stereotype.Service

@Service
class CompanyServiceImpl(private var persistencePort: PersistencePort): ServicePort {
    override fun getId(id: Long): Company {
        return persistencePort.getId(id)
    }

    override fun addId(company: Company) {
        persistencePort.addId(company)
    }
}