package trabalhofinal;

public class listaduplarun {

    public static void main(String[] args) {
        listadupla newList = new listadupla();
        newList.addPrimeiro("Numeros");
        newList.addPrimeiro(40);
        newList.addPrimeiro(60);
        newList.addPrimeiro(10);
        newList.addPrimeiro(30);
        newList.addPrimeiro(80);
        newList.addPrimeiro(90);
        newList.displayList();
        newList.removeprimeiro();
        newList.removeprimeiro();
        newList.removeultimo();

        newList.displayList();
    }
}