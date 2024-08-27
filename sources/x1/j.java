package x1;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final v0.h f39865a = new v0.h(new i[16]);

    public boolean a(t.o oVar, a2.u uVar, f fVar, boolean z10) {
        v0.h hVar = this.f39865a;
        int i10 = hVar.f37655c;
        if (i10 <= 0) {
            return false;
        }
        Object[] objArr = hVar.f37653a;
        int i11 = 0;
        boolean z11 = false;
        do {
            if (!((i) objArr[i11]).a(oVar, uVar, fVar, z10) && !z11) {
                z11 = false;
            } else {
                z11 = true;
            }
            i11++;
        } while (i11 < i10);
        return z11;
    }

    public void b(f fVar) {
        v0.h hVar = this.f39865a;
        int i10 = hVar.f37655c;
        while (true) {
            i10--;
            if (-1 < i10) {
                if (((i) hVar.f37653a[i10]).f39858c.f41052a == 0) {
                    hVar.n(i10);
                }
            } else {
                return;
            }
        }
    }

    public final void c() {
        int i10 = 0;
        while (true) {
            v0.h hVar = this.f39865a;
            if (i10 < hVar.f37655c) {
                i iVar = (i) hVar.f37653a[i10];
                if (!iVar.f39857b.f16417m) {
                    hVar.n(i10);
                    iVar.d();
                } else {
                    i10++;
                    iVar.c();
                }
            } else {
                return;
            }
        }
    }
}
