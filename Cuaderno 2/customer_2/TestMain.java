package es.uah.matcomp.mp.e1.ejerciciosComposicion.customer_2;

public class TestMain {
    public static void main(String[] args) {
        // 1. Crear un cliente
        Customer c1 = new Customer(88, "Guillermo", 10, 'm');
        System.out.println("Cliente creado: " + c1.toString()); // Guillermo(88)

        // 2. Probar el primer constructor de Account (con balance inicial)
        Account a1 = new Account(101, c1, 888.8);
        System.out.println("Cuenta 1: " + a1); // Guillermo(88) balance=$888.80

        // 3. Probar el segundo constructor (balance por defecto 0.0)
        Account a2 = new Account(102, c1);
        System.out.println("Cuenta 2 inicial: " + a2);

        // 4. Probar depósitos y retiros encadenados
        // Al devolver 'Account', podemos llamar a varios métodos en una sola línea
        a1.deposit(111.2).withdraw(50.0);
        System.out.println("Cuenta 1 tras operaciones: " + a1); // 888.8 + 111.2 - 50 = 950.0

        // 5. Probar el caso de retiro que excede el balance
        System.out.println("\nIntentando retirar 2000 de la Cuenta 1...");
        a1.withdraw(2000.0);
        // Debería imprimir: "amount withdrawn exceeds the current balance!"

        // 6. Verificar que el balance no cambió tras el retiro fallido
        System.out.println("Balance final Cuenta 1: " + a1.getBalance());

        // 7. Probar getters de conveniencia
        System.out.println("\nDatos del propietario de la Cuenta 2:");
        System.out.println("Nombre: " + a2.getCustomerName());
    }
}
