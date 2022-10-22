package nc.project.start.rdv;

import lombok.Data;
import nc.project.start.user.User;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Rdv {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public Date debut;
    public Date fin;
    public String description;
    @OneToOne
    @JoinColumn(name="user_id")
    public User destinataire;
}
