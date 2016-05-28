/**
 * Created by bruno on 5/22/16.
 */
package com.vaidegrails.ligasEsportivas

/**
 * Caracteriza a participação de uma determinada equipe em uma edição específica de um campeonato.
 */
class Participacao {

    Equipe equipe
    Edicao edicao

    static constraints = {
        equipe unique: ['edicao']
    }

    static mapping = {
    }
}