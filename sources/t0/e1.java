package t0;

/* loaded from: classes.dex */
public interface e1 extends g1, l3 {
    @Override // t0.l3
    default Object getValue() {
        return Integer.valueOf(((u2) this).i());
    }

    @Override // t0.g1
    default void setValue(Object obj) {
        ((u2) this).j(((Number) obj).intValue());
    }
}
