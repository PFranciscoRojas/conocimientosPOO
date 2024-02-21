public class Inventario {

    private List<Item> items;
    private final int capacidadMaxima = 20;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        if (items.size() < capacidadMaxima) {
            items.add(item);
            System.out.println("Item " + item.getNombre() + " añadido al inventario.");
        } else {
            System.out.println("El inventario está lleno. No se pudo agregar " + item.getNombre() + ".");
        }
    }

    public void eliminarItem(String nombreItem) {
        int indiceItem = buscarIndiceItem(nombreItem);
        if (indiceItem != -1) {
            items.remove(indiceItem);
            System.out.println("Item " + nombreItem + " eliminado del inventario.");
        } else {
            System.out.println("El item " + nombreItem + " no se encuentra en el inventario.");
        }
    }

    public void mostrarItems() {
        if (items.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("**Lista de items en el inventario:**");
            for (Item item : items) {
                System.out.println("- " + item.getNombre() + " (Cantidad: " + item.getCantidad() + ")");
            }
        }
    }

    public void buscarItem(String nombreItem) {
        Item itemEncontrado = buscarItemPorNombre(nombreItem);
        if (itemEncontrado != null) {
            System.out.println("Item encontrado: " + itemEncontrado.getNombre() + " (Cantidad: " + itemEncontrado.getCantidad() + ")");
        } else {
            System.out.println("El item " + nombreItem + " no se encuentra en el inventario.");
        }
    }

    public void modificarCantidad(String nombreItem, int nuevaCantidad) {
        int indiceItem = buscarIndiceItem(nombreItem);
        if (indiceItem != -1) {
            items.get(indiceItem).setCantidad(nuevaCantidad);
            System.out.println("Cantidad del item " + nombreItem + " actualizada a " + nuevaCantidad + ".");
        } else {
            System.out.println("El item " + nombreItem + " no se encuentra en el inventario.");
        }
    }

    private int buscarIndiceItem(String nombreItem) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getNombre().equals(nombreItem)) {
                return i;
            }
        }
        return -1;
    }

    private Item buscarItemPorNombre(String nombreItem) {
        for (Item item : items) {
            if (item.getNombre().equals(nombreItem)) {
                return item;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // Agregar items al inventario
        inventario.agregarItem(new Item("Espada", 1));
        inventario.agregarItem(new Item("Pocion de vida", 5));
        inventario.agregarItem(new Item("Armadura", 1));

        // Mostrar la lista de items
        inventario.mostrarItems();

        // Buscar un item
        inventario.buscarItem("Pocion de vida");

        // Eliminar un item
        inventario.eliminarItem("Espada");

        // Modificar la cantidad de un item
        inventario.modificarCantidad("Pocion de vida", 3);

        // Mostrar la lista de items nuevamente
        inventario.mostrarItems();
    }
}

class Item {

    private String nombre;
    private int cantidad;

    public Item(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
