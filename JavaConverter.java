public static Object deserialize (InputStream is)
    throws IOException {
    ObjectInputStream ois = new ObjectInputStream(is);
    return ois.readObject();
}
