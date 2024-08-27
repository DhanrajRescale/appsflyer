package nv;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class z implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f29322a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f29323b;

    public z(c0 c0Var, k kVar) {
        this.f29323b = c0Var;
        this.f29322a = kVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        try {
            this.f29322a.a(this.f29323b, iOException);
        } catch (Throwable th2) {
            e1.m(th2);
            th2.printStackTrace();
        }
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        k kVar = this.f29322a;
        c0 c0Var = this.f29323b;
        try {
            try {
                kVar.b(c0Var, c0Var.c(response));
            } catch (Throwable th2) {
                e1.m(th2);
                th2.printStackTrace();
            }
        } catch (Throwable th3) {
            e1.m(th3);
            try {
                kVar.a(c0Var, th3);
            } catch (Throwable th4) {
                e1.m(th4);
                th4.printStackTrace();
            }
        }
    }
}
