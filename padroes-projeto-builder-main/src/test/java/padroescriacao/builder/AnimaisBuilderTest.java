package padroescriacao.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimaisBuilderTest {



    @Test
    void deveRetornarExcecaoParaAnimaisSemNome() {
        try {
            AnimaisBuilder AnimaisBuilder = new AnimaisBuilder();
            Animais animais = AnimaisBuilder
                    .setIdade(20)
                    .setNome("")
                    .setRaca("Girafa")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAnimalCadastrado() {
        AnimaisBuilder AnimaisBuilder = new AnimaisBuilder();
        Animais animais = AnimaisBuilder
                .setIdade(15)
                .setNome("Tiquinha")
                .setRaca("Girafa")
                .build();

        assertNotNull(animais);
    }






}