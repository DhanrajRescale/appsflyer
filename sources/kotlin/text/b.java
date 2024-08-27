package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes2.dex */
public final class b implements Iterator, ju.a {

    /* renamed from: a, reason: collision with root package name */
    public int f23396a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f23397b;

    /* renamed from: c, reason: collision with root package name */
    public int f23398c;

    /* renamed from: d, reason: collision with root package name */
    public IntRange f23399d;

    /* renamed from: e, reason: collision with root package name */
    public int f23400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f23401f;

    public b(c cVar) {
        this.f23401f = cVar;
        int f10 = kotlin.ranges.d.f(cVar.f23403b, 0, cVar.f23402a.length());
        this.f23397b = f10;
        this.f23398c = f10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.ranges.c, kotlin.ranges.IntRange] */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.ranges.c, kotlin.ranges.IntRange] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            int r0 = r7.f23398c
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f23396a = r1
            r0 = 0
            r7.f23399d = r0
            goto L7b
        Lb:
            kotlin.text.c r2 = r7.f23401f
            int r3 = r2.f23404c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f23400e
            int r6 = r6 + r5
            r7.f23400e = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f23402a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.f23397b
            java.lang.CharSequence r2 = r2.f23402a
            int r2 = kotlin.text.w.w(r2)
            r0.<init>(r1, r2, r5)
            r7.f23399d = r0
            r7.f23398c = r4
            goto L79
        L34:
            kotlin.jvm.functions.Function2 r0 = r2.f23405d
            java.lang.CharSequence r3 = r2.f23402a
            int r6 = r7.f23398c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L58
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r7.f23397b
            java.lang.CharSequence r2 = r2.f23402a
            int r2 = kotlin.text.w.w(r2)
            r0.<init>(r1, r2, r5)
            r7.f23399d = r0
            r7.f23398c = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.f23353a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f23354b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f23397b
            kotlin.ranges.IntRange r3 = kotlin.ranges.d.k(r3, r2)
            r7.f23399d = r3
            int r2 = r2 + r0
            r7.f23397b = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.f23398c = r2
        L79:
            r7.f23396a = r5
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.b.b():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f23396a == -1) {
            b();
        }
        if (this.f23396a == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f23396a == -1) {
            b();
        }
        if (this.f23396a != 0) {
            IntRange intRange = this.f23399d;
            Intrinsics.d(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f23399d = null;
            this.f23396a = -1;
            return intRange;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
