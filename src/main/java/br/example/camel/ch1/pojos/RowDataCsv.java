package br.example.camel.ch1.pojos;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ";",skipFirstLine = true, quoting = true, crlf = "UNIX")
public class RowDataCsv {

    @DataField(pos = 1)
    private String numEtapa;

    @DataField(pos = 2)
    private String coIes;

    @DataField(pos = 3)
    private String noIes;

    @DataField(pos = 4)
    private String sgIes;

    @DataField(pos = 5)
    private String sgUfIes;

    @DataField(pos = 6)
    private String noCampus;

    @DataField(pos = 7)
    private String coIesCurso;

    @DataField(pos = 8)
    private String noCurso;

    @DataField(pos = 9)
    private String dsTurno;

    @DataField(pos = 10)
    private String dsFormacao; // OK

    @DataField(pos = 11)
    private String qtVagas;

    @DataField(pos = 12)
    private String coInscricaoEnem;

    @DataField(pos = 13)
    private String noInscrito;

    @DataField(pos = 14)
    private String nuCpf;

    @DataField(pos = 15)
    private String dtNascimento;

    @DataField(pos = 16)
    private String tpSexo;

    @DataField(pos = 17)
    private String nuRg;

    @DataField(pos = 18)
    private String noMae;

    @DataField(pos = 19)
    private String dsLogradouro;

    @DataField(pos = 20)
    private String nuEndereco; // OK

    @DataField(pos = 21)
    private String dsComplemento;

    @DataField(pos = 22)
    private String sgUfInscrito;

    @DataField(pos = 23)
    private String noMunicipio;

    @DataField(pos = 24)
    private String noBairro;

    @DataField(pos = 25)
    private String nuCep;

    @DataField(pos = 26)
    private String nuFoneUm;

    @DataField(pos = 27)
    private String nuFoneDois;

    @DataField(pos = 28)
    private String dosEmail;

    @DataField(pos = 29)
    private String nuNotaL;

    @DataField(pos = 30)
    private String nuNotaCH; // OK

    @DataField(pos = 31)
    private String nuNotaCN;

    @DataField(pos = 32)
    private String nuNotaM;

    @DataField(pos = 33)
    private String nuNotaR;

    @DataField(pos = 34)
    private String coCursoInscricao;

    @DataField(pos = 35)
    private String dtCursoInscricao;

    @DataField(pos = 36)
    private String hrCursoInscricao;

    @DataField(pos = 37)
    private String dtMesDiaInscricao;

    @DataField(pos = 38)
    private String stOpcao;

    @DataField(pos = 39)
    private String nuNotaCursoL;

    @DataField(pos = 40)
    private String nuNotaCursoCH; // OK

    @DataField(pos = 41)
    private String nuNotaCursoCN;

    @DataField(pos = 42)
    private String nuNotaCursoM;

    @DataField(pos = 43)
    private String nuNotaCursoR;

    @DataField(pos = 44)
    private String stAdesaoAcaoAfirmativaCurs;

    @DataField(pos = 45)
    private String noModalidadeConcorrencia;

    @DataField(pos = 46)
    private String stBonusPerc;

    @DataField(pos = 47)
    private String qtBonusPerc;

    @DataField(pos = 48)
    private String noAcaoAfirmativaBonus;

    @DataField(pos = 49)
    private String nuNotaInscrito;

    @DataField(pos = 50)
    private String nuNotaCorteConcorrida; // OK

    @DataField(pos = 51)
    private String nuClassificacao;

    @DataField(pos = 52)
    private String stAprovado;

    @DataField(pos = 53)
    private String stMatricula;

    @DataField(pos = 54)
    private String dtMatriculaEfetivada;

    @DataField(pos = 55)
    private String dtMesDiaMatricula;

    @DataField(pos = 56)
    private String stMatriculaCancelada;

    @DataField(pos = 57)
    private String datMatriculaCancelada;

    @DataField(pos = 58)
    private String noModConcorrenciaOrig;

    @DataField(pos = 59)
    private String stLeiOptante;

