package zq;

import br.h;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import gr.p;
import gr.r;
import gr.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class g extends uq.c implements cr.b {

    /* renamed from: h, reason: collision with root package name */
    public static final yq.a f42807h = yq.a.d();

    /* renamed from: a, reason: collision with root package name */
    public final List f42808a;

    /* renamed from: b, reason: collision with root package name */
    public final GaugeManager f42809b;

    /* renamed from: c, reason: collision with root package name */
    public final er.f f42810c;

    /* renamed from: d, reason: collision with root package name */
    public final p f42811d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f42812e;

    /* renamed from: f, reason: collision with root package name */
    public String f42813f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f42814g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(er.f r3) {
        /*
            r2 = this;
            uq.b r0 = uq.b.a()
            com.google.firebase.perf.session.gauges.GaugeManager r1 = com.google.firebase.perf.session.gauges.GaugeManager.getInstance()
            r2.<init>(r0)
            gr.p r0 = gr.r.b0()
            r2.f42811d = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r2.f42812e = r0
            r2.f42810c = r3
            r2.f42809b = r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = java.util.Collections.synchronizedList(r3)
            r2.f42808a = r3
            r2.registerForAppState()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.g.<init>(er.f):void");
    }

    public static g c(er.f fVar) {
        return new g(fVar);
    }

    @Override // cr.b
    public final void a(cr.a aVar) {
        if (aVar == null) {
            f42807h.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        p pVar = this.f42811d;
        if (((r) pVar.f11975b).T() && !((r) pVar.f11975b).Z()) {
            this.f42808a.add(aVar);
        }
    }

    public final void b() {
        List unmodifiableList;
        SessionManager.getInstance().unregisterForSessionUpdates(this.f42812e);
        unregisterForAppState();
        synchronized (this.f42808a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (cr.a aVar : this.f42808a) {
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        w[] b10 = cr.a.b(unmodifiableList);
        if (b10 != null) {
            p pVar = this.f42811d;
            List asList = Arrays.asList(b10);
            pVar.i();
            r.E((r) pVar.f11975b, asList);
        }
        r rVar = (r) this.f42811d.g();
        String str = this.f42813f;
        if (str != null) {
            if (h.f7303a.matcher(str).matches()) {
                f42807h.a("Dropping network request from a 'User-Agent' that is not allowed");
                return;
            }
        } else {
            Pattern pattern = h.f7303a;
        }
        if (!this.f42814g) {
            er.f fVar = this.f42810c;
            fVar.f15851i.execute(new androidx.fragment.app.e(18, fVar, rVar, getAppState()));
            this.f42814g = true;
        }
    }

    public final void d(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            int i10 = 8;
            char c10 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    break;
                case 1:
                    i10 = 2;
                    break;
                case 2:
                    i10 = 3;
                    break;
                case 3:
                    i10 = 6;
                    break;
                case 4:
                    i10 = 4;
                    break;
                case 5:
                    i10 = 7;
                    break;
                case 6:
                    i10 = 9;
                    break;
                case 7:
                    i10 = 10;
                    break;
                case '\b':
                    i10 = 5;
                    break;
                default:
                    i10 = 1;
                    break;
            }
            p pVar = this.f42811d;
            pVar.i();
            r.F((r) pVar.f11975b, i10);
        }
    }

    public final void e(int i10) {
        p pVar = this.f42811d;
        pVar.i();
        r.x((r) pVar.f11975b, i10);
    }

    public final void f(long j10) {
        p pVar = this.f42811d;
        pVar.i();
        r.G((r) pVar.f11975b, j10);
    }

    public final void h(long j10) {
        cr.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f42812e);
        p pVar = this.f42811d;
        pVar.i();
        r.A((r) pVar.f11975b, j10);
        a(perfSession);
        if (perfSession.f13073c) {
            this.f42809b.collectGaugeMetricOnce(perfSession.f13072b);
        }
    }

    public final void i(String str) {
        p pVar = this.f42811d;
        if (str == null) {
            pVar.i();
            r.z((r) pVar.f11975b);
            return;
        }
        if (str.length() <= 128) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (charAt > 31 && charAt <= 127) {
                }
            }
            pVar.i();
            r.y((r) pVar.f11975b, str);
            return;
        }
        f42807h.f("The content type of the response is not a valid content-type:".concat(str));
    }

    public final void j(long j10) {
        p pVar = this.f42811d;
        pVar.i();
        r.H((r) pVar.f11975b, j10);
    }

    public final void k(long j10) {
        p pVar = this.f42811d;
        pVar.i();
        r.D((r) pVar.f11975b, j10);
        if (SessionManager.getInstance().perfSession().f13073c) {
            this.f42809b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f13072b);
        }
    }

    public final void l(String str) {
        int lastIndexOf;
        if (str != null) {
            HttpUrl parse = HttpUrl.parse(str);
            if (parse != null) {
                str = parse.newBuilder().username(HttpUrl.FRAGMENT_ENCODE_SET).password(HttpUrl.FRAGMENT_ENCODE_SET).query(null).fragment(null).toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE) == '/') {
                    str = str.substring(0, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
                } else {
                    HttpUrl parse2 = HttpUrl.parse(str);
                    if (parse2 == null) {
                        str = str.substring(0, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
                    } else if (parse2.encodedPath().lastIndexOf(47) >= 0 && (lastIndexOf = str.lastIndexOf(47, 1999)) >= 0) {
                        str = str.substring(0, lastIndexOf);
                    } else {
                        str = str.substring(0, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
                    }
                }
            }
            p pVar = this.f42811d;
            pVar.i();
            r.v((r) pVar.f11975b, str);
        }
    }
}
