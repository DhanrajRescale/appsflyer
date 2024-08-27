package i5;

import android.util.Base64;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements kp.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19581a;

    @Override // kp.n
    public final Object get() {
        switch (this.f19581a) {
            case 0:
                return new j();
            default:
                byte[] bArr = new byte[12];
                j5.y.f21028i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
        }
    }
}
