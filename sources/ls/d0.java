package ls;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public final class d0 {
    public static boolean E = false;
    public static d0 F;
    public static final Object G = new Object();
    public final int A;
    public final String B;
    public final String C;
    public final SSLSocketFactory D;

    /* renamed from: a, reason: collision with root package name */
    public final int f25149a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25150b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25151c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25152d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25153e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f25154f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f25155g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f25156h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f25157i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f25158j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f25159k;

    /* renamed from: l, reason: collision with root package name */
    public final String[] f25160l;

    /* renamed from: m, reason: collision with root package name */
    public final String f25161m;

    /* renamed from: n, reason: collision with root package name */
    public final String f25162n;

    /* renamed from: o, reason: collision with root package name */
    public final String f25163o;

    /* renamed from: p, reason: collision with root package name */
    public final String f25164p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f25165q;

    /* renamed from: r, reason: collision with root package name */
    public final String f25166r;

    /* renamed from: s, reason: collision with root package name */
    public final String f25167s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f25168t;

    /* renamed from: u, reason: collision with root package name */
    public final int f25169u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f25170v;

    /* renamed from: w, reason: collision with root package name */
    public final int f25171w;

    /* renamed from: x, reason: collision with root package name */
    public final int f25172x;

    /* renamed from: y, reason: collision with root package name */
    public final int f25173y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f25174z;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d0(android.content.Context r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ls.d0.<init>(android.content.Context, android.os.Bundle):void");
    }

    public static d0 a(Context context) {
        synchronized (G) {
            try {
                if (F == null) {
                    F = b(context.getApplicationContext());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return F;
    }

    public static d0 b(Context context) {
        String packageName = context.getPackageName();
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
            return new d0(context, bundle);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(a3.a.f("Can't configure Mixpanel with package name ", packageName), e10);
        }
    }

    public final String toString() {
        return "Mixpanel (5.8.5) configured with:\n    AutoShowMixpanelUpdates " + this.f25165q + "\n    BulkUploadLimit " + this.f25149a + "\n    FlushInterval " + this.f25150b + "\n    DataExpiration " + this.f25152d + "\n    MinimumDatabaseLimit " + this.f25153e + "\n    DisableAppOpenEvent " + this.f25157i + "\n    DisableViewCrawler " + this.f25158j + "\n    DisableGestureBindingUI " + this.f25155g + "\n    DisableEmulatorBindingUI " + this.f25156h + "\n    EnableDebugLogging " + E + "\n    TestMode " + this.f25154f + "\n    EventsEndpoint " + this.f25161m + "\n    PeopleEndpoint " + this.f25162n + "\n    DecideEndpoint " + this.f25164p + "\n    EditorUrl " + this.f25166r + "\n    ImageCacheMaxMemoryFactor " + this.f25169u + "\n    DisableDecideChecker " + this.f25168t + "\n    IgnoreInvisibleViewsEditor " + this.f25170v + "\n    NotificationDefaults " + this.f25171w + "\n    MinimumSessionDuration: " + this.f25172x + "\n    SessionTimeoutDuration: " + this.f25173y + "\n    DisableExceptionHandler: " + this.f25159k + "\n    NotificationChannelId: " + this.B + "\n    NotificationChannelName: " + this.C + "\n    NotificationChannelImportance: " + this.A + "\n    FlushOnBackground: " + this.f25151c;
    }
}
