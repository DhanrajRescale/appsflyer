package v5;

import android.net.Uri;
import e5.x;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class r implements m {

    /* renamed from: a, reason: collision with root package name */
    public final long f37758a;

    /* renamed from: b, reason: collision with root package name */
    public final g5.i f37759b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37760c;

    /* renamed from: d, reason: collision with root package name */
    public final g5.t f37761d;

    /* renamed from: e, reason: collision with root package name */
    public final q f37762e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f37763f;

    public r(g5.f fVar, Uri uri, int i10, q qVar) {
        Map emptyMap = Collections.emptyMap();
        yk.j.J0(uri, "The uri must be set.");
        g5.i iVar = new g5.i(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 1, null);
        this.f37761d = new g5.t(fVar);
        this.f37759b = iVar;
        this.f37760c = i10;
        this.f37762e = qVar;
        this.f37758a = r5.n.f33243a.getAndIncrement();
    }

    @Override // v5.m
    public final void e() {
        this.f37761d.f16626b = 0L;
        g5.g gVar = new g5.g(this.f37761d, this.f37759b);
        try {
            gVar.f16553a.o(gVar.f16554b);
            gVar.f16556d = true;
            Uri l10 = this.f37761d.f16625a.l();
            l10.getClass();
            this.f37763f = this.f37762e.i(l10, gVar);
            try {
                gVar.close();
            } catch (IOException unused) {
            }
        } finally {
            int i10 = x.f15050a;
            try {
                gVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // v5.m
    public final void f() {
    }
}
