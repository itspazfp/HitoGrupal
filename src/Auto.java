
public class Auto extends Coche {

    public Auto(String marca,String modelo,String placa, String tipo, int velocidad, int marcha, Seguro seguro) {
        super(marca, modelo, placa, tipo, velocidad, marcha,seguro);
   }

@Override
   public void acelerar(int a) {
     super.acelerar(a);
       if (getVelocidad() < 0) {
           cambiaMarcha(0);
       } else if (getVelocidad() < 10) {
           cambiaMarcha(1);
       } else if (getVelocidad() < 30) {
           cambiaMarcha(2);
       } else if (getVelocidad() < 50) {
           cambiaMarcha(3);
       } else if (getVelocidad() < 80) {
           cambiaMarcha(4);
       } else if (getVelocidad() < 0) {
           cambiaMarcha(0);
       } else {
           cambiaMarcha(5);
       }
       if (velocidad < 0) {
           velocidad = 0;
       }
   }

@Override
   public void frenar(int f) {
     super.frenar(f);
       if (getVelocidad() < 0) {
          cambiaMarcha(0);
      } else if (getVelocidad() < 5) {
          cambiaMarcha(1);
      } else if (getVelocidad() < 20) {
          cambiaMarcha(2);
      } else if (getVelocidad() < 40) {
          cambiaMarcha(3);
      } else if (getVelocidad() < 60) {
          cambiaMarcha(4);
      } else {
          cambiaMarcha(5);
      }
       if (velocidad < 0) {
           velocidad = 0;
    }
}
}
