package services;

import interfaces.daos.IDao;
import models.Odontologo;

public class OdontologoService {

    private IDao<Odontologo> odontologoIDao;

    public OdontologoService(IDao<Odontologo> odontologoIDao) {
        this.odontologoIDao = odontologoIDao;
    }

    public Odontologo salvarOdontologo(Odontologo odontologo){
        return odontologoIDao.guardar(odontologo);
    }

    public Odontologo busqueda(Integer matricula){
        return odontologoIDao.buscar(matricula);
    }


}
