/**
 * Created by bruno on 5/22/16.
 */
package com.vaidegrails.ligasEsportivas

/**
 * Especifica os critérios para definir uma fase
 */
abstract class TipoFase {

    String nome
    String descricao

    static constraints = {
        nome unique: true
    }

}
