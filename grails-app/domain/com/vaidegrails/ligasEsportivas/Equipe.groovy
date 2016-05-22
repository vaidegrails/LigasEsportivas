/**
 * Created by bruno on 5/22/16.
 */
package com.vaidegrails.ligasEsportivas

/**
 * Agremiação que pode participar de campeonatos
 */
class Equipe {

    String nome

    String cidade
    String estado
    String pais


    static constraints = {
        nome unique: true
    }

}
