package controller;

import model.AnyStack;

import javax.swing.*;

public class HistoricoController {

    public void insert(AnyStack<String> historical) {
        String endereco = JOptionPane.showInputDialog("Informe um endereço");
        if (endereco.contains("www")) {
            if (endereco.contains("https://")) {
                historical.push(endereco);
            } else {
                historical.push("https://" + endereco);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Endereço inválido, tente novamente");
        }
    }

    public void remove(AnyStack<String> historical) {
        try {
            JOptionPane.showMessageDialog(null, "Endereço: " + historical.pop() + " removido");
        } catch (Exception empty) {
            JOptionPane.showMessageDialog(null, "Pilha vazia!");
        }
    }

    public void query(AnyStack<String> historical) {
        try {
            JOptionPane.showMessageDialog(null, "Endereço mais recente: " + historical.top());
        } catch (Exception empty2) {
            JOptionPane.showMessageDialog(null, "Pilha vazia!");
        }
    }
}
