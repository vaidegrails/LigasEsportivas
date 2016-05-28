package com.vaidegrails.ligasEsportivas
/**
 * Created by bruno on 5/26/16.
 */
/**
 * Representa uma fase de um campeonato. Essa fase tem um determinado tipo, com 2 ou mais participantes e com as
 * respectivas rodadas.
 */
class Fase {

    TipoFase tipoFase

    static hasMany = [participantes: Participacao, rodadas: Rodada]

    static constraints = {
    }

    static mapping = {
    }
}