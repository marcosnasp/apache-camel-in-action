package br.example.camel.ch1.eip;

import org.megatech.horus.sgc.messages.json.RequisicaoMensagem;
import org.megatech.horus.sgc.messages.validadores.ValidadorDeMensagem;

public class SplitterComando {

    public String splitter(String body) {
        ValidadorDeMensagem validadorDeMensagem = new ValidadorDeMensagem();
        JsonReaderImpl jsonReaderImpl = new JsonReaderImpl();
        RequisicaoMensagem requisicaoMensagem = null;
        
        if(validadorDeMensagem != null && body != null) {
            if(!validadorDeMensagem.isRequisicaoMensagem(body)) {
                throw new IllegalArgumentException("Mensagem enviada invalida");
            } else {
                requisicaoMensagem = jsonReaderImpl.getRequisicaoMensagem(body);
            }
        }
        
        return requisicaoMensagem.getId_horus();
    }
    
}
