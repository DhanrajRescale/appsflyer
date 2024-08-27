package s5;

import r5.u0;
import z5.b0;
import z5.o;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f34231a;

    /* renamed from: b, reason: collision with root package name */
    public final u0[] f34232b;

    public b(int[] iArr, u0[] u0VarArr) {
        this.f34231a = iArr;
        this.f34232b = u0VarArr;
    }

    public final b0 a(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = this.f34231a;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return this.f34232b[i11];
                }
                i11++;
            } else {
                e5.m.c("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new o();
            }
        }
    }
}
