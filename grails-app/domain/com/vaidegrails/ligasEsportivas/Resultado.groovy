package com.vaidegrails.ligasEsportivas
/**
 * Created by bruno on 5/28/16.
 */
/**
 * Resultado de uma partida.
 */
class Resultado {

    Integer pontuacaoMandante
    Integer pontuacaoVisitante

    static belongsTo = [partida: Partida]

    static constraints = {
    }

    static mapping = {
    }
}