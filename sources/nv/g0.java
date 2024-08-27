package nv;

import java.util.Objects;
import okhttp3.FormBody;

/* loaded from: classes2.dex */
public final class g0 extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29209b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29210c;

    /* renamed from: d, reason: collision with root package name */
    public final o f29211d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f29212e;

    public g0(String str, boolean z10, int i10) {
        d dVar = d.f29195a;
        this.f29209b = i10;
        if (i10 != 1) {
            Objects.requireNonNull(str, "name == null");
            this.f29210c = str;
            this.f29211d = dVar;
            this.f29212e = z10;
            return;
        }
        Objects.requireNonNull(str, "name == null");
        this.f29210c = str;
        this.f29211d = dVar;
        this.f29212e = z10;
    }

    @Override // bl.j
    public final void k(s0 s0Var, Object obj) {
        String str;
        String str2;
        int i10 = this.f29209b;
        boolean z10 = this.f29212e;
        String str3 = this.f29210c;
        o oVar = this.f29211d;
        switch (i10) {
            case 0:
                if (obj != null && (str = (String) oVar.e(obj)) != null) {
                    FormBody.Builder builder = s0Var.f29258j;
                    if (z10) {
                        builder.addEncoded(str3, str);
                        return;
                    } else {
                        builder.add(str3, str);
                        return;
                    }
                }
                return;
            default:
                if (obj != null && (str2 = (String) oVar.e(obj)) != null) {
                    s0Var.b(str3, str2, z10);
                    return;
                }
                return;
        }
    }
}
