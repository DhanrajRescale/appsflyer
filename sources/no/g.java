package no;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import l.c0;
import l.i0;
import l.o;
import l.q;
import mo.u;
import t7.s;

/* loaded from: classes2.dex */
public final class g implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public e f29059a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29060b;

    /* renamed from: c, reason: collision with root package name */
    public int f29061c;

    @Override // l.c0
    public final void b(o oVar, boolean z10) {
    }

    @Override // l.c0
    public final boolean c(q qVar) {
        return false;
    }

    @Override // l.c0
    public final void d(boolean z10) {
        boolean z11;
        t7.a aVar;
        if (this.f29060b) {
            return;
        }
        if (z10) {
            this.f29059a.a();
            return;
        }
        e eVar = this.f29059a;
        o oVar = eVar.C;
        if (oVar != null && eVar.f29036f != null) {
            int size = oVar.f23641f.size();
            if (size != eVar.f29036f.length) {
                eVar.a();
                return;
            }
            int i10 = eVar.f29037g;
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = eVar.C.getItem(i11);
                if (item.isChecked()) {
                    eVar.f29037g = item.getItemId();
                    eVar.f29038h = i11;
                }
            }
            if (i10 != eVar.f29037g && (aVar = eVar.f29031a) != null) {
                s.a(eVar, aVar);
            }
            int i12 = eVar.f29035e;
            int size2 = eVar.C.l().size();
            if (i12 != -1 ? i12 == 0 : size2 > 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            for (int i13 = 0; i13 < size; i13++) {
                eVar.B.f29060b = true;
                eVar.f29036f[i13].setLabelVisibilityMode(eVar.f29035e);
                eVar.f29036f[i13].setShifting(z11);
                eVar.f29036f[i13].b((q) eVar.C.getItem(i13));
                eVar.B.f29060b = false;
            }
        }
    }

    @Override // l.c0
    public final boolean e() {
        return false;
    }

    @Override // l.c0
    public final void g(Parcelable parcelable) {
        SparseArray sparseArray;
        if (parcelable instanceof f) {
            e eVar = this.f29059a;
            f fVar = (f) parcelable;
            int i10 = fVar.f29057a;
            int size = eVar.C.f23641f.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                MenuItem item = eVar.C.getItem(i11);
                if (i10 == item.getItemId()) {
                    eVar.f29037g = i10;
                    eVar.f29038h = i11;
                    item.setChecked(true);
                    break;
                }
                i11++;
            }
            Context context = this.f29059a.getContext();
            u uVar = fVar.f29058b;
            SparseArray sparseArray2 = new SparseArray(uVar.size());
            for (int i12 = 0; i12 < uVar.size(); i12++) {
                int keyAt = uVar.keyAt(i12);
                xn.b bVar = (xn.b) uVar.valueAt(i12);
                if (bVar != null) {
                    sparseArray2.put(keyAt, new xn.a(context, bVar));
                } else {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
            }
            e eVar2 = this.f29059a;
            eVar2.getClass();
            int i13 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = eVar2.f29048r;
                if (i13 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i13);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (xn.a) sparseArray2.get(keyAt2));
                }
                i13++;
            }
            c[] cVarArr = eVar2.f29036f;
            if (cVarArr != null) {
                for (c cVar : cVarArr) {
                    cVar.setBadge((xn.a) sparseArray.get(cVar.getId()));
                }
            }
        }
    }

    @Override // l.c0
    public final int getId() {
        return this.f29061c;
    }

    @Override // l.c0
    public final void j(Context context, o oVar) {
        this.f29059a.C = oVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object, no.f] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.util.SparseArray, mo.u] */
    @Override // l.c0
    public final Parcelable k() {
        ?? obj = new Object();
        obj.f29057a = this.f29059a.getSelectedItemId();
        SparseArray<xn.a> badgeDrawables = this.f29059a.getBadgeDrawables();
        ?? sparseArray = new SparseArray();
        for (int i10 = 0; i10 < badgeDrawables.size(); i10++) {
            int keyAt = badgeDrawables.keyAt(i10);
            xn.a valueAt = badgeDrawables.valueAt(i10);
            if (valueAt != null) {
                sparseArray.put(keyAt, valueAt.f40493e.f40525a);
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        obj.f29058b = sparseArray;
        return obj;
    }

    @Override // l.c0
    public final boolean l(i0 i0Var) {
        return false;
    }

    @Override // l.c0
    public final boolean m(q qVar) {
        return false;
    }
}
