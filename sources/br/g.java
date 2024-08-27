package br;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import fr.i;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class g implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Callback f7299a;

    /* renamed from: b, reason: collision with root package name */
    public final zq.g f7300b;

    /* renamed from: c, reason: collision with root package name */
    public final i f7301c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7302d;

    public g(Callback callback, er.f fVar, i iVar, long j10) {
        this.f7299a = callback;
        this.f7300b = new zq.g(fVar);
        this.f7302d = j10;
        this.f7301c = iVar;
    }

    @Override // okhttp3.Callback
    public final void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        zq.g gVar = this.f7300b;
        if (request != null) {
            HttpUrl url = request.url();
            if (url != null) {
                gVar.l(url.url().toString());
            }
            if (request.method() != null) {
                gVar.d(request.method());
            }
        }
        gVar.h(this.f7302d);
        a3.a.t(this.f7301c, gVar, gVar);
        this.f7299a.onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public final void onResponse(Call call, Response response) {
        FirebasePerfOkHttpClient.a(response, this.f7300b, this.f7302d, this.f7301c.a());
        this.f7299a.onResponse(call, response);
    }
}
