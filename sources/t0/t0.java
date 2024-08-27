package t0;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f35209a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    public int f35210b;

    public final int a() {
        int[] iArr = this.f35209a;
        int i10 = this.f35210b - 1;
        this.f35210b = i10;
        return iArr[i10];
    }

    public final void b(int i10) {
        int i11 = this.f35210b;
        int[] iArr = this.f35209a;
        if (i11 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f35209a = copyOf;
        }
        int[] iArr2 = this.f35209a;
        int i12 = this.f35210b;
        this.f35210b = i12 + 1;
        iArr2[i12] = i10;
    }
}
