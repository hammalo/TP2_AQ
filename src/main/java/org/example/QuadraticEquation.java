package org.example;

public class QuadraticEquation {

        public static double[] solve(double a, double b, double c) {
            if (a == 0) {
                throw new IllegalArgumentException("Le coefficient a ne peut pas être zéro");
            }

            double delta = (b * b) - (4 * a * c);

            if (delta < 0) {
                return new double[0]; // Pas de racines réelles
            } else if (delta == 0) {
                return new double[]{-b / (2 * a)}; // Une seule racine réelle
            } else {
                double sqrtDelta = Math.sqrt(delta);
                return new double[]{
                        (-b + sqrtDelta) / (2 * a),
                        (-b - sqrtDelta) / (2 * a)
                }; // Deux racines réelles distinctes
            }
        }
    }


