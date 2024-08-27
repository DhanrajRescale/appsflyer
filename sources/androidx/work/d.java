package androidx.work;

import com.google.android.gms.common.api.Api;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f2543a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f2544b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* renamed from: c, reason: collision with root package name */
    public final m0 f2545c;

    /* renamed from: d, reason: collision with root package name */
    public final ni.j f2546d;

    /* renamed from: e, reason: collision with root package name */
    public final e.l f2547e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2548f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2549g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2550h;

    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.work.m0, java.lang.Object] */
    public d(b bVar) {
        m0 m0Var = bVar.f2542a;
        if (m0Var == null) {
            String str = m0.f2631a;
            this.f2545c = new Object();
        } else {
            this.f2545c = m0Var;
        }
        this.f2546d = new ni.j();
        this.f2547e = new e.l(23);
        this.f2548f = 4;
        this.f2549g = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f2550h = 20;
    }
}
