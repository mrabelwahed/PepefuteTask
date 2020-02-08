package com.pokemon.di.module

import androidx.lifecycle.ViewModel
import com.pokemon.ui.viewmodel.PokeMonListViewModel
import com.pokemon.ui.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class PokemonListViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(PokeMonListViewModel::class)
    internal abstract fun bindPokemonListViewModel(viewModel: PokeMonListViewModel): ViewModel
}