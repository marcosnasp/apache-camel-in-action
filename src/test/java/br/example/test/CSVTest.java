package br.example.test;

import br.example.camel.ch1.pojos.RowDataCsv;
import br.example.camel.ch1.routers.CSVRouterBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.dataformat.bindy.format.factories.DefaultFactoryRegistry;
import org.apache.camel.impl.JndiRegistry;
import org.apache.camel.impl.PropertyPlaceholderDelegateRegistry;
import org.apache.camel.model.dataformat.BindyType;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Before;
import org.junit.Test;

public class CSVTest extends CamelTestSupport {

    private static final String HEADER =
            "NU_ETAPA;CO_IES;NO_IES;SG_IES;SG_UF_IES;NO_CAMPUS;CO_IES_CURSO;NO_CURSO;DS_TURNO;DS_FORMACAO;" +
            "QT_VAGAS;CO_INSCRICAO_ENEM;NO_INSCRITO;NU_CPF;DT_NASCIMENTO;TP_SEXO;NU_RG;NO_MAE;DS_LOGRADOURO;NU_ENDERECO;" +
            "DS_COMPLEMENTO;SG_UF_INSCRITO;NO_MUNICIPIO;NO_BAIRRO;NU_CEP;NU_FONE1;NU_FONE2;DS_EMAIL;NU_NOTA_L;NU_NOTA_CH;" +
            "NU_NOTA_CN;NU_NOTA_M;NU_NOTA_R;CO_CURSO_INSCRICAO;DT_CURSO_INSCRICAO;HR_CURSO_INSCRICAO;DT_MES_DIA_INSCRICAO;ST_OPCAO;NU_NOTA_CURSO_L;NU_NOTA_CURSO_CH;" +
            "NU_NOTA_CURSO_CN;NU_NOTA_CURSO_M;NU_NOTA_CURSO_R;ST_ADESAO_ACAO_AFIRMATIVA_CURS;NO_MODALIDADE_CONCORRENCIA;ST_BONUS_PERC;QT_BONUS_PERC;NO_ACAO_AFIRMATIVA_BONUS;NU_NOTA_INSCRITO;NU_NOTACORTE_CONCORRIDA;" +
            "NU_CLASSIFICACAO;ST_APROVADO;ST_MATRICULA;DT_MATRICULA_EFETIVADA;DT_MES_DIA_MATRICULA;ST_MATRICULA_CANCELADA;DT_MATRICULA_CANCELADA;NO_MOD_CONCORRENCIA_ORIG;ST_LEI_OPTANTE;" +
            "ST_LEI_RENDA;ST_LEI_ETNIA_P;ST_LEI_ETNIA_I";

    private static final String ROW =
            "4;548;UNIVERSIDADE FEDERAL DO MARANHÃO;UFMA;MA;CAMPUS DO BACANGA;311450;CIÊNCIAS SOCIAIS;Vespertino;Bacharelado;" +
            "8;120137350661;SAMIA CAROLINA SANTOS DIAS;3591470384;1995-03-11 00:00:00;F;1085549990;DORACY SANTOS BARROSO;Rua Epitácio Cafeteira;Nº 09 A;" +
            "Maracanã;MA;SAO LUIS;Vila Nova Republica;65080160;9832577284;9888525270;samia-carolini@hotmail.com;456.7;564.3;" +
            "401.6;494.7;700;13815972;2013-01-07 00:00:00;14:25;01/07;;456.7;564.3;" +
            "401.6;494.7;700;Não;Ampla Concorrência;Não;0;;523.46;600.2;" +
            "109;Sim;Não;;;Não;;;;;" +
            ";";

    @Before
    public void setup() {
        PropertyPlaceholderDelegateRegistry registry = (PropertyPlaceholderDelegateRegistry)context.getRegistry();
        JndiRegistry reg = (JndiRegistry)registry.getRegistry();
        reg.bind("defaultFactoryRegistry", new DefaultFactoryRegistry());
    }

    @Test
    public void testBindyUnmarshalQuoteAndCommaDelimiter() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:out");
        mock.expectedMessageCount(1);

        assertMockEndpointsSatisfied();

        RowDataCsv row = mock.getReceivedExchanges().get(0).getIn().getBody(RowDataCsv.class);
        System.out.println(row.toString());
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new CSVRouterBuilder();
    }

}
