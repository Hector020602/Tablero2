import java.util.Scanner;

public class Tablero {
    public static void main(String[] args) {
        final int FILAS = 8;
        final int COLUMNAS = 8;
        final char CUADROBLANCO = '\u25A1';
        final char CUADRONEGRO = '\u25A0';
        final char DAMA = '۩';
        Scanner scanner = new Scanner(System.in);
        char[][] tablero = new char[FILAS][COLUMNAS];
        boolean blanco = false;
        char color;
        String posicion = new String();
        int filaDama;
        int columnaDama;
        for (int fila = FILAS - 1; fila >= 0; fila--) {
            //blanco = ! blanco;
            System.out.print(fila + 1 + " ");
            for (int columna = 0; columna < COLUMNAS; columna++) {
                //if (blanco)
                if (((fila + columna) % 2) != 0)
                    //color = 'B';
                    color = CUADROBLANCO;
                else
                    //color = 'N';
                    color = CUADRONEGRO;
                //blanco = ! blanco;
                System.out.print(color + " ");
                tablero[fila][columna] = color;
            }
            System.out.println();
        }
        System.out.print("  ");
        for (char letra = 'a'; letra <= 'h'; letra++) {
            System.out.print(letra + " ");
        }/*
        System.out.println();
        System.out.println("Dame la posición de la dama: ");
        posicion = scanner.nextLine();
        columnaDama = (int) (posicion.charAt(0) - 'a');
        filaDama = (int) (posicion.charAt(1) - '1');
        tablero[filaDama][columnaDama] = DAMA;
        // TODO: calcular posiciones a las que se puede mover la dama
        for (int fila = FILAS - 1; fila >= 0; fila --) {
            System.out.print(fila + 1 + " ");
            for (int columna = 0; columna < COLUMNAS; columna ++) {
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
        System.out.print("  ");
        for (char letra = 'a'; letra <= 'h'; letra ++) {
            System.out.print(letra + " ");
        }
        System.out.println();
    }*/
    }
}

