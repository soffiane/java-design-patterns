package AbstractFactory.Eni;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Automobile {
    private String modele;
    private String couleur;
    private int puissance;
    private double espace;

    public abstract void afficheCaracteristiques();
}
