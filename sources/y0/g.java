package y0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: d, reason: collision with root package name */
    public final f f41028d;

    /* renamed from: e, reason: collision with root package name */
    public Object f41029e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41030f;

    /* renamed from: g, reason: collision with root package name */
    public int f41031g;

    public g(f fVar, s[] sVarArr) {
        super(fVar.f41024b, sVarArr);
        this.f41028d = fVar;
        this.f41031g = fVar.f41026d;
    }

    public final void d(int i10, r rVar, Object obj, int i11) {
        int i12 = i11 * 5;
        s[] sVarArr = this.f41020a;
        if (i12 > 30) {
            s sVar = sVarArr[i11];
            Object[] objArr = rVar.f41045d;
            sVar.b(objArr.length, 0, objArr);
            while (true) {
                s sVar2 = sVarArr[i11];
                if (!Intrinsics.a(sVar2.f41046a[sVar2.f41048c], obj)) {
                    sVarArr[i11].f41048c += 2;
                } else {
                    this.f41021b = i11;
                    return;
                }
            }
        } else {
            int W = 1 << t0.t.W(i10, i12);
            if (rVar.h(W)) {
                sVarArr[i11].b(Integer.bitCount(rVar.f41042a) * 2, rVar.f(W), rVar.f41045d);
                this.f41021b = i11;
                return;
            }
            int t10 = rVar.t(W);
            r s7 = rVar.s(t10);
            sVarArr[i11].b(Integer.bitCount(rVar.f41042a) * 2, t10, rVar.f41045d);
            d(i10, s7, obj, i11 + 1);
        }
    }

    @Override // y0.e, java.util.Iterator
    public final Object next() {
        if (this.f41028d.f41026d == this.f41031g) {
            if (this.f41022c) {
                s sVar = this.f41020a[this.f41021b];
                this.f41029e = sVar.f41046a[sVar.f41048c];
                this.f41030f = true;
                return super.next();
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // y0.e, java.util.Iterator
    public final void remove() {
        int i10;
        if (this.f41030f) {
            boolean z10 = this.f41022c;
            f fVar = this.f41028d;
            if (z10) {
                if (z10) {
                    s sVar = this.f41020a[this.f41021b];
                    Object obj = sVar.f41046a[sVar.f41048c];
                    Object obj2 = this.f41029e;
                    zq.f.w(fVar);
                    fVar.remove(obj2);
                    if (obj != null) {
                        i10 = obj.hashCode();
                    } else {
                        i10 = 0;
                    }
                    d(i10, fVar.f41024b, obj, 0);
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                Object obj3 = this.f41029e;
                zq.f.w(fVar);
                fVar.remove(obj3);
            }
            this.f41029e = null;
            this.f41030f = false;
            this.f41031g = fVar.f41026d;
            return;
        }
        throw new IllegalStateException();
    }
}
