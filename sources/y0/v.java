package y0;

/* loaded from: classes.dex */
public final class v extends s {

    /* renamed from: d, reason: collision with root package name */
    public final i f41049d;

    public v(i iVar) {
        this.f41049d = iVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f41048c;
        this.f41048c = i10 + 2;
        Object[] objArr = this.f41046a;
        return new c(this.f41049d, objArr[i10], objArr[i10 + 1]);
    }
}
