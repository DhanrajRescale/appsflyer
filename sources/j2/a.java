package j2;

import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.List;
import n1.w0;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final r2.c f20627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20628b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20629c;

    /* renamed from: d, reason: collision with root package name */
    public final k2.t f20630d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f20631e;

    /* renamed from: f, reason: collision with root package name */
    public final List f20632f;

    /* renamed from: g, reason: collision with root package name */
    public final ut.g f20633g;

    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x02a9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ea A[LOOP:1: B:70:0x01e8->B:71:0x01ea, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020f  */
    /* JADX WARN: Type inference failed for: r0v40, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(r2.c r25, int r26, boolean r27, long r28) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.a.<init>(r2.c, int, boolean, long):void");
    }

    public final k2.t a(int i10, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, int i14, int i15, int i16) {
        boolean z10;
        v vVar;
        CharSequence charSequence = this.f20631e;
        float c10 = c();
        r2.c cVar = this.f20627a;
        r2.d dVar = cVar.f33032g;
        int i17 = cVar.f33037l;
        k2.h hVar = cVar.f33034i;
        r2.a aVar = r2.b.f33025a;
        x xVar = cVar.f33027b.f20724c;
        if (xVar != null && (vVar = xVar.f20773b) != null) {
            z10 = vVar.f20769a;
        } else {
            z10 = false;
        }
        return new k2.t(charSequence, c10, dVar, i10, truncateAt, i17, z10, i12, i14, i15, i16, i13, i11, hVar);
    }

    public final float b() {
        return this.f20630d.a();
    }

    public final float c() {
        return w2.a.h(this.f20629c);
    }

    public final void d(n1.r rVar) {
        Canvas a10 = n1.d.a(rVar);
        k2.t tVar = this.f20630d;
        if (tVar.f21963c) {
            a10.save();
            a10.clipRect(s0.g.f34069a, s0.g.f34069a, c(), b());
        }
        if (a10.getClipBounds(tVar.f21974n)) {
            int i10 = tVar.f21966f;
            if (i10 != 0) {
                a10.translate(s0.g.f34069a, i10);
            }
            k2.s sVar = k2.u.f21976a;
            sVar.f21960a = a10;
            tVar.f21964d.draw(sVar);
            if (i10 != 0) {
                a10.translate(s0.g.f34069a, (-1) * i10);
            }
        }
        if (tVar.f21963c) {
            a10.restore();
        }
    }

    public final void e(n1.r rVar, long j10, w0 w0Var, u2.j jVar, p1.i iVar, int i10) {
        r2.c cVar = this.f20627a;
        r2.d dVar = cVar.f33032g;
        n1.f fVar = dVar.f33038a;
        int i11 = fVar.f28131b;
        if (j10 != 16) {
            fVar.f(j10);
            dVar.f33042e = null;
            dVar.f33041d = null;
            dVar.f33043f = null;
            fVar.j(null);
        }
        dVar.c(w0Var);
        dVar.d(jVar);
        dVar.b(iVar);
        dVar.f33038a.e(i10);
        d(rVar);
        cVar.f33032g.f33038a.e(i11);
    }

    public final void f(n1.r rVar, n1.p pVar, float f10, w0 w0Var, u2.j jVar, p1.i iVar, int i10) {
        r2.c cVar = this.f20627a;
        r2.d dVar = cVar.f33032g;
        int i11 = dVar.f33038a.f28131b;
        dVar.a(pVar, t0.t.j(c(), b()), f10);
        dVar.c(w0Var);
        dVar.d(jVar);
        dVar.b(iVar);
        dVar.f33038a.e(i10);
        d(rVar);
        cVar.f33032g.f33038a.e(i11);
    }
}
