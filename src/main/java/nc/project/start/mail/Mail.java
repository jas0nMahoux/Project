package nc.project.start.mail;

import lombok.Data;
import nc.project.start.user.User;

import javax.persistence.*;

@Data
@Entity
public class Mail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String objet;
    public String template;
    @OneToOne
    @JoinColumn(name="user_id")
    public User destinataire;
}
