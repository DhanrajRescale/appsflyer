package ls;

import android.content.Context;
import android.os.Message;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Timer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class c0 implements InstallReferrerStateListener {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f25134j = Pattern.compile("(^|&)utm_source=([^&#=]*)([#&]|$)");

    /* renamed from: e, reason: collision with root package name */
    public final Context f25139e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f25140f;

    /* renamed from: g, reason: collision with root package name */
    public InstallReferrerClient f25141g;

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f25135a = Pattern.compile("(^|&)utm_medium=([^&#=]*)([#&]|$)");

    /* renamed from: b, reason: collision with root package name */
    public final Pattern f25136b = Pattern.compile("(^|&)utm_campaign=([^&#=]*)([#&]|$)");

    /* renamed from: c, reason: collision with root package name */
    public final Pattern f25137c = Pattern.compile("(^|&)utm_content=([^&#=]*)([#&]|$)");

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f25138d = Pattern.compile("(^|&)utm_term=([^&#=]*)([#&]|$)");

    /* renamed from: h, reason: collision with root package name */
    public int f25142h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final Timer f25143i = new Timer();

    public c0(Context context, l0 l0Var) {
        this.f25139e = context;
        this.f25140f = l0Var;
    }

    public static String b(Matcher matcher) {
        String group;
        if (matcher.find() && (group = matcher.group(2)) != null) {
            try {
                return URLDecoder.decode(group, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                el.l.M("MixpanelAPI.InstallReferrerPlay", "Could not decode a parameter into UTF-8");
                return null;
            }
        }
        return null;
    }

    public final void a() {
        try {
            InstallReferrerClient build = InstallReferrerClient.newBuilder(this.f25139e).build();
            this.f25141g = build;
            build.startConnection(this);
        } catch (SecurityException e10) {
            el.l.N("MixpanelAPI.InstallReferrerPlay", "Install referrer client could not start connection", e10);
        }
    }

    public final void c() {
        if (this.f25142h > 5) {
            el.l.F("MixpanelAPI.InstallReferrerPlay", "Already retried 5 times. Disconnecting...");
            InstallReferrerClient installReferrerClient = this.f25141g;
            if (installReferrerClient != null && installReferrerClient.isReady()) {
                try {
                    this.f25141g.endConnection();
                    return;
                } catch (Exception e10) {
                    el.l.N("MixpanelAPI.InstallReferrerPlay", "Error closing referrer connection", e10);
                    return;
                }
            }
            return;
        }
        this.f25143i.schedule(new bl.k(this, 1), 2500L);
        this.f25142h++;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [ls.b, java.lang.Object, ls.f] */
    public final void d(String str) {
        if (str == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("referrer", str);
        String b10 = b(f25134j.matcher(str));
        if (b10 != null) {
            hashMap.put("utm_source", b10);
        }
        String b11 = b(this.f25135a.matcher(str));
        if (b11 != null) {
            hashMap.put("utm_medium", b11);
        }
        String b12 = b(this.f25136b.matcher(str));
        if (b12 != null) {
            hashMap.put("utm_campaign", b12);
        }
        String b13 = b(this.f25137c.matcher(str));
        if (b13 != null) {
            hashMap.put("utm_content", b13);
        }
        String b14 = b(this.f25138d.matcher(str));
        if (b14 != null) {
            hashMap.put("utm_term", b14);
        }
        y0.r(this.f25139e, hashMap);
        b0 b0Var = this.f25140f;
        if (b0Var != null) {
            n0 n0Var = ((l0) b0Var).f25236a;
            i iVar = n0Var.f25260b;
            HashMap e10 = n0Var.f25265g.e();
            ?? bVar = new b(n0Var.f25262d);
            bVar.f25184b = e10;
            iVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.obj = bVar;
            iVar.f25224a.b(obtain);
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
        el.l.F("MixpanelAPI.InstallReferrerPlay", "Install Referrer Service Disconnected.");
        c();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i10) {
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            el.l.F("MixpanelAPI.InstallReferrerPlay", "Unexpected error.");
                        }
                    } else {
                        el.l.F("MixpanelAPI.InstallReferrerPlay", "API not available on the current Play Store app.");
                    }
                } else {
                    el.l.F("MixpanelAPI.InstallReferrerPlay", "Service is currently unavailable.");
                }
            } else {
                try {
                    d(this.f25141g.getInstallReferrer().getInstallReferrer());
                } catch (Exception e10) {
                    el.l.G("MixpanelAPI.InstallReferrerPlay", "There was an error fetching your referrer details.", e10);
                }
            }
            InstallReferrerClient installReferrerClient = this.f25141g;
            if (installReferrerClient != null && installReferrerClient.isReady()) {
                try {
                    this.f25141g.endConnection();
                    return;
                } catch (Exception e11) {
                    el.l.N("MixpanelAPI.InstallReferrerPlay", "Error closing referrer connection", e11);
                    return;
                }
            }
            return;
        }
        el.l.F("MixpanelAPI.InstallReferrerPlay", "Service was disconnected unexpectedly.");
        c();
    }
}
