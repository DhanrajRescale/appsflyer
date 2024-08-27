package nv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* loaded from: classes2.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f29307a;

    /* renamed from: b, reason: collision with root package name */
    public Call.Factory f29308b;

    /* renamed from: c, reason: collision with root package name */
    public HttpUrl f29309c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f29310d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f29311e;

    public w0() {
        q0 q0Var = q0.f29240c;
        this.f29310d = new ArrayList();
        this.f29311e = new ArrayList();
        this.f29307a = q0Var;
    }

    public final void a() {
        HttpUrl httpUrl = HttpUrl.get("https://prod.stockgro.com");
        Objects.requireNonNull(httpUrl, "baseUrl == null");
        if (HttpUrl.FRAGMENT_ENCODE_SET.equals(httpUrl.pathSegments().get(r1.size() - 1))) {
            this.f29309c = httpUrl;
        } else {
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [nv.g, java.lang.Object] */
    public final x0 b() {
        List singletonList;
        List emptyList;
        if (this.f29309c != null) {
            Call.Factory factory = this.f29308b;
            if (factory == null) {
                factory = new OkHttpClient();
            }
            q0 q0Var = this.f29307a;
            Executor a10 = q0Var.a();
            ArrayList arrayList = new ArrayList(this.f29311e);
            q qVar = new q(a10);
            boolean z10 = q0Var.f29241a;
            if (z10) {
                singletonList = Arrays.asList(m.f29233a, qVar);
            } else {
                singletonList = Collections.singletonList(qVar);
            }
            arrayList.addAll(singletonList);
            ArrayList arrayList2 = this.f29310d;
            ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + (z10 ? 1 : 0));
            ?? obj = new Object();
            obj.f29208a = true;
            arrayList3.add(obj);
            arrayList3.addAll(arrayList2);
            if (z10) {
                emptyList = Collections.singletonList(d0.f29196a);
            } else {
                emptyList = Collections.emptyList();
            }
            arrayList3.addAll(emptyList);
            return new x0(factory, this.f29309c, Collections.unmodifiableList(arrayList3), Collections.unmodifiableList(arrayList));
        }
        throw new IllegalStateException("Base URL required.");
    }
}
