package wl;

import com.facebook.FacebookException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements xk.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f39172b;

    public /* synthetic */ e(i iVar, int i10) {
        this.f39171a = i10;
        this.f39172b = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [wl.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.facebook.FacebookException, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.facebook.FacebookException, java.lang.RuntimeException] */
    @Override // xk.v
    public final void onCompleted(xk.d0 response) {
        switch (this.f39171a) {
            case 0:
                i this$0 = this.f39172b;
                int i10 = i.f39198l;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!this$0.f39203e.get()) {
                    xk.q qVar = response.f40344c;
                    if (qVar != null) {
                        int i11 = qVar.f40460c;
                        if (i11 == 1349174 || i11 == 1349172) {
                            this$0.x();
                            return;
                        }
                        if (i11 == 1349152) {
                            g gVar = this$0.f39206h;
                            if (gVar != null) {
                                ml.b bVar = ml.b.f27823a;
                                ml.b.a(gVar.f39185b);
                            }
                            q qVar2 = this$0.f39209k;
                            if (qVar2 != null) {
                                this$0.z(qVar2);
                                return;
                            } else {
                                this$0.t();
                                return;
                            }
                        }
                        if (i11 == 1349173) {
                            this$0.t();
                            return;
                        }
                        FacebookException facebookException = qVar.f40466i;
                        if (facebookException == null) {
                            facebookException = new FacebookException();
                        }
                        this$0.u(facebookException);
                        return;
                    }
                    try {
                        JSONObject jSONObject = response.f40343b;
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        String string = jSONObject.getString("access_token");
                        Intrinsics.checkNotNullExpressionValue(string, "resultObject.getString(\"access_token\")");
                        this$0.v(string, jSONObject.getLong("expires_in"), Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                        return;
                    } catch (JSONException e10) {
                        this$0.u(new RuntimeException(e10));
                        return;
                    }
                }
                return;
            default:
                int i12 = i.f39198l;
                i this$02 = this.f39172b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(response, "response");
                if (!this$02.f39207i) {
                    xk.q qVar3 = response.f40344c;
                    if (qVar3 != null) {
                        FacebookException facebookException2 = qVar3.f40466i;
                        if (facebookException2 == null) {
                            facebookException2 = new FacebookException();
                        }
                        this$02.u(facebookException2);
                        return;
                    }
                    JSONObject jSONObject2 = response.f40343b;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    ?? obj = new Object();
                    try {
                        String string2 = jSONObject2.getString("user_code");
                        obj.f39185b = string2;
                        String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string2}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                        obj.f39184a = format;
                        obj.f39186c = jSONObject2.getString("code");
                        obj.f39187d = jSONObject2.getLong("interval");
                        this$02.y(obj);
                        return;
                    } catch (JSONException e11) {
                        this$02.u(new RuntimeException(e11));
                        return;
                    }
                }
                return;
        }
    }
}
