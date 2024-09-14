package br.senai.sp.jandira.touccanmobile_user.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    var nome_social: String = "",
    var email: String = "",
    var senha: String = "",
    var telefone: String = "",
    var cpf: String = "",
    var cep: String = "",
    var data_nascimento: String = ""
)