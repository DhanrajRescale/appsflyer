package y0;

/* loaded from: classes.dex */
public final class t extends s {
    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f41048c;
        this.f41048c = i10 + 2;
        Object[] objArr = this.f41046a;
        return new b(objArr[i10], objArr[i10 + 1]);
    }
}
