package com.webengage.sdk.android.actions.rules;

import android.content.Context;
import com.webengage.sdk.android.f0;
import com.webengage.sdk.android.j0;
import com.webengage.sdk.android.n;
import com.webengage.sdk.android.utils.WebEngageConstant;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class g implements f0 {

    /* renamed from: a, reason: collision with root package name */
    private static g f12458a;

    /* renamed from: b, reason: collision with root package name */
    public static final f0.a f12459b = new a();

    /* renamed from: c, reason: collision with root package name */
    private Context f12460c;

    /* loaded from: classes2.dex */
    public class a implements f0.a {
        @Override // com.webengage.sdk.android.f0.a
        public f0 a(Context context) {
            if (g.f12458a == null) {
                g unused = g.f12458a = new g(context, null);
            }
            return g.f12458a;
        }
    }

    private g(Context context) {
        this.f12460c = null;
        this.f12460c = context.getApplicationContext();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x0173. Please report as an issue. */
    public Map<String, Object> b(j0 j0Var, Object obj) {
        WebEngageConstant.c cVar;
        HashMap hashMap = new HashMap();
        if (obj instanceof n) {
            ArrayList arrayList = new ArrayList();
            n nVar = (n) obj;
            String d10 = nVar.d();
            if (d10 != null && LogSubCategory.Action.SYSTEM.equals(nVar.b())) {
                char c10 = 65535;
                switch (d10.hashCode()) {
                    case -2135424194:
                        if (d10.equals("app_personalization_view")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1972881700:
                        if (d10.equals("app_installed")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -1791094769:
                        if (d10.equals("app_personalization_click")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -1571863175:
                        if (d10.equals("notification_view")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case -1500572364:
                        if (d10.equals("notification_click")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case -1500566108:
                        if (d10.equals("notification_close")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case -1408232839:
                        if (d10.equals("push_notification_click")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case -1408226583:
                        if (d10.equals("push_notification_close")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case -1398970167:
                        if (d10.equals("notification_control_group")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case -1310224610:
                        if (d10.equals("user_update_geo_info")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case -1203939164:
                        if (d10.equals("app_personalization_control_group")) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case -1139037360:
                        if (d10.equals("push_notification_received")) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case -1038562278:
                        if (d10.equals("we_wk_screen_navigated")) {
                            c10 = '\f';
                            break;
                        }
                        break;
                    case -995801710:
                        if (d10.equals("we_wk_push_notification_rerender")) {
                            c10 = '\r';
                            break;
                        }
                        break;
                    case -876147820:
                        if (d10.equals("push_notification_view")) {
                            c10 = 14;
                            break;
                        }
                        break;
                    case -687967635:
                        if (d10.equals("we_wk_page_delay")) {
                            c10 = 15;
                            break;
                        }
                        break;
                    case -228093336:
                        if (d10.equals("app_crashed")) {
                            c10 = 16;
                            break;
                        }
                        break;
                    case -217294450:
                        if (d10.equals("user_logged_in")) {
                            c10 = 17;
                            break;
                        }
                        break;
                    case -96895043:
                        if (d10.equals("user_update")) {
                            c10 = 18;
                            break;
                        }
                        break;
                    case 170551543:
                        if (d10.equals("user_delete_attributes")) {
                            c10 = 19;
                            break;
                        }
                        break;
                    case 503961794:
                        if (d10.equals("push_notification_item_view")) {
                            c10 = 20;
                            break;
                        }
                        break;
                    case 793481382:
                        if (d10.equals("visitor_new_session")) {
                            c10 = 21;
                            break;
                        }
                        break;
                    case 1220490790:
                        if (d10.equals("app_upgraded")) {
                            c10 = 22;
                            break;
                        }
                        break;
                    case 1555512768:
                        if (d10.equals("we_wk_session_delay")) {
                            c10 = 23;
                            break;
                        }
                        break;
                    case 1853812741:
                        if (d10.equals("user_logged_out")) {
                            c10 = 24;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                    case 3:
                    case 4:
                    case 5:
                    case '\b':
                    case '\n':
                        arrayList.add(WebEngageConstant.c.PAGE_RULE);
                        break;
                    case 2:
                    case '\t':
                    case 18:
                    case 19:
                    case 21:
                        arrayList.add(WebEngageConstant.c.SESSION_RULE);
                        cVar = WebEngageConstant.c.PAGE_RULE;
                        arrayList.add(cVar);
                        hashMap.put("execution_chain", arrayList);
                        break;
                    case '\f':
                        cVar = WebEngageConstant.c.PAGE_RULE;
                        arrayList.add(cVar);
                        hashMap.put("execution_chain", arrayList);
                        break;
                    case 17:
                        arrayList.add(WebEngageConstant.c.SESSION_RULE);
                        arrayList.add(WebEngageConstant.c.PAGE_RULE);
                        break;
                }
                hashMap.put("event_state_data", nVar);
            }
            cVar = WebEngageConstant.c.EVENT_RULE;
            arrayList.add(cVar);
            hashMap.put("execution_chain", arrayList);
            hashMap.put("event_state_data", nVar);
        } else {
            hashMap.put("execution_chain", obj);
        }
        return hashMap;
    }

    public /* synthetic */ g(Context context, a aVar) {
        this(context);
    }

    @Override // com.webengage.sdk.android.f0
    public void a(j0 j0Var, Object obj) {
        Map<String, Object> b10 = b(j0Var, obj);
        if (b10.get("execution_chain") != null) {
            new f(this.f12460c).c(b10);
        }
    }
}
