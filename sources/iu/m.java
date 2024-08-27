package iu;

/* loaded from: classes2.dex */
public abstract class m extends o implements ou.d {
    @Override // iu.c
    public final ou.a a() {
        a0.f20536a.getClass();
        return this;
    }

    @Override // ou.f
    public final void c() {
        if (!this.f20555g) {
            ou.a e10 = e();
            if (e10 != this) {
                ((m) ((ou.d) ((ou.g) e10))).c();
                return;
            }
            throw new gu.a();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((n) this).c();
        throw null;
    }
}
