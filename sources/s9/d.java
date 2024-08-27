package s9;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import j9.b0;
import j9.y;
import j9.z;
import m9.u;

/* loaded from: classes.dex */
public final class d extends b {
    public final /* synthetic */ int C;
    public final k9.a D;
    public u E;
    public final Parcelable F;
    public final Object G;
    public final Object H;
    public Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [k9.a, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r4v6, types: [k9.a, android.graphics.Paint] */
    public d(y yVar, e eVar, int i10) {
        super(yVar, eVar);
        z zVar;
        this.C = i10;
        if (i10 != 1) {
            this.D = new Paint(3);
            this.F = new Rect();
            this.G = new Rect();
            j9.i iVar = yVar.f21224a;
            if (iVar == null) {
                zVar = null;
            } else {
                zVar = (z) iVar.f21169d.get(eVar.f34383g);
            }
            this.H = zVar;
            return;
        }
        super(yVar, eVar);
        this.F = new RectF();
        ?? paint = new Paint();
        this.D = paint;
        this.G = new float[8];
        this.H = new Path();
        this.I = eVar;
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(eVar.f34388l);
    }

    @Override // s9.b, p9.f
    public final void c(x9.c cVar, Object obj) {
        switch (this.C) {
            case 0:
                super.c(cVar, obj);
                if (obj == b0.K) {
                    if (cVar == null) {
                        this.E = null;
                        return;
                    } else {
                        this.E = new u(cVar, null);
                        return;
                    }
                }
                if (obj == b0.N) {
                    if (cVar == null) {
                        this.I = null;
                        return;
                    } else {
                        this.I = new u(cVar, null);
                        return;
                    }
                }
                return;
            default:
                super.c(cVar, obj);
                if (obj == b0.K) {
                    if (cVar == null) {
                        this.E = null;
                        return;
                    } else {
                        this.E = new u(cVar, null);
                        return;
                    }
                }
                return;
        }
    }

    @Override // s9.b, l9.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f34364n;
        switch (this.C) {
            case 0:
                super.e(rectF, matrix, z10);
                if (((z) this.H) != null) {
                    float c10 = w9.f.c();
                    rectF.set(s0.g.f34069a, s0.g.f34069a, r5.f21250a * c10, r5.f21251b * c10);
                    matrix2.mapRect(rectF);
                    return;
                }
                return;
            default:
                super.e(rectF, matrix, z10);
                RectF rectF2 = (RectF) this.F;
                e eVar = (e) this.I;
                rectF2.set(s0.g.f34069a, s0.g.f34069a, eVar.f34386j, eVar.f34387k);
                matrix2.mapRect(rectF2);
                rectF.set(rectF2);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01fa  */
    @Override // s9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.d.l(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
