package org.subnetting;/*
    Subnet Solver v1.0.0 (https://github.com/vittorioPiotti/Subnet-Solver-Java/releases/tag/1.0.0)
    Copyright 2024 Vittorio Piotti
    Licensed under GPL-3.0 (https://github.com/vittorioPiotti/Subnet-Solver-Java/blob/main/LICENSE.md)
*/

/*
    batik-all v1.17 (https://xmlgraphics.apache.org/batik/download.html)
    Copyright 2024 The Apache Software Foundation
    Licensed under Apache License 2.0 (https://xmlgraphics.apache.org/batik/license.html)
*/


/*
    FlatLaf v3.2.5 (https://github.com/JFormDesigner/FlatLaf/releases/tag/3.2.5)
    Copyright 2024 JFormDesigner GmbH
    Licensed under Apache License 2.0 (https://github.com/JFormDesigner/FlatLaf/blob/main/LICENSE)
*/

/*
    xml-apis-ext v1.3.04 (https://xmlgraphics.apache.org/batik/download.html)
    Part of Apache Batik (https://xmlgraphics.apache.org/batik/)
    Copyright 2024 The Apache Software Foundation
    Licensed under Apache License 2.0 (https://xmlgraphics.apache.org/batik/license.html)
*/

/*
    xmlgraphics-commons v2.9 (https://xmlgraphics.apache.org/batik/download.html)
    Part of Apache Batik (https://xmlgraphics.apache.org/batik/)
    Copyright 2024 The Apache Software Foundation
    Licensed under Apache License 2.0 (https://xmlgraphics.apache.org/batik/license.html)
*/

/*!
  * Bootstrap v5.3.0-alpha3 (https://getbootstrap.com/)
  * Copyright 2011-2023 The Bootstrap Authors (https://github.com/twbs/bootstrap/graphs/contributors)
  * Licensed under MIT (https://github.com/twbs/bootstrap/blob/main/LICENSE)
*/

/**
 * Rappresenta un oggetto che contiene due identificatori di rete.
 */

public class ObjNetIDs {
        private String netId1;
        private String netId2;

        /**
         * Costruisce un oggetto {@code ObjNetIDs} con i valori specificati per gli identificatori di rete.
         *
         * @param netId1 il primo identificatore di rete
         * @param netId2 il secondo identificatore di rete
         */
        public ObjNetIDs(String netId1, String netId2) {
            this.netId1 = netId1;
            this.netId2 = netId2;
        }

        /**
         * Restituisce il primo identificatore di rete.
         *
         * @return il primo identificatore di rete
         */
        public String getNetId1() {
            return netId1;
        }

        /**
         * Restituisce il secondo identificatore di rete.
         *
         * @return il secondo identificatore di rete
         */
        public String getNetId2() {
            return netId2;
        }

        /**
         * Restituisce una rappresentazione in formato stringa dell'oggetto {@code ObjNetIDs}.
         * La stringa risultante include i due identificatori di rete.
         *
         * @return una stringa che rappresenta l'oggetto {@code ObjNetIDs}
         */
        @Override
        public String toString() {
            return "Network IDs:\n" +
                    "  Net ID 1: " + netId1 + "\n" +
                    "  Net ID 2: " + netId2;
        }

        /**
         * Calcola gli identificatori di rete a partire dagli indirizzi IP e dalle maschere di rete forniti.
         * Questo metodo non è implementato e lancia {@code UnsupportedOperationException} se chiamato.
         *
         * @param ip1 l'indirizzo IP del primo identificatore di rete
         * @param sm1 la maschera di rete del primo identificatore di rete
         * @param ip2 l'indirizzo IP del secondo identificatore di rete
         * @param sm2 la maschera di rete del secondo identificatore di rete
         * @return un array di caratteri che rappresentano gli identificatori di rete calcolati
         * @throws UnsupportedOperationException se il metodo non è implementato
         */
        public static char[] calculateNetworkIDs(String ip1, String sm1, String ip2, String sm2) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'calculateNetworkIDs'");
        }
    }
