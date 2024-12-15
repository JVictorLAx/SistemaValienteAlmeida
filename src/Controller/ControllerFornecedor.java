package Controller;

/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template*/
import bean.JvlFornecedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 *
 * @author u06296329105
 */
public class ControllerFornecedor extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public JvlFornecedor getBean(int rowIndex) {
        return (JvlFornecedor) lista.get(rowIndex);
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
        JvlFornecedor fornecedor = (JvlFornecedor) lista.get(rowIndex);
        if (columnIndex == 0) {
            return fornecedor.getJvlIdFornecedor();
        }
        if (columnIndex == 1) {
            return fornecedor.getJvlCnpj();
        }
        if (columnIndex == 2) {
            return fornecedor.getJvlNome();
        }
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "ID";
            case 1:
                return "CNPJ";
            case 2:
                return "NOME";
            default:
                return "";
        }
    }

}
