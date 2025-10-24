<?php
$carrinho = new SplDoublyLinkedList();                                              // Cria uma nova lista e armazena em carrinho.

                                                                                    // MÉTODOS PARA ADICIONAR ITENS NA LISTA.
$carrinho->push(["nome"=>"Camisa", "preco"=>50]);                            // Adiciona um item ao final da lista.
$carrinho->push(["nome"=>"Tênis", "preco"=>200]);     
$carrinho->push(["nome"=>"Raquete", "preco"=>800]);                   
$carrinho->unshift(["nome"=>"Boné", "preco"=>30]);                           // Adiciona um item ao inicio da lista.

                                                                                    // MÉTODOS PARA EXIBIR INFORMAÇÕES DA LISTA.
echo "Total de itens no carrinho: " . $carrinho->count() . "\n";                    // count(), metodo que retorna a quantidade de itens da lista.
echo "Primeiro item (bottom): " . $carrinho->bottom()["nome"] . "\n";               // bottom(), metodo que retornao o primeiro item da lista.
echo "Último item (top): " . $carrinho->top()["nome"] . "\n\n";                     // top(), metodo que retorna o ultimo item da lista.

                                                                                    // PERCORRENDO ITENS DA LISTA.
echo "=== Itens no carrinho ===\n";
$carrinho->rewind();                                                                // Vai para o início.
while($carrinho->valid()){                                                          // Verifica se posição é válida.
    $item = $carrinho->current();                                                   // Pega item atual.
    echo "- {$item['nome']} (R$ {$item['preco']})\n";
    $carrinho->next();                                                              // Avança para o próximo.
}
echo "--------------------------\n\n";

                                                                                    // MÉTODOS DE ACESSO DIRETO.
echo "Alterando o item na posição [1]...\n";
$carrinho->offsetSet(1, ["nome"=>"Calça", "preco"=>120]);             // Substitui no índice 1.
echo "Novo item na posição [1]: " . $carrinho->offsetGet(1)["nome"] . "\n\n";

echo "=== Itens no carrinho ===\n";
$carrinho->rewind();                                                                // Vai para o início.
while($carrinho->valid()){                                                          // Verifica se posição é válida.
    $item = $carrinho->current();                                                   // Pega item atual.
    echo "- {$item['nome']} (R$ {$item['preco']})\n";
    $carrinho->next();                                                              // Avança para o próximo.
}
echo "--------------------------\n\n";

                                                                                    // MÉTODOS PARA REMOVER ITENS DA LISTA.
$removido = $carrinho->pop();                                                       // Remove último item da lista.
echo "Removido com pop(): {$removido['nome']}\n";

$removido = $carrinho->shift();                                                     // Remove primeiro
echo "Removido com shift(): {$removido['nome']}\n";

$carrinho->offsetUnset(0);                                                   // Remove pelo índice
echo "Item no índice [0] removido com offsetUnset().\n\n";

                                                                                    // METODO QUE VERIFICA SE ESTÁ VAZIA.
if($carrinho->isEmpty()){
    echo "O carrinho está vazio.\n";
} else {
    echo "Ainda restam " . $carrinho->count() . " itens no carrinho.\n";
}