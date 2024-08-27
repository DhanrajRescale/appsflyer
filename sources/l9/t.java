package l9;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import j9.b0;

/* loaded from: classes.dex */
public final class t extends b {

    /* renamed from: r, reason: collision with root package name */
    public final s9.b f24364r;

    /* renamed from: s, reason: collision with root package name */
    public final String f24365s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f24366t;

    /* renamed from: u, reason: collision with root package name */
    public final m9.e f24367u;

    /* renamed from: v, reason: collision with root package name */
    public m9.u f24368v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(j9.y r14, s9.b r15, r9.o r16) {
        /*
            r13 = this;
            r10 = r13
            r11 = r15
            r12 = r16
            int r0 = r12.f33535g
            r1 = 0
            if (r0 == 0) goto L5b
            r2 = 1
            int r0 = r0 - r2
            if (r0 == 0) goto L16
            if (r0 == r2) goto L13
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
        L11:
            r3 = r0
            goto L19
        L13:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L11
        L16:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto L11
        L19:
            int r0 = r12.f33536h
            if (r0 == 0) goto L5a
            int r0 = r0 - r2
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L2b
            r2 = 2
            if (r0 == r2) goto L27
            r4 = r1
            goto L31
        L27:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
        L29:
            r4 = r0
            goto L31
        L2b:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L29
        L2e:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto L29
        L31:
            float r5 = r12.f33537i
            bk.c r6 = r12.f33533e
            q9.a r7 = r12.f33534f
            java.util.List r8 = r12.f33531c
            q9.a r9 = r12.f33530b
            r0 = r13
            r1 = r14
            r2 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f24364r = r11
            java.lang.String r0 = r12.f33529a
            r10.f24365s = r0
            boolean r0 = r12.f33538j
            r10.f24366t = r0
            bk.c r0 = r12.f33532d
            m9.e r0 = r0.a()
            r10.f24367u = r0
            r0.a(r13)
            r15.g(r0)
            return
        L5a:
            throw r1
        L5b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.t.<init>(j9.y, s9.b, r9.o):void");
    }

    @Override // l9.b, p9.f
    public final void c(x9.c cVar, Object obj) {
        super.c(cVar, obj);
        Integer num = b0.f21106b;
        m9.e eVar = this.f24367u;
        if (obj == num) {
            eVar.k(cVar);
            return;
        }
        if (obj == b0.K) {
            m9.u uVar = this.f24368v;
            s9.b bVar = this.f24364r;
            if (uVar != null) {
                bVar.p(uVar);
            }
            if (cVar == null) {
                this.f24368v = null;
                return;
            }
            m9.u uVar2 = new m9.u(cVar, null);
            this.f24368v = uVar2;
            uVar2.a(this);
            bVar.g(eVar);
        }
    }

    @Override // l9.d
    public final String d() {
        return this.f24365s;
    }

    @Override // l9.b, l9.f
    public final void h(Canvas canvas, Matrix matrix, int i10) {
        if (this.f24366t) {
            return;
        }
        m9.f fVar = (m9.f) this.f24367u;
        int l10 = fVar.l(fVar.b(), fVar.d());
        k9.a aVar = this.f24242i;
        aVar.setColor(l10);
        m9.u uVar = this.f24368v;
        if (uVar != null) {
            aVar.setColorFilter((ColorFilter) uVar.f());
        }
        super.h(canvas, matrix, i10);
    }
}
