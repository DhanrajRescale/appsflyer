package com.webengage.sdk.android.actions.database;

import android.content.Context;
import com.webengage.sdk.android.actions.render.CarouselV1CallToAction;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.utils.WebEngageConstant;
import com.webengage.sdk.android.utils.WebEngageUtils;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class h extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f12268c;

    /* renamed from: d, reason: collision with root package name */
    private Object f12269d;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12270a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12271b;

        static {
            int[] iArr = new int[WebEngageConstant.a.values().length];
            f12271b = iArr;
            try {
                iArr[WebEngageConstant.a.PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12271b[WebEngageConstant.a.NOTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[WebEngageConstant.STYLE.values().length];
            f12270a = iArr2;
            try {
                iArr2[WebEngageConstant.STYLE.BIG_PICTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12270a[WebEngageConstant.STYLE.CAROUSEL_V1.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12270a[WebEngageConstant.STYLE.RATING_V1.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public h(Context context) {
        super(context);
        this.f12268c = null;
        this.f12269d = null;
        this.f12268c = context.getApplicationContext();
    }

    private void a(com.webengage.sdk.android.n nVar) {
        Map<String, Object> f10 = DataHolder.get().f();
        Map<String, Object> c10 = nVar.c();
        HashMap hashMap = new HashMap();
        if (f10 != null) {
            hashMap.putAll(f10);
        }
        if (c10 != null) {
            hashMap.putAll(c10);
        }
        nVar.a(hashMap);
    }

    private void b(com.webengage.sdk.android.n nVar) {
        Map<String, Object> c10 = nVar.c();
        Map<String, Object> l10 = nVar.l();
        HashMap hashMap = new HashMap();
        if (l10 != null) {
            l10.put("event_time", nVar.e());
            hashMap.put("we_wk_sys", l10);
        }
        if (c10 != null) {
            hashMap.putAll(c10);
        }
        String b10 = nVar.b();
        String d10 = nVar.d();
        if (LogSubCategory.Action.SYSTEM.equals(b10) && !d10.startsWith("we_")) {
            d10 = "we_".concat(d10);
        }
        DataHolder.get().c(d10, hashMap);
        Map<String, List<Object>> A = DataHolder.get().A();
        if (A != null) {
            Iterator<Map.Entry<String, List<Object>>> it = A.entrySet().iterator();
            while (it.hasNext()) {
                List<Object> value = it.next().getValue();
                if (value != null) {
                    Iterator<Object> it2 = value.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        List<Object> list = (List) it2.next();
                        if (list != null && list.size() != 0 && a(nVar, list)) {
                            DataHolder.get().d(d10, hashMap);
                            break;
                        }
                    }
                }
            }
        }
    }

    private void i(String str) {
        PushNotificationData pushNotificationData;
        HashSet hashSet;
        try {
            pushNotificationData = new PushNotificationData(new JSONObject(c(str)), this.f12268c);
        } catch (JSONException unused) {
            pushNotificationData = null;
        }
        if (pushNotificationData == null || !pushNotificationData.isBigNotification() || pushNotificationData.getStyle() == null) {
            return;
        }
        int i10 = a.f12270a[pushNotificationData.getStyle().ordinal()];
        if (i10 == 2) {
            hashSet = new HashSet();
            List<CarouselV1CallToAction> callToActions = pushNotificationData.getCarouselV1Data().getCallToActions();
            if (callToActions != null) {
                Iterator<CarouselV1CallToAction> it = callToActions.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().getImageURL());
                }
            }
            if (hashSet.size() <= 0) {
                return;
            }
        } else {
            if (i10 != 3) {
                return;
            }
            hashSet = new HashSet();
            if (pushNotificationData.getRatingV1().getImageUrl() != null) {
                hashSet.add(pushNotificationData.getRatingV1().getImageUrl());
            }
            if (pushNotificationData.getRatingV1().getIconUrl() != null) {
                hashSet.add(pushNotificationData.getRatingV1().getIconUrl());
            }
            if (hashSet.size() <= 0) {
                return;
            }
        }
        com.webengage.sdk.android.utils.l.b.b(this.f12268c).a(hashSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x05db, code lost:
    
        if (r2 != false) goto L109;
     */
    @Override // com.webengage.sdk.android.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 2161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.database.h.d(java.lang.Object):java.lang.Object");
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
    }

    private void a(com.webengage.sdk.android.n nVar, w wVar, boolean z10) {
        Map<String, Object> l10 = nVar.l();
        if (l10 == null) {
            l10 = new HashMap<>();
        }
        nVar.c(wVar.a(l10, z10));
    }

    @Override // com.webengage.sdk.android.a
    public Object d(Map<String, Object> map) {
        return map;
    }

    private void a(com.webengage.sdk.android.n nVar, WebEngageConstant.a aVar) {
        Map<String, Object> l10;
        String str;
        if (aVar == null || a.f12271b[aVar.ordinal()] != 1 || (l10 = nVar.l()) == null || (str = (String) l10.get("id")) == null) {
            return;
        }
        try {
            PushNotificationData pushNotificationData = new PushNotificationData(new JSONObject(c(str)), this.f12268c);
            if (pushNotificationData.getCustomData() != null) {
                HashMap hashMap = new HashMap();
                Map<String, Object> c10 = nVar.c();
                if (c10 != null) {
                    hashMap.putAll(c10);
                }
                hashMap.putAll(WebEngageUtils.a(pushNotificationData.getCustomData()));
                nVar.a(hashMap);
            }
        } catch (Exception unused) {
        }
    }

    private boolean a(com.webengage.sdk.android.n nVar, List<Object> list) {
        String str;
        if (nVar != null && list != null && list.size() > 2 && "event".equals(list.get(0).toString()) && nVar.d().equals(list.get(2)) && (str = (String) list.get(1)) != null) {
            if ("custom".equals(str)) {
                return "application".equals(nVar.b());
            }
            if (LogSubCategory.Action.SYSTEM.equals(str)) {
                return LogSubCategory.Action.SYSTEM.equals(nVar.b());
            }
        }
        return false;
    }
}
