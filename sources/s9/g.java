package s9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import j9.y;
import java.util.ArrayList;
import java.util.Collections;
import r9.m;

/* loaded from: classes.dex */
public final class g extends b {
    public final l9.e C;
    public final c D;

    public g(j9.i iVar, y yVar, c cVar, e eVar) {
        super(yVar, eVar);
        this.D = cVar;
        l9.e eVar2 = new l9.e(yVar, this, new m(eVar.f34377a, "__container", false), iVar);
        this.C = eVar2;
        eVar2.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // s9.b, l9.f
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        this.C.e(rectF, this.f34364n, z10);
    }

    @Override // s9.b
    public final void l(Canvas canvas, Matrix matrix, int i10) {
        this.C.h(canvas, matrix, i10);
    }

    @Override // s9.b
    public final hr.c m() {
        hr.c cVar = this.f34366p.f34399w;
        if (cVar != null) {
            return cVar;
        }
        return this.D.f34366p.f34399w;
    }

    @Override // s9.b
    public final q.h n() {
        q.h hVar = this.f34366p.f34400x;
        if (hVar != null) {
            return hVar;
        }
        return this.D.f34366p.f34400x;
    }

    @Override // s9.b
    public final void q(p9.e eVar, int i10, ArrayList arrayList, p9.e eVar2) {
        this.C.f(eVar, i10, arrayList, eVar2);
    }
}
