package d2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public String f13361a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f13362b = new int[2];

    public final int[] c(int i10, int i11) {
        if (i10 >= 0 && i11 >= 0 && i10 != i11) {
            int[] iArr = this.f13362b;
            iArr[0] = i10;
            iArr[1] = i11;
            return iArr;
        }
        return null;
    }

    public final String d() {
        String str = this.f13361a;
        if (str != null) {
            return str;
        }
        Intrinsics.k("text");
        throw null;
    }
}
