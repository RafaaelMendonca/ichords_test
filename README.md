
# Ichords

### Descrição do projeto:
O iChords é uma plataforma especializada no ensino de música online, desenvolvida pela Daccord. Em resposta ao crescimento de 31% na procura por cursos online de música e à alta taxa de desistência (64%), este MVP apresenta uma solução inovadora: uma aba de lições gamificada.

### Problema que ele resolve:
Cursos online de música enfrentam dificuldades em manter a motivação e o engajamento dos alunos, resultando em altas taxas de abandono. Este MVP busca reduzir significativamente a desistência, tornando o aprendizado mais atrativo e envolvente.

### Principal funcionalidade:
A aba de lições gamificada utiliza mecânicas de jogo (como conquistas e desafios) para motivar os alunos a concluírem as lições. Estudos mostram que 89% dos alunos aprendem mais eficientemente com formatos gamificados, tornando essa abordagem uma alternativa eficaz ao método tradicional.

## Estrutura do Projeto

Este projeto Android tem como objetivo [descrever o objetivo principal do app, por exemplo: "ensinar os primeiros acordes de violão de forma simples e intuitiva"].

### **Estrutura de Diretórios:**

* **app:**
  * **manifests:**
    * **AndroidManifest.xml:** Configurações gerais do aplicativo, como permissões e componentes.
  * **java:**
    * **com.example.myteste:** Pacote principal do aplicativo.
      * **MainActivity.kt:** Tela de login do usuário.
      * **ChordsLessonActivity.kt, ChordsLessonActivity2.kt:** Atividades para exibir os vídeos das lições.
      * **Lesson.kt:** Modelo de dados representando uma lição (título, descrição, vídeo).
      * **LessonsAdapter.kt:** Adaptador para personalizar a visualização das lições no RecyclerView.
      * **LicoesListActivity.kt:** Tela que lista as lições disponíveis.
  * **res:**
    * **drawable:** Imagens e ícones utilizados no aplicativo.
    * **layout:** 
      * **activity_main.xml:** Layout da tela de login (email: 123@gmail.com / senha: 123)
      * **chords_lesson_one.xml, chords_lesson_two.xml:** Layouts das telas das lições.
      * **item_list.xml:** Layout de um item da lista de lições.
      * **activity_licoes_list.xml:** Layout da tela que lista as lições.
    * **raw:** Arquivos de mídia (vídeos) utilizados no aplicativo.
    * **values:** Recursos reutilizáveis, como strings, estilos e cores.


### **Tecnologias Utilizadas**

* **Linguagem:** Kotlin 
* **Framework:** Android SDK

### **Como Executar o Projeto**

1. **Pré-requisitos:**
   * **Android Studio:** Instalar a versão 2024.1.2 do Android Studio.
   * **JVM:** Ter a JVM instalada.

2. **Importar o Projeto:**
   * Abrir o Android Studio.
   * Selecionar "Get from Version Control".
   * Colocar o link do repositório:

     ```
     https://github.com/RafaaelMendonca/ichords_test.git
     ```

3. **Executar:**
   * Conectar um dispositivo físico ou iniciar um emulador.
   * Clicar no botão "Run" no Android Studio.

### **Próximos Passos**

* **Funcionalidades Adicionais:**
  * Implementar Icoins (moedas do aplicativo).
  * Adicionar mais lições e exercícios.
  * Permitir que o usuário troque suas moedas por desconto nos planos ou remoção temporária de anúncios.
  * Implementar ganhos de moedas a cada 10 minutos no tempo máximo de 30 min/dia.
  * Implementar sistema de ranking global mensal.
* **Melhorias:**
  * Ajustar layouts das telas.
  * Implementar testes unitários e de interface.




