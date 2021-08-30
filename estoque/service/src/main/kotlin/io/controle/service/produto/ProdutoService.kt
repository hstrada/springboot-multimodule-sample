package io.controle.service.produto

import io.controle.model.Produto
import io.controle.repository.produto.ProdutoRepository
import org.springframework.stereotype.Service

@Service
class ProdutoService(private val produtoRepository: ProdutoRepository) {
    fun listarProdutos(): List<Produto> =
            produtoRepository.findAll()
}