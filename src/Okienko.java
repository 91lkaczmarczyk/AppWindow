import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okienko {
    private JButton zgadujButton;
    private JPanel panelMain;
    private JFormattedTextField wprowadzonaLiczba;
    private JLabel podajLiczbe;
    private JTextPane wyswietlWynik;
    private JButton losujNowąLiczbęDoButton;
    private JTextPane iloscProb;
    private  int losowaLiczba = 1 + (int) (Math.random() * 100);
    private int proby = 0;


    public Okienko() {
        zgadujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println(losowaLiczba);
                try {
                    int liczba = Integer.parseInt(wprowadzonaLiczba.getText());
                    while (true) {

                        if (liczba > losowaLiczba) {
                            wyswietlWynik.setText("liczba jest za duza");
                            proby++;
                            iloscProb.setText("Liczba prób: " + proby);
                            wprowadzonaLiczba.setText("");

                            break;
                        } else if (liczba < losowaLiczba) {
                            wyswietlWynik.setText("liczba jest za mala");
                            proby++;
                            iloscProb.setText("Liczba prób: " + proby);
                            wprowadzonaLiczba.setText("");

                            break;
                        }else{
                            wyswietlWynik.setText("      !!!  BRAWO ZGADŁEŚ  !!!\n \n"+"  ZOSTAŁA WYLOSOWANA NOWA LICZBA");
                            //Settings / Preferences and go to Version Control | Git.
                            wprowadzonaLiczba.setText("");
                            losowaLiczba = 1 + (int) (Math.random() * 100);
                            iloscProb.setText("");
                            proby = 0;
                            break;
                        }
                    }
                } catch (Exception s){

                        wyswietlWynik.setText("debilu nie podales liczby");
                        wprowadzonaLiczba.setText("");
                }



            }
        });
        losujNowąLiczbęDoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
losowaLiczba = 1 + (int) (Math.random() * 100);
               iloscProb.setText("");
proby = 0;
            }
        });
    }
    public static void main(String[] args) {

       


        JFrame frame = new JFrame("Okienko");
        frame.setContentPane(new Okienko().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
/*


        System.out.println(liczba);

        while (true){
            int a = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbę"));
            if (a > liczba){
                System.out.println("liczba jest za duza");
            }else if (a < liczba){
                System.out.println("liczba jest za mala");
            } else {
                System.out.println("brawo zgadles");
                break;
            }

        }*/


    }
}
