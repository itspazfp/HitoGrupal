
public class Manual extends Coche {

public Manual(String tipo, String marca, String modelo, String placa, int velocidad, int marcha,  Seguro seguro) {
		super(tipo, marca, modelo, placa, velocidad, marcha, seguro);
		// TODO Auto-generated constructor stub
	}


@Override
   public void cambiaMarcha(int marcha) {
       super.cambiaMarcha(marcha);
          if (marcha < 0) {
            this.marcha = 0;
        } else {
            this.marcha = marcha;

        }
         if (velocidad < 0) {
            velocidad = 0;
      }
  }
}