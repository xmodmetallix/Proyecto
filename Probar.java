
import java.util.*;

public class Probar {

    public static void main(String[] args) {
        Opcion op1 = new Opcion("Missisipi", false);
        Opcion op2 = new Opcion("Nilo", false);
        Opcion op3 = new Opcion("Amazonas", true);
        Opcion op4 = new Opcion("Bravo", false);
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        Pregunta p1 = new Pregunta("1) ¿Cuál es el río mas largo del mundo?", opciones);

        Opcion op11 = new Opcion("Estados Unidos", false);
        Opcion op12 = new Opcion("Chile", false);
        Opcion op13 = new Opcion("México", false);
        Opcion op14 = new Opcion("Canadá", true);
        ArrayList<Opcion> opciones1 = new ArrayList<>();
        opciones1.add(op11);
        opciones1.add(op12);
        opciones1.add(op13);
        opciones1.add(op14);
        Pregunta p2 = new Pregunta("2) ¿A qué país pertenece la capital de Ottawa?", opciones1);
        
        Opcion op21 = new Opcion("Franz Kafka", false);
        Opcion op22 = new Opcion("Jorge Luis Borges", false);
        Opcion op23 = new Opcion("Gabriel García Márquez", false);
        Opcion op24 = new Opcion("Miguel de Cervantes", true);
        ArrayList<Opcion> opciones2 = new ArrayList<>();
        opciones2.add(op21);
        opciones2.add(op22);
        opciones2.add(op23);
        opciones2.add(op24);
        Pregunta p3 = new Pregunta("3) ¿Quién es el autor de: Don Quijote de la Mancha?", opciones2);
        
        Opcion op31 = new Opcion("Leonardo da Vinci", true);
        Opcion op32 = new Opcion("Vincent van Gogh", false);
        Opcion op33 = new Opcion("Salvador Dalí", false);
        Opcion op34 = new Opcion("Pablo Picasso", false);
        ArrayList<Opcion> opciones3 = new ArrayList<>();
        opciones3.add(op31);
        opciones3.add(op32);
        opciones3.add(op33);
        opciones3.add(op34);
        Pregunta p4 = new Pregunta("4) ¿Quién creó la pintura mural de La última cena?", opciones3);
        
        Opcion op41 = new Opcion("Desierto Kalahari", false);
        Opcion op42 = new Opcion("Desierto de Lut", true);
        Opcion op43 = new Opcion("Desierto del Sahara", false);
        Opcion op44 = new Opcion("Desierto de los leones", false);
        ArrayList<Opcion> opciones4 = new ArrayList<>();
        opciones4.add(op41);
        opciones4.add(op42);
        opciones4.add(op43);
        opciones4.add(op44);
        Pregunta p5 = new Pregunta("5) ¿Cuál es el lugar más caluroso del planeta?", opciones4);
        
        Opcion op51 = new Opcion("Texas", false);
        Opcion op52 = new Opcion("DF", false);
        Opcion op53 = new Opcion("Tokyo", true);
        Opcion op54 = new Opcion("Ucrania", false);
        ArrayList<Opcion> opciones5 = new ArrayList<>();
        opciones5.add(op51);
        opciones5.add(op52);
        opciones5.add(op53);
        opciones5.add(op54);
        Pregunta p6 = new Pregunta("6) Ciudad mas poblada del mundo", opciones5);
        
        Opcion op61 = new Opcion("Okinawa", false);
        Opcion op62 = new Opcion("Palestina", false);
        Opcion op63 = new Opcion("Pristina", true);
        Opcion op64 = new Opcion("Konoha", false);
        ArrayList<Opcion> opciones6 = new ArrayList<>();
        opciones6.add(op61);
        opciones6.add(op62);
        opciones6.add(op63);
        opciones6.add(op64);
        Pregunta p7 = new Pregunta("7) ¿Cuál es la capital de Kosovo?", opciones6);
        
        Opcion op71 = new Opcion("Adamantium", false);
        Opcion op72 = new Opcion("Plata", false);
        Opcion op73 = new Opcion("Oro", false);
        Opcion op74 = new Opcion("Rodio", true);
        ArrayList<Opcion> opciones7 = new ArrayList<>();
        opciones7.add(op71);
        opciones7.add(op72);
        opciones7.add(op73);
        opciones7.add(op74);
        Pregunta p8 = new Pregunta("8) ¿Cuál es el metal más caro del mundo?", opciones7);  
                
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);

        //Probando modelo
        for (Pregunta P : preguntas) {
            System.out.println(P.getTitulo());
            for (Opcion O : P.getOpcions()) {
                System.out.println(O.getTitulo());
            }
        }
    }
}
