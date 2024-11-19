package com.example.APPY_REST_G4.Servicios;

import com.example.APPY_REST_G4.Repositorio.IRepositorioMedico;
import com.example.APPY_REST_G4.modelos.Medico;
import com.example.APPY_REST_G4.modelos.SignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServicio {

    @Autowired
    IRepositorioMedico iRepositorioMedico;

    public Medico registrarMedico(Medico datosMedicos) throws Exception{
        try {

            return iRepositorioMedico.save(datosMedicos);

        }catch (Exception error){

            throw new Exception(error.getMessage());
        }
    }

    public List<Medico> buscarMedicos() throws Exception{

        try {

            return iRepositorioMedico.findAll();

        }catch (Exception error){

            throw new Exception(error.getMessage());
        }


    }
}
