package br.com.fernandavedovello.pokedex.view.detail.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fernandavedovello.pokedex.R
import br.com.fernandavedovello.pokedex.model.Pokemon
import br.com.fernandavedovello.pokedex.view.form.FormPokemonViewModel
import com.squareup.picasso.Picasso
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class FormPokemonActivity : AppCompatActivity() {

    val formPokemonViewModel: FormPokemonViewModel by viewModel()
    val picasso: Picasso by inject()
    lateinit var pokemon : Pokemon

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_pokemon)
    }
}
