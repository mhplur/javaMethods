public static int[] ordenarElementos( int[] arrayEnteros) {
    int elementoTemporal;
    for (int i = 1; i < arrayEnteros.length; i++) 
        for (int j = i; j > 0; j--) 
            if (arrayEnteros[j] < arrayEnteros[j - 1]) {
                elementoTemporal = arrayEnteros[j];
                arrayEnteros[j] = arrayEnteros[j - 1];
                arrayEnteros[j - 1] = elementoTemporal;
            }
    return arrayEnteros;
}
