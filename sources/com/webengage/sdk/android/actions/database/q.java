package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.f0;
import com.webengage.sdk.android.j0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class q implements f0 {

    /* renamed from: a, reason: collision with root package name */
    protected static t f12287a;

    /* renamed from: b, reason: collision with root package name */
    private static q f12288b;

    /* renamed from: c, reason: collision with root package name */
    public static final f0.a f12289c = new a();

    /* renamed from: d, reason: collision with root package name */
    private Context f12290d;

    /* loaded from: classes2.dex */
    public class a implements f0.a {
        @Override // com.webengage.sdk.android.f0.a
        public f0 a(Context context) {
            if (q.f12288b == null) {
                q unused = q.f12288b = new q(context, null);
            }
            return q.f12288b;
        }
    }

    private q(Context context) {
        this.f12290d = null;
        this.f12290d = context.getApplicationContext();
        if (f12287a == null) {
            f12287a = new t(new r(), this.f12290d);
        }
    }

    public Map<String, Object> b(j0 j0Var, Object obj) {
        s c10;
        HashMap hashMap = new HashMap();
        if (obj != null) {
            hashMap.put("action_data", obj);
            c10 = f12287a.b((com.webengage.sdk.android.n) obj);
        } else {
            hashMap.put("action_data", null);
            c10 = f12287a.c();
        }
        hashMap.put("strategy", c10);
        return hashMap;
    }

    public /* synthetic */ q(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.f0
    public void a(j0 j0Var, Object obj) {
        if (obj == null || a(obj)) {
            new p(this.f12290d).c(b(j0Var, obj));
        }
    }

    public boolean a(Object obj) {
        if (obj instanceof com.webengage.sdk.android.n) {
            return (WebEngage.get().getWebEngageConfig().getFilterCustomEvents() && "application".equals(((com.webengage.sdk.android.n) obj).b())) ? false : true;
        }
        return false;
    }
}
