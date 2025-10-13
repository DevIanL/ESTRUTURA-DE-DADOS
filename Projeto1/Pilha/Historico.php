<?php

$historico = new SplStack();                                    // Pilha principal para armazenar ações
$refazer = new SplStack();                                      // Pilha auxiliar para redo

// Usuário realiza algumas ações
$historico->push("Digitou 'Olá'");                       // Empilhando ações.   
$historico->push("Digitou 'Mundo'");
$historico->push("Apagou a palavra 'Mundo'");

// Mostrando histórico atual
echo "Histórico de ações:\n";
foreach ($historico as $acao) {
    echo "- $acao\n";
}

// Função de Undo (desfazer última ação)
function undo(SplStack $historico, SplStack $refazer) {
    if (!$historico->isEmpty()) {
        $acao = $historico->pop();
        $refazer->push($acao); // guarda no redo
        echo "\nDesfeito: $acao\n";
    } else {
        echo "\nNada para desfazer.\n";
    }
}

// Função de Redo (refazer última ação desfeita)
function redo(SplStack $historico, SplStack $refazer) {
    if (!$refazer->isEmpty()) {
        $acao = $refazer->pop();
        $historico->push($acao);
        echo "Refeito: $acao\n";
    } else {
        echo "Nada para refazer.\n";
    }
}

// Testando Undo
undo($historico, $refazer); // desfaz "Apagou a palavra 'Mundo'"
undo($historico, $refazer); // desfaz "Digitou 'Mundo'"

// Testando Redo
redo($historico, $refazer); // refaz "Digitou 'Mundo'"

// Mostrar estado final do histórico
echo "\n Histórico final:\n";
foreach ($historico as $acao) {
    echo "- $acao\n";
}