/**
 * Created by bruno on 5/22/16.
 */
package com.vaidegrails.ligasEsportivas

/**
 * Edição de um determinado campeonato
 */
class Edicao {

    Integer anoBase
    Regulamento regulamento
    static belongsTo = [campeonato: Campeonato]

    static constraints = {
        campeonato unique: ['anoBase']
    }
}
