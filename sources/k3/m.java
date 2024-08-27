package k3;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public q f22014a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f22015b;

    public static long a(g gVar, long j10) {
        q qVar = gVar.f22002d;
        if (qVar instanceof k) {
            return j10;
        }
        ArrayList arrayList = gVar.f22009k;
        int size = arrayList.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) arrayList.get(i10);
            if (eVar instanceof g) {
                g gVar2 = (g) eVar;
                if (gVar2.f22002d != qVar) {
                    j11 = Math.min(j11, a(gVar2, gVar2.f22004f + j10));
                }
            }
        }
        if (gVar == qVar.f22037i) {
            long j12 = qVar.j();
            long j13 = j10 - j12;
            return Math.min(Math.min(j11, a(qVar.f22036h, j13)), j13 - r9.f22004f);
        }
        return j11;
    }

    public static long b(g gVar, long j10) {
        q qVar = gVar.f22002d;
        if (qVar instanceof k) {
            return j10;
        }
        ArrayList arrayList = gVar.f22009k;
        int size = arrayList.size();
        long j11 = j10;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = (e) arrayList.get(i10);
            if (eVar instanceof g) {
                g gVar2 = (g) eVar;
                if (gVar2.f22002d != qVar) {
                    j11 = Math.max(j11, b(gVar2, gVar2.f22004f + j10));
                }
            }
        }
        if (gVar == qVar.f22036h) {
            long j12 = qVar.j();
            long j13 = j10 + j12;
            return Math.max(Math.max(j11, b(qVar.f22037i, j13)), j13 - r9.f22004f);
        }
        return j11;
    }
}
