package br.edu.ifpe.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpe.manager.model.Laboratorio;
import br.edu.ifpe.manager.model.Reserva;
import br.edu.ifpe.manager.model.Sala;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    
    List<Reserva> findBySalaOrLaboratorioAndDataInicioBeforeAndDataFimAfter(
            Sala sala,
            Laboratorio laboratorio,
            LocalDateTime dataFim,
            LocalDateTime dataInicio
    );
}
