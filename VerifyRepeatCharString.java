public static boolean existenRepetidos (String cadena) {
    int longitudCadena = cadena.length();
    for(int i = 0; i < longitudCadena; i++)
        for(int j = 0; j < longitudCadena; j++)
                if(i != j && cadena.charAt(i) == cadena.charAt(j))
                    return true;
    return false;
}
