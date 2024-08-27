package lu;

import java.util.Random;

/* loaded from: classes2.dex */
public abstract class a extends d {
    @Override // lu.d
    public final int a(int i10) {
        return ((-i10) >> 31) & (e().nextInt() >>> (32 - i10));
    }

    @Override // lu.d
    public final int b() {
        return e().nextInt();
    }

    @Override // lu.d
    public final int c(int i10) {
        return e().nextInt(i10);
    }

    public abstract Random e();
}
