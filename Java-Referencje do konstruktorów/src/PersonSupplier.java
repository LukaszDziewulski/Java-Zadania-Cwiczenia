@FunctionalInterface
interface PersonSupplier {
    Person get(String[] firstNames, String[] lastNames, int[] ages);
}