/**
 * Created by bruno on 5/22/16.
 */
package com.vaidegrails.ligasEsportivas

class Participacao {

    Equipe equipe
    Edicao edicao

    static constraints = {
        equip unique: ['edicao']
    }

    static mapping = {
    }
}