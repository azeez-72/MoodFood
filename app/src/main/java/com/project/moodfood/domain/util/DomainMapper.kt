package com.project.moodfood.domain.util

interface DomainMapper <T, DomainModel> {   //T and DomainModel are datatypes
    fun mapToDomainModel(model: T) : DomainModel    //for get requests

    fun mapFromDomainModel(domainModel: DomainModel) : T  //for publishing requests
}