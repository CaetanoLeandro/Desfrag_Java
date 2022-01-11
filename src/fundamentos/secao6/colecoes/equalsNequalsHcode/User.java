package fundamentos.secao6.colecoes.equalsNequalsHcode;

public class User {

    String name;
    String email;

    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User outher = (User) obj;

            boolean nameEquals = outher.name.equals(this.name);
            boolean emailEquals = outher.email.equals(this.email);

            return nameEquals && emailEquals;

        } else {
            return false;
        }
    }
}
