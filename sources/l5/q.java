package l5;

import android.os.Handler;
import androidx.media3.common.ParserException;
import b5.q0;
import b5.v;
import e5.x;
import r5.r0;
import r5.u0;
import z5.a0;
import z5.b0;

/* loaded from: classes.dex */
public final class q implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f24081a;

    /* renamed from: b, reason: collision with root package name */
    public final tr.e f24082b = new tr.e(10, (Object) null);

    /* renamed from: c, reason: collision with root package name */
    public final f6.a f24083c = new h5.f(1);

    /* renamed from: d, reason: collision with root package name */
    public long f24084d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f24085e;

    /* JADX WARN: Type inference failed for: r2v3, types: [h5.f, f6.a] */
    public q(r rVar, v5.e eVar) {
        this.f24085e = rVar;
        this.f24081a = new u0(eVar, null, null);
    }

    @Override // z5.b0
    public final int a(b5.o oVar, int i10, boolean z10) {
        return this.f24081a.a(oVar, i10, z10);
    }

    @Override // z5.b0
    public final void b(long j10, int i10, int i11, int i12, a0 a0Var) {
        long g10;
        long j11;
        this.f24081a.b(j10, i10, i11, i12, a0Var);
        while (this.f24081a.q(false)) {
            f6.a aVar = this.f24083c;
            aVar.i();
            if (this.f24081a.t(this.f24082b, aVar, 0, false) == -4) {
                aVar.l();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j12 = aVar.f18004f;
                q0 c02 = this.f24085e.f24088c.c0(aVar);
                if (c02 != null) {
                    h6.a aVar2 = (h6.a) c02.f3577a[0];
                    String str = aVar2.f18013a;
                    String str2 = aVar2.f18014b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = x.I(x.m(aVar2.f18017e));
                        } catch (ParserException unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            p pVar = new p(j12, j11);
                            Handler handler = this.f24085e.f24089d;
                            handler.sendMessage(handler.obtainMessage(1, pVar));
                        }
                    }
                }
            }
        }
        u0 u0Var = this.f24081a;
        r0 r0Var = u0Var.f33301a;
        synchronized (u0Var) {
            int i13 = u0Var.f33319s;
            if (i13 == 0) {
                g10 = -1;
            } else {
                g10 = u0Var.g(i13);
            }
        }
        r0Var.b(g10);
    }

    @Override // z5.b0
    public final void c(int i10, e5.p pVar) {
        this.f24081a.c(i10, pVar);
    }

    @Override // z5.b0
    public final void e(v vVar) {
        this.f24081a.e(vVar);
    }
}
