package org.idnp.jetpackpagingsample.adapters

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.idnp.jetpackpagingsample.R
import org.idnp.jetpackpagingsample.entities.Country

class CountryViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val nameEnText = view.findViewById<TextView>(R.id.textViewName_en) as TextView
    private val nameEsText = view.findViewById<TextView>(R.id.textViewName_es) as TextView
    private val contEnText = view.findViewById<TextView>(R.id.textViewContinent_en) as TextView
    private val contEsText = view.findViewById<TextView>(R.id.textViewContinent_es) as TextView
    private val capEnText = view.findViewById<TextView>(R.id.textViewCapital_en) as TextView
    private val capEsText = view.findViewById<TextView>(R.id.textViewCapital_es) as TextView
    private val dialText = view.findViewById<TextView>(R.id.textViewDial_code) as TextView
    private val code2Text = view.findViewById<TextView>(R.id.textViewCode_2) as TextView
    private val code3Text = view.findViewById<TextView>(R.id.textViewCode_3) as TextView
    private val tidText = view.findViewById<TextView>(R.id.textViewTid) as TextView
    private val km2Text = view.findViewById<TextView>(R.id.textViewKm2) as TextView

    fun bind(country: Country) {
        with(country) {
            nameEnText.text = name_en.toString()
            nameEsText.text = name_es.toString()
            contEnText.text = continent_en.toString()
            contEsText.text = continent_es.toString()
            capEnText.text = capital_en.toString()
            capEsText.text = capital_es.toString()
            dialText.text = dial_code.toString()
            code2Text.text = code_2.toString()
            code3Text.text = code_3.toString()
            tidText.text = tid.toString()
            km2Text.text = km2.toString()
        }
    }
}
