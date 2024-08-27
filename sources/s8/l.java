package s8;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import bv.b0;
import bv.d0;
import bv.e0;
import bv.q;
import java.io.IOException;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import kotlin.text.w;
import okhttp3.CacheControl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final CacheControl f34338f = new CacheControl.Builder().noCache().noStore().build();

    /* renamed from: g, reason: collision with root package name */
    public static final CacheControl f34339g = new CacheControl.Builder().noCache().onlyIfCached().build();

    /* renamed from: a, reason: collision with root package name */
    public final String f34340a;

    /* renamed from: b, reason: collision with root package name */
    public final y8.m f34341b;

    /* renamed from: c, reason: collision with root package name */
    public final ut.g f34342c;

    /* renamed from: d, reason: collision with root package name */
    public final ut.g f34343d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f34344e;

    public l(String str, y8.m mVar, ut.g gVar, ut.g gVar2, boolean z10) {
        this.f34340a = str;
        this.f34341b = mVar;
        this.f34342c = gVar;
        this.f34343d = gVar2;
        this.f34344e = z10;
    }

    public static String d(String str, MediaType mediaType) {
        String str2;
        String b10;
        if (mediaType != null) {
            str2 = mediaType.getMediaType();
        } else {
            str2 = null;
        }
        if ((str2 == null || s.r(str2, "text/plain", false)) && (b10 = d9.e.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b10;
        }
        if (str2 == null) {
            return null;
        }
        return w.U(str2, ';');
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0130 A[Catch: Exception -> 0x00cc, TryCatch #1 {Exception -> 0x00cc, blocks: (B:28:0x0225, B:29:0x0228, B:36:0x0155, B:38:0x0229, B:39:0x0232, B:80:0x0093, B:82:0x009e, B:85:0x00d0, B:87:0x00d4, B:91:0x00ed, B:93:0x013d, B:97:0x0105, B:99:0x0111, B:100:0x011a, B:102:0x00b2, B:104:0x00bc, B:106:0x0124, B:107:0x012f, B:108:0x0130), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01eb A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:15:0x01e3, B:17:0x01eb, B:19:0x0212, B:20:0x0217, B:23:0x0215, B:24:0x021b, B:25:0x0224, B:41:0x015f, B:44:0x016b, B:46:0x0177, B:47:0x0185, B:49:0x0191, B:51:0x019d, B:53:0x01bf, B:54:0x01c4, B:56:0x01c2, B:57:0x01c8), top: B:40:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021b A[Catch: Exception -> 0x018f, TryCatch #0 {Exception -> 0x018f, blocks: (B:15:0x01e3, B:17:0x01eb, B:19:0x0212, B:20:0x0217, B:23:0x0215, B:24:0x021b, B:25:0x0224, B:41:0x015f, B:44:0x016b, B:46:0x0177, B:47:0x0185, B:49:0x0191, B:51:0x019d, B:53:0x01bf, B:54:0x01c4, B:56:0x01c2, B:57:0x01c8), top: B:40:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0229 A[Catch: Exception -> 0x00cc, TryCatch #1 {Exception -> 0x00cc, blocks: (B:28:0x0225, B:29:0x0228, B:36:0x0155, B:38:0x0229, B:39:0x0232, B:80:0x0093, B:82:0x009e, B:85:0x00d0, B:87:0x00d4, B:91:0x00ed, B:93:0x013d, B:97:0x0105, B:99:0x0111, B:100:0x011a, B:102:0x00b2, B:104:0x00bc, B:106:0x0124, B:107:0x012f, B:108:0x0130), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0093 A[Catch: Exception -> 0x00cc, TRY_ENTER, TryCatch #1 {Exception -> 0x00cc, blocks: (B:28:0x0225, B:29:0x0228, B:36:0x0155, B:38:0x0229, B:39:0x0232, B:80:0x0093, B:82:0x009e, B:85:0x00d0, B:87:0x00d4, B:91:0x00ed, B:93:0x013d, B:97:0x0105, B:99:0x0111, B:100:0x011a, B:102:0x00b2, B:104:0x00bc, B:106:0x0124, B:107:0x012f, B:108:0x0130), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    @Override // s8.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(yt.a r15) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.l.a(yt.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(okhttp3.Request r5, yt.a r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s8.j
            if (r0 == 0) goto L13
            r0 = r6
            s8.j r0 = (s8.j) r0
            int r1 = r0.f34331c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34331c = r1
            goto L18
        L13:
            s8.j r0 = new s8.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f34329a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f34331c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ut.n.b(r6)
            goto L92
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            ut.n.b(r6)
            android.graphics.Bitmap$Config[] r6 = d9.e.f14221a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r6 = kotlin.jvm.internal.Intrinsics.a(r6, r2)
            ut.g r2 = r4.f34342c
            if (r6 == 0) goto L61
            y8.m r6 = r4.f34341b
            y8.b r6 = r6.f41403o
            boolean r6 = r6.f41299a
            if (r6 != 0) goto L5b
            java.lang.Object r6 = r2.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            okhttp3.Response r5 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r5)
            goto L95
        L5b:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L61:
            java.lang.Object r6 = r2.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            r0.f34331c = r3
            qu.i r6 = new qu.i
            yt.a r2 = zt.f.b(r0)
            r6.<init>(r3, r2)
            r6.s()
            d9.f r2 = new d9.f
            r2.<init>(r5, r6)
            com.google.firebase.perf.network.FirebasePerfOkHttpClient.enqueue(r5, r2)
            r6.u(r2)
            java.lang.Object r6 = r6.p()
            if (r6 != r1) goto L8f
            java.lang.String r5 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
        L8f:
            if (r6 != r1) goto L92
            return r1
        L92:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L95:
            boolean r6 = r5.isSuccessful()
            if (r6 != 0) goto Ld0
            int r6 = r5.code()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto Ld0
            okhttp3.ResponseBody r6 = r5.body()
            if (r6 == 0) goto Lac
            d9.e.a(r6)
        Lac:
            coil.network.HttpException r6 = new coil.network.HttpException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            int r1 = r5.code()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r5 = r5.message()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Ld0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.l.b(okhttp3.Request, yt.a):java.lang.Object");
    }

    public final q c() {
        Object value = this.f34343d.getValue();
        Intrinsics.c(value);
        return ((q8.l) ((q8.c) value)).f31865a;
    }

    public final Request e() {
        Request.Builder url = new Request.Builder().url(this.f34340a);
        y8.m mVar = this.f34341b;
        Request.Builder headers = url.headers(mVar.f41398j);
        for (Map.Entry entry : mVar.f41399k.f41414a.entrySet()) {
            Object key = entry.getKey();
            Intrinsics.d(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            headers.tag((Class) key, entry.getValue());
        }
        y8.b bVar = mVar.f41402n;
        boolean z10 = bVar.f41299a;
        boolean z11 = mVar.f41403o.f41299a;
        if (!z11 && z10) {
            headers.cacheControl(CacheControl.FORCE_CACHE);
        } else if (z11 && !z10) {
            if (bVar.f41300b) {
                headers.cacheControl(CacheControl.FORCE_NETWORK);
            } else {
                headers.cacheControl(f34338f);
            }
        } else if (!z11 && !z10) {
            headers.cacheControl(f34339g);
        }
        return headers.build();
    }

    public final x8.b f(q8.k kVar) {
        Throwable th2;
        x8.b bVar;
        try {
            q c10 = c();
            q8.e eVar = kVar.f31864a;
            if (!eVar.f31840b) {
                e0 v10 = hl.f.v(c10.l((b0) eVar.f31839a.f31832c.get(0)));
                try {
                    bVar = new x8.b(v10);
                    try {
                        v10.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        v10.close();
                    } catch (Throwable th5) {
                        ut.c.a(th4, th5);
                    }
                    th2 = th4;
                    bVar = null;
                }
                if (th2 == null) {
                    return bVar;
                }
                throw th2;
            }
            throw new IllegalStateException("snapshot is closed".toString());
        } catch (IOException unused) {
            return null;
        }
    }

    public final p8.n g(q8.k kVar) {
        q8.e eVar = kVar.f31864a;
        if (!eVar.f31840b) {
            b0 b0Var = (b0) eVar.f31839a.f31832c.get(1);
            q c10 = c();
            String str = this.f34341b.f41397i;
            if (str == null) {
                str = this.f34340a;
            }
            return new p8.n(b0Var, c10, str, kVar);
        }
        throw new IllegalStateException("snapshot is closed".toString());
    }

    public final q8.k h(q8.b bVar, Request request, Response response, x8.b bVar2) {
        q8.j jVar;
        Throwable th2;
        n5.b0 c10;
        Throwable th3 = null;
        if (this.f34341b.f41402n.f41300b && (!this.f34344e || (!request.cacheControl().noStore() && !response.cacheControl().noStore() && !Intrinsics.a(response.headers().get("Vary"), "*")))) {
            if (bVar != null) {
                q8.e eVar = ((q8.k) bVar).f31864a;
                q8.h hVar = eVar.f31841c;
                synchronized (hVar) {
                    eVar.close();
                    c10 = hVar.c(eVar.f31839a.f31830a);
                }
                if (c10 != null) {
                    jVar = new q8.j(c10);
                }
                jVar = null;
            } else {
                q8.c cVar = (q8.c) this.f34343d.getValue();
                if (cVar != null) {
                    String str = this.f34341b.f41397i;
                    if (str == null) {
                        str = this.f34340a;
                    }
                    q8.h hVar2 = ((q8.l) cVar).f31866b;
                    bv.m mVar = bv.m.f7367d;
                    n5.b0 c11 = hVar2.c(gt.d.e(str).c("SHA-256").e());
                    if (c11 != null) {
                        jVar = new q8.j(c11);
                    }
                }
                jVar = null;
            }
            try {
                if (jVar == null) {
                    return null;
                }
                try {
                    if (response.code() == 304 && bVar2 != null) {
                        Response build = response.newBuilder().headers(x8.c.a(bVar2.f40097f, response.headers())).build();
                        d0 u10 = hl.f.u(c().k(jVar.f31863a.i(0)));
                        try {
                            new x8.b(build).a(u10);
                            Unit unit = Unit.f23355a;
                            try {
                                u10.close();
                            } catch (Throwable th4) {
                                th3 = th4;
                            }
                        } catch (Throwable th5) {
                            th3 = th5;
                            try {
                                u10.close();
                            } catch (Throwable th6) {
                                ut.c.a(th3, th6);
                            }
                        }
                        if (th3 != null) {
                            throw th3;
                        }
                    } else {
                        d0 u11 = hl.f.u(c().k(jVar.f31863a.i(0)));
                        try {
                            new x8.b(response).a(u11);
                            Unit unit2 = Unit.f23355a;
                            try {
                                u11.close();
                                th2 = null;
                            } catch (Throwable th7) {
                                th2 = th7;
                            }
                        } catch (Throwable th8) {
                            try {
                                u11.close();
                            } catch (Throwable th9) {
                                ut.c.a(th8, th9);
                            }
                            th2 = th8;
                        }
                        if (th2 == null) {
                            d0 u12 = hl.f.u(c().k(jVar.f31863a.i(1)));
                            try {
                                ResponseBody body = response.body();
                                Intrinsics.c(body);
                                body.getBodySource().V(u12);
                                try {
                                    u12.close();
                                } catch (Throwable th10) {
                                    th3 = th10;
                                }
                            } catch (Throwable th11) {
                                th3 = th11;
                                try {
                                    u12.close();
                                } catch (Throwable th12) {
                                    ut.c.a(th3, th12);
                                }
                            }
                            if (th3 != null) {
                                throw th3;
                            }
                        } else {
                            throw th2;
                        }
                    }
                    q8.k a10 = jVar.a();
                    d9.e.a(response);
                    return a10;
                } catch (Exception e10) {
                    Bitmap.Config[] configArr = d9.e.f14221a;
                    try {
                        jVar.f31863a.a();
                    } catch (Exception unused) {
                    }
                    throw e10;
                }
            } catch (Throwable th13) {
                d9.e.a(response);
                throw th13;
            }
        }
        if (bVar != null) {
            d9.e.a(bVar);
        }
        return null;
    }
}
