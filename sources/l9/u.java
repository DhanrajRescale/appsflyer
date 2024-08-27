package l9;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements d, m9.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24369a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f24370b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f24371c;

    /* renamed from: d, reason: collision with root package name */
    public final m9.i f24372d;

    /* renamed from: e, reason: collision with root package name */
    public final m9.i f24373e;

    /* renamed from: f, reason: collision with root package name */
    public final m9.i f24374f;

    public u(s9.b bVar, r9.p pVar) {
        pVar.getClass();
        this.f24369a = pVar.f33543e;
        this.f24371c = pVar.f33539a;
        m9.e a10 = pVar.f33540b.a();
        this.f24372d = (m9.i) a10;
        m9.e a11 = pVar.f33541c.a();
        this.f24373e = (m9.i) a11;
        m9.e a12 = pVar.f33542d.a();
        this.f24374f = (m9.i) a12;
        bVar.g(a10);
        bVar.g(a11);
        bVar.g(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    @Override // m9.a
    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24370b;
            if (i10 < arrayList.size()) {
                ((m9.a) arrayList.get(i10)).a();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // l9.d
    public final void b(List list, List list2) {
    }

    public final void c(m9.a aVar) {
        this.f24370b.add(aVar);
    }
}
