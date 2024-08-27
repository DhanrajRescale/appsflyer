package com.webengage.sdk.android.actions.render;

import android.content.Context;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.j0;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
class i extends com.webengage.sdk.android.a {

    /* renamed from: c, reason: collision with root package name */
    private final Context f12345c;

    /* renamed from: d, reason: collision with root package name */
    private PushNotificationData f12346d;

    /* renamed from: e, reason: collision with root package name */
    private String f12347e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12348f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12349g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f12350h;

    /* renamed from: i, reason: collision with root package name */
    private Map<String, Object> f12351i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, Object> f12352j;

    public i(Context context) {
        super(context);
        this.f12346d = null;
        this.f12347e = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f12348f = true;
        this.f12349g = false;
        this.f12350h = null;
        this.f12351i = null;
        this.f12352j = null;
        this.f12345c = context.getApplicationContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        if (r4 != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.webengage.sdk.android.callbacks.CustomPushRender] */
    @Override // com.webengage.sdk.android.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.lang.Object r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L71
            com.webengage.sdk.android.actions.render.PushNotificationData r4 = r3.f12346d
            boolean r4 = r4.isCustomRender()
            boolean r0 = r3.f12348f
            java.lang.String r1 = "WebEngage"
            if (r0 == 0) goto L3c
            android.content.Context r0 = r3.f12345c
            com.webengage.sdk.android.i r0 = r3.a(r0)
            if (r4 == 0) goto L1d
            boolean r4 = r0.a()
            if (r4 == 0) goto L1d
            goto L27
        L1d:
            com.webengage.sdk.android.actions.render.PushNotificationData r4 = r3.f12346d
            com.webengage.sdk.android.utils.WebEngageConstant$STYLE r4 = r4.getStyle()
            com.webengage.sdk.android.callbacks.CustomPushRender r0 = com.webengage.sdk.android.actions.render.l.a(r4)
        L27:
            if (r0 == 0) goto L36
            android.content.Context r4 = r3.f12345c
            com.webengage.sdk.android.actions.render.PushNotificationData r1 = r3.f12346d
            boolean r4 = r0.onRender(r4, r1)
        L31:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L36:
            java.lang.String r4 = "CustomPushRender is null"
        L38:
            com.webengage.sdk.android.Logger.e(r1, r4)
            goto L71
        L3c:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r3.f12352j
            android.os.Bundle r4 = com.webengage.sdk.android.utils.WebEngageUtils.c(r4)
            r0 = 0
            if (r4 == 0) goto L4e
            java.lang.String r2 = "we_wk_render"
            boolean r2 = r4.getBoolean(r2, r0)
            if (r2 == 0) goto L4e
            r0 = 1
        L4e:
            r3.f12349g = r0
            if (r0 == 0) goto L5d
            com.webengage.sdk.android.actions.render.PushNotificationData r0 = r3.f12346d
            com.webengage.sdk.android.utils.WebEngageConstant$STYLE r0 = r0.getStyle()
            com.webengage.sdk.android.callbacks.CustomPushRerender r0 = com.webengage.sdk.android.actions.render.l.b(r0)
            goto L63
        L5d:
            android.content.Context r0 = r3.f12345c
            com.webengage.sdk.android.i r0 = r3.a(r0)
        L63:
            if (r0 == 0) goto L6e
            android.content.Context r1 = r3.f12345c
            com.webengage.sdk.android.actions.render.PushNotificationData r2 = r3.f12346d
            boolean r4 = r0.onRerender(r1, r2, r4)
            goto L31
        L6e:
            java.lang.String r4 = "CustomPushRerender is null"
            goto L38
        L71:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.render.i.d(java.lang.Object):java.lang.Object");
    }

