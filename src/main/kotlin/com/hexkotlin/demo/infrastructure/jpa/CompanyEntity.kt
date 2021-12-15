package com.hexkotlin.demo.infrastructure.jpa

import javax.persistence.*

@Entity
@Table(name = "COMPANY")
class CompanyEntity {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    var id: Long? = null

    @Column(name = "NAME")
    var name: String ? = null
}