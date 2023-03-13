package padroescriacao.builder;

import java.util.Date;

public class AnimaisBuilder {

    private Animais Animais;

    public AnimaisBuilder() {
        Animais = new Animais();
    }

    public Animais build() {

        if (Animais.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (Animais.getIdade()<= 0){
            throw new IllegalArgumentException("Idade inválida");
        }

        if (Animais.getRaca().equals("")) {
            throw new IllegalArgumentException("Raça inválida");
        }
        return Animais;
    }

    public AnimaisBuilder setIdade(int idade) {
        Animais.setIdade(idade);
        return this;
    }

    public AnimaisBuilder setNome(String nome) {
        Animais.setNome(nome);
        return this;
    }


    public AnimaisBuilder setRaca(String raca) {
        Animais.setRaca(raca);
        return this;
    }












}
