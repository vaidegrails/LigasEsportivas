package com.vaidegrails.ligasEsportivas
/**
 * Created by bruno on 5/26/16.
 */
/**
 * Disputa entre duas equipes
 */
class Partida {

    Participacao mandante
    Participacao visitante
    static hasOne = [resultado: Resultado]

    String local

    Date dataPrevista
    Date dataRealizacao

    static constraints = {
    }

    static mapping = {
    }
}