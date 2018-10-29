
import java.util.Timer;
import java.util.TimerTask;

public class Knopf {
    public static int delay1 = 2, delay2 = 5, delay3 = 10;
    public static int ws, Art, Art2 , Art3, Stelle, Stelle2, Stelle3;
    static Timer t = new Timer();


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
                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Var.text1.setText(Var.orange);
                    }
                }, delay1 * 1000);
                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Var.text2.setText(Var.orange);
                    }
                }, delay2 * 1000);

                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Var.text3.setText(Var.orange);
                    }
                }, delay3 * 1000);

            } else if (Art == 1) {
                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Var.text1.setText(Var.apfel);
                    }
                }, delay1 * 1000);
                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Var.text2.setText(Var.apfel);
                    }
                }, delay2 * 1000);

                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Var.text3.setText(Var.apfel);
                    }
                }, delay3 * 1000);

            } else if (Art == 2) {
                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Var.text1.setText(Var.birne);
                    }
                }, delay1 * 1000);
                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Var.text2.setText(Var.birne);
                    }
                }, delay2 * 1000);

                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        Var.text3.setText(Var.birne);
                    }
                }, delay3 * 1000);

            }
        } else if(ws < 40){
            while(Stelle == Stelle2 || Art == Art2 || Stelle == Stelle3 || Stelle3 == Stelle2){

                Stelle = (int) (Math.random() * 3);
                Stelle2 = (int) (Math.random() * 3);
                Stelle3 = (int) (Math.random() * 3);
                Art = (int) (Math.random() * 3);
                Art2 = (int) (Math.random() * 3);

            }

            if (Stelle == 0) {
                if (Art == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.orange);
                        }
                    }, delay1 * 1000);
                } else if (Art == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.apfel);
                        }
                    }, delay1 * 1000);
                } else if (Art == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.birne);
                        }
                    }, delay1 * 1000);
                }

            } else if (Stelle == 1) {

                if (Art == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.orange);
                        }
                    }, delay2 * 1000);

                } else if (Art == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.apfel);
                        }
                    }, delay2 * 1000);

                } else if (Art == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.birne);
                        }
                    }, delay2 * 1000);

                }

            } else if (Stelle == 2) {
                if (Art == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.orange);
                        }
                    }, delay3 * 1000);

                } else if (Art == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.apfel);
                        }
                    }, delay3 * 1000);

                } else if (Art == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.birne);
                        }
                    }, delay3 * 1000);

                }
            }

            if (Stelle2 == 0) {
                if (Art == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.orange);
                        }
                    }, delay1 * 1000);
                } else if (Art == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.apfel);
                        }
                    }, delay1 * 1000);
                } else if (Art == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.birne);
                        }
                    }, delay1 * 1000);
                }

            } else if (Stelle2 == 1) {

                if (Art == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.orange);
                        }
                    }, delay2 * 1000);

                } else if (Art == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.apfel);
                        }
                    }, delay2 * 1000);

                } else if (Art == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.birne);
                        }
                    }, delay2 * 1000);

                }

            } else if (Stelle2 == 2) {
                if (Art == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.orange);
                        }
                    }, delay3 * 1000);

                } else if (Art == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.apfel);
                        }
                    }, delay3 * 1000);

                } else if (Art == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.birne);
                        }
                    }, delay3 * 1000);

                }
            }

            if (Stelle3 == 0) {
                if (Art2 == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.orange);
                        }
                    }, delay1 * 1000);
                } else if (Art2 == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.apfel);
                        }
                    }, delay1 * 1000);
                } else if (Art2 == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.birne);
                        }
                    }, delay1 * 1000);
                }

            } else if (Stelle3 == 1) {

                if (Art2 == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.orange);
                        }
                    }, delay2 * 1000);

                } else if (Art2 == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.apfel);
                        }
                    }, delay2 * 1000);

                } else if (Art2 == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.birne);
                        }
                    }, delay2 * 1000);

                }

            } else if (Stelle3 == 2) {
                if (Art2 == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.orange);
                        }
                    }, delay3 * 1000);

                } else if (Art2 == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.apfel);
                        }
                    }, delay3 * 1000);

                } else if (Art2 == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.birne);
                        }
                    }, delay3 * 1000);

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
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.orange);
                        }
                    }, delay1 * 1000);
                } else if (Art == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.apfel);
                        }
                    }, delay1 * 1000);
                } else if (Art == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.birne);
                        }
                    }, delay1 * 1000);
                }

            } else if (Stelle == 1) {

                if (Art == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.orange);
                        }
                    }, delay2 * 1000);

                } else if (Art == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.apfel);
                        }
                    }, delay2 * 1000);

                } else if (Art == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.birne);
                        }
                    }, delay2 * 1000);

                }

            } else if (Stelle == 2) {
                if (Art == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.orange);
                        }
                    }, delay3 * 1000);

                } else if (Art == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.apfel);
                        }
                    }, delay3 * 1000);

                } else if (Art == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.birne);
                        }
                    }, delay3 * 1000);

                }
            }

            if (Stelle2 == 0) {
                if (Art2 == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.orange);
                        }
                    }, delay1 * 1000);
                } else if (Art2 == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.apfel);
                        }
                    }, delay1 * 1000);
                } else if (Art2 == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.birne);
                        }
                    }, delay1 * 1000);
                }

            } else if (Stelle2 == 1) {

                if (Art2 == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.orange);
                        }
                    }, delay2 * 1000);

                } else if (Art2 == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.apfel);
                        }
                    }, delay2 * 1000);

                } else if (Art2 == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.birne);
                        }
                    }, delay2 * 1000);

                }

            } else if (Stelle2 == 2) {
                if (Art2 == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.orange);
                        }
                    }, delay3 * 1000);

                } else if (Art2 == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.apfel);
                        }
                    }, delay3 * 1000);

                } else if (Art2 == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.birne);
                        }
                    }, delay3 * 1000);

                }
            }

            if (Stelle3 == 0) {
                if (Art3 == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.orange);
                        }
                    }, delay1 * 1000);
                } else if (Art3 == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.apfel);
                        }
                    }, delay1 * 1000);
                } else if (Art3 == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text1.setText(Var.birne);
                        }
                    }, delay1 * 1000);
                }

            } else if (Stelle3 == 1) {

                if (Art3 == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.orange);
                        }
                    }, delay2 * 1000);

                } else if (Art3 == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.apfel);
                        }
                    }, delay2 * 1000);

                } else if (Art3 == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text2.setText(Var.birne);
                        }
                    }, delay2 * 1000);

                }

            } else if (Stelle3 == 2) {
                if (Art3 == 0) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.orange);
                        }
                    }, delay3 * 1000);

                } else if (Art3 == 1) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.apfel);
                        }
                    }, delay3 * 1000);

                } else if (Art3 == 2) {
                    t.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            Var.text3.setText(Var.birne);
                        }
                    }, delay3 * 1000);

                }
            }

        }

        t.schedule(new TimerTask() {
            @Override
            public void run() {

                if(Var.text1.getText().equals(Var.text2.getText()) && Var.text2.getText().equals(Var.text3.getText())){

                    Var.gewinn.setText("Jackpot");

                }else if(Var.text1.getText().equals(Var.text2.getText()) || Var.text2.getText().equals(Var.text3.getText()) || Var.text3.getText().equals(Var.text1.getText())){

                    Var.gewinn.setText("Payback");

                }else {

                    Var.gewinn.setText("Verloren");

                }


            }
        }, delay3 * 1001);




    }


}
