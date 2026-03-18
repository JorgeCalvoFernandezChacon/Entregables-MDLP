package es.uah.matcomp.mp.e1.ejerciciosComposicion.my_point;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    /*
     * --- Métodos de Distancia ---
     */

    /// 1. Distancia a unas coordenadas (x, y) dadas
    public double distance(int x, int y) {
        int xDiferencia = this.x - x;
        int yDiferencia = this.y - y;
        return Math.sqrt(xDiferencia * xDiferencia + yDiferencia * yDiferencia);
    }

    /// 2. Distancia a otra instancia de MyPoint
    public double distance(MyPoint another) {
        int xDiferencia = this.x - another.x;
        int yDiferencia = this.y - another.y;
        return Math.sqrt(xDiferencia * xDiferencia + yDiferencia * yDiferencia);
    }

    /// 3. Distancia al origen (0, 0)
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}
