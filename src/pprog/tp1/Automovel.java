/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pprog.tp1;

import java.util.Calendar;

/**
 *
 * @author Daniel Martins
 */
public class Automovel {
    private String matricula;
    private double consumo;
    private int cilindrada;
    private int anoRegisto;
    private int autonomia;
    
    private static final String MATRICULA_POR_OMISSAO = "sem matrícula";
    private static final int CONSUMO_POR_OMISSAO = 0;   
    private static final int CILINDRADA_POR_OMISSAO = 0;
    private static final int ANOREGISTO_POR_OMISSAO = 0;
    private static final int AUTONOMIA_POR_OMISSAO = 0;
    private static double taxaAmbiental = 0.02;
    
    private static int limiteRecente = 1;
    private static int limiteContemporaneo = 20;

    /** Cria um objecto com os atributos abaixo
     *
     * @param matricula
     * @param anoRegisto
     * @param consumo
     * @param autonomia
     * @param cilindrada
     */
    public Automovel(String matricula, int anoRegisto, double consumo, int autonomia, int cilindrada) {
        this.matricula = matricula;
        this.anoRegisto = anoRegisto;
        this.consumo = consumo;
        this.autonomia = autonomia;
        this.cilindrada = cilindrada;
        
    }

    /** Cria um objecto com os atributos abaixo
     *  Os atributos que não são recebidos por parâmetro ficam com o respectivo valor por omissão
     * @param matricula
     * @param anoRegisto
     * @param consumo
     * @param autonomia
     */
    public Automovel(String matricula, int anoRegisto, double consumo, int autonomia) {
        this.matricula = matricula;
        this.anoRegisto = anoRegisto;
        this.consumo = consumo;
        this.autonomia = autonomia;
        this.cilindrada = CILINDRADA_POR_OMISSAO;
        
    }
    
    /** Cria um objecto com os atributos abaixo
     *  Os atributos que não são recebidos por parâmetro ficam com o respectivo valor por omissão
     * @param matricula
     * @param anoRegisto
     * @param consumo
     */
    public Automovel(String matricula, int anoRegisto, double consumo) {
        this.matricula = matricula;
        this.anoRegisto = anoRegisto;
        this.consumo = consumo;
        this.autonomia = AUTONOMIA_POR_OMISSAO;
        this.cilindrada = CILINDRADA_POR_OMISSAO;
        
    }
    
    /** Cria um objecto com os atributos abaixo
     *  Os atributos que não são recebidos por parâmetro ficam com o respectivo valor por omissão
     * @param matricula
     * @param anoRegisto
     */
    public Automovel(String matricula, int anoRegisto) {
        this.matricula = matricula;
        this.anoRegisto = anoRegisto;
        this.consumo = CONSUMO_POR_OMISSAO;
        this.autonomia = AUTONOMIA_POR_OMISSAO;
        this.cilindrada = CILINDRADA_POR_OMISSAO;
        
    }
    
    /** Cria um objecto com os atributos abaixo
     *  Os atributos que não são recebidos por parâmetro ficam com o respectivo valor por omissão
     * @param matricula
     */
    public Automovel(String matricula) {
        this.matricula = matricula;
        this.anoRegisto = ANOREGISTO_POR_OMISSAO;
        this.consumo = CONSUMO_POR_OMISSAO;
        this.autonomia = AUTONOMIA_POR_OMISSAO;
        this.cilindrada = CILINDRADA_POR_OMISSAO;
        
    }
    
    /** Cria um objecto com os valores por omissão
     *
     */
    public Automovel() {
        this.matricula = MATRICULA_POR_OMISSAO;
        this.anoRegisto = ANOREGISTO_POR_OMISSAO;
        this.consumo = CONSUMO_POR_OMISSAO;
        this.autonomia = AUTONOMIA_POR_OMISSAO;
        this.cilindrada = CILINDRADA_POR_OMISSAO;
        
    }
    
    /** Retorna a matrícula do objecto
     *
     * @return
     */
    public String getMatricula() {
        return matricula;
    }

    /** Retorna o ano de registo do objecto
     *
     * @return
     */
    public int getAnoRegisto() {
        return anoRegisto;
    }

    /** Retorna o consumo do objecto
     *
     * @return
     */
    public double getConsumo() {
        return cilindrada;
    }

    /** Retorna a autonomia do objecto
     *
     * @return
     */
    public int getAutonomia() {
        return autonomia;
    }
    
    /** Retorna a cilindrada do objecto
     *
     * @return
     */
    public int getCilindrada() {
        return cilindrada;
    }
    
    /** Retorna a taxa ambiental do objecto
     *
     * @return
     */
    public double getTaxaAmbiental() {
        return taxaAmbiental;
    }
    
    /** Define a matrícula do objecto
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /** Define o ano de registo do objecto
     *
     * @param anoRegisto
     */
    public void setAnoRegisto(int anoRegisto) {
        this.anoRegisto = anoRegisto;
    }

    /** Define o consumo do objecto
     *
     * @param consumo
     */
    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    /** Define a taxa ambiental
     *
     * @param taxa
     */
    public void setTaxaAmbiental(double taxa) {
    
        taxaAmbiental = taxa;
    }
    
    /** Define a autonomia do objecto
     *
     * @param autonomia
     */
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }
    
    /** Define a cilindrada do objecto
     *
     * @param cilindrada
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    /** Define qual o número de anos em que um objecto é considerado recente
     *
     * @param limite
     */
    public static void setLimiteRecente(int limite) {
        limiteRecente = limite;
    }

    public String toString() {
        return  "Matrícula: " + matricula + "\nAno de Registo: " + anoRegisto + 
                "\nConsumo (em L): " + consumo + "\nAutonomia (em KM): " + autonomia + "\nCilindrada (em CC): " + cilindrada +
                "\nImposto de circulação (em €): " + calcularImpostoCirculacao() + 
                "\nClassificação do Carro: " + detClassificacaoCarro() + "\n";

    }

    /** Calcula imposto de circulação
     *
     * @return
     */
    public double calcularImpostoCirculacao() {
        return cilindrada * taxaAmbiental;
        
    }
    
    /** Determina a classificação do carro mediante o ano de registo do objecto
     *
     * @return
     */
    public String detClassificacaoCarro() {
        String classificacaoCarro = null;
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);

        if (year-this.getAnoRegisto()<limiteRecente)
        {
            classificacaoCarro = "Recente";
        }
        else if (year-this.getAnoRegisto() >= limiteRecente && year-this.getAnoRegisto() <= limiteContemporaneo)
        {
            classificacaoCarro = "Contemporâneo";
        }
        else if (this.getAnoRegisto() == 0 )
        {
            classificacaoCarro = "sem classificação";
        }
        else if (year-this.getAnoRegisto() > limiteContemporaneo)
        {
            classificacaoCarro = "Clássico";
        }
        return classificacaoCarro;
    }

}
