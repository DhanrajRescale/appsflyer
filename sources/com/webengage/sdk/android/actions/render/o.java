package com.webengage.sdk.android.actions.render;

import android.content.Context;
import android.os.Bundle;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.actions.database.DataHolder;
import com.webengage.sdk.android.f0;
import com.webengage.sdk.android.j0;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class o implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private static o f12414a;

    /* renamed from: b, reason: collision with root package name */
    public static final f0.a f12415b = new a();

    /* renamed from: c, reason: collision with root package name */
    private Context f12416c;

    /* loaded from: classes2.dex */
    public class a implements f0.a {
        @Override // com.webengage.sdk.android.f0.a
        public f0 a(Context context) {
            if (o.f12414a == null) {
                o unused = o.f12414a = new o(context, null);
            }
            return o.f12414a;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12417a;

        static {
            int[] iArr = new int[j0.values().length];
            f12417a = iArr;
            try {
                iArr[j0.f12599c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12417a[j0.f12606j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12417a[j0.f12598b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12417a[j0.f12604h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private o(Context context) {
        this.f12416c = null;
        this.f12416c = context.getApplicationContext();
    }

    public Map<String, Object> b(j0 j0Var, Object obj) {
        HashMap hashMap = new HashMap();
        int i10 = b.f12417a[j0Var.ordinal()];
        if (i10 == 1) {
            hashMap.put("first_time", Boolean.TRUE);
            hashMap.put("current", 0);
            hashMap.put("navigation", "right");
        } else if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                obj = (com.webengage.sdk.android.n) obj;
                hashMap.put("first_time", Boolean.FALSE);
            }
            return hashMap;
        }
        hashMap.put("action_data", obj);
        return hashMap;
    }

    public /* synthetic */ o(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.f0
    public void a(j0 j0Var, Object obj) {
        String string;
        int i10 = b.f12417a[j0Var.ordinal()];
        if (i10 == 1) {
            Bundle bundle = (Bundle) obj;
            if (bundle != null && bundle.containsKey("source") && "webengage".equalsIgnoreCase(bundle.getString("source")) && (string = bundle.getString("message_action")) != null && string.equalsIgnoreCase("show_system_tray_notification") && bundle.containsKey("message_data")) {
                try {
                    String string2 = bundle.getString("message_data");
                    Logger.d("WebEngage", " Push Payload: " + string2);
                    new i(this.f12416c).c(b(j0Var, new JSONObject(string2).getString("identifier")));
                    return;
                } catch (JSONException e10) {
                    WebEngage.startService(com.webengage.sdk.android.q.a(j0.f12603g, e10, this.f12416c), this.f12416c);
                    return;
                }
            }
            return;
        }
        if (i10 != 2) {
            if ((i10 == 3 || i10 == 4) && (obj instanceof com.webengage.sdk.android.n) && "we_wk_push_notification_rerender".equals(((com.webengage.sdk.android.n) obj).d())) {
                new i(this.f12416c).c(b(j0Var, obj));
                return;
            }
            return;
        }
        List<String> list = (List) obj;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            if (DataHolder.get().a(WebEngageConstant.a.NOTIFICATION) && DataHolder.get().E() && DataHolder.get().a(false, true)) {
                new f(this.f12416c).c(b(j0Var, str));
            }
        }
    }
}
