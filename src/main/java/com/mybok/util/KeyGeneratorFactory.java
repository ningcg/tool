package com.mybok.util;

public final class KeyGeneratorFactory {

    /**
     * Create key generator.
     *
     * @param keyGeneratorClass key generator class
     * @return key generator instance
     */
    public static KeyGenerator createKeyGenerator(final Class<? extends KeyGenerator> keyGeneratorClass) {
        try {
            return keyGeneratorClass.newInstance();
        } catch (final InstantiationException | IllegalAccessException ex) {
            throw new IllegalArgumentException(String.format("Class %s should have public privilege and no argument constructor", keyGeneratorClass.getName()));
        }
    }
}