package w0;

import java.util.List;

/* loaded from: classes.dex */
public final class a extends vt.d implements b {

    /* renamed from: b, reason: collision with root package name */
    public final b f38748b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38749c;

    /* renamed from: d, reason: collision with root package name */
    public final int f38750d;

    /* JADX WARN: Multi-variable type inference failed */
    public a(b bVar, int i10, int i11) {
        this.f38748b = bVar;
        this.f38749c = i10;
        al.d.X(i10, i11, ((vt.b) bVar).size());
        this.f38750d = i11 - i10;
    }

    @Override // vt.b
    public final int b() {
        return this.f38750d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        al.d.U(i10, this.f38750d);
        return this.f38748b.get(this.f38749c + i10);
    }

    @Override // vt.d, java.util.List
    public final List subList(int i10, int i11) {
        al.d.X(i10, i11, this.f38750d);
        int i12 = this.f38749c;
        return new a(this.f38748b, i10 + i12, i12 + i11);
    }
}
