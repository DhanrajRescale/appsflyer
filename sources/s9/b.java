package s9;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import j9.e0;
import j9.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import m9.m;
import m9.p;
import m9.t;

/* loaded from: classes.dex */
public abstract class b implements l9.f, m9.a, p9.f {
    public float A;
    public BlurMaskFilter B;

    /* renamed from: a, reason: collision with root package name */
    public final Path f34351a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f34352b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f34353c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final k9.a f34354d = new Paint(1);

    /* renamed from: e, reason: collision with root package name */
    public final k9.a f34355e;

    /* renamed from: f, reason: collision with root package name */
    public final k9.a f34356f;

    /* renamed from: g, reason: collision with root package name */
    public final k9.a f34357g;

    /* renamed from: h, reason: collision with root package name */
    public final k9.a f34358h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f34359i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f34360j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f34361k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f34362l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f34363m;

    /* renamed from: n, reason: collision with root package name */
    public final Matrix f34364n;

    /* renamed from: o, reason: collision with root package name */
    public final y f34365o;

    /* renamed from: p, reason: collision with root package name */
    public final e f34366p;

    /* renamed from: q, reason: collision with root package name */
    public final m f34367q;

    /* renamed from: r, reason: collision with root package name */
    public final m9.i f34368r;

    /* renamed from: s, reason: collision with root package name */
    public b f34369s;

    /* renamed from: t, reason: collision with root package name */
    public b f34370t;

    /* renamed from: u, reason: collision with root package name */
    public List f34371u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f34372v;

    /* renamed from: w, reason: collision with root package name */
    public final t f34373w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f34374x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f34375y;

    /* renamed from: z, reason: collision with root package name */
    public k9.a f34376z;

