public enum Libro
{
    JHTP("Java How to Program", "2012"),
    CHTP("C How to Program", "2007"),
    IW3HTP("Internet & World Wide How to Program", "2008"),
    CPPHTP("C++ How to prongram", "2012"),
    VBHTP("Visual Basic 2010 How to program", "2011"),
    CSHARPHTP("Visual c# 2010 How to program", "2011");

    private final String titulo;
    private final String anioCopyright;

    Libro(String tituloLibro, String anio)
    {

        titulo = tituloLibro;
        anioCopyright = anio;
    }

    public String obtenerTitulo()
    {
        return titulo;
    }

    public String obtenerAnioCopyright()
    {
        return anioCopyright;
    }
}