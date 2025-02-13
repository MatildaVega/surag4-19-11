package com.example.APPY_REST_G4.controladores;

import com.example.APPY_REST_G4.Servicios.MedicamentoServicio;
import com.example.APPY_REST_G4.modelos.Medicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medicamento")
public class MedicamentoControlador {

    @Autowired
    MedicamentoServicio medicamentoServicio;

    @PostMapping

    public ResponseEntity<?> guardar (@RequestBody Medicamento datos){

        try {

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(medicamentoServicio.registrarMedicamento(datos));

        }catch (Exception error){

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());

        }

    }

    @GetMapping
    public ResponseEntity<?> buscarTodo(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(medicamentoServicio.buscarMedicamentos());

        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(error.getMessage());
        }
    }
}
