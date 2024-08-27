package t0;

/* loaded from: classes.dex */
public interface f1 extends g1, l3 {
    @Override // t0.l3
    default Object getValue() {
        w2 w2Var = (w2) this;
        return Long.valueOf(((v2) e1.p.r(w2Var.f35229b, w2Var)).f35223c);
    }

    @Override // t0.g1
    default void setValue(Object obj) {
        ((w2) this).i(((Number) obj).longValue());
    }
}
