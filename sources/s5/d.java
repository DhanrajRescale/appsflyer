package s5;

import android.util.SparseArray;
import b5.v;
import z5.b0;
import z5.p;
import z5.r;
import z5.y;

/* loaded from: classes.dex */
public final class d implements r, g {

    /* renamed from: j, reason: collision with root package name */
    public static final mj.b f34239j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final p f34240a;

    /* renamed from: b, reason: collision with root package name */
    public final int f34241b;

    /* renamed from: c, reason: collision with root package name */
    public final v f34242c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f34243d = new SparseArray();

    /* renamed from: e, reason: collision with root package name */
    public boolean f34244e;

    /* renamed from: f, reason: collision with root package name */
    public f f34245f;

    /* renamed from: g, reason: collision with root package name */
    public long f34246g;

    /* renamed from: h, reason: collision with root package name */
    public y f34247h;

    /* renamed from: i, reason: collision with root package name */
    public v[] f34248i;

    public d(p pVar, int i10, v vVar) {
        this.f34240a = pVar;
        this.f34241b = i10;
        this.f34242c = vVar;
    }

    public final void a(f fVar, long j10, long j11) {
        this.f34245f = fVar;
        this.f34246g = j11;
        boolean z10 = this.f34244e;
        p pVar = this.f34240a;
        if (!z10) {
            pVar.d(this);
            if (j10 != -9223372036854775807L) {
                pVar.f(0L, j10);
            }
            this.f34244e = true;
            return;
        }
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        pVar.f(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f34243d;
            if (i10 < sparseArray.size()) {
                c cVar = (c) sparseArray.valueAt(i10);
                if (fVar == null) {
                    cVar.f34237e = cVar.f34235c;
                } else {
                    cVar.f34238f = j11;
                    b0 a10 = ((b) fVar).a(cVar.f34233a);
                    cVar.f34237e = a10;
                    v vVar = cVar.f34236d;
                    if (vVar != null) {
                        a10.e(vVar);
                    }
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // z5.r
    public final void c() {
        SparseArray sparseArray = this.f34243d;
        v[] vVarArr = new v[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            v vVar = ((c) sparseArray.valueAt(i10)).f34236d;
            yk.j.I0(vVar);
            vVarArr[i10] = vVar;
        }
        this.f34248i = vVarArr;
    }

    @Override // z5.r
    public final void d(y yVar) {
        this.f34247h = yVar;
    }

    @Override // z5.r
    public final b0 f(int i10, int i11) {
        boolean z10;
        v vVar;
        SparseArray sparseArray = this.f34243d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            if (this.f34248i == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            yk.j.H0(z10);
            if (i11 == this.f34241b) {
                vVar = this.f34242c;
            } else {
                vVar = null;
            }
            cVar = new c(i10, i11, vVar);
            f fVar = this.f34245f;
            long j10 = this.f34246g;
            if (fVar == null) {
                cVar.f34237e = cVar.f34235c;
            } else {
                cVar.f34238f = j10;
                b0 a10 = ((b) fVar).a(i11);
                cVar.f34237e = a10;
                v vVar2 = cVar.f34236d;
                if (vVar2 != null) {
                    a10.e(vVar2);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }
}
