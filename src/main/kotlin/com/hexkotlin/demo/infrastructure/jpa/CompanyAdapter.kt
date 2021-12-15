package com.hexkotlin.demo.infrastructure.jpa

import com.hexkotlin.demo.domain.Company
import com.hexkotlin.demo.infrastructure.port.PersistencePort
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Service
import java.util.Optional

@Service
class CompanyAdapter(private var companyRepository: CompanyRepository): PersistencePort{
    override fun getId(id:Long): Company {
        lateinit var company:Company
        var companyEntity:Optional<CompanyEntity>

        companyEntity = companyRepository.findById(id)

        company.id = companyEntity.get().id!!
        company.name = companyEntity.get().name.toString()

        return company
    }

    override fun addId(company: Company) {
        val modelMapper = ModelMapper()
        companyRepository.save(modelMapper.map(company, CompanyEntity::class.java))
    }

}