package lp;

/* loaded from: classes2.dex */
public final class p1 extends v0 {

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f25034i = null;

    /* renamed from: j, reason: collision with root package name */
    public static final p1 f25035j;

    /* renamed from: d, reason: collision with root package name */
    public final transient Object[] f25036d;

    /* renamed from: e, reason: collision with root package name */
    public final transient int f25037e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f25038f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f25039g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f25040h;

    static {
        Object[] objArr = new Object[0];
        f25035j = new p1(objArr, 0, objArr, 0, 0);
    }

    public p1(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f25036d = objArr;
        this.f25037e = i10;
        this.f25038f = objArr2;
        this.f25039g = i11;
        this.f25040h = i12;
    }

    @Override // lp.i0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f25038f;
            if (objArr.length != 0) {
                int o10 = g0.o(obj);
                while (true) {
                    int i10 = o10 & this.f25039g;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    o10 = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // lp.i0
    public final int e(int i10, Object[] objArr) {
        Object[] objArr2 = this.f25036d;
        int i11 = this.f25040h;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // lp.i0
    public final Object[] g() {
        return this.f25036d;
    }

    @Override // lp.i0
    public final int h() {
        return this.f25040h;
    }

    @Override // lp.v0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25037e;
    }

    @Override // lp.i0
    public final int i() {
        return 0;
    }

    @Override // lp.i0
    public final boolean k() {
        return false;
    }

    @Override // lp.i0
    /* renamed from: m */
    public final y1 iterator() {
        return b().listIterator(0);
    }

    @Override // lp.v0
    public final o0 r() {
        return o0.o(this.f25040h, this.f25036d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25040h;
    }
}
