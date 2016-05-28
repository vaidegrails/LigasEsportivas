package com.vaidegrails.ligasEsportivas

/**
 * Created by bruno on 5/26/16.
 */
/**
 * Relação existente entre uma pessoa e uma equipe
 */
class Vinculo {
    Pessoa pessoa
    Equipe equipe
    TipoVinculo tipoVinculo
    Date dataInicio
    Date dataPrevistaTermino
    Date dataTermino

    static constraints = {
        pessoa unique: ['equipe']
    }
}