    @Override // com.webengage.sdk.android.a
    public void e(Object obj) {
        j0 j0Var;
        com.webengage.sdk.android.n b10;
        if (obj != null) {
            if (!((Boolean) obj).booleanValue()) {
                Logger.e("WebEngage", "Push notification is not rendered.");
                return;
            }
            if (this.f12348f) {
                a(com.webengage.sdk.android.l.b("push_notification_view", this.f12350h, this.f12351i, null, this.f12345c));
                a(this.f12345c).onPushNotificationShown(this.f12345c, this.f12346d);
                return;
            }
            if (this.f12346d.getStyle() == WebEngageConstant.STYLE.CAROUSEL_V1 && this.f12346d.getCarouselV1Data() != null) {
                List<CarouselV1CallToAction> callToActions = this.f12346d.getCarouselV1Data().getCallToActions();
                int currentIndex = this.f12346d.getCurrentIndex();
                Map<String, Object> map = this.f12352j;
                int intValue = (map == null || !map.containsKey("current") || this.f12352j.get("current") == null) ? 0 : ((Integer) this.f12352j.get("current")).intValue();
                Map<String, Object> map2 = this.f12352j;
                String str = (map2 == null || !map2.containsKey("navigation") || this.f12352j.get("navigation") == null) ? "right" : (String) this.f12352j.get("navigation");
                this.f12350h.put("call_to_action", callToActions.get(currentIndex).getId());
                this.f12350h.put("navigated_from", callToActions.get(intValue).getId());
                this.f12350h.put("navigation", str);
                Map<String, Object> map3 = this.f12352j;
                if (map3 != null) {
                    this.f12351i.putAll(map3);
                }
                j0Var = j0.f12598b;
                b10 = com.webengage.sdk.android.l.b("push_notification_item_view", this.f12350h, this.f12351i, null, this.f12345c);
            } else {
                if (this.f12346d.getStyle() == WebEngageConstant.STYLE.RATING_V1 || this.f12349g) {
                    return;
                }
                Map<String, Object> map4 = this.f12352j;
                if (map4 != null) {
                    this.f12351i.putAll(map4);
                }
                j0Var = j0.f12598b;
                b10 = com.webengage.sdk.android.l.b("push_notification_rerender", this.f12350h, this.f12351i, this.f12352j, this.f12345c);
            }
            WebEngage.startService(com.webengage.sdk.android.q.a(j0Var, b10, this.f12345c), this.f12345c, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    @Override // com.webengage.sdk.android.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(java.util.Map<java.lang.String, java.lang.Object> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "first_time"
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4.f12348f = r0
            java.lang.String r1 = "id"
            java.lang.String r2 = "action_data"
            java.lang.Object r5 = r5.get(r2)
            if (r0 != 0) goto L34
            com.webengage.sdk.android.n r5 = (com.webengage.sdk.android.n) r5
            java.util.Map r0 = r5.l()
            r4.f12350h = r0
            java.util.Map r0 = r5.c()
            r4.f12351i = r0
            java.util.Map r5 = r5.f()
            r4.f12352j = r5
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.f12350h
            if (r5 == 0) goto L38
            java.lang.Object r5 = r5.get(r1)
        L34:
            java.lang.String r5 = (java.lang.String) r5
            r4.f12347e = r5
        L38:
            java.lang.String r5 = r4.f12347e
            java.lang.String r5 = r4.c(r5)
            r0 = 0
            com.webengage.sdk.android.actions.render.PushNotificationData r2 = new com.webengage.sdk.android.actions.render.PushNotificationData     // Catch: java.lang.Exception -> Lda
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lda
            r3.<init>(r5)     // Catch: java.lang.Exception -> Lda
            android.content.Context r5 = r4.f12345c     // Catch: java.lang.Exception -> Lda
            r2.<init>(r3, r5)     // Catch: java.lang.Exception -> Lda
            r4.f12346d = r2     // Catch: java.lang.Exception -> Lda
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.f12351i
            if (r5 != 0) goto L58
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4.f12351i = r5
        L58:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.f12351i
            com.webengage.sdk.android.actions.render.PushNotificationData r2 = r4.f12346d
            boolean r2 = r2.isAmplified()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r3 = "amplified"
            r5.put(r3, r2)
            boolean r5 = r4.f12348f
            if (r5 == 0) goto Ld7
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4.f12350h = r5
            com.webengage.sdk.android.actions.render.PushNotificationData r2 = r4.f12346d
            java.lang.String r2 = r2.getExperimentId()
            java.lang.String r3 = "experiment_id"
            r5.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.f12350h
            com.webengage.sdk.android.actions.render.PushNotificationData r2 = r4.f12346d
            java.lang.String r2 = r2.getVariationId()
            r5.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.f12350h
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f12351i
            android.content.Context r2 = r4.f12345c
            java.lang.String r3 = "push_notification_received"
            com.webengage.sdk.android.n r5 = com.webengage.sdk.android.l.b(r3, r5, r1, r0, r2)
            r4.a(r5)
            com.webengage.sdk.android.actions.database.DataHolder r5 = com.webengage.sdk.android.actions.database.DataHolder.get()
            com.webengage.sdk.android.utils.WebEngageConstant$a r1 = com.webengage.sdk.android.utils.WebEngageConstant.a.PUSH
            boolean r5 = r5.a(r1)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto Lb5
            java.lang.String r5 = "WebEngage"
            java.lang.String r1 = "Push-opt-in is false, hence not rendering."
            com.webengage.sdk.android.Logger.e(r5, r1)
            return r0
        Lb5:
            com.webengage.sdk.android.actions.render.PushNotificationData r5 = r4.f12346d
            if (r5 == 0) goto Ld6
            android.content.Context r5 = r4.f12345c
            com.webengage.sdk.android.i r5 = r4.a(r5)
            android.content.Context r1 = r4.f12345c
            com.webengage.sdk.android.actions.render.PushNotificationData r2 = r4.f12346d
            com.webengage.sdk.android.actions.render.PushNotificationData r5 = r5.onPushNotificationReceived(r1, r2)
            if (r5 == 0) goto Lcb
            r4.f12346d = r5
        Lcb:
            com.webengage.sdk.android.actions.render.PushNotificationData r5 = r4.f12346d
            boolean r5 = r5.shouldRender()
            if (r5 == 0) goto Ld6
            com.webengage.sdk.android.actions.render.PushNotificationData r5 = r4.f12346d
            return r5
        Ld6:
            return r0
        Ld7:
            com.webengage.sdk.android.actions.render.PushNotificationData r5 = r4.f12346d
            return r5
        Lda:
            r5 = move-exception
            r4.b(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.render.i.d(java.util.Map):java.lang.Object");
    }
}
