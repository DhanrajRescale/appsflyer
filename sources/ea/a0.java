package ea;

import com.webengage.sdk.android.Analytics;
import com.webengage.sdk.android.WebEngage;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a0 implements xs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15109a;

    /* renamed from: b, reason: collision with root package name */
    public final w f15110b;

    public /* synthetic */ a0(w wVar, int i10) {
        this.f15109a = i10;
        this.f15110b = wVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [mj.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [mj.b, java.lang.Object] */
    @Override // javax.inject.Provider
    public final Object get() {
        int i10 = this.f15109a;
        w wVar = this.f15110b;
        switch (i10) {
            case 0:
                wVar.getClass();
                ?? obj = new Object();
                ?? obj2 = new Object();
                new HashMap();
                new ConcurrentHashMap();
                try {
                    obj2.f27810a = 1200L;
                    obj2.b();
                } catch (Exception unused) {
                }
                obj.f27809a = obj2;
                return obj;
            default:
                wVar.getClass();
                Analytics analytics = WebEngage.get().analytics();
                Intrinsics.checkNotNullExpressionValue(analytics, "analytics(...)");
                yk.g.j(analytics);
                return analytics;
        }
    }
}
