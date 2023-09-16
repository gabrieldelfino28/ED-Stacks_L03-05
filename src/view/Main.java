package view;

import controller.HistoricoController;
import model.AnyStack;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        AnyStack<String> historical = new AnyStack<>();

        HistoricoController h = new HistoricoController();
        String Menu = "";
        do {
            Menu = JOptionPane.showInputDialog("Menu de Histórico\n1- Inserir\n2- Remover\n3- Consultar ultimo endereço\n9- Finalizar");
            switch (Menu) {
                case "1" -> h.insert(historical);
                case "2" -> h.remove(historical);
                case "3" -> h.query(historical);
                case "9" -> {
                    JOptionPane.showMessageDialog(null, "Exiting");
                    //end
                }
                default -> JOptionPane.showMessageDialog(null, "Valor inválido, tente novamente!");
            }
        } while (!Menu.equals("9"));
    }
}
