package l0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f23795a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23796b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23797c;

    /* renamed from: d, reason: collision with root package name */
    public final j2.e0 f23798d;

    public o(int i10, int i11, int i12, j2.e0 e0Var) {
        this.f23795a = i10;
        this.f23796b = i11;
        this.f23797c = i12;
        this.f23798d = e0Var;
    }

    public final p a(int i10) {
        return new p(al.d.r0(this.f23798d, i10), i10, 1L);
    }

    public final int b() {
        int i10 = this.f23795a;
        int i11 = this.f23796b;
        if (i10 < i11) {
            return 2;
        }
        return i10 > i11 ? 1 : 3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionInfo(id=1, range=(");
        int i10 = this.f23795a;
        sb2.append(i10);
        sb2.append('-');
        j2.e0 e0Var = this.f23798d;
        sb2.append(al.d.r0(e0Var, i10));
        sb2.append(',');
        int i11 = this.f23796b;
        sb2.append(i11);
        sb2.append('-');
        sb2.append(al.d.r0(e0Var, i11));
        sb2.append("), prevOffset=");
        return a3.a.i(sb2, this.f23797c, ')');
    }
}
