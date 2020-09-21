package ar.edu.unlam.pb2.disco;

public class Disco {

    /*crear una clase que permita modelar un Disco. 

     * Se desea conocer: • radio interior. • radio exterior. 

     * • perímetro interior. • perímetro exterior. 

     * • superficie. Debe tener operaciones para 

     * cambiar el radio interior y el radio exterior.*/


        private Double radioMayor, radioMenor, perimetroMayor, perimetroMenor, superficie;

        private final int DOS;


        public Disco(Double radioMayor, Double radioMenor) {

            this.radioMayor=radioMayor;

            this.radioMenor=radioMenor;    

            this.DOS=2;

        }


        public double obtenerElPerimetroMayor() {

            this.perimetroMayor= DOS * Math.PI * radioMayor;

            return perimetroMayor;

        }


        public double obtenerElPerimetroMenor() {

            this.perimetroMayor= DOS * Math.PI * radioMenor;

            return perimetroMenor;

        }

       

        public double obtenerLaSuperficie() {

            this.superficie=  Math.PI * Math.pow(radioMayor-radioMenor, DOS);

            return superficie;

        }

       public double getRadioMayor() {

            return radioMayor;

        }

       public void setRadioMayor(Double radioMayor) {

            this.radioMayor = radioMayor;

        }

       public double getRadioMenor() {

            return radioMenor;

        }

       public void setRadioMenor(Double radioMenor) {

            this.radioMenor = radioMenor;

        }



    }