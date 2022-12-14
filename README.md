# Bertoti
Engenharia de software I

"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. 
On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. 
In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. 
Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth. 
Within Google, we sometimes say, “Software engineering is programming integrated over time.” 
Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. 
If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) 
and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. 
Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming."

Titus Winters, Software Engineering at Google

<strong><h3> Engenharia de Software </h3></strong>

Um bom software deve ser construído com uma boa estrutura, pois não devemos pensar apenas no nascimento de um software, mas como vai funcionar a longo prazo, como vai ser a manutenção desse código? Está bem comentando para futuras correções? É um código limpo? Tudo isso deve ser levado em conta quando criamos um software, pois não envolve apenas a programação, mas o raciocínio da estrutura ao todo. As linguagens de programação deve ser levado em conta para cada tipo de software, pois cada linguagem de programação tem sua vantagem e desvatagem para determinados softwares. Apenas a programação não é o suficiente para um bom software, mas devemos olhar toda sua estrutura, ferramentas, documentação etc...
<hr>

<strong><h3> Trade Off </h3></strong>


Qualquer projeto que seja, devemos levar em conta quais ferramenta utilizar. Um engenheiro civil precisa analisar quais ferramentas e materiais utilizar, para cada tipo de construção. Precisa ser um projeto que necessita de uma entrega rápida sem manutenção? Ou um projeto para usar a longo prazo, que necessita de correções ao longo do tempo. Cada uma das diversas ferramentas e materiais, deve ser analisado ao criar um projeto, qual é a suas vantagens e desvantagens para o projeto.
Um confeiteiro ao criar um bolo, deve levar em conta quais marcas de ingredientes usar para o bolo, precisa ser um bolo doce ou não? Um bolo fofo? Consistente ou inconsistente. 
<hr>
<strong><h3> Ciclo de vida do desenvolvimento de software </h3></strong>

Uma empresa de telemarketing, o qual atende linhas pré-pago está com um grande fluxo de ligações nos últimos tempos e para resolver esse problema, eles resolveram criar um software básico para seus clientes, o qual o usuário consegue resolver seu problema de uma forma prática e eficiente. Primeiramente eles fazem uma análise sobre as ligações, quais são as maiores solicitações e reclamações de seus clientes, e logo após essa análise, eles iniciam a criação do software com alguns requisitos básicos. Fazem a definição dos requisitos funcionais e não funcionais do sistema, e criam um protótipo desse software, analisam a melhor linguagem de programação para o software ter um bom desempenho e pensam em uma estrutura de dados do código o qual eles podem fazer uma futura manutenção de uma forma eficiente.

1.	Interface de login front-end: Definir boa cores, deixando um ambiente prático e bonito o qual o cliente consegue enxergar tudo perfeitamente, e chamar atenção de clientes novos que irá utilizar o software futuramente. Adicionar instruções para os usuários, de como acessar o login e de como realizar um cadastro caso não tenha um login ainda.
2.	Interface de configurações e informações sobre os planos e promoções: Boas cores, instrução de como usar o canal de configurações e informações, utilizar imagens com base em experiência real dos usuários, um site limpo o qual o cliente não fique perdido. 
3.	Interface de reclamação: Boas cores, instruções de como utilizar o canal de reclamações, informações sobre quando realizar uma reclamação ou não, solicitando alguns testes antes de abrir qualquer reclamação, para uma melhor análise do sistema.
4.	Implementação do banco de dados: Incluir os clientes no banco de dados, para obter informações e analisar a necessidade de cada cliente, para assim oferecer uma experiência boa e única para cada usuário, criando um sistema eficiente.
<hr>

<strong><h3> Atividade de requisitos </h3></strong>
<strong><h4> Situação: </h4></strong>
Um restaurante estabelece um sistema chamado garçom para o cadastro de clientes, onde ele poderá localizar por seu nome ou através dos atributos incluído no pedido, sendo possível comparar os dados entre os pedidos.
<strong><h4> Requisitos Funcionais  </h4></strong>

•	Cadastro de clientes: Realiza o cadastro do cliente com os seguintes dados, nome e pedido;<br>
•	Cadastro de pedidos: Introduz os dados, numeroDaMesa, horaDoPedido, tipoDeGrao, tipoDeSalada, acompanhamento; 
<strong><h4> Diagrama de Casos de Uso </h4></strong>
<img src = "https://user-images.githubusercontent.com/101937633/203674418-aa042d1f-f48a-4059-8a43-a36304952b4b.png" />
<strong><h4> Requisitos Não Funcionais </h4></strong>

•	Usabilidade<br>
•	Transparência<br>
•	Plataforma Intuitiva e Flexível<br>

<strong><h4> Diagrama de Classes UML </h4></strong>

<img src = "https://user-images.githubusercontent.com/101937633/203813781-209e9607-4368-45ad-96dc-f2c8536bc766.png" />

<strong><h3> Desenvolvimento </h3></strong>

<strong><h4> Classe Cliente </h4></strong>

<img src = "https://user-images.githubusercontent.com/101937633/204535862-d16762bc-82b2-426a-9136-00a9a8e9c361.png" />

<strong><h4> Classe Pedido </h4></strong>

<img src = "https://user-images.githubusercontent.com/101937633/204536267-ddeb15a7-8dfd-4f92-9feb-4b9ec348375e.png" />


<strong><h4> Classe Restaurante </h4></strong>

<Img src = "https://user-images.githubusercontent.com/101937633/204536389-d395a141-4720-429e-a1c1-2f5414c3c6e0.png" />

<strong><h4> Teste </h4></strong>

<img src = "https://user-images.githubusercontent.com/101937633/204536527-37d42e26-aa79-4f18-b76d-19cc00b8bedc.png" />
