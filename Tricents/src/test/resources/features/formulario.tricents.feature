#language: pt
#Author: antonioleonelrjr@gmail.com

@formulario
Funcionalidade: 
  Como usuario
  Quero preencher todos os formularios
  Para validar cadastro enviado com sucesso

  @formulario
  Cenario: validando formularios tricents
     
    Dado que eu esteja no site "http://sampleapp.tricentis.com/101/app.php"
    E preencher todos os formularios
    Quando pressionar next
    Entao valido se o cadastro foi enviado com sucesso
    

 