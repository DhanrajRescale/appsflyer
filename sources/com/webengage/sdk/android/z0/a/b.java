package com.webengage.sdk.android.z0.a;

import android.content.Context;
import com.webengage.sdk.android.f0;
import com.webengage.sdk.android.j0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class b implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f13021a;

    /* renamed from: b, reason: collision with root package name */
    public static final f0.a f13022b = new a();

    /* renamed from: c, reason: collision with root package name */
    private Context f13023c;

    /* loaded from: classes2.dex */
    public class a implements f0.a {
        @Override // com.webengage.sdk.android.f0.a
        public f0 a(Context context) {
            if (b.f13021a == null) {
                b unused = b.f13021a = new b(context, null);
            }
            return b.f13021a;
        }
    }

    private b(Context context) {
        this.f13023c = null;
        this.f13023c = context.getApplicationContext();
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
        if (obj == null) {
            return;
        }
        new com.webengage.sdk.android.z0.a.a(this.f13023c).c(b(j0Var, obj));
    }
}
