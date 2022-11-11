package services;

import interfaces.daos.IDao;
import models.Medicamento;

public class MedicamentoService {

    private IDao<Medicamento> medicamentoIDao;

    public MedicamentoService(IDao<Medicamento> medicamentoIDao) {
        this.medicamentoIDao = medicamentoIDao;
    }

    public Medicamento salvarMedicamento(Medicamento medicamento){
        return medicamentoIDao.guardar(medicamento);
    }

    public Medicamento busqueda(Integer id){
        return medicamentoIDao.buscar(id);
    }

    public Medicamento busquedaPorCantidad(Integer cantidad){
        return medicamentoIDao.buscarPorCantidad(cantidad);
    }
}
