package com.webengage.sdk.android.z0.b;

import android.content.Context;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.f0;
import com.webengage.sdk.android.j0;
import com.webengage.sdk.android.n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class b implements f0 {

    /* renamed from: a, reason: collision with root package name */
    static AtomicBoolean f13025a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private static b f13026b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final f0.a f13027c = new a();

    /* renamed from: d, reason: collision with root package name */
    private Context f13028d;

    /* loaded from: classes2.dex */
    public class a implements f0.a {
        @Override // com.webengage.sdk.android.f0.a
        public f0 a(Context context) {
            if (b.f13026b == null) {
                b unused = b.f13026b = new b(context, null);
            }
            return b.f13026b;
        }
    }

    private b(Context context) {
        this.f13028d = null;
        this.f13028d = context.getApplicationContext();
    }

    public Map<String, Object> b(j0 j0Var, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("action_data", obj);
        return hashMap;
    }

    public /* synthetic */ b(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.f0
    public void a(j0 j0Var, Object obj) {
        if (WebEngage.get().getWebEngageConfig().getAutoGCMRegistrationFlag()) {
            n nVar = (n) obj;
            com.webengage.sdk.android.z0.b.a aVar = new com.webengage.sdk.android.z0.b.a(this.f13028d);
            if (j0Var != null) {
                if (!j0.f12597a.equals(j0Var)) {
                    if (!j0.f12598b.equals(j0Var) || nVar == null) {
                        return;
                    }
                    if (!"app_upgraded".equals(nVar.d()) && !"visitor_new_session".equals(nVar.d())) {
                        return;
                    }
                }
                if (f13025a.compareAndSet(false, true)) {
                    aVar.b(b(j0Var, obj));
                }
            }
        }
    }
}
