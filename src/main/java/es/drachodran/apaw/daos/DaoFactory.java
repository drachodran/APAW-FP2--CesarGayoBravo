package es.drachodran.apaw.daos;

public abstract class DaoFactory {

    private static DaoFactory factory = null;

    public static DaoFactory getFactory() {
        assert factory != null;
        return factory;
    }

    public static void setFactory(DaoFactory factory) {
        DaoFactory.factory = factory;

    }

    public abstract ArtistaDao getArtistaDao();

    public abstract AgenteDao getAgenteDao();

    public abstract AlbumsDao getAlbumsDao();

    public abstract ConciertoDao getConciertoDao();
}
