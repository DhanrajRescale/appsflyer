package ea;

import android.content.SharedPreferences;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z implements xs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15297a;

    /* renamed from: b, reason: collision with root package name */
    public final w f15298b;

    public /* synthetic */ z(w wVar, int i10) {
        this.f15297a = i10;
        this.f15298b = wVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f15297a) {
            case 0:
                this.f15298b.getClass();
                rq.a aVar = rq.a.f33973a;
                FirebaseAnalytics firebaseAnalytics = vp.a.f38246a;
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                if (vp.a.f38246a == null) {
                    synchronized (vp.a.f38247b) {
                        if (vp.a.f38246a == null) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            pp.g d10 = pp.g.d();
                            Intrinsics.checkNotNullExpressionValue(d10, "getInstance()");
                            d10.a();
                            vp.a.f38246a = FirebaseAnalytics.getInstance(d10.f31271a);
                        }
                    }
                }
                FirebaseAnalytics firebaseAnalytics2 = vp.a.f38246a;
                Intrinsics.c(firebaseAnalytics2);
                return firebaseAnalytics2;
            default:
                SharedPreferences sharedPreferences = this.f15298b.f15291a.getSharedPreferences("assetgro_stockgro_pref", 0);
                Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
                yk.g.j(sharedPreferences);
                return sharedPreferences;
        }
    }
}
