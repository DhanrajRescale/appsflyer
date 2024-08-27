package ar;

import android.content.Context;
import android.content.res.Resources;
import gr.r;
import java.net.URI;
import lp.g0;

/* loaded from: classes2.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final yq.a f2773c = yq.a.d();

    /* renamed from: a, reason: collision with root package name */
    public final r f2774a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2775b;

    public c(r rVar, Context context) {
        this.f2775b = context;
        this.f2774a = rVar;
    }

    @Override // ar.e
    public final boolean a() {
        boolean isEmpty;
        int i10;
        r rVar = this.f2774a;
        String S = rVar.S();
        if (S == null) {
            isEmpty = true;
        } else {
            isEmpty = S.trim().isEmpty();
        }
        yq.a aVar = f2773c;
        if (isEmpty) {
            aVar.f("URL is missing:" + rVar.S());
            return false;
        }
        String S2 = rVar.S();
        URI uri = null;
        if (S2 != null) {
            try {
                uri = URI.create(S2);
            } catch (IllegalArgumentException | IllegalStateException e10) {
                aVar.g("getResultUrl throws exception %s", e10.getMessage());
            }
        }
        if (uri == null) {
            aVar.f("URL cannot be parsed");
            return false;
        }
        Context context = this.f2775b;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier != 0) {
            yq.a.d().a("Detected domain allowlist, only allowlisted domains will be measured.");
            if (g0.f24982a == null) {
                g0.f24982a = resources.getStringArray(identifier);
            }
            String host = uri.getHost();
            if (host != null) {
                for (String str : g0.f24982a) {
                    if (!host.contains(str)) {
                    }
                }
                aVar.f("URL fails allowlist rule: " + uri);
                return false;
            }
        }
        String host2 = uri.getHost();
        if (host2 != null && !host2.trim().isEmpty() && host2.length() <= 255) {
            String scheme = uri.getScheme();
            if (scheme == null || (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme))) {
                aVar.f("URL scheme is null or invalid");
                return false;
            }
            if (uri.getUserInfo() == null) {
                int port = uri.getPort();
                if (port != -1 && port <= 0) {
                    aVar.f("URL port is less than or equal to 0");
                    return false;
                }
                if (rVar.U()) {
                    i10 = rVar.K();
                } else {
                    i10 = 0;
                }
                if (i10 != 0 && i10 != 1) {
                    if (rVar.V() && rVar.L() <= 0) {
                        aVar.f("HTTP ResponseCode is a negative value:" + rVar.L());
                        return false;
                    }
                    if (rVar.W() && rVar.N() < 0) {
                        aVar.f("Request Payload is a negative value:" + rVar.N());
                        return false;
                    }
                    if (rVar.X() && rVar.O() < 0) {
                        aVar.f("Response Payload is a negative value:" + rVar.O());
                        return false;
                    }
                    if (rVar.T() && rVar.I() > 0) {
                        if (rVar.Y() && rVar.P() < 0) {
                            aVar.f("Time to complete the request is a negative value:" + rVar.P());
                            return false;
                        }
                        if (rVar.a0() && rVar.R() < 0) {
                            aVar.f("Time from the start of the request to the start of the response is null or a negative value:" + rVar.R());
                            return false;
                        }
                        if (rVar.Z() && rVar.Q() > 0) {
                            if (rVar.V()) {
                                return true;
                            }
                            aVar.f("Did not receive a HTTP Response Code");
                            return false;
                        }
                        aVar.f("Time from the start of the request to the end of the response is null, negative or zero:" + rVar.Q());
                        return false;
                    }
                    aVar.f("Start time of the request is null, or zero, or a negative value:" + rVar.I());
                    return false;
                }
                aVar.f("HTTP Method is null or invalid: ".concat(da.e.C(rVar.K())));
                return false;
            }
            aVar.f("URL user info is null");
            return false;
        }
        aVar.f("URL host is null or invalid");
        return false;
    }
}
