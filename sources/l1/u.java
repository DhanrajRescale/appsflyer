package l1;

import kotlin.jvm.functions.Function0;
import t.f0;
import t.z;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final z f23925a;

    /* renamed from: b, reason: collision with root package name */
    public final v0.h f23926b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f23927c;

    public u() {
        long[] jArr = f0.f34855a;
        this.f23925a = new z();
        this.f23926b = new v0.h(new Function0[16]);
    }

    public static final void a(u uVar) {
        v0.h hVar = uVar.f23926b;
        int i10 = hVar.f37655c;
        if (i10 > 0) {
            Object[] objArr = hVar.f37653a;
            int i11 = 0;
            do {
                ((Function0) objArr[i11]).mo2invoke();
                i11++;
            } while (i11 < i10);
        }
        hVar.g();
        uVar.f23925a.a();
        uVar.f23927c = false;
    }

    public static final void b(u uVar) {
        z zVar = uVar.f23925a;
        Object[] objArr = zVar.f34932b;
        long[] jArr = zVar.f34931a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            t tVar = (t) objArr[(i10 << 3) + i12];
                            tVar.getClass();
                            s sVar = (s) androidx.compose.ui.focus.a.F(tVar).f23925a.f(tVar);
                            if (sVar != null) {
                                tVar.f23924p = sVar;
                            } else {
                                t0.t.D0("committing a node that was not updated in the current transaction");
                                throw null;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        zVar.a();
        uVar.f23927c = false;
    }
}
