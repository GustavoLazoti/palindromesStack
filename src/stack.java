public class stack {
    // Atributos privados
    private static final int TAM_DEFAULT = 100;
    private	int topoStack;
    private	char e[ ];
    // Métodos públicos
    public	stack(int tamanho) {  // construtor 1
        this.e = new char [tamanho];
        this.topoStack = -1;
    }

    public	stack() {// construtor 2
        this(TAM_DEFAULT);
    }


    //Verifica se a Stack
    //está vazia
    public boolean isEmpty() {
        if (this.topoStack == -1)
            return true;
        else
            return false;
    }
    // Verifica se a Stack está
    // cheia
    public boolean isFull() {
        if (this.topoStack == this.e.length-1)
            return true;
        else
            return false;
    }
    // insere um elemento e 
    // no topo da Stack
    public void push(char e) {
        if (! this.isFull( ))
            this.e[++this.topoStack] = e;
        else
            System.out.println("overflow - Estouro de Stack");
    }
    //remove um elemento 
    //do topo da Stack
    public char pop() {
        if (! this.isEmpty( ))
            return this.e[this.topoStack--];
        else{
            System.out.println( "underflow - Esvaziamento de Stack");
            return '\0';
        }
    }
    //Retorna o elemento que está
    //no topo da Stack
    public char topo() {
        if ( ! this.isEmpty( ))
            return this.e[this.topoStack];
        else{
            System.out.println("Underlow - Esvaziamento de Stack");
            return '\0';
        }
    }
    // obtém o total de elementos 
    //armazenados na Stack
    public int sizeElements() {
        return topoStack+1;
    }



    // Sobrescrita/sobreposição (override) do método toString(), que veio da superclasse Object.
    // O retorno do método toString() é a representação de um objeto em formato string, e toString()
    // geralmente é executado (de forma implícita) quando passamos um objeto ao System.out.print*().
    //
    // Experimente incluir o seguinte código na main() e veja a saída:
    // Stack p = new Stack();
    // System.out.println(f);
    //
    // Depois, remova/comente o método toString() abaixo e rode o código acima novamente.

}

