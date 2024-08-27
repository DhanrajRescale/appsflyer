package u0;

import okhttp3.HttpUrl;
import t0.q2;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f36634a;

    /* renamed from: b, reason: collision with root package name */
    public final int f36635b;

    public j0(int i10, int i11) {
        this.f36634a = i10;
        this.f36635b = i11;
    }

    public abstract void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar);

    public String b(int i10) {
        return "IntParameter(" + i10 + ')';
    }

    public String c(int i10) {
        return "ObjectParameter(" + i10 + ')';
    }

    public final String toString() {
        String b10 = iu.a0.a(getClass()).b();
        if (b10 == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return b10;
    }

    public /* synthetic */ j0(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }
}
