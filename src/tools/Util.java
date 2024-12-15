
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author u06296329105
 */
public class Util {

    public static void habilitar(boolean valor, JComponent... comp) {
        for (int i = 0; i < comp.length; i++) {
            comp[i].setEnabled(valor);

        }

    }

    public static void limpar(JComponent... comp) {
        for (int i = 0; i < comp.length; i++) {
            JComponent c = comp[i];
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            } else if (c instanceof JCheckBox) {
                ((JCheckBox) c).setSelected(false);
            } else if (c instanceof JComboBox) {
                ((JComboBox<?>) c).setSelectedIndex(-1);
            } else if (c instanceof JFormattedTextField) {
                ((JFormattedTextField) c).setText("");
            } else if (c instanceof JTextArea) {
                ((JTextArea) c).setText("");
            }
        }
    }

    public static int srToInt(String cad) {
        return Integer.parseInt(cad);
        // string para int
    }

    public static String intToStg(int num) {
        return String.valueOf(num);

        // int para string ??
    }

    public static double strgDouble(String cad) {
        return Double.parseDouble(cad);

    }

    public static Date strgDta(String cad) throws ParseException {

        return null;

        // string para data(em teoria)
    }

    public static String dateToSrt(Date data) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(data);

        //data para string
    }

    public static void mostrar(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static boolean perguntar(String mensagem) {
        int option = JOptionPane.showConfirmDialog(null, mensagem, "Pergunta", JOptionPane.YES_NO_OPTION);
        return option == JOptionPane.YES_OPTION;
    }

    public static String DoubleString(double valor) {
        return Double.toString(valor);
    }

}

