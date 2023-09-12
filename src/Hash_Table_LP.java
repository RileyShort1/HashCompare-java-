import java.util.ArrayList;

 class Hash_Table_LP<T> {

    protected class Entry { // Data structure payload
        T _data;
        enum State { ACTIVE, VACANT, DELETED; }
        State _state;
        Entry() {_state = State.VACANT; } // constructor
    }

    static final int DEFAULT_INIT_CAPACITY = 3; // Do not change
    protected ArrayList<T> _elems;
    protected int _size;
    protected int _num_non_vacant_cells;
    protected float _max_load_factor;

    protected int _get_hash_modulus( T item) {

    }
    protected void _rehash() {

    }

    protected boolean set_max_load_factor(float x) {

    }

    protected float _get_biggest_allowed_max_load_factor() {

    }
    protected int _find_pos(T item) {

    }

    protected void _grow_capacity() {

    }

    public Hash_Table_LP() {

    }
    public int get_size() { return _size; }
    public boolean is_empty() { return _size == 0; }
    public boolean contains(T item) {

    }

    public T find(T item) {

    }

    public boolean clear() {

    }

    public boolean insert(T item) {

    }

    public boolean remove(T item) {

    }






}
