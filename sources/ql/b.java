package ql;

import bl.j;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import xk.d0;
import xk.v;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32087a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f32088b;

    public /* synthetic */ b(int i10, List list) {
        this.f32087a = i10;
        this.f32088b = list;
    }

    @Override // xk.v
    public final void onCompleted(d0 response) {
        int i10 = this.f32087a;
        Boolean bool = null;
        List validReports = this.f32088b;
        switch (i10) {
            case 0:
                if (!sl.a.b(c.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(validReports, "$validReports");
                        Intrinsics.checkNotNullParameter(response, "response");
                        try {
                            if (response.f40344c == null) {
                                JSONObject jSONObject = response.f40345d;
                                if (jSONObject != null) {
                                    bool = Boolean.valueOf(jSONObject.getBoolean("success"));
                                }
                                if (Intrinsics.a(bool, Boolean.TRUE)) {
                                    Iterator it = validReports.iterator();
                                    while (it.hasNext()) {
                                        j.w(((pl.c) it.next()).f31158a);
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (JSONException unused) {
                            return;
                        }
                    } catch (Throwable th2) {
                        sl.a.a(c.class, th2);
                        return;
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(validReports, "$validReports");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    if (response.f40344c == null) {
                        JSONObject jSONObject2 = response.f40345d;
                        if (jSONObject2 != null) {
                            bool = Boolean.valueOf(jSONObject2.getBoolean("success"));
                        }
                        if (Intrinsics.a(bool, Boolean.TRUE)) {
                            Iterator it2 = validReports.iterator();
                            while (it2.hasNext()) {
                                j.w(((pl.c) it2.next()).f31158a);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (JSONException unused2) {
                    return;
                }
        }
    }
}
