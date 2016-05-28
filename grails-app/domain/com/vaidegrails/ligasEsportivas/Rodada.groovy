package com.vaidegrails.ligasEsportivas
/**
 * Created by bruno on 5/26/16.
 */
class Rodada {

    static belongsTo = [fase: Fase]
    Integer numero

    static hasMany = [partidas: Partida]

    static constraints = {
        fase unique: ['numero']
    }

    static mapping = {
    }
}