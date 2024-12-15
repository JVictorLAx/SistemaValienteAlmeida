package Controller;

/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/
import bean.EmdCategoria;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 *
 * @author u10073049107
 */
public class ControllerCategoria extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public EmdCategoria getBean(int rowIndex) {
        return (EmdCategoria) lista.get(rowIndex);
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
        EmdCategoria emdCategoria = (EmdCategoria) lista.get(rowIndex);
        if (columnIndex == 0) {
            return emdCategoria.getEmdIdCategoria();
        }
        if (columnIndex == 1) {
            return emdCategoria.getEmdTipoMotor();
        }
        if (columnIndex == 2) {
            return emdCategoria.getEmdNomeCategoria();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return "Motor";
            case 2:
                return "Nome";
            default:
                return "";
        }
    }

}
