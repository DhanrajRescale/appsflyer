package d4;

/* loaded from: classes.dex */
public final class c0 implements p2.v, lv.l {

    /* renamed from: a, reason: collision with root package name */
    public int f13727a;

    /* renamed from: b, reason: collision with root package name */
    public int f13728b;

    public /* synthetic */ c0(int i10, int i11) {
        this.f13727a = i10;
        this.f13728b = i11;
    }

    @Override // p2.v
    public int a(int i10) {
        if (i10 >= 0 && i10 <= this.f13728b) {
            i0.l1.F(i10, this.f13727a, i10);
        }
        return i10;
    }

    @Override // p2.v
    public int b(int i10) {
        if (i10 >= 0 && i10 <= this.f13727a) {
            i0.l1.E(i10, this.f13728b, i10);
        }
        return i10;
    }

    public int c() {
        int i10 = this.f13728b;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public void d(int i10, int i11) {
        if (i11 == 1) {
            this.f13728b = i10;
        } else {
            this.f13727a = i10;
        }
    }

    @Override // lv.l
    public lv.j h(lv.j jVar) {
        int i10;
        int i11;
        int k10 = jVar.k(lv.a.DAY_OF_WEEK);
        int i12 = this.f13728b;
        int i13 = this.f13727a;
        if (i13 < 2 && k10 == i12) {
            return jVar;
        }
        if ((i13 & 1) == 0) {
            int i14 = k10 - i12;
            if (i14 >= 0) {
                i11 = 7 - i14;
            } else {
                i11 = -i14;
            }
            return jVar.c(i11, lv.b.DAYS);
        }
        int i15 = i12 - k10;
        if (i15 >= 0) {
            i10 = 7 - i15;
        } else {
            i10 = -i15;
        }
        return jVar.a(i10, lv.b.DAYS);
    }

    public c0(int i10, hv.c cVar) {
        el.l.D0(cVar, "dayOfWeek");
        this.f13727a = i10;
        this.f13728b = cVar.l();
    }
}
