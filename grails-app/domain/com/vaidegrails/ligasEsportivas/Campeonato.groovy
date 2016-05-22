/**
 * Created by bruno on 5/22/16.
 */
package com.vaidegrails.ligasEsportivas

/**
 * Representa os campeonatos disponíveis, como por exemplo Campeonato Brasileiro
 */
class Campeonato {

    String nome
    Modalidade modalidade
//
    static hasMany = ['edicoes': Edicao]
    static constraints = {

    }
}
