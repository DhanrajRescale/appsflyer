package x1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a2.u f39841a;

    /* renamed from: b, reason: collision with root package name */
    public final j f39842b = new j();

    public e(c2.x xVar) {
        this.f39841a = xVar;
    }

    public final void a(long j10, c2.v vVar) {
        Object obj;
        j jVar = this.f39842b;
        int i10 = vVar.f7859d;
        boolean z10 = true;
        for (int i11 = 0; i11 < i10; i11++) {
            g1.n nVar = (g1.n) vVar.get(i11);
            if (z10) {
                v0.h hVar = jVar.f39865a;
                int i12 = hVar.f37655c;
                if (i12 > 0) {
                    Object[] objArr = hVar.f37653a;
                    int i13 = 0;
                    do {
                        obj = objArr[i13];
                        if (Intrinsics.a(((i) obj).f39857b, nVar)) {
                            break;
                        } else {
                            i13++;
                        }
                    } while (i13 < i12);
                }
                obj = null;
                i iVar = (i) obj;
                if (iVar != null) {
                    iVar.f39863h = true;
                    iVar.f39858c.a(j10);
                    jVar = iVar;
                } else {
                    z10 = false;
                }
            }
            i iVar2 = new i(nVar);
            iVar2.f39858c.a(j10);
            jVar.f39865a.b(iVar2);
            jVar = iVar2;
        }
    }

    public final boolean b(f fVar, boolean z10) {
        boolean z11;
        boolean z12;
        j jVar = this.f39842b;
        if (!jVar.a(fVar.f39844a, this.f39841a, fVar, z10)) {
            return false;
        }
        v0.h hVar = jVar.f39865a;
        int i10 = hVar.f37655c;
        if (i10 > 0) {
            Object[] objArr = hVar.f37653a;
            int i11 = 0;
            z11 = false;
            do {
                if (!((i) objArr[i11]).f(fVar, z10) && !z11) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                i11++;
            } while (i11 < i10);
        } else {
            z11 = false;
        }
        int i12 = hVar.f37655c;
        if (i12 > 0) {
            Object[] objArr2 = hVar.f37653a;
            int i13 = 0;
            z12 = false;
            do {
                if (!((i) objArr2[i13]).e(fVar) && !z12) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                i13++;
            } while (i13 < i12);
        } else {
            z12 = false;
        }
        jVar.b(fVar);
        if (!z12 && !z11) {
            return false;
        }
        return true;
    }
}
