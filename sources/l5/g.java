package l5;

import android.net.Uri;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import e5.x;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import m5.t;

/* loaded from: classes.dex */
public final class g implements v5.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24023a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24024b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f24023a = i10;
        this.f24024b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [v5.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [v5.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [r5.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [r5.n, java.lang.Object] */
    public final void a(v5.r rVar, long j10, long j11) {
        int size;
        int i10 = 1;
        switch (this.f24023a) {
            case 0:
                h hVar = (h) this.f24024b;
                hVar.getClass();
                long j12 = rVar.f37758a;
                Uri uri = rVar.f37761d.f16627c;
                ?? obj = new Object();
                hVar.f24031n.getClass();
                hVar.f24035r.l(obj, rVar.f37760c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                m5.c cVar = (m5.c) rVar.f37763f;
                m5.c cVar2 = hVar.I;
                if (cVar2 == null) {
                    size = 0;
                } else {
                    size = cVar2.f27525m.size();
                }
                long j13 = cVar.a(0).f27548b;
                int i11 = 0;
                while (i11 < size && hVar.I.a(i11).f27548b < j13) {
                    i11++;
                }
                if (cVar.f27516d) {
                    if (size - i11 > cVar.f27525m.size()) {
                        e5.m.f("DashMediaSource", "Loaded out of sync manifest");
                    } else {
                        long j14 = hVar.O;
                        if (j14 != -9223372036854775807L && cVar.f27520h * 1000 <= j14) {
                            e5.m.f("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f27520h + ", " + hVar.O);
                        } else {
                            hVar.N = 0;
                        }
                    }
                    int i12 = hVar.N;
                    hVar.N = i12 + 1;
                    if (i12 < hVar.f24031n.H(rVar.f37760c)) {
                        hVar.E.postDelayed(hVar.f24040w, Math.min((hVar.N - 1) * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, 5000));
                        return;
                    } else {
                        hVar.D = new DashManifestStaleException();
                        return;
                    }
                }
                hVar.I = cVar;
                hVar.J = cVar.f27516d & hVar.J;
                hVar.K = j10 - j11;
                hVar.L = j10;
                synchronized (hVar.f24038u) {
                    try {
                        if (rVar.f37759b.f16569a == hVar.G) {
                            Uri uri2 = hVar.I.f27523k;
                            if (uri2 == null) {
                                uri2 = rVar.f37761d.f16627c;
                            }
                            hVar.G = uri2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (size == 0) {
                    m5.c cVar3 = hVar.I;
                    if (cVar3.f27516d) {
                        t tVar = cVar3.f27521i;
                        if (tVar != null) {
                            String str = tVar.f27589b;
                            if (!x.a(str, "urn:mpeg:dash:utc:direct:2014") && !x.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                                if (!x.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !x.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                                    if (!x.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !x.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                        if (!x.a(str, "urn:mpeg:dash:utc:ntp:2014") && !x.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                            e5.m.d("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
                                            hVar.v(true);
                                            return;
                                        } else {
                                            hVar.t();
                                            return;
                                        }
                                    }
                                    hVar.w(new v5.r(hVar.A, Uri.parse(tVar.f27590c), 5, new Object()), new g(hVar, i10), 1);
                                    return;
                                }
                                hVar.w(new v5.r(hVar.A, Uri.parse(tVar.f27590c), 5, new Object()), new g(hVar, i10), 1);
                                return;
                            }
                            try {
                                hVar.M = x.I(tVar.f27590c) - hVar.L;
                                hVar.v(true);
                                return;
                            } catch (ParserException e10) {
                                e5.m.d("DashMediaSource", "Failed to resolve time offset.", e10);
                                hVar.v(true);
                                return;
                            }
                        }
                        hVar.t();
                        return;
                    }
                    hVar.v(true);
                    return;
                }
                hVar.P += i11;
                hVar.v(true);
                return;
            default:
                h hVar2 = (h) this.f24024b;
                hVar2.getClass();
                long j15 = rVar.f37758a;
                Uri uri3 = rVar.f37761d.f16627c;
                ?? obj2 = new Object();
                hVar2.f24031n.getClass();
                hVar2.f24035r.l(obj2, rVar.f37760c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                hVar2.M = ((Long) rVar.f37763f).longValue() - j10;
                hVar2.v(true);
                return;
        }
    }

    @Override // v5.k
    public final v5.j b(v5.m mVar, long j10, long j11, IOException iOException, int i10) {
        switch (this.f24023a) {
            case 0:
                return c((v5.r) mVar, iOException, i10);
            case 1:
                return c((v5.r) mVar, iOException, i10);
            default:
                w5.a aVar = (w5.a) this.f24024b;
                if (aVar != null) {
                    h hVar = (h) ((e.l) aVar).f14641b;
                    int i11 = h.Q;
                    hVar.getClass();
                    e5.m.d("DashMediaSource", "Failed to resolve time offset.", iOException);
                    hVar.v(true);
                }
                return v5.o.f37753d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Type inference failed for: r2v1, types: [r5.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [r5.n, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final v5.j c(v5.r r19, java.io.IOException r20, int r21) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.g.c(v5.r, java.io.IOException, int):v5.j");
    }

    @Override // v5.k
    public final void h(v5.m mVar, long j10, long j11, boolean z10) {
        Object obj = this.f24024b;
        int i10 = this.f24023a;
        switch (i10) {
            case 0:
                v5.r rVar = (v5.r) mVar;
                switch (i10) {
                    case 0:
                        ((h) obj).u(rVar);
                        return;
                    default:
                        ((h) obj).u(rVar);
                        return;
                }
            case 1:
                v5.r rVar2 = (v5.r) mVar;
                switch (i10) {
                    case 0:
                        ((h) obj).u(rVar2);
                        return;
                    default:
                        ((h) obj).u(rVar2);
                        return;
                }
            default:
                return;
        }
    }

    @Override // v5.k
    public final void j(v5.m mVar, long j10, long j11) {
        boolean z10;
        switch (this.f24023a) {
            case 0:
                a((v5.r) mVar, j10, j11);
                return;
            case 1:
                a((v5.r) mVar, j10, j11);
                return;
            default:
                w5.a aVar = (w5.a) this.f24024b;
                if (aVar != null) {
                    synchronized (w5.b.f38812b) {
                        z10 = w5.b.f38813c;
                    }
                    if (!z10) {
                        IOException iOException = new IOException(new ConcurrentModificationException());
                        h hVar = (h) ((e.l) aVar).f14641b;
                        int i10 = h.Q;
                        hVar.getClass();
                        e5.m.d("DashMediaSource", "Failed to resolve time offset.", iOException);
                        hVar.v(true);
                        return;
                    }
                    ((e.l) aVar).M();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, int i10) {
        this((Object) hVar, 0);
        this.f24023a = i10;
        int i11 = 1;
        if (i10 != 1) {
        } else {
            this((Object) hVar, i11);
        }
    }
}
