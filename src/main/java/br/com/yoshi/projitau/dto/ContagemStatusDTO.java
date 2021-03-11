package br.com.yoshi.projitau.dto;

public class ContagemStatusDTO {
    private int agFinanceiro;
    private String nomeAgente;
    private int volumeTransacional;
    private long sucessos;
    private long falhas;
    private long fraudes;

    public ContagemStatusDTO(int agFinanceiro, String nomeAgente, int volumeTransacional, long sucessos, long falhas,
            long fraudes) {
        this.agFinanceiro = agFinanceiro;
        this.nomeAgente = nomeAgente;
        this.volumeTransacional = volumeTransacional;
        this.sucessos = sucessos;
        this.falhas = falhas;
        this.fraudes = fraudes;
    }

    public int getAgFinanceiro() {
        return agFinanceiro;
    }

    public void setAgFinanceiro(int agFinanceiro) {
        this.agFinanceiro = agFinanceiro;
    }

    public String getNomeAgente() {
        return nomeAgente;
    }

    public void setNomeAgente(String nomeAgente) {
        this.nomeAgente = nomeAgente;
    }

    public int getVolumeTransacional() {
        return volumeTransacional;
    }

    public void setVolumeTransacional(int volumeTransacional) {
        this.volumeTransacional = volumeTransacional;
    }

    public long getSucessos() {
        return sucessos;
    }

    public void setSucessos(long sucessos) {
        this.sucessos = sucessos;
    }

    public long getFalhas() {
        return falhas;
    }

    public void setFalhas(long falhas) {
        this.falhas = falhas;
    }

    public long getFraudes() {
        return fraudes;
    }

    public void setFraudes(long fraudes) {
        this.fraudes = fraudes;
    }

    
}
