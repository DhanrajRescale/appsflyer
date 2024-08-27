package x0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import t0.t;

/* loaded from: classes.dex */
public final class k extends a {

    /* renamed from: c, reason: collision with root package name */
    public int f39820c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f39821d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39822e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public k(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        ?? r52;
        this.f39820c = i12;
        Object[] objArr2 = new Object[i12];
        this.f39821d = objArr2;
        if (i10 == i11) {
            r52 = 1;
        } else {
            r52 = 0;
        }
        this.f39822e = r52;
        objArr2[0] = objArr;
        c(i10 - r52, 1);
    }

    public final Object b() {
        int i10 = this.f39794a & 31;
        Object obj = this.f39821d[this.f39820c - 1];
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i10];
    }

    public final void c(int i10, int i11) {
        int i12 = (this.f39820c - i11) * 5;
        while (i11 < this.f39820c) {
            Object[] objArr = this.f39821d;
            Object obj = objArr[i11 - 1];
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[t.V(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void d(int i10) {
        int i11 = 0;
        while (t.V(this.f39794a, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            c(this.f39794a, ((this.f39820c - 1) - (i11 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object b10 = b();
            int i10 = this.f39794a + 1;
            this.f39794a = i10;
            if (i10 == this.f39795b) {
                this.f39822e = true;
                return b10;
            }
            d(0);
            return b10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.f39794a--;
            if (this.f39822e) {
                this.f39822e = false;
                return b();
            }
            d(31);
            return b();
        }
        throw new NoSuchElementException();
    }
}