    @DataField(pos = 60)
    private String stLeiRenda;

    @DataField(pos = 61)
    private String stLeiEtniaP;

    @DataField(pos = 62)
    private String stLeiEtniaI;

    public String getNumEtapa() {
        return numEtapa;
    }

    public void setNumEtapa(String numEtapa) {
        this.numEtapa = numEtapa;
    }

    public String getCoIes() {
        return coIes;
    }

    public void setCoIes(String coIes) {
        this.coIes = coIes;
    }

    public String getNoIes() {
        return noIes;
    }

    public void setNoIes(String noIes) {
        this.noIes = noIes;
    }

    public String getSgIes() {
        return sgIes;
    }

    public void setSgIes(String sgIes) {
        this.sgIes = sgIes;
    }

    public String getSgUfIes() {
        return sgUfIes;
    }

    public void setSgUfIes(String sgUfIes) {
        this.sgUfIes = sgUfIes;
    }

    public String getNoCampus() {
        return noCampus;
    }

    public void setNoCampus(String noCampus) {
        this.noCampus = noCampus;
    }

    public String getCoIesCurso() {
        return coIesCurso;
    }

    public void setCoIesCurso(String coIesCurso) {
        this.coIesCurso = coIesCurso;
    }

    public String getNoCurso() {
        return noCurso;
    }

    public void setNoCurso(String noCurso) {
        this.noCurso = noCurso;
    }

    public String getDsTurno() {
        return dsTurno;
    }

    public void setDsTurno(String dsTurno) {
        this.dsTurno = dsTurno;
    }

    public String getDsFormacao() {
        return dsFormacao;
    }

    public void setDsFormacao(String dsFormacao) {
        this.dsFormacao = dsFormacao;
    }

    public String getQtVagas() {
        return qtVagas;
    }

    public void setQtVagas(String qtVagas) {
        this.qtVagas = qtVagas;
    }

    public String getCoInscricaoEnem() {
        return coInscricaoEnem;
    }

    public void setCoInscricaoEnem(String coInscricaoEnem) {
        this.coInscricaoEnem = coInscricaoEnem;
    }

    public String getNoInscrito() {
        return noInscrito;
    }

    public void setNoInscrito(String noInscrito) {
        this.noInscrito = noInscrito;
    }

    public String getNuCpf() {
        return nuCpf;
    }

