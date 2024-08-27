package z5;

/* loaded from: classes.dex */
public interface b0 {
    int a(b5.o oVar, int i10, boolean z10);

    void b(long j10, int i10, int i11, int i12, a0 a0Var);

    void c(int i10, e5.p pVar);

    default int d(b5.o oVar, int i10, boolean z10) {
        return a(oVar, i10, z10);
    }

    void e(b5.v vVar);

    default void f(int i10, e5.p pVar) {
        c(i10, pVar);
    }
}
