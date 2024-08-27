package vt;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import vt.d;

/* loaded from: classes2.dex */
public final class s0 extends d implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f38338b;

    /* renamed from: c, reason: collision with root package name */
    public final int f38339c;

    /* renamed from: d, reason: collision with root package name */
    public int f38340d;

    /* renamed from: e, reason: collision with root package name */
    public int f38341e;

    public s0(Object[] buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f38338b = buffer;
        if (i10 >= 0) {
            if (i10 <= buffer.length) {
                this.f38339c = buffer.length;
                this.f38341e = i10;
                return;
            } else {
                StringBuilder n10 = a3.a.n("ring buffer filled size: ", i10, " cannot be larger than the buffer size: ");
                n10.append(buffer.length);
                throw new IllegalArgumentException(n10.toString().toString());
            }
        }
        throw new IllegalArgumentException(jr.h.n("ring buffer filled size should not be negative but it is ", i10).toString());
    }

    @Override // vt.b
    public final int b() {
        return this.f38341e;
    }

    public final void e(int i10) {
        if (i10 >= 0) {
            if (i10 <= this.f38341e) {
                if (i10 > 0) {
                    int i11 = this.f38340d;
                    int i12 = this.f38339c;
                    int i13 = (i11 + i10) % i12;
                    Object[] objArr = this.f38338b;
                    if (i11 > i13) {
                        t.k(i11, i12, objArr);
                        t.k(0, i13, objArr);
                    } else {
                        t.k(i11, i13, objArr);
                    }
                    this.f38340d = i13;
                    this.f38341e -= i10;
                    return;
                }
                return;
            }
            StringBuilder n10 = a3.a.n("n shouldn't be greater than the buffer size: n = ", i10, ", size = ");
            n10.append(this.f38341e);
            throw new IllegalArgumentException(n10.toString().toString());
        }
        throw new IllegalArgumentException(jr.h.n("n shouldn't be negative but it is ", i10).toString());
    }

    @Override // java.util.List
    public final Object get(int i10) {
        d.Companion companion = d.INSTANCE;
        int i11 = this.f38341e;
        companion.getClass();
        d.Companion.a(i10, i11);
        return this.f38338b[(this.f38340d + i10) % this.f38339c];
    }

    @Override // vt.d, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new r0(this);
    }

    @Override // vt.b, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // vt.b, java.util.Collection
    public final Object[] toArray(Object[] array) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i10 = this.f38341e;
        if (length < i10) {
            array = Arrays.copyOf(array, i10);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        }
        int i11 = this.f38341e;
        int i12 = this.f38340d;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            objArr = this.f38338b;
            if (i14 >= i11 || i12 >= this.f38339c) {
                break;
            }
            array[i14] = objArr[i12];
            i14++;
            i12++;
        }
        while (i14 < i11) {
            array[i14] = objArr[i13];
            i14++;
            i13++;
        }
        x.b(i11, array);
        return array;
    }
}
