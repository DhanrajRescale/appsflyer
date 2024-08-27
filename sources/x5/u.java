package x5;

import android.content.Context;
import android.view.Surface;
import b5.s0;
import com.facebook.FacebookSdk;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import e5.x;
import i5.d0;
import i5.g0;
import in.juspay.services.HyperServices;
import kotlin.jvm.internal.Intrinsics;
import nl.a0;
import nl.y;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40062a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f40063b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f40064c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f40065d;

    public /* synthetic */ u(Context context, String str, long j10) {
        this.f40063b = j10;
        this.f40064c = str;
        this.f40065d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Long l10;
        int i10;
        gl.l lVar;
        switch (this.f40062a) {
            case 0:
                w wVar = (w) ((e) this.f40064c).f39981b;
                int i11 = x.f15050a;
                g0 g0Var = ((d0) wVar).f19384a;
                j5.w wVar2 = (j5.w) g0Var.f19472r;
                j5.b U = wVar2.U();
                long j10 = this.f40063b;
                Object obj = this.f40065d;
                wVar2.V(U, 26, new j5.l(U, j10, obj));
                if (g0Var.P == obj) {
                    g0Var.f19466l.l(26, new s0(21));
                    return;
                }
                return;
            case 1:
                long j11 = this.f40063b;
                String activityName = (String) this.f40064c;
                Context appContext = (Context) this.f40065d;
                String str = gl.b.f17450a;
                Intrinsics.checkNotNullParameter(activityName, "$activityName");
                gl.l lVar2 = gl.b.f17455f;
                if (lVar2 == null) {
                    l10 = null;
                } else {
                    l10 = lVar2.f17479b;
                }
                if (gl.b.f17455f == null) {
                    gl.b.f17455f = new gl.l(Long.valueOf(j11), null);
                    String str2 = gl.b.f17457h;
                    Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                    gl.m.b(activityName, str2, appContext);
                } else if (l10 != null) {
                    long longValue = j11 - l10.longValue();
                    a0 a0Var = a0.f28827a;
                    y b10 = a0.b(FacebookSdk.getApplicationId());
                    if (b10 == null) {
                        i10 = 60;
                    } else {
                        i10 = b10.f28967b;
                    }
                    if (longValue > i10 * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT) {
                        gl.m.d(activityName, gl.b.f17455f, gl.b.f17457h);
                        String str3 = gl.b.f17457h;
                        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                        gl.m.b(activityName, str3, appContext);
                        gl.b.f17455f = new gl.l(Long.valueOf(j11), null);
                    } else if (longValue > 1000 && (lVar = gl.b.f17455f) != null) {
                        lVar.f17481d++;
                    }
                }
                gl.l lVar3 = gl.b.f17455f;
                if (lVar3 != null) {
                    lVar3.f17479b = Long.valueOf(j11);
                }
                gl.l lVar4 = gl.b.f17455f;
                if (lVar4 != null) {
                    lVar4.a();
                    return;
                }
                return;
            default:
                ((HyperServices) this.f40064c).lambda$doProcess$6(this.f40063b, (JSONObject) this.f40065d);
                return;
        }
    }

    public /* synthetic */ u(HyperServices hyperServices, long j10, JSONObject jSONObject) {
        this.f40064c = hyperServices;
        this.f40063b = j10;
        this.f40065d = jSONObject;
    }

    public /* synthetic */ u(e eVar, Surface surface, long j10) {
        this.f40064c = eVar;
        this.f40065d = surface;
        this.f40063b = j10;
    }
}
