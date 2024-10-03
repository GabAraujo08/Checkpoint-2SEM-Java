package questao3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Inventario  {


    //MINHA SOLUÇÃO

//    static Map<String, Integer> produtos = new HashMap<>();
//    static ArrayList<String> nomeProdutos = new ArrayList<>();
//    static ArrayList<Integer> quantidadeProdutos = new ArrayList<>();
////    private static String nomeProduto;
////    private static Integer quantidadeProduto;
//
//
//    public static void setNomeProdutos(String nomeProdutos) {
//        Inventario.nomeProdutos.add(nomeProdutos);
//    }
//
//    public static void setQuantidadeProdutos(Integer quantidadeProdutos) {
//        Inventario.quantidadeProdutos.add(quantidadeProdutos);
//    }
//
//    public static Map<String, Integer> criarInventario() {
//        for (int i = 0; i < nomeProdutos.size(); i++) {
//            produtos.put(nomeProdutos.get(i), quantidadeProdutos.get(i));
//        }
//        return produtos;
//    }

    //CORREÇÃO

    public static Map<String, Integer> criarInventario(){
        return new HashMap<>();
    }

    public static void main(String[] args) {
        Map<String, Integer> inventario = new HashMap<>();
        inventario.put("maçã", 3);
        inventario.put("banana", 2);
        inventario.put("laranja", 5);
        System.out.println(inventario);
    }

}
