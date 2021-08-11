package com.burakks.countriesapp.data.remote.model

import com.burakks.countriesapp.domain.model.Country
import com.burakks.countriesapp.util.DomainMapper

class CountryDtoMapper : DomainMapper<CountryDto, Country> {
    override fun mapToDomainModel(entity: CountryDto): Country {
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

    override fun mapFromDomainModel(domainModel: Country): CountryDto {
        return CountryDto(
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

    fun toDomainList(initial: List<CountryDto>): List<Country>{
        return initial.map {mapToDomainModel(it)}
    }

    fun fromDomainList(initial: List<Country>): List<CountryDto> {
        return initial.map { mapFromDomainModel(it) }
    }
}