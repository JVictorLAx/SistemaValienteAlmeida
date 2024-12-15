package Controller;

/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/
import bean.JvlVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 *
 * @author u10073049107
 */
public class ControllerVendedor extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public JvlVendedor getBean(int rowIndex) {
        return (JvlVendedor) lista.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JvlVendedor vendedor = (JvlVendedor) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendedor.getJvlIdVendedor();
        }
        if (columnIndex == 1) {
            return vendedor.getJvlNome();
        }
        if (columnIndex == 2) {
            return vendedor.getJvlCpf();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return "Nome";
            case 2:
                return "CPF";
            default:
                return "";
        }
    }

}
