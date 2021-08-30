package io.controle.resources

import io.controle.model.Produto
import io.controle.service.produto.ProdutoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/api/produtos")
class ProdutoResource(private val produtoService: ProdutoService) {

    @GetMapping
    fun getProdutos(): List<Produto> =
            produtoService.listarProdutos()
}