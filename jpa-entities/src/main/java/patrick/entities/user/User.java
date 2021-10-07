package patrick.entities.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@Entity
public class User {

    @Id
    private Long Id;
    String firstName;
    String lastName;
    String email;
}
