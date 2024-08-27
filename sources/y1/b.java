package y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f41052a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f41053b;

    public final void a(long j10) {
        int i10 = this.f41052a;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f41053b[i11] == j10) {
                return;
            }
        }
        int i12 = this.f41052a;
        long[] jArr = this.f41053b;
        if (i12 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i12 + 1, jArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f41053b = copyOf;
        }
        this.f41053b[i12] = j10;
        if (i12 >= this.f41052a) {
            this.f41052a = i12 + 1;
        }
    }

    public final void b(int i10) {
        int i11 = this.f41052a;
        if (i10 < i11) {
            int i12 = i11 - 1;
            while (i10 < i12) {
                long[] jArr = this.f41053b;
                int i13 = i10 + 1;
                jArr[i10] = jArr[i13];
                i10 = i13;
            }
            this.f41052a--;
        }
    }
}
