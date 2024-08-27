package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.f0;
import com.webengage.sdk.android.j0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class l implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private static l f12278a;

    /* renamed from: b, reason: collision with root package name */
    public static final f0.a f12279b = new a();

    /* renamed from: c, reason: collision with root package name */
    private Context f12280c;

    /* loaded from: classes2.dex */
    public class a implements f0.a {
        @Override // com.webengage.sdk.android.f0.a
        public f0 a(Context context) {
            if (l.f12278a == null) {
                l unused = l.f12278a = new l(context, null);
            }
            return l.f12278a;
        }
    }

    private l(Context context) {
        this.f12280c = null;
        this.f12280c = context.getApplicationContext();
    }

    public Map<String, Object> b(j0 j0Var, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("topic", j0Var);
        hashMap.put("data", obj);
        return hashMap;
    }

    public /* synthetic */ l(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.f0
    public void a(j0 j0Var, Object obj) {
        new k(this.f12280c).c(b(j0Var, obj));
    }
}
