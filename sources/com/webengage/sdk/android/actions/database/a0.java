package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.f0;
import com.webengage.sdk.android.j0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class a0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private static a0 f12240a;

    /* renamed from: b, reason: collision with root package name */
    public static final f0.a f12241b = new a();

    /* renamed from: c, reason: collision with root package name */
    private Context f12242c;

    /* loaded from: classes2.dex */
    public class a implements f0.a {
        @Override // com.webengage.sdk.android.f0.a
        public f0 a(Context context) {
            if (a0.f12240a == null) {
                a0 unused = a0.f12240a = new a0(context, null);
            }
            return a0.f12240a;
        }
    }

    private a0(Context context) {
        this.f12242c = null;
        this.f12242c = context.getApplicationContext();
    }

    public Map<String, Object> b(j0 j0Var, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("topic", j0Var);
        hashMap.put("data", obj);
        return hashMap;
    }

    public /* synthetic */ a0(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.f0
    public void a(j0 j0Var, Object obj) {
        new z(this.f12242c).c(b(j0Var, obj));
    }
}
