package com.vaidegrails.ligasEsportivas
/**
 * Created by bruno on 5/26/16.
 */
/**
 * Inscrição de alguma pessoa com vínculo em uma equipe participante de um campeonato específico.
 */
class Inscricao {

    Vinculo vinculo
    Participacao participacao
    Date dataInscricao
    Date dataTermino

    static constraints = {
        vinculo unique: ['participacao']
        dataTermino nullable: true
    }

    static mapping = {
    }
}