package com.burakks.countriesapp.data.cache.model

import com.burakks.countriesapp.data.remote.model.CountryDto
import com.burakks.countriesapp.domain.model.Country
import com.burakks.countriesapp.util.DomainMapper

class CountryEntityMapper: DomainMapper<CountryEntity, Country> {
    override fun mapToDomainModel(entity: CountryEntity): Country {
        return Country(
            alpha2Code = entity.alpha2Code,
            alpha3Code = entity.alpha3Code,
            altSpellings = entity.altSpellings,
            area = entity.area,
            borders = entity.borders,
            callingCodes = entity.callingCodes,
            capital = entity.capital,
            cioc = entity.cioc,
            currencies = entity.currencies,
            demonym = entity.demonym,
            flag = entity.flag,
            gini = entity.gini,
            languages = entity.languages,
            latlng = entity.latlng,
            name = entity.name,
            nativeName = entity.nativeName,
            numericCode = entity.numericCode,
            population = entity.population,
            region = entity.region,
            subregion = entity.subregion,
            timezones = entity.timezones,
            topLevelDomain = entity.topLevelDomain,
        )
    }

    override fun mapFromDomainModel(domainModel: Country): CountryEntity {
        return CountryEntity(
            alpha2Code = domainModel.alpha2Code,
            alpha3Code = domainModel.alpha3Code,
            altSpellings = domainModel.altSpellings,
            area = domainModel.area,
            borders = domainModel.borders,
            callingCodes = domainModel.callingCodes,
            capital = domainModel.capital,
            cioc = domainModel.cioc,
            currencies = domainModel.currencies,
            demonym = domainModel.demonym,
            flag = domainModel.flag,
            gini = domainModel.gini,
            languages = domainModel.languages,
            latlng = domainModel.latlng,
            name = domainModel.name,
            nativeName = domainModel.nativeName,
            numericCode = domainModel.numericCode,
            population = domainModel.population,
            region = domainModel.region,
            subregion = domainModel.subregion,
            timezones = domainModel.timezones,
            topLevelDomain = domainModel.topLevelDomain,
        )
    }

    fun toEntityList(initial: List<Country>): List<CountryEntity>{
        return initial.map {mapFromDomainModel(it)}
    }

    fun fromEntityList(initial: List<CountryEntity>): List<Country> {
        return initial.map { mapToDomainModel(it) }
    }
}