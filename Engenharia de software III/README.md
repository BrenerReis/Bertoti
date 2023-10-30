<table>
    <tr>
        <td>Nome do padrão</td>
        <td>Anti-padrão</td>
        <td>Definição do padrão</td>
        <td>Problema que ele resolve</td>
        <td>Onde é utilizado na arquitetura Java</td>
    </tr>
    <tr>
        <td>Strategy</td>
        <td>Herança</td>
        <td>Consiste em encapsular diferentes estratégias de decisão e permitir a troca flexível entre elas usando polimorfismo.</td>
        <td>Evita a complexidade de decisões incorporadas e torna o código mais flexível.</td>
        <td>Usado em Java para gerenciar estratégias de roteamento de rede, escolha de algoritmos de criptografia, seleção de políticas de autenticação, etc.</td>
    </tr>
    </tr>
    <tr>
        <td>Observer</td>
        <td>Alto acoplamento</td>
        <td>Permite que objetos se inscrevam para receber notificações sobre eventos ocorrendo em um objeto observado em tempo real.</td>
        <td>Reduz o alto acoplamento entre objetos e torna o sistema altamente responsivo.</td>
        <td>Usado em Java para atualizar automaticamente interfaces de usuário em tempo real, notificar assinantes de eventos em sistemas de mensagens, manter consistência de dados distribuídos, etc.</td>
    </tr>
    <tr>
        <td>Composite</td>
        <td>Código de grande complexidade, difícil manutenção</td>
        <td>É aplicada quando se precisa criar estruturas hierárquicas de objetos, como árvores, e tratar objetos individuais e compostos de maneira uniforme.</td>
        <td>Evita a duplicação de código e usa a recursão para dividir problemas em partes menores e resolvê-los eficientemente.</td>
        <td>Usado em Java para representar estruturas de documentos, organizar componentes de interface de usuário, criar árvores de categorias, etc.</td>
    </tr>
    <tr>
        <td>Facade</td>
        <td>Uma única classe ou objeto assume muitas responsabilidades, tornando-o difícil de entender e modificar</td>
        <td>Fornece uma interface fácil de usar para um conjunto de funcionalidades complexas em um subsistema, ocultando detalhes internos.</td>
        <td>Resolve o desafio de interagir com sistemas complexos, simplificando o acesso aos serviços essenciais.</td>
        <td>Usado em Java em sistemas de gerenciamento de banco de dados, onde uma interface simples esconde a complexidade das consultas SQL, operações de banco de dados, etc.</td>
    </tr>
    <tr>
        <td>Singleton</td>
        <td>Múltiplas instâncias da classe parecem compartilhar o mesmo estado</td>
        <td>Garante que uma classe tenha somente uma instância e oferece um ponto global de acesso a essa instância.</td>
        <td>Resolve o problema de controlar múltiplas instâncias da mesma classe, evitando inconsistências de estado.</td>
        <td>Usado em Java para gerenciar recursos compartilhados, como conexões de banco de dados, caches de objetos, registros de log centralizados, configurações de aplicativos globais, etc.</td>
    </tr>
</table>