    public void setNuCpf(String nuCpf) {
        this.nuCpf = nuCpf;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getTpSexo() {
        return tpSexo;
    }

    public void setTpSexo(String tpSexo) {
        this.tpSexo = tpSexo;
    }

    public String getNuRg() {
        return nuRg;
    }

    public void setNuRg(String nuRg) {
        this.nuRg = nuRg;
    }

    public String getNoMae() {
        return noMae;
    }

    public void setNoMae(String noMae) {
        this.noMae = noMae;
    }

    public String getDsLogradouro() {
        return dsLogradouro;
    }

    public void setDsLogradouro(String dsLogradouro) {
        this.dsLogradouro = dsLogradouro;
    }

    public String getNuEndereco() {
        return nuEndereco;
    }

    public void setNuEndereco(String nuEndereco) {
        this.nuEndereco = nuEndereco;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public String getSgUfInscrito() {
        return sgUfInscrito;
    }

    public void setSgUfInscrito(String sgUfInscrito) {
        this.sgUfInscrito = sgUfInscrito;
    }

    public String getNoMunicipio() {
        return noMunicipio;
    }

    public void setNoMunicipio(String noMunicipio) {
        this.noMunicipio = noMunicipio;
    }

    public String getNoBairro() {
        return noBairro;
    }

    public void setNoBairro(String noBairro) {
        this.noBairro = noBairro;
    }

    public String getNuCep() {
        return nuCep;
    }

    public void setNuCep(String nuCep) {
        this.nuCep = nuCep;
    }

    public String getNuFoneUm() {
        return nuFoneUm;
    }

    public void setNuFoneUm(String nuFoneUm) {
        this.nuFoneUm = nuFoneUm;
    }

    public String getNuFoneDois() {
        return nuFoneDois;
    }

    public void setNuFoneDois(String nuFoneDois) {
        this.nuFoneDois = nuFoneDois;
    }

    public String getDosEmail() {
        return dosEmail;
    }

    public void setDosEmail(String dosEmail) {
        this.dosEmail = dosEmail;
    }

    public String getNuNotaL() {
        return nuNotaL;
    }

    public void setNuNotaL(String nuNotaL) {
        this.nuNotaL = nuNotaL;
    }

    public String getNuNotaCH() {
        return nuNotaCH;
    }

    public void setNuNotaCH(String nuNotaCH) {
        this.nuNotaCH = nuNotaCH;
    }

    public String getNuNotaCN() {
        return nuNotaCN;
    }

    public void setNuNotaCN(String nuNotaCN) {
        this.nuNotaCN = nuNotaCN;
    }

    public String getNuNotaM() {
        return nuNotaM;
    }

    public void setNuNotaM(String nuNotaM) {
        this.nuNotaM = nuNotaM;
    }

    public String getNuNotaR() {
        return nuNotaR;
    }

    public void setNuNotaR(String nuNotaR) {
        this.nuNotaR = nuNotaR;
    }

    public String getCoCursoInscricao() {
        return coCursoInscricao;
    }

    public void setCoCursoInscricao(String coCursoInscricao) {
        this.coCursoInscricao = coCursoInscricao;
    }

    public String getDtCursoInscricao() {
        return dtCursoInscricao;
    }

    public void setDtCursoInscricao(String dtCursoInscricao) {
        this.dtCursoInscricao = dtCursoInscricao;
    }

    public String getHrCursoInscricao() {
        return hrCursoInscricao;
    }

    public void setHrCursoInscricao(String hrCursoInscricao) {
        this.hrCursoInscricao = hrCursoInscricao;
    }

    public String getDtMesDiaInscricao() {
        return dtMesDiaInscricao;
    }

    public void setDtMesDiaInscricao(String dtMesDiaInscricao) {
        this.dtMesDiaInscricao = dtMesDiaInscricao;
    }

    public String getStOpcao() {
        return stOpcao;
    }

    public void setStOpcao(String stOpcao) {
        this.stOpcao = stOpcao;
    }

    public String getNuNotaCursoL() {
        return nuNotaCursoL;
    }

    public void setNuNotaCursoL(String nuNotaCursoL) {
        this.nuNotaCursoL = nuNotaCursoL;
    }

    public String getNuNotaCursoCH() {
        return nuNotaCursoCH;
    }

    public void setNuNotaCursoCH(String nuNotaCursoCH) {
        this.nuNotaCursoCH = nuNotaCursoCH;
    }

    public String getNuNotaCursoCN() {
        return nuNotaCursoCN;
    }

    public void setNuNotaCursoCN(String nuNotaCursoCN) {
        this.nuNotaCursoCN = nuNotaCursoCN;
    }

    public String getNuNotaCursoM() {
        return nuNotaCursoM;
    }

    public void setNuNotaCursoM(String nuNotaCursoM) {
        this.nuNotaCursoM = nuNotaCursoM;
    }

    public String getNuNotaCursoR() {
        return nuNotaCursoR;
    }

    public void setNuNotaCursoR(String nuNotaCursoR) {
        this.nuNotaCursoR = nuNotaCursoR;
    }

    public String getStAdesaoAcaoAfirmativaCurs() {
        return stAdesaoAcaoAfirmativaCurs;
    }

    public void setStAdesaoAcaoAfirmativaCurs(String stAdesaoAcaoAfirmativaCurs) {
        this.stAdesaoAcaoAfirmativaCurs = stAdesaoAcaoAfirmativaCurs;
    }

    public String getNoModalidadeConcorrencia() {
        return noModalidadeConcorrencia;
    }

    public void setNoModalidadeConcorrencia(String noModalidadeConcorrencia) {
        this.noModalidadeConcorrencia = noModalidadeConcorrencia;
    }

    public String getStBonusPerc() {
        return stBonusPerc;
    }

    public void setStBonusPerc(String stBonusPerc) {
        this.stBonusPerc = stBonusPerc;
    }

    public String getQtBonusPerc() {
        return qtBonusPerc;
    }

    public void setQtBonusPerc(String qtBonusPerc) {
        this.qtBonusPerc = qtBonusPerc;
    }

    public String getNoAcaoAfirmativaBonus() {
        return noAcaoAfirmativaBonus;
    }

    public void setNoAcaoAfirmativaBonus(String noAcaoAfirmativaBonus) {
        this.noAcaoAfirmativaBonus = noAcaoAfirmativaBonus;
    }

    public String getNuNotaInscrito() {
        return nuNotaInscrito;
    }

    public void setNuNotaInscrito(String nuNotaInscrito) {
        this.nuNotaInscrito = nuNotaInscrito;
    }

    public String getNuNotaCorteConcorrida() {
        return nuNotaCorteConcorrida;
    }

    public void setNuNotaCorteConcorrida(String nuNotaCorteConcorrida) {
        this.nuNotaCorteConcorrida = nuNotaCorteConcorrida;
    }

    public String getNuClassificacao() {
        return nuClassificacao;
    }

    public void setNuClassificacao(String nuClassificacao) {
        this.nuClassificacao = nuClassificacao;
    }

    public String getStAprovado() {
        return stAprovado;
    }

    public void setStAprovado(String stAprovado) {
        this.stAprovado = stAprovado;
    }

    public String getStMatricula() {
        return stMatricula;
    }

    public void setStMatricula(String stMatricula) {
        this.stMatricula = stMatricula;
    }

    public String getDtMatriculaEfetivada() {
        return dtMatriculaEfetivada;
    }

    public void setDtMatriculaEfetivada(String dtMatriculaEfetivada) {
        this.dtMatriculaEfetivada = dtMatriculaEfetivada;
    }

    public String getDtMesDiaMatricula() {
        return dtMesDiaMatricula;
    }

    public void setDtMesDiaMatricula(String dtMesDiaMatricula) {
        this.dtMesDiaMatricula = dtMesDiaMatricula;
    }

    public String getStMatriculaCancelada() {
        return stMatriculaCancelada;
    }

    public void setStMatriculaCancelada(String stMatriculaCancelada) {
        this.stMatriculaCancelada = stMatriculaCancelada;
    }

    public String getDatMatriculaCancelada() {
        return datMatriculaCancelada;
    }

    public void setDatMatriculaCancelada(String datMatriculaCancelada) {
        this.datMatriculaCancelada = datMatriculaCancelada;
    }

    public String getNoModConcorrenciaOrig() {
        return noModConcorrenciaOrig;
    }

    public void setNoModConcorrenciaOrig(String noModConcorrenciaOrig) {
        this.noModConcorrenciaOrig = noModConcorrenciaOrig;
    }

    public String getStLeiOptante() {
        return stLeiOptante;
    }

    public void setStLeiOptante(String stLeiOptante) {
        this.stLeiOptante = stLeiOptante;
    }

    public String getStLeiRenda() {
        return stLeiRenda;
    }

    public void setStLeiRenda(String stLeiRenda) {
        this.stLeiRenda = stLeiRenda;
    }

    public String getStLeiEtniaP() {
        return stLeiEtniaP;
    }

    public void setStLeiEtniaP(String stLeiEtniaP) {
        this.stLeiEtniaP = stLeiEtniaP;
    }

    public String getStLeiEtniaI() {
        return stLeiEtniaI;
    }

    public void setStLeiEtniaI(String stLeiEtniaI) {
        this.stLeiEtniaI = stLeiEtniaI;
    }

    @Override
    public String toString() {
        return "RowDataCsv{" +
                "numEtapa='" + numEtapa + '\'' +
                ", coIes='" + coIes + '\'' +
                ", noIes='" + noIes + '\'' +
                ", sgIes='" + sgIes + '\'' +
                ", sgUfIes='" + sgUfIes + '\'' +
                ", noCampus='" + noCampus + '\'' +
                ", coIesCurso='" + coIesCurso + '\'' +
                ", noCurso='" + noCurso + '\'' +
                ", dsTurno='" + dsTurno + '\'' +
                ", dsFormacao='" + dsFormacao + '\'' +
                ", qtVagas='" + qtVagas + '\'' +
                ", coInscricaoEnem='" + coInscricaoEnem + '\'' +
                ", noInscrito='" + noInscrito + '\'' +
                ", nuCpf='" + nuCpf + '\'' +
                ", dtNascimento='" + dtNascimento + '\'' +
                ", tpSexo='" + tpSexo + '\'' +
                ", nuRg='" + nuRg + '\'' +
                ", noMae='" + noMae + '\'' +
                ", dsLogradouro='" + dsLogradouro + '\'' +
                ", nuEndereco='" + nuEndereco + '\'' +
                ", dsComplemento='" + dsComplemento + '\'' +
                ", sgUfInscrito='" + sgUfInscrito + '\'' +
                ", noMunicipio='" + noMunicipio + '\'' +
                ", noBairro='" + noBairro + '\'' +
                ", nuCep='" + nuCep + '\'' +
                ", nuFoneUm='" + nuFoneUm + '\'' +
                ", nuFoneDois='" + nuFoneDois + '\'' +
                ", dosEmail='" + dosEmail + '\'' +
                ", nuNotaL='" + nuNotaL + '\'' +
                ", nuNotaCH='" + nuNotaCH + '\'' +
                ", nuNotaCN='" + nuNotaCN + '\'' +
                ", nuNotaM='" + nuNotaM + '\'' +
                ", nuNotaR='" + nuNotaR + '\'' +
                ", coCursoInscricao='" + coCursoInscricao + '\'' +
                ", dtCursoInscricao='" + dtCursoInscricao + '\'' +
                ", hrCursoInscricao='" + hrCursoInscricao + '\'' +
                ", dtMesDiaInscricao='" + dtMesDiaInscricao + '\'' +
                ", stOpcao='" + stOpcao + '\'' +
                ", nuNotaCursoL='" + nuNotaCursoL + '\'' +
                ", nuNotaCursoCH='" + nuNotaCursoCH + '\'' +
                ", nuNotaCursoCN='" + nuNotaCursoCN + '\'' +
                ", nuNotaCursoM='" + nuNotaCursoM + '\'' +
                ", nuNotaCursoR='" + nuNotaCursoR + '\'' +
                ", stAdesaoAcaoAfirmativaCurs='" + stAdesaoAcaoAfirmativaCurs + '\'' +
                ", noModalidadeConcorrencia='" + noModalidadeConcorrencia + '\'' +
                ", stBonusPerc='" + stBonusPerc + '\'' +
                ", qtBonusPerc='" + qtBonusPerc + '\'' +
                ", noAcaoAfirmativaBonus='" + noAcaoAfirmativaBonus + '\'' +
                ", nuNotaInscrito='" + nuNotaInscrito + '\'' +
                ", nuNotaCorteConcorrida='" + nuNotaCorteConcorrida + '\'' +
                ", nuClassificacao='" + nuClassificacao + '\'' +
                ", stAprovado='" + stAprovado + '\'' +
                ", stMatricula='" + stMatricula + '\'' +
                ", dtMatriculaEfetivada='" + dtMatriculaEfetivada + '\'' +
                ", dtMesDiaMatricula='" + dtMesDiaMatricula + '\'' +
                ", stMatriculaCancelada='" + stMatriculaCancelada + '\'' +
                ", datMatriculaCancelada='" + datMatriculaCancelada + '\'' +
                ", noModConcorrenciaOrig='" + noModConcorrenciaOrig + '\'' +
                ", stLeiOptante='" + stLeiOptante + '\'' +
                ", stLeiRenda='" + stLeiRenda + '\'' +
                ", stLeiEtniaP='" + stLeiEtniaP + '\'' +
                ", stLeiEtniaI='" + stLeiEtniaI + '\'' +
                '}';
    }
}