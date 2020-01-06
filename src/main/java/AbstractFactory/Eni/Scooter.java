package AbstractFactory.Eni;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Scooter {
    private String modele;
    private String couleur;
    private int puissance;

    public abstract void afficheCaracteristiques();
}
