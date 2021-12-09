/**
 * @author Oliveri
 * @date 07/12/2021
 * @description Programma per calcolare i crediti scolastici di un alunno frequentante la classe terza,quarta,quinta
 */

package com.company;

public class CreditoScolastico {
    private double mediavotianno;
    private int numInsuff;
    private int crediti;
    private int creditoScolastico;


    /**
     * Metodo costruttore che riceve cognome,media,insufficienze,crediti e le salva nei relativi attributi
     * e che inizializza creditoScolastico e classe
     * @param media media dei voti
     * @param insufficiente numero delle materie insufficienti
     * @param crediti crediti aggiuntivi
     */
    public CreditoScolastico(double media, int insufficiente, int crediti) {
        this.mediavotianno = media;
        this.crediti = crediti;
        this.creditoScolastico = 0;
        this.numInsuff = insufficiente;
    }

    /**
     * Metodo che calcola i crediti scolastici di un alunno
     */
    public void calcoloCreditiTerza() {

        if (this.mediavotianno < 6) {
            // la media minore di 6 non avrà nessun credito
            creditoScolastico = 0;
        }

        else if (this.mediavotianno == 6) {
            //la media e uguale 6 calcola se avrà i crediti tra 7-8
            if (this.numInsuff == 0 && this.crediti >= 1) {
                // non ha nessun voto insufficiente avrò un credito maggiore
                this.creditoScolastico = 8;
            } else if (this.numInsuff >= 1 || crediti == 0) {
                // se ha  voto insufficiente avrà un credito minore
                this.creditoScolastico = 7;
            }
        }

        else if (this.mediavotianno > 6 && this.mediavotianno <= 7) {
            if (this.numInsuff == 0 && this.crediti >= 1) {
                this.creditoScolastico = 9;
            } else if (this.numInsuff >= 1 || crediti == 0) {
                this.creditoScolastico = 8;
            }
        }

        else if (this.mediavotianno > 7 && this.mediavotianno <= 8) {
            if (this.numInsuff == 0 && this.crediti >= 1) {
                this.creditoScolastico = 10;
            } else if (this.numInsuff >= 1 || crediti == 0) {
                this.creditoScolastico = 9;
            }
        }

        else if (this.mediavotianno > 8 && this.mediavotianno <= 9) {
            if (this.numInsuff == 0 && this.crediti >= 1) {
                this.creditoScolastico = 11;
            } else if (this.numInsuff >= 1 || crediti == 0) {
                this.creditoScolastico = 10;
            }
        }

        else if (this.mediavotianno > 9 && this.mediavotianno <= 10) {//9<M≤10
            if (this.numInsuff == 0 && this.crediti >= 1) {
                this.creditoScolastico = 12;
            } else if (this.numInsuff >= 1 || crediti == 0) {
                this.creditoScolastico = 11;
            }
        }
    }
    public void calcoloCreditiQuarta() {
        calcoloCreditiTerza();
        creditoScolastico = creditoScolastico+1;

    }

    public void calcoloCreditiQuinta(){
        if (this.mediavotianno < 6) {
            if (this.numInsuff == 0 && this.crediti >= 1) {
                // non ha nessun voto insufficiente avrò un credito maggiore
                this.creditoScolastico = 8;
            } else if (this.numInsuff >= 1 || crediti == 0) {
                // se ha  voto insufficiente avrà un credito minore
                this.creditoScolastico = 7;
            }        }

        else if (this.mediavotianno == 6) {
            //la media e uguale 6 calcola se avrà i crediti tra 7-8
            if (this.numInsuff == 0 && this.crediti >= 1) {
                // non ha nessun voto insufficiente avrò un credito maggiore
                this.creditoScolastico = 10;
            } else if (this.numInsuff >= 1 || crediti == 0) {
                // se ha  voto insufficiente avrà un credito minore
                this.creditoScolastico = 9;
            }
        }

        else if (this.mediavotianno > 6 && this.mediavotianno <= 7) {
            if (this.numInsuff == 0 && this.crediti >= 1) {
                this.creditoScolastico = 11;
            } else if (this.numInsuff >= 1 || crediti == 0) {
                this.creditoScolastico = 10;
            }
        }

        else if (this.mediavotianno > 7 && this.mediavotianno <= 8) {
            if (this.numInsuff == 0 && this.crediti >= 1) {
                this.creditoScolastico = 12;
            } else if (this.numInsuff >= 1 || crediti == 0) {
                this.creditoScolastico = 11;
            }
        }

        else if (this.mediavotianno > 8 && this.mediavotianno <= 9) {
            if (this.numInsuff == 0 && this.crediti >= 1) {
                this.creditoScolastico = 14;
            } else if (this.numInsuff >= 1 || crediti == 0) {
                this.creditoScolastico = 13;
            }
        }

        else if (this.mediavotianno > 9 && this.mediavotianno <= 10) {//9<M≤10
            if (this.numInsuff == 0 && this.crediti >= 1) {
                this.creditoScolastico = 15;
            } else if (this.numInsuff >= 1 || crediti == 0) {
                this.creditoScolastico = 14;
            }
        }
    }


    public int getCreditoScolastico() {
        return creditoScolastico;
    }
}

