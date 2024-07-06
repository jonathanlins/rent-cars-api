package br.gov.sp.fatec.domain.dto;

import java.time.LocalDate;

public class AluguelDTO {
    private Long id;
    private Long clienteId;
    private Long carroId;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getClienteId() {
        return clienteId;
    }
    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }
    public Long getCarroId() {
        return carroId;
    }
    public void setCarroId(Long carroId) {
        this.carroId = carroId;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
}
