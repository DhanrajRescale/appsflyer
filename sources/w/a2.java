package w;

/* loaded from: classes.dex */
public interface a2 {
    boolean a();

    long c(t tVar, t tVar2, t tVar3);

    default t d(t tVar, t tVar2, t tVar3) {
        return f(c(tVar, tVar2, tVar3), tVar, tVar2, tVar3);
    }

    t e(long j10, t tVar, t tVar2, t tVar3);

    t f(long j10, t tVar, t tVar2, t tVar3);
}
