package com.webengage.sdk.android.actions.database;

import android.content.Context;
import android.os.Bundle;
import com.webengage.sdk.android.f0;
import com.webengage.sdk.android.j0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class g implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile g f12264a;

    /* renamed from: b, reason: collision with root package name */
    public static final f0.a f12265b = new a();

    /* renamed from: c, reason: collision with root package name */
    private Context f12266c;

    /* loaded from: classes2.dex */
    public class a implements f0.a {
        @Override // com.webengage.sdk.android.f0.a
        public f0 a(Context context) {
            if (g.f12264a == null) {
                g unused = g.f12264a = new g(context, null);
            }
            return g.f12264a;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12267a;

        static {
            int[] iArr = new int[j0.values().length];
            f12267a = iArr;
            try {
                iArr[j0.f12599c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12267a[j0.f12598b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12267a[j0.f12604h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12267a[j0.f12605i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private g(Context context) {
        this.f12266c = null;
        this.f12266c = context.getApplicationContext();
    }

    public Map<String, Object> b(j0 j0Var, Object obj) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("action_data", obj);
        int i10 = b.f12267a[j0Var.ordinal()];
        if (i10 == 1) {
            str = "gcm";
        } else if (i10 == 2) {
            str = "event";
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    str = "change_data";
                }
                return hashMap;
            }
            str = "internal_event";
        }
        hashMap.put("action_type", str);
        return hashMap;
    }

    public /* synthetic */ g(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.f0
    public void a(j0 j0Var, Object obj) {
        h hVar;
        Object obj2;
        int i10 = b.f12267a[j0Var.ordinal()];
        if (i10 == 1) {
            Bundle bundle = (Bundle) obj;
            if (bundle == null || !bundle.containsKey("source") || !"webengage".equalsIgnoreCase(bundle.getString("source")) || !bundle.containsKey("message_data") || !bundle.containsKey("message_action")) {
                return;
            }
            hVar = new h(this.f12266c);
            obj2 = bundle;
        } else {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                return;
            }
            hVar = new h(this.f12266c);
            obj2 = obj;
        }
        hVar.c(b(j0Var, obj2));
    }
}
