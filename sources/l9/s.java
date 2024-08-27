package l9;

import android.graphics.Path;
import j9.y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements n, m9.a {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24359b;

    /* renamed from: c, reason: collision with root package name */
    public final y f24360c;

    /* renamed from: d, reason: collision with root package name */
    public final m9.p f24361d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24362e;

    /* renamed from: a, reason: collision with root package name */
    public final Path f24358a = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final c f24363f = new c(0);

    public s(y yVar, s9.b bVar, r9.n nVar) {
        nVar.getClass();
        this.f24359b = nVar.f33528d;
        this.f24360c = yVar;
        m9.p pVar = new m9.p((List) nVar.f33527c.f3178b);
        this.f24361d = pVar;
        bVar.g(pVar);
        pVar.a(this);
    }

    @Override // m9.a
    public final void a() {
        this.f24362e = false;
        this.f24360c.invalidateSelf();
    }

    @Override // l9.d
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i10 < arrayList2.size()) {
                d dVar = (d) arrayList2.get(i10);
                if (dVar instanceof u) {
                    u uVar = (u) dVar;
                    if (uVar.f24371c == 1) {
                        this.f24363f.f24251a.add(uVar);
                        uVar.c(this);
                        i10++;
                    }
                }
                if (dVar instanceof r) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((r) dVar);
                }
                i10++;
            } else {
                this.f24361d.f27668k = arrayList;
                return;
            }
        }
    }

    @Override // l9.n
    public final Path i() {
        boolean z10 = this.f24362e;
        Path path = this.f24358a;
        if (z10) {
            return path;
        }
        path.reset();
        if (this.f24359b) {
            this.f24362e = true;
            return path;
        }
        Path path2 = (Path) this.f24361d.f();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f24363f.b(path);
        this.f24362e = true;
        return path;
    }
}
