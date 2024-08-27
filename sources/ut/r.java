package ut;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import t.m0;

/* loaded from: classes2.dex */
public final class r implements Collection, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f37405a;

    public /* synthetic */ r(byte[] bArr) {
        this.f37405a = bArr;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        byte b10 = ((q) obj).f37404a;
        byte[] bArr = this.f37405a;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (b10 == bArr[i10]) {
                if (i10 < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r5 < 0) goto L22;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsAll(java.util.Collection r8) {
        /*
            r7 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L15
            goto L45
        L15:
            java.util.Iterator r8 = r8.iterator()
        L19:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r8.next()
            boolean r2 = r0 instanceof ut.q
            r3 = 0
            if (r2 == 0) goto L44
            ut.q r0 = (ut.q) r0
            byte r0 = r0.f37404a
            byte[] r2 = r7.f37405a
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            int r4 = r2.length
            r5 = r3
        L38:
            if (r5 >= r4) goto L44
            r6 = r2[r5]
            if (r0 != r6) goto L41
            if (r5 < 0) goto L44
            goto L19
        L41:
            int r5 = r5 + 1
            goto L38
        L44:
            r1 = r3
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.r.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        if (!Intrinsics.a(this.f37405a, ((r) obj).f37405a)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f37405a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f37405a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new m0(this.f37405a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f37405a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return iu.j.q(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f37405a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return iu.j.r(this, array);
    }
}
