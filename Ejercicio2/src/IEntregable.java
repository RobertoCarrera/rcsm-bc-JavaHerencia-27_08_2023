public interface IEntregable {
	
    void entregar();
    void devolver();
    boolean isEntregado();
    int compareTo(Object a);
}