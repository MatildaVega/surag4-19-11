package com.example.APPY_REST_G4.Servicios;

import com.example.APPY_REST_G4.Repositorio.IRepositorioPaciente;
import com.example.APPY_REST_G4.modelos.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServicio {
    //para usar un servicio debo llamar al repositorio
    //INYECTAR UNA DEPENDENCIA
    @Autowired
    IRepositorioPaciente iRepositorioPaciente;

    //LISTO LAS OPERACIONES QUE VOY A REALIZAR EN BD

    //registrar un paciente
    public Paciente registrarPaciente(Paciente datosPaciente) throws Exception {
        try {

            //Guardar en la bd los datos del paciente
            return iRepositorioPaciente.save(datosPaciente);

        } catch (Exception error) {

            throw new Exception(error.getMessage());
        }

    }
        //Buscar un paciente

        //Buscar un paciente por id

    public List<Paciente> buscarPacientes() throws Exception{

        try{

           return iRepositorioPaciente.findAll();

        }catch (Exception error){

            throw new Exception(error.getMessage());

        }
    }




}