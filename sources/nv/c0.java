package nv;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class c0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f29184a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f29185b;

    /* renamed from: c, reason: collision with root package name */
    public final Call.Factory f29186c;

    /* renamed from: d, reason: collision with root package name */
    public final o f29187d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f29188e;

    /* renamed from: f, reason: collision with root package name */
    public Call f29189f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f29190g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29191h;

    public c0(u0 u0Var, Object[] objArr, Call.Factory factory, o oVar) {
        this.f29184a = u0Var;
        this.f29185b = objArr;
        this.f29186c = factory;
        this.f29187d = oVar;
    }

    public final Call a() {
        HttpUrl resolve;
        u0 u0Var = this.f29184a;
        u0Var.getClass();
        Object[] objArr = this.f29185b;
        int length = objArr.length;
        bl.j[] jVarArr = u0Var.f29298j;
        if (length == jVarArr.length) {
            s0 s0Var = new s0(u0Var.f29291c, u0Var.f29290b, u0Var.f29292d, u0Var.f29293e, u0Var.f29294f, u0Var.f29295g, u0Var.f29296h, u0Var.f29297i);
            if (u0Var.f29299k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                jVarArr[i10].k(s0Var, objArr[i10]);
            }
            HttpUrl.Builder builder = s0Var.f29252d;
            if (builder != null) {
                resolve = builder.build();
            } else {
                String str = s0Var.f29251c;
                HttpUrl httpUrl = s0Var.f29250b;
                resolve = httpUrl.resolve(str);
                if (resolve == null) {
                    throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + s0Var.f29251c);
                }
            }
            RequestBody requestBody = s0Var.f29259k;
            if (requestBody == null) {
                FormBody.Builder builder2 = s0Var.f29258j;
                if (builder2 != null) {
                    requestBody = builder2.build();
                } else {
                    MultipartBody.Builder builder3 = s0Var.f29257i;
                    if (builder3 != null) {
                        requestBody = builder3.build();
                    } else if (s0Var.f29256h) {
                        requestBody = RequestBody.create((MediaType) null, new byte[0]);
                    }
                }
            }
            MediaType mediaType = s0Var.f29255g;
            Headers.Builder builder4 = s0Var.f29254f;
            if (mediaType != null) {
                if (requestBody != null) {
                    requestBody = new r0(requestBody, mediaType);
                } else {
                    builder4.add("Content-Type", mediaType.getMediaType());
                }
            }
            Call newCall = this.f29186c.newCall(s0Var.f29253e.url(resolve).headers(builder4.build()).method(s0Var.f29249a, requestBody).tag(v.class, new v(u0Var.f29289a, arrayList)).build());
            if (newCall != null) {
                return newCall;
            }
            throw new NullPointerException("Call.Factory returned null.");
        }
        throw new IllegalArgumentException(nn.d.m(a3.a.n("Argument count (", length, ") doesn't match expected count ("), jVarArr.length, ")"));
    }

    public final Call b() {
        Call call = this.f29189f;
        if (call != null) {
            return call;
        }
        Throwable th2 = this.f29190g;
        if (th2 != null) {
            if (!(th2 instanceof IOException)) {
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                throw ((Error) th2);
            }
            throw ((IOException) th2);
        }
        try {
            Call a10 = a();
            this.f29189f = a10;
            return a10;
        } catch (IOException | Error | RuntimeException e10) {
            e1.m(e10);
            this.f29190g = e10;
            throw e10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, bv.l, bv.k] */
    public final v0 c(Response response) {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new b0(body.get$contentType(), body.get$contentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                a0 a0Var = new a0(body);
                try {
                    Object e10 = this.f29187d.e(a0Var);
                    if (build.isSuccessful()) {
                        return new v0(build, e10, null);
                    }
                    throw new IllegalArgumentException("rawResponse must be successful response");
                } catch (RuntimeException e11) {
                    IOException iOException = a0Var.f29178c;
                    if (iOException == null) {
                        throw e11;
                    }
                    throw iOException;
                }
            }
            body.close();
            if (build.isSuccessful()) {
                return new v0(build, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        try {
            ?? obj = new Object();
            body.get$this_asResponseBody().V(obj);
            ResponseBody create = ResponseBody.create(body.get$contentType(), body.get$contentLength(), (bv.l) obj);
            Objects.requireNonNull(create, "body == null");
            if (!build.isSuccessful()) {
                return new v0(build, null, create);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response");
        } finally {
            body.close();
        }
    }

    @Override // nv.h
    public final void cancel() {
        Call call;
        this.f29188e = true;
        synchronized (this) {
            call = this.f29189f;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Object clone() {
        return new c0(this.f29184a, this.f29185b, this.f29186c, this.f29187d);
    }

    @Override // nv.h
    public final v0 execute() {
        Call b10;
        synchronized (this) {
            if (!this.f29191h) {
                this.f29191h = true;
                b10 = b();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f29188e) {
            b10.cancel();
        }
        return c(FirebasePerfOkHttpClient.execute(b10));
    }

    @Override // nv.h
    public final boolean isCanceled() {
        boolean z10 = true;
        if (this.f29188e) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.f29189f;
                if (call == null || !call.getCanceled()) {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // nv.h
    public final synchronized Request request() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return b().request();
    }

    @Override // nv.h
    public final void v(k kVar) {
        Call call;
        Throwable th2;
        synchronized (this) {
            try {
                if (!this.f29191h) {
                    this.f29191h = true;
                    call = this.f29189f;
                    th2 = this.f29190g;
                    if (call == null && th2 == null) {
                        try {
                            Call a10 = a();
                            this.f29189f = a10;
                            call = a10;
                        } catch (Throwable th3) {
                            th2 = th3;
                            e1.m(th2);
                            this.f29190g = th2;
                        }
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            kVar.a(this, th2);
            return;
        }
        if (this.f29188e) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new z(this, kVar));
    }

    @Override // nv.h
    /* renamed from: clone, reason: collision with other method in class */
    public final h mo24clone() {
        return new c0(this.f29184a, this.f29185b, this.f29186c, this.f29187d);
    }
}
