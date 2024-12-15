package Controller;

/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/
import bean.EmdCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 *
 * @author u10073049107
 */
public class ControllerCliente extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public EmdCliente getBean(int rowIndex) {
        return (EmdCliente) lista.get(rowIndex);
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
        EmdCliente emdCliente = (EmdCliente) lista.get(rowIndex);
        if (columnIndex == 0) {
            return emdCliente.getEmdIdCliente();
        }
        if (columnIndex == 1) {
            return emdCliente.getEmdNome();
        }
        if (columnIndex == 2) {
            return emdCliente.getEmdEmail();
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
                return "Email";
            default:
                return "";
        }
    }

}
