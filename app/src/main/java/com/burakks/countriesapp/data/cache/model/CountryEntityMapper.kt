package com.burakks.countriesapp.data.cache.model

import com.burakks.countriesapp.domain.model.Country
import com.burakks.countriesapp.util.DomainMapper

class CountryEntityMapper : DomainMapper<CountryEntity, Country> {
    override fun mapToDomainModel(entity: CountryEntity): Country {
        return Country(
            alpha2Code = entity.alpha2Code,
            alpha3Code = entity.alpha3Code,
            area = entity.area,
            capital = entity.capital,
            cioc = entity.cioc,
            demonym = entity.demonym,
            flag = entity.flag,
            gini = entity.gini,
            name = entity.name,
            nativeName = entity.nativeName,
            numericCode = entity.numericCode,
            population = entity.population,
            region = entity.region,
            subregion = entity.subregion,
        )
    }

    override fun mapFromDomainModel(domainModel: Country): CountryEntity {
        return CountryEntity(
            alpha2Code = domainModel.alpha2Code,
            alpha3Code = domainModel.alpha3Code,
            area = domainModel.area,
            capital = domainModel.capital ?: "",
            cioc = domainModel.cioc ?: "",
            demonym = domainModel.demonym,
            flag = domainModel.flag ?: "",
            gini = domainModel.gini,
            name = domainModel.name ?: "",
            nativeName = domainModel.nativeName ?: "",
            numericCode = domainModel.numericCode ?: "",
            population = domainModel.population,
            region = domainModel.region ?: "",
            subregion = domainModel.subregion ?: "",
        )
    }

    fun toEntityList(initial: List<Country>): List<CountryEntity> {
        return initial.map { mapFromDomainModel(it) }
    }

    fun fromEntityList(initial: List<CountryEntity>): List<Country> {
        return initial.map { mapToDomainModel(it) }
    }
}