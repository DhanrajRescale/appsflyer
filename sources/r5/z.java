package r5;

import android.view.ViewGroup;
import com.facebook.FacebookSdk;
import in.juspay.hypersdk.core.JuspayServices;
import in.juspay.hypersdk.utils.LogType;
import in.juspay.hypersdk.utils.TrackerFallback;
import in.juspay.services.HyperServices;
import java.util.HashSet;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33337c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f33338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f33339e;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f33335a = i10;
        this.f33336b = obj;
        this.f33337c = obj2;
        this.f33338d = obj3;
        this.f33339e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f33335a;
        Object obj = this.f33339e;
        Object obj2 = this.f33338d;
        Object obj3 = this.f33337c;
        Object obj4 = this.f33336b;
        switch (i10) {
            case 0:
                ((b0) obj3).L(((l0.j) obj4).f23773a, (w) obj2, (s) obj);
                return;
            case 1:
                JSONObject viewData = (JSONObject) obj4;
                String buttonText = (String) obj3;
                kl.f this$0 = (kl.f) obj2;
                String pathID = (String) obj;
                HashSet hashSet = kl.f.f23258e;
                if (!sl.a.b(kl.f.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(viewData, "$viewData");
                        Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(pathID, "$pathID");
                        try {
                            String m10 = nl.n0.m(FacebookSdk.getApplicationContext());
                            if (m10 != null) {
                                String lowerCase = m10.toLowerCase();
                                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                                float[] a10 = kl.a.a(lowerCase, viewData);
                                String c10 = kl.a.c(buttonText, this$0.f23262d, lowerCase);
                                if (a10 != null) {
                                    hl.e eVar = hl.e.f18611a;
                                    String[] f10 = hl.e.f(hl.c.f18601b, new float[][]{a10}, new String[]{c10});
                                    if (f10 != null) {
                                        String str = f10[0];
                                        kl.b.a(pathID, str);
                                        if (!Intrinsics.a(str, "other")) {
                                            HashSet hashSet2 = kl.f.f23258e;
                                            androidx.work.u.A(str, buttonText, a10);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable th2) {
                        sl.a.a(kl.f.class, th2);
                        return;
                    }
                }
                return;
            case 2:
                nn.a aVar = (nn.a) obj4;
                jn.i iVar = (jn.i) obj3;
                gn.g gVar = (gn.g) obj2;
                jn.h hVar = (jn.h) obj;
                Logger logger = nn.a.f28994f;
                aVar.getClass();
                Logger logger2 = nn.a.f28994f;
                try {
                    kn.g a11 = aVar.f28997c.a(iVar.f21499a);
                    if (a11 == null) {
                        String format = String.format("Transport backend '%s' is not registered", iVar.f21499a);
                        logger2.warning(format);
                        gVar.g(new IllegalArgumentException(format));
                    } else {
                        ((pn.j) aVar.f28999e).g(new ie.n(3, aVar, iVar, ((hn.d) a11).a(hVar)));
                        gVar.g(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger2.warning("Error scheduling event " + e10.getMessage());
                    gVar.g(e10);
                    return;
                }
            case 3:
                TrackerFallback.a((TrackerFallback) obj4, (JuspayServices) obj3, (JSONObject) obj2, (LogType) obj);
                return;
            default:
                ((HyperServices) obj4).lambda$process$5((androidx.fragment.app.j0) obj3, (ViewGroup) obj2, (JSONObject) obj);
                return;
        }
    }
}
