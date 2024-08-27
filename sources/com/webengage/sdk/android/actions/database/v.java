package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.f0;
import com.webengage.sdk.android.j0;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class v implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private static v f12304a;

    /* renamed from: b, reason: collision with root package name */
    public static final f0.a f12305b = new a();

    /* renamed from: c, reason: collision with root package name */
    private Context f12306c;

    /* loaded from: classes2.dex */
    public class a implements f0.a {
        @Override // com.webengage.sdk.android.f0.a
        public f0 a(Context context) {
            if (v.f12304a == null) {
                v unused = v.f12304a = new v(context, null);
            }
            return v.f12304a;
        }
    }

    private v(Context context) {
        this.f12306c = null;
        this.f12306c = context.getApplicationContext();
    }

    public Map<String, Object> b(j0 j0Var, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("server_url", WebEngageConstant.d.UPLOAD_EVENTS_URL.toString());
        hashMap.put("action_data", obj);
        return hashMap;
    }

    public /* synthetic */ v(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.f0
    public void a(j0 j0Var, Object obj) {
        new u(this.f12306c).c(b(j0Var, obj));
    }
}
