package edu.andrey.metodos;

public class Usuario {
    public static void  main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarDeCanal(15);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        smartTv.ligar();
        System.out.println("novo estado:" + smartTv.ligada);
        smartTv.desligar();
        System.out.println("novo estado:" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Aumentando volume: " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Diminuir volume: " + smartTv.volume);
    }
}
