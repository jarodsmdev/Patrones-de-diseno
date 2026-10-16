package observer;

/**
 * Ejemplo2
 *
 * Description:
 *
 * @author Jarod
 * @version 1.0
 * @since 13.aug.2026
 */
public class Ejemplo2 implements Observer{

    @Override
    public void update() {
        System.out.println("Se ha llamado a Ejemplo 2");
    }

}
