package Factory;

/**
 * Created by admin on 03.05.2017. 123
 */
public interface WeaponFactory {

    abstract Revolver createRevolver();

    abstract Gun createGun();

    abstract Rifle createRifle();

    abstract Bfg createBfg();

}
