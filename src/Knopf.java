
public class Knopf {

    public static int ws, Art, Art2 , Art3, Stelle, Stelle2, Stelle3;

    public static void Knopf(){

        Var.text1.setText("");
        Var.text2.setText("");
        Var.text3.setText("");
        Var.gewinn.setText("");
        ws = (int) (Math.random() * 100);
        Art = (int) (Math.random()*3);
        Art2 = (int) (Math.random() * 3);
        Art3 = (int) (Math.random() * 3);
        Stelle = (int) (Math.random() * 3);
        Stelle2 = (int) (Math.random() * 3);
        Stelle3 = (int) (Math.random() * 3);
        if(ws < 5) {
            if (Art == 0) {
                Var.text1.setText(Var.orange);
                Var.text2.setText(Var.orange);
                Var.text3.setText(Var.orange);
            } else if (Art == 1) {
                Var.text1.setText(Var.apfel);
                Var.text2.setText(Var.apfel);
                Var.text3.setText(Var.apfel);
            } else if (Art == 2) {
                Var.text1.setText(Var.birne);
                Var.text2.setText(Var.birne);
                Var.text3.setText(Var.birne);
            }
        } else if(ws < 30){
            while(Stelle == Stelle2 || Art == Art2 || Stelle == Stelle3 || Stelle3 == Stelle2){

                Stelle = (int) (Math.random() * 3);
                Stelle2 = (int) (Math.random() * 3);
                Stelle3 = (int) (Math.random() * 3);
                Art = (int) (Math.random() * 3);
                Art2 = (int) (Math.random() * 3);

            }

            if (Stelle == 0) {
                if (Art == 0) {
                    Var.text1.setText(Var.orange);
                } else if (Art == 1) {
                    Var.text1.setText(Var.apfel);
                } else if (Art == 2) {
                    Var.text1.setText(Var.birne);
                }

            } else if (Stelle == 1) {

                if (Art == 0) {
                    Var.text2.setText(Var.orange);
                } else if (Art == 1) {
                    Var.text2.setText(Var.apfel);
                } else if (Art == 2) {
                    Var.text2.setText(Var.birne);
                }

            } else if (Stelle == 2) {
                if (Art == 0) {
                    Var.text3.setText(Var.orange);
                } else if (Art == 1) {
                    Var.text3.setText(Var.apfel);
                } else if (Art == 2) {
                    Var.text3.setText(Var.birne);
                }
            }

            if (Stelle2 == 0) {
                if (Art == 0) {
                    Var.text1.setText(Var.orange);
                } else if (Art == 1) {
                    Var.text1.setText(Var.apfel);
                } else if (Art == 2) {
                    Var.text1.setText(Var.birne);
                }

            } else if (Stelle2 == 1) {

                if (Art == 0) {
                    Var.text2.setText(Var.orange);
                } else if (Art == 1) {
                    Var.text2.setText(Var.apfel);
                } else if (Art == 2) {
                    Var.text2.setText(Var.birne);
                }

            } else if (Stelle2 == 2) {
                if (Art == 0) {
                    Var.text3.setText(Var.orange);
                } else if (Art == 1) {
                    Var.text3.setText(Var.apfel);
                } else if (Art == 2) {
                    Var.text3.setText(Var.birne);
                }
            }

            if (Stelle3 == 0) {
                if (Art2 == 0) {
                    Var.text1.setText(Var.orange);
                } else if (Art2 == 1) {
                    Var.text1.setText(Var.apfel);
                } else if (Art2 == 2) {
                    Var.text1.setText(Var.birne);
                }

            } else if (Stelle3 == 1) {

                if (Art2 == 0) {
                    Var.text2.setText(Var.orange);
                } else if (Art2 == 1) {
                    Var.text2.setText(Var.apfel);
                } else if (Art2 == 2) {
                    Var.text2.setText(Var.birne);
                }

            } else if (Stelle3 == 2) {
                if (Art2 == 0) {
                    Var.text3.setText(Var.orange);
                } else if (Art2 == 1) {
                    Var.text3.setText(Var.apfel);
                } else if (Art2 == 2) {
                    Var.text3.setText(Var.birne);
                }
            }


        }else if(ws < 100){

            while(Stelle == Stelle2 || Art == Art2 || Stelle == Stelle3 || Stelle3 == Stelle2 || Art == Art3 || Art2 == Art3){

                Stelle = (int) (Math.random() * 3);
                Stelle2 = (int) (Math.random() * 3);
                Stelle3 = (int) (Math.random() * 3);
                Art = (int) (Math.random() * 3);
                Art2 = (int) (Math.random() * 3);
                Art3 = (int) (Math.random() * 3);

            }

            if (Stelle == 0) {
                if (Art == 0) {
                    Var.text1.setText(Var.orange);
                } else if (Art == 1) {
                    Var.text1.setText(Var.apfel);
                } else if (Art == 2) {
                    Var.text1.setText(Var.birne);
                }

            } else if (Stelle == 1) {

                if (Art == 0) {
                    Var.text2.setText(Var.orange);
                } else if (Art == 1) {
                    Var.text2.setText(Var.apfel);
                } else if (Art == 2) {
                    Var.text2.setText(Var.birne);
                }

            } else if (Stelle == 2) {
                if (Art == 0) {
                    Var.text3.setText(Var.orange);
                } else if (Art == 1) {
                    Var.text3.setText(Var.apfel);
                } else if (Art == 2) {
                    Var.text3.setText(Var.birne);
                }
            }

            if (Stelle2 == 0) {
                if (Art2 == 0) {
                    Var.text1.setText(Var.orange);
                } else if (Art2 == 1) {
                    Var.text1.setText(Var.apfel);
                } else if (Art2 == 2) {
                    Var.text1.setText(Var.birne);
                }

            } else if (Stelle2 == 1) {

                if (Art2 == 0) {
                    Var.text2.setText(Var.orange);
                } else if (Art2 == 1) {
                    Var.text2.setText(Var.apfel);
                } else if (Art2 == 2) {
                    Var.text2.setText(Var.birne);
                }

            } else if (Stelle2 == 2) {
                if (Art2 == 0) {
                    Var.text3.setText(Var.orange);
                } else if (Art2 == 1) {
                    Var.text3.setText(Var.apfel);
                } else if (Art2 == 2) {
                    Var.text3.setText(Var.birne);
                }
            }

            if (Stelle3 == 0) {
                if (Art3 == 0) {
                    Var.text1.setText(Var.orange);
                } else if (Art3 == 1) {
                    Var.text1.setText(Var.apfel);
                } else if (Art3 == 2) {
                    Var.text1.setText(Var.birne);
                }

            } else if (Stelle3 == 1) {

                if (Art3 == 0) {
                    Var.text2.setText(Var.orange);
                } else if (Art3 == 1) {
                    Var.text2.setText(Var.apfel);
                } else if (Art3 == 2) {
                    Var.text2.setText(Var.birne);
                }

            } else if (Stelle3 == 2) {
                if (Art3 == 0) {
                    Var.text3.setText(Var.orange);
                } else if (Art3 == 1) {
                    Var.text3.setText(Var.apfel);
                } else if (Art3 == 2) {
                    Var.text3.setText(Var.birne);
                }
            }

        }

        if(Var.text1.getText().equals(Var.text2.getText()) && Var.text2.getText().equals(Var.text3.getText())){

            Var.gewinn.setText("Jackpot");

        }else if(Var.text1.getText().equals(Var.text2.getText()) || Var.text2.getText().equals(Var.text3.getText()) || Var.text3.getText().equals(Var.text1.getText())){

            Var.gewinn.setText("Payback");

        }else {

            Var.gewinn.setText("Verloren");

        }

    }

}
