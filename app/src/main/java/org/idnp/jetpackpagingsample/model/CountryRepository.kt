package org.idnp.jetpackpagingsample.model
import android.util.Log
import org.idnp.jetpackpagingsample.entities.Country

class CountryRepository {
    fun getCountries(nextPageNumber: Int): List<Country> {

        Log.d("nextPageNumber:",nextPageNumber.toString())

        val countries = arrayListOf<Country>()
        var country: Country
        val start: Int = 100 * nextPageNumber
        val end = start + 20

        for (i in start..end) {
            country = Country(name_en = "NombreEN" + i, name_es = "NombreES  " + i,
                continent_en = "ContinenteEN " + i, continent_es = "ContinenteES " + i,
                capital_en = "CapitalEN " + i,  capital_es = "CapitalES " + i,
                dial_code = "Codigo Marca "+i, code_2 = "Codigo 2 "+i,
                code_3 = "Codigo 3 "+i, tid = "Tid "+i, km2 = i);
            countries.add(country)
        }

        return countries
    }
}
