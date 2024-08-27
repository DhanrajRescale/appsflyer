package nv;

import java.lang.reflect.Method;
import okhttp3.Headers;

/* loaded from: classes2.dex */
public final class j0 extends bl.j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29219b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f29220c;

    /* renamed from: d, reason: collision with root package name */
    public final int f29221d;

    public /* synthetic */ j0(Method method, int i10, int i11) {
        this.f29219b = i11;
        this.f29220c = method;
        this.f29221d = i10;
    }

    @Override // bl.j
    public final void k(s0 s0Var, Object obj) {
        int i10 = this.f29219b;
        int i11 = this.f29221d;
        Method method = this.f29220c;
        switch (i10) {
            case 0:
                Headers headers = (Headers) obj;
                if (headers != null) {
                    s0Var.f29254f.addAll(headers);
                    return;
                }
                throw e1.j(method, i11, "Headers parameter must not be null.", new Object[0]);
            default:
                if (obj != null) {
                    s0Var.f29251c = obj.toString();
                    return;
                }
                throw e1.j(method, i11, "@Url parameter is null.", new Object[0]);
        }
    }
}
