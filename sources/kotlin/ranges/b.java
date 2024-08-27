package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.e;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/b;", "Lkotlin/ranges/a;", "Lnu/e;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "e", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b extends a implements e {
    static {
        new a((char) 1, (char) 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.f(r2.f23376a, r2.f23377b) > 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlin.ranges.b
            if (r0 == 0) goto L28
            char r0 = r4.f23376a
            char r1 = r4.f23377b
            int r2 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r2 <= 0) goto L1c
            r2 = r5
            kotlin.ranges.b r2 = (kotlin.ranges.b) r2
            char r3 = r2.f23376a
            char r2 = r2.f23377b
            int r2 = kotlin.jvm.internal.Intrinsics.f(r3, r2)
            if (r2 <= 0) goto L1c
            goto L26
        L1c:
            kotlin.ranges.b r5 = (kotlin.ranges.b) r5
            char r2 = r5.f23376a
            if (r0 != r2) goto L28
            char r5 = r5.f23377b
            if (r1 != r5) goto L28
        L26:
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ranges.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        char c10 = this.f23376a;
        char c11 = this.f23377b;
        if (Intrinsics.f(c10, c11) > 0) {
            return -1;
        }
        return (c10 * 31) + c11;
    }

    public final String toString() {
        return this.f23376a + ".." + this.f23377b;
    }
}