    /* JADX WARN: Type inference failed for: r0v10, types: [m9.e, m9.i] */
    /* JADX WARN: Type inference failed for: r0v13, types: [m9.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [k9.a, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r0v6, types: [k9.a, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r4v0, types: [k9.a, android.graphics.Paint] */
    public b(y yVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f34355e = new k9.a(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f34356f = new k9.a(mode2);
        ?? paint = new Paint(1);
        this.f34357g = paint;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        ?? paint2 = new Paint();
        paint2.setXfermode(new PorterDuffXfermode(mode3));
        this.f34358h = paint2;
        this.f34359i = new RectF();
        this.f34360j = new RectF();
        this.f34361k = new RectF();
        this.f34362l = new RectF();
        this.f34363m = new RectF();
        this.f34364n = new Matrix();
        this.f34372v = new ArrayList();
        this.f34374x = true;
        this.A = s0.g.f34069a;
        this.f34365o = yVar;
        this.f34366p = eVar;
        nn.d.o(new StringBuilder(), eVar.f34379c, "#draw");
        if (eVar.f34397u == 3) {
            paint.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        q9.d dVar = eVar.f34385i;
        dVar.getClass();
        t tVar = new t(dVar);
        this.f34373w = tVar;
        tVar.b(this);
        List list = eVar.f34384h;
        if (list != null && !list.isEmpty()) {
            ?? obj = new Object();
            obj.f27659c = list;
            obj.f27657a = new ArrayList(list.size());
            obj.f27658b = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                obj.f27657a.add(new p((List) ((r9.f) list.get(i10)).f33490b.f3178b));
                obj.f27658b.add(((r9.f) list.get(i10)).f33491c.a());
            }
            this.f34367q = obj;
            Iterator it = obj.f27657a.iterator();
            while (it.hasNext()) {
                ((m9.e) it.next()).a(this);
            }
            for (m9.e eVar2 : this.f34367q.f27658b) {
                g(eVar2);
                eVar2.a(this);
            }
        }
        e eVar3 = this.f34366p;
        if (!eVar3.f34396t.isEmpty()) {
            ?? eVar4 = new m9.e(eVar3.f34396t);
            this.f34368r = eVar4;
            eVar4.f27640b = true;
            eVar4.a(new m9.a() { // from class: s9.a
                @Override // m9.a
                public final void a() {
                    boolean z10;
                    b bVar = b.this;
                    if (bVar.f34368r.l() == 1.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 != bVar.f34374x) {
                        bVar.f34374x = z10;
                        bVar.f34365o.invalidateSelf();
                    }
                }
            });
            boolean z10 = ((Float) this.f34368r.f()).floatValue() == 1.0f;
            if (z10 != this.f34374x) {
                this.f34374x = z10;
                this.f34365o.invalidateSelf();
            }
            g(this.f34368r);
            return;
        }
        if (true != this.f34374x) {
            this.f34374x = true;
            this.f34365o.invalidateSelf();
        }
    }

    @Override // m9.a
    public final void a() {
        this.f34365o.invalidateSelf();
    }

    @Override // l9.d
    public final void b(List list, List list2) {
    }

    @Override // p9.f
    public void c(x9.c cVar, Object obj) {
        this.f34373w.c(cVar, obj);
    }

    @Override // l9.d
    public final String d() {
        return this.f34366p.f34379c;
    }

    @Override // l9.f
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f34359i.set(s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a);
        j();
        Matrix matrix2 = this.f34364n;
        matrix2.set(matrix);
        if (z10) {
            List list = this.f34371u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((b) this.f34371u.get(size)).f34373w.e());
                }
            } else {
                b bVar = this.f34370t;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f34373w.e());
                }
            }
        }
        matrix2.preConcat(this.f34373w.e());
    }

    @Override // p9.f
    public final void f(p9.e eVar, int i10, ArrayList arrayList, p9.e eVar2) {
        b bVar = this.f34369s;
        e eVar3 = this.f34366p;
        if (bVar != null) {
            String str = bVar.f34366p.f34379c;
            eVar2.getClass();
            p9.e eVar4 = new p9.e(eVar2);
            eVar4.f30794a.add(str);
            if (eVar.a(i10, this.f34369s.f34366p.f34379c)) {
                b bVar2 = this.f34369s;
                p9.e eVar5 = new p9.e(eVar4);
                eVar5.f30795b = bVar2;
                arrayList.add(eVar5);
            }
            if (eVar.d(i10, eVar3.f34379c)) {
                this.f34369s.q(eVar, eVar.b(i10, this.f34369s.f34366p.f34379c) + i10, arrayList, eVar4);
            }
        }
        if (!eVar.c(i10, eVar3.f34379c)) {
            return;
        }
        String str2 = eVar3.f34379c;
        if (!"__container".equals(str2)) {
            eVar2.getClass();
            p9.e eVar6 = new p9.e(eVar2);
            eVar6.f30794a.add(str2);
            if (eVar.a(i10, str2)) {
                p9.e eVar7 = new p9.e(eVar6);
                eVar7.f30795b = this;
                arrayList.add(eVar7);
            }
            eVar2 = eVar6;
        }
        if (eVar.d(i10, str2)) {
            q(eVar, eVar.b(i10, str2) + i10, arrayList, eVar2);
        }
    }

    public final void g(m9.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f34372v.add(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x011e  */
    @Override // l9.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.b.h(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void j() {
        if (this.f34371u != null) {
            return;
        }
        if (this.f34370t == null) {
            this.f34371u = Collections.emptyList();
            return;
        }
        this.f34371u = new ArrayList();
        for (b bVar = this.f34370t; bVar != null; bVar = bVar.f34370t) {
            this.f34371u.add(bVar);
        }
    }

    public final void k(Canvas canvas) {
        RectF rectF = this.f34359i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f34358h);
        kp.j.M();
    }

    public abstract void l(Canvas canvas, Matrix matrix, int i10);

    public hr.c m() {
        return this.f34366p.f34399w;
    }

    public q.h n() {
        return this.f34366p.f34400x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        e0 e0Var = this.f34365o.f21224a.f21166a;
        String str = this.f34366p.f34379c;
        if (e0Var.f21141a) {
            HashMap hashMap = e0Var.f21143c;
            w9.d dVar = (w9.d) hashMap.get(str);
            w9.d dVar2 = dVar;
            if (dVar == null) {
                Object obj = new Object();
                hashMap.put(str, obj);
                dVar2 = obj;
            }
            int i10 = dVar2.f38890a + 1;
            dVar2.f38890a = i10;
            if (i10 == Integer.MAX_VALUE) {
                dVar2.f38890a = i10 / 2;
            }
            if (str.equals("__container")) {
                t.g gVar = e0Var.f21142b;
                gVar.getClass();
                t.b bVar = new t.b(gVar);
                if (bVar.hasNext()) {
                    a3.a.u(bVar.next());
                    throw null;
                }
            }
        }
    }

    public final void p(m9.e eVar) {
        this.f34372v.remove(eVar);
    }

    public void q(p9.e eVar, int i10, ArrayList arrayList, p9.e eVar2) {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k9.a, android.graphics.Paint] */
    public void r(boolean z10) {
        if (z10 && this.f34376z == null) {
            this.f34376z = new Paint();
        }
        this.f34375y = z10;
    }

    public void s(float f10) {
        t tVar = this.f34373w;
        m9.e eVar = tVar.f27687j;
        if (eVar != null) {
            eVar.j(f10);
        }
        m9.e eVar2 = tVar.f27690m;
        if (eVar2 != null) {
            eVar2.j(f10);
        }
        m9.e eVar3 = tVar.f27691n;
        if (eVar3 != null) {
            eVar3.j(f10);
        }
        m9.e eVar4 = tVar.f27683f;
        if (eVar4 != null) {
            eVar4.j(f10);
        }
        m9.e eVar5 = tVar.f27684g;
        if (eVar5 != null) {
            eVar5.j(f10);
        }
        m9.e eVar6 = tVar.f27685h;
        if (eVar6 != null) {
            eVar6.j(f10);
        }
        m9.e eVar7 = tVar.f27686i;
        if (eVar7 != null) {
            eVar7.j(f10);
        }
        m9.i iVar = tVar.f27688k;
        if (iVar != null) {
            iVar.j(f10);
        }
        m9.i iVar2 = tVar.f27689l;
        if (iVar2 != null) {
            iVar2.j(f10);
        }
        m mVar = this.f34367q;
        int i10 = 0;
        if (mVar != null) {
            for (int i11 = 0; i11 < mVar.f27657a.size(); i11++) {
                ((m9.e) mVar.f27657a.get(i11)).j(f10);
            }
        }
        m9.i iVar3 = this.f34368r;
        if (iVar3 != null) {
            iVar3.j(f10);
        }
        b bVar = this.f34369s;
        if (bVar != null) {
            bVar.s(f10);
        }
        while (true) {
            ArrayList arrayList = this.f34372v;
            if (i10 < arrayList.size()) {
                ((m9.e) arrayList.get(i10)).j(f10);
                i10++;
            } else {
                return;
            }
        }
    }
}
