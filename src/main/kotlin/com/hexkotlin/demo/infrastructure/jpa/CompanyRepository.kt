package com.hexkotlin.demo.infrastructure.jpa

import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository: JpaRepository<CompanyEntity, Long> {
}