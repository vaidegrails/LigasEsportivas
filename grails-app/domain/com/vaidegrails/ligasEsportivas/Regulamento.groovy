/**
 * Created by bruno on 5/22/16.
 */
package com.vaidegrails.ligasEsportivas

/**
 * Regulamento que pode ser utilizado em uma ou mais edições de campeonatos
 */
class Regulamento {

    static hasMany = [tiposFase: TipoFase]

    static constraints = {

    }

}
