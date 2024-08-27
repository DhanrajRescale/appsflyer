package t0;

/* loaded from: classes.dex */
public interface d1 extends g1, l3 {
    @Override // t0.l3
    default Object getValue() {
        return Float.valueOf(((s2) this).i());
    }

    @Override // t0.g1
    default void setValue(Object obj) {
        ((s2) this).j(((Number) obj).floatValue());
    }
}
