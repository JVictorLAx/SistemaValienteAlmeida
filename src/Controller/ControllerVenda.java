package Controller;

/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/
import bean.EmdVenda;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 *
 * @author u10073049107
 */
public class ControllerVenda extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public EmdVenda getBean(int rowIndex) {
        return (EmdVenda) lista.get(rowIndex);
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
        EmdVenda jvlCompra = (EmdVenda) lista.get(rowIndex);
        if (columnIndex == 0) {
            return jvlCompra.getEmdIdVenda();
        }
        if (columnIndex == 1) {
            return jvlCompra.getEmdCliente();
        }
        if (columnIndex == 2) {
            return jvlCompra.getJvlVendedor();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return "Cliente";
            case 2:
                return "Vendedor";
            default:
                return "";
        }
    }
 
}
