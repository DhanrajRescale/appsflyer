package bv;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class a0 extends vt.d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f7319d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final m[] f7320b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f7321c;

    public a0(m[] mVarArr, int[] iArr) {
        this.f7320b = mVarArr;
        this.f7321c = iArr;
    }

    @Override // vt.b
    public final int b() {
        return this.f7320b.length;
    }

    @Override // vt.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        return super.contains((m) obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        return this.f7320b[i10];
    }

    @Override // vt.d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof m)) {
            return -1;
        }
        return super.indexOf((m) obj);
    }

    @Override // vt.d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof m)) {
            return -1;
        }
        return super.lastIndexOf((m) obj);
    }
}
