package Controller;

/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/
import bean.EmdProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 *
 * @author u06296329105
 */
public class ControllerProduto extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public EmdProduto getBean(int rowIndex) {
        return (EmdProduto) lista.get(rowIndex);
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
        EmdProduto produto = (EmdProduto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return produto.getEmdIdProduto();
        }
        if (columnIndex == 1) {
            return produto.getEmdNome();
        }
        if (columnIndex == 2) {
            return produto.getEmdModelo();
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
                return "Modelo";
            default:
                return "";
        }
    }

}
