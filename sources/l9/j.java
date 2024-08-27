package l9;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import j9.b0;

/* loaded from: classes.dex */
public final class j extends b {
    public final m9.e A;
    public m9.u B;

    /* renamed from: r, reason: collision with root package name */
    public final String f24305r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f24306s;

    /* renamed from: t, reason: collision with root package name */
    public final t.o f24307t;

    /* renamed from: u, reason: collision with root package name */
    public final t.o f24308u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f24309v;

    /* renamed from: w, reason: collision with root package name */
    public final int f24310w;

    /* renamed from: x, reason: collision with root package name */
    public final int f24311x;

    /* renamed from: y, reason: collision with root package name */
    public final m9.e f24312y;

    /* renamed from: z, reason: collision with root package name */
    public final m9.e f24313z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j(j9.y r15, s9.b r16, r9.e r17) {
        /*
            r14 = this;
            r10 = r14
            r11 = r16
            r12 = r17
            int r0 = r12.f33483h
            r13 = 0
            if (r0 == 0) goto L9d
            r1 = 1
            int r0 = r0 - r1
            if (r0 == 0) goto L17
            if (r0 == r1) goto L14
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
        L12:
            r3 = r0
            goto L1a
        L14:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L12
        L17:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            goto L12
        L1a:
            int r0 = r12.f33484i
            if (r0 == 0) goto L9c
            int r0 = r0 - r1
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L2c
            r1 = 2
            if (r0 == r1) goto L28
            r4 = r13
            goto L32
        L28:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.BEVEL
        L2a:
            r4 = r0
            goto L32
        L2c:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            goto L2a
        L2f:
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.MITER
            goto L2a
        L32:
            float r5 = r12.f33485j
            bk.c r6 = r12.f33479d
            q9.a r7 = r12.f33482g
            java.util.List r8 = r12.f33486k
            q9.a r9 = r12.f33487l
            r0 = r14
            r1 = r15
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            t.o r0 = new t.o
            r0.<init>(r13)
            r10.f24307t = r0
            t.o r0 = new t.o
            r0.<init>(r13)
            r10.f24308u = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r10.f24309v = r0
            java.lang.String r0 = r12.f33476a
            r10.f24305r = r0
            int r0 = r12.f33477b
            r10.f24310w = r0
            boolean r0 = r12.f33488m
            r10.f24306s = r0
            r0 = r15
            j9.i r0 = r0.f21224a
            float r0 = r0.b()
            r1 = 1107296256(0x42000000, float:32.0)
            float r0 = r0 / r1
            int r0 = (int) r0
            r10.f24311x = r0
            bk.c r0 = r12.f33478c
            m9.e r0 = r0.a()
            r10.f24312y = r0
            r0.a(r14)
            r11.g(r0)
            bk.c r0 = r12.f33480e
            m9.e r0 = r0.a()
            r10.f24313z = r0
            r0.a(r14)
            r11.g(r0)
            bk.c r0 = r12.f33481f
            m9.e r0 = r0.a()
            r10.A = r0
            r0.a(r14)
            r11.g(r0)
            return
        L9c:
            throw r13
        L9d:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l9.j.<init>(j9.y, s9.b, r9.e):void");
    }

    @Override // l9.b, p9.f
    public final void c(x9.c cVar, Object obj) {
        super.c(cVar, obj);
        if (obj == b0.L) {
            m9.u uVar = this.B;
            s9.b bVar = this.f24239f;
            if (uVar != null) {
                bVar.p(uVar);
            }
            if (cVar == null) {
                this.B = null;
                return;
            }
            m9.u uVar2 = new m9.u(cVar, null);
            this.B = uVar2;
            uVar2.a(this);
            bVar.g(this.B);
        }
    }

    @Override // l9.d
    public final String d() {
        return this.f24305r;
    }

    public final int[] g(int[] iArr) {
        m9.u uVar = this.B;
        if (uVar != null) {
            Integer[] numArr = (Integer[]) uVar.f();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    @Override // l9.b, l9.f
    public final void h(Canvas canvas, Matrix matrix, int i10) {
        Shader shader;
        if (this.f24306s) {
            return;
        }
        e(this.f24309v, matrix, false);
        int i11 = this.f24310w;
        m9.e eVar = this.f24312y;
        m9.e eVar2 = this.A;
        m9.e eVar3 = this.f24313z;
        if (i11 == 1) {
            long j10 = j();
            t.o oVar = this.f24307t;
            shader = (LinearGradient) oVar.c(j10);
            if (shader == null) {
                PointF pointF = (PointF) eVar3.f();
                PointF pointF2 = (PointF) eVar2.f();
                r9.c cVar = (r9.c) eVar.f();
                shader = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, g(cVar.f33467b), cVar.f33466a, Shader.TileMode.CLAMP);
                oVar.g(j10, shader);
            }
        } else {
            long j11 = j();
            t.o oVar2 = this.f24308u;
            shader = (RadialGradient) oVar2.c(j11);
            if (shader == null) {
                PointF pointF3 = (PointF) eVar3.f();
                PointF pointF4 = (PointF) eVar2.f();
                r9.c cVar2 = (r9.c) eVar.f();
                int[] g10 = g(cVar2.f33467b);
                float[] fArr = cVar2.f33466a;
                RadialGradient radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), g10, fArr, Shader.TileMode.CLAMP);
                oVar2.g(j11, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        this.f24242i.setShader(shader);
        super.h(canvas, matrix, i10);
    }

    public final int j() {
        int i10;
        float f10 = this.f24313z.f27642d;
        int i11 = this.f24311x;
        int round = Math.round(f10 * i11);
        int round2 = Math.round(this.A.f27642d * i11);
        int round3 = Math.round(this.f24312y.f27642d * i11);
        if (round != 0) {
            i10 = 527 * round;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }
}
