package g5;

import android.os.SystemClock;
import e5.x;
import java.util.ArrayList;
import lp.j1;

/* loaded from: classes.dex */
public abstract class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16539a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16540b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f16541c;

    /* renamed from: d, reason: collision with root package name */
    public i f16542d;

    public b(boolean z10) {
        this.f16539a = z10;
    }

    @Override // g5.f
    public final void m(u uVar) {
        uVar.getClass();
        ArrayList arrayList = this.f16540b;
        if (!arrayList.contains(uVar)) {
            arrayList.add(uVar);
            this.f16541c++;
        }
    }

    public final void p(int i10) {
        i iVar = this.f16542d;
        int i11 = x.f15050a;
        for (int i12 = 0; i12 < this.f16541c; i12++) {
            u uVar = (u) this.f16540b.get(i12);
            boolean z10 = this.f16539a;
            v5.h hVar = (v5.h) uVar;
            synchronized (hVar) {
                j1 j1Var = v5.h.f37717n;
                if (z10 && (iVar.f16577i & 8) != 8) {
                    hVar.f37731h += i10;
                }
            }
        }
    }

    public final void q() {
        boolean z10;
        i iVar = this.f16542d;
        int i10 = x.f15050a;
        for (int i11 = 0; i11 < this.f16541c; i11++) {
            u uVar = (u) this.f16540b.get(i11);
            boolean z11 = this.f16539a;
            v5.h hVar = (v5.h) uVar;
            synchronized (hVar) {
                try {
                    j1 j1Var = v5.h.f37717n;
                    if (z11 && (iVar.f16577i & 8) != 8) {
                        if (hVar.f37729f > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        yk.j.H0(z10);
                        ((e5.r) hVar.f37727d).getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i12 = (int) (elapsedRealtime - hVar.f37730g);
                        hVar.f37733j += i12;
                        long j10 = hVar.f37734k;
                        long j11 = hVar.f37731h;
                        hVar.f37734k = j10 + j11;
                        if (i12 > 0) {
                            hVar.f37726c.a((int) Math.sqrt(j11), (((float) j11) * 8000.0f) / i12);
                            if (hVar.f37733j < 2000) {
                                if (hVar.f37734k >= 524288) {
                                }
                                hVar.c(i12, hVar.f37731h, hVar.f37735l);
                                hVar.f37730g = elapsedRealtime;
                                hVar.f37731h = 0L;
                            }
                            hVar.f37735l = hVar.f37726c.b();
                            hVar.c(i12, hVar.f37731h, hVar.f37735l);
                            hVar.f37730g = elapsedRealtime;
                            hVar.f37731h = 0L;
                        }
                        hVar.f37729f--;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f16542d = null;
    }

    public final void r() {
        for (int i10 = 0; i10 < this.f16541c; i10++) {
            ((u) this.f16540b.get(i10)).getClass();
        }
    }

    public final void s(i iVar) {
        this.f16542d = iVar;
        for (int i10 = 0; i10 < this.f16541c; i10++) {
            u uVar = (u) this.f16540b.get(i10);
            boolean z10 = this.f16539a;
            v5.h hVar = (v5.h) uVar;
            synchronized (hVar) {
                try {
                    j1 j1Var = v5.h.f37717n;
                    if (z10 && (iVar.f16577i & 8) != 8) {
                        if (hVar.f37729f == 0) {
                            ((e5.r) hVar.f37727d).getClass();
                            hVar.f37730g = SystemClock.elapsedRealtime();
                        }
                        hVar.f37729f++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
