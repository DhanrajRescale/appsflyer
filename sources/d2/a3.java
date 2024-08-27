package d2;

import java.util.List;

/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final h2.j f13352a;

    /* renamed from: b, reason: collision with root package name */
    public final t.u f13353b;

    public a3(h2.o oVar, t.t tVar) {
        this.f13352a = oVar.f17862d;
        int[] iArr = t.l.f34879a;
        this.f13353b = new t.u();
        List g10 = h2.o.g(oVar, true, 4);
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            h2.o oVar2 = (h2.o) g10.get(i10);
            if (tVar.b(oVar2.f17865g)) {
                this.f13353b.a(oVar2.f17865g);
            }
        }
    }
}
