package io.controle.model

import javax.persistence.*

@Entity
class Produto(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int,

        @Column(nullable = false)
        val nome: String,

        val descricao: String
)