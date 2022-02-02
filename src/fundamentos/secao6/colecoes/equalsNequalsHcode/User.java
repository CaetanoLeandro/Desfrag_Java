package fundamentos.secao6.colecoes.equalsNequalsHcode;

public class User {

    String name;
    String email;

    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User other = (User) obj;

            boolean nameEquals = other.name.equals(this.name);
            boolean emailEquals = other.email.equals(this.email);

            return nameEquals && emailEquals;

        } else {
            return false;
        }
    }
}
