package br.example.camel.ch1.pojos;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

//NU_NOTA_L	NU_NOTA_CH	NU_NOTA_CN	NU_NOTA_M	NU_NOTA_R NU_NOTA_INSCRITO
@CsvRecord(separator = ";")
public class NotaParticipante {

    //@DataField()
    private Double nuNotaL;

    //@DataField()
    private Double nuNotaCh;

    //@DataField()
    private Double nuNotaCn;

    //@DataField()
    private Double nuNotaM;

    //@DataField()
    private Double nuNotaR;

    //@DataField()
    private Double nuNotaInscrito;



}
