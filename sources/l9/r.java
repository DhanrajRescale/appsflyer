package l9;

import j9.y;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements m9.a, d {

    /* renamed from: a, reason: collision with root package name */
    public final y f24355a;

    /* renamed from: b, reason: collision with root package name */
    public final m9.e f24356b;

    /* renamed from: c, reason: collision with root package name */
    public r9.k f24357c;

    public r(y yVar, s9.b bVar, r9.j jVar) {
        this.f24355a = yVar;
        jVar.getClass();
        m9.e a10 = jVar.f33512a.a();
        this.f24356b = a10;
        bVar.g(a10);
        a10.a(this);
    }

    public static int c(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i12 * i11 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }

    @Override // m9.a
    public final void a() {
        this.f24355a.invalidateSelf();
    }

    @Override // l9.d
    public final void b(List list, List list2) {
    }
}
