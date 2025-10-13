<?php

// Criando a fila de espera
$fila = new SplQueue();

// Clientes chegam para atendimento (enqueue)
$fila->enqueue("Cliente 1");                                        // Enfileirando o cliente 1.                            
$fila->enqueue("Cliente 2");                                        // Enfileirando o cliente 2. 
$fila->enqueue("Cliente 3");                                        // Enfileirando o cliente 3. 
$fila->enqueue("Cliente 4");                                        // Enfileirando o cliente 4. 

// Mostrando a fila atual
echo "Fila inicial:\n";
foreach ($fila as $cliente) {
    echo "- $cliente\n";
}

// Atendendo clientes (dequeue = remove do início da fila)
echo "\nAtendendo: " . $fila->dequeue() . "\n";                             // Cliente 1
echo "Atendendo: " . $fila->dequeue() . "\n";                               // Cliente 2

// Mostrando fila após alguns atendimentos
echo "\nFila restante:\n";
foreach ($fila as $cliente) {
    echo "- $cliente\n";
}

// Verificando o próximo da fila sem remover (peek)
echo "\nPróximo a ser atendido: " . $fila->bottom() . "\n";

// Verificando o último da fila (quem chegou por último)
echo "Último da fila: " . $fila->top() . "\n";

// Quantidade de pessoas ainda esperando
echo "\nTotal na fila: " . $fila->count() . "\n";

// Limpando toda a fila
$fila = new SplQueue();                                                     // reinicia
echo "\nFila limpa. Total: " . $fila->count() . "\n";

