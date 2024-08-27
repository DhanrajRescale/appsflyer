package g5;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import e5.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16581a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16582b;

    /* renamed from: c, reason: collision with root package name */
    public final f f16583c;

    /* renamed from: d, reason: collision with root package name */
    public q f16584d;

    /* renamed from: e, reason: collision with root package name */
    public a f16585e;

    /* renamed from: f, reason: collision with root package name */
    public c f16586f;

    /* renamed from: g, reason: collision with root package name */
    public f f16587g;

    /* renamed from: h, reason: collision with root package name */
    public v f16588h;

    /* renamed from: i, reason: collision with root package name */
    public d f16589i;

    /* renamed from: j, reason: collision with root package name */
    public s f16590j;

    /* renamed from: k, reason: collision with root package name */
    public f f16591k;

    public k(Context context, f fVar) {
        this.f16581a = context.getApplicationContext();
        fVar.getClass();
        this.f16583c = fVar;
        this.f16582b = new ArrayList();
    }

    public static void q(f fVar, u uVar) {
        if (fVar != null) {
            fVar.m(uVar);
        }
    }

    @Override // g5.f
    public final void close() {
        f fVar = this.f16591k;
        if (fVar != null) {
            try {
                fVar.close();
            } finally {
                this.f16591k = null;
            }
        }
    }

    @Override // g5.f
    public final Map h() {
        f fVar = this.f16591k;
        if (fVar == null) {
            return Collections.emptyMap();
        }
        return fVar.h();
    }

    @Override // g5.f
    public final Uri l() {
        f fVar = this.f16591k;
        if (fVar == null) {
            return null;
        }
        return fVar.l();
    }

    @Override // g5.f
    public final void m(u uVar) {
        uVar.getClass();
        this.f16583c.m(uVar);
        this.f16582b.add(uVar);
        q(this.f16584d, uVar);
        q(this.f16585e, uVar);
        q(this.f16586f, uVar);
        q(this.f16587g, uVar);
        q(this.f16588h, uVar);
        q(this.f16589i, uVar);
        q(this.f16590j, uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [g5.f, g5.d, g5.b] */
    /* JADX WARN: Type inference failed for: r0v8, types: [g5.f, g5.b, g5.q] */
    @Override // g5.f
    public final long o(i iVar) {
        boolean z10;
        if (this.f16591k == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        yk.j.H0(z10);
        String scheme = iVar.f16569a.getScheme();
        int i10 = x.f15050a;
        Uri uri = iVar.f16569a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f16581a;
        if (!isEmpty && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                if (this.f16585e == null) {
                    a aVar = new a(context);
                    this.f16585e = aVar;
                    p(aVar);
                }
                this.f16591k = this.f16585e;
            } else if ("content".equals(scheme)) {
                if (this.f16586f == null) {
                    c cVar = new c(context);
                    this.f16586f = cVar;
                    p(cVar);
                }
                this.f16591k = this.f16586f;
            } else {
                boolean equals = "rtmp".equals(scheme);
                f fVar = this.f16583c;
                if (equals) {
                    if (this.f16587g == null) {
                        try {
                            f fVar2 = (f) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                            this.f16587g = fVar2;
                            p(fVar2);
                        } catch (ClassNotFoundException unused) {
                            e5.m.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e10) {
                            throw new RuntimeException("Error instantiating RTMP extension", e10);
                        }
                        if (this.f16587g == null) {
                            this.f16587g = fVar;
                        }
                    }
                    this.f16591k = this.f16587g;
                } else if ("udp".equals(scheme)) {
                    if (this.f16588h == null) {
                        v vVar = new v();
                        this.f16588h = vVar;
                        p(vVar);
                    }
                    this.f16591k = this.f16588h;
                } else if ("data".equals(scheme)) {
                    if (this.f16589i == null) {
                        ?? bVar = new b(false);
                        this.f16589i = bVar;
                        p(bVar);
                    }
                    this.f16591k = this.f16589i;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.f16591k = fVar;
                } else {
                    if (this.f16590j == null) {
                        s sVar = new s(context);
                        this.f16590j = sVar;
                        p(sVar);
                    }
                    this.f16591k = this.f16590j;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.f16585e == null) {
                    a aVar2 = new a(context);
                    this.f16585e = aVar2;
                    p(aVar2);
                }
                this.f16591k = this.f16585e;
            } else {
                if (this.f16584d == null) {
                    ?? bVar2 = new b(false);
                    this.f16584d = bVar2;
                    p(bVar2);
                }
                this.f16591k = this.f16584d;
            }
        }
        return this.f16591k.o(iVar);
    }

    public final void p(f fVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f16582b;
            if (i10 < arrayList.size()) {
                fVar.m((u) arrayList.get(i10));
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // b5.o
    public final int read(byte[] bArr, int i10, int i11) {
        f fVar = this.f16591k;
        fVar.getClass();
        return fVar.read(bArr, i10, i11);
    }
}
