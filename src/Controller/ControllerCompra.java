package Controller;

/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/
import bean.JvlCompra;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 *
 * @author u10073049107
 */
public class ControllerCompra extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public JvlCompra getBean(int rowIndex) {
        return (JvlCompra) lista.get(rowIndex);
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
        JvlCompra jvlCompra = (JvlCompra) lista.get(rowIndex);
        if (columnIndex == 0) {
            return jvlCompra.getJvlIdCompra();
        }
        if (columnIndex == 1) {
            return jvlCompra.getJvlFornecedor();
        }
        if (columnIndex == 2) {
            return jvlCompra.getJvlUsuarios();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return "Fornecedor";
            case 2:
                return "Usuario";
            default:
                return "";
        }
    }

}
