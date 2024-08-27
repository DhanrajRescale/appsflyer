package com.webengage.sdk.android.actions.render;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.actions.exception.ImageLoadException;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;
import com.webengage.sdk.android.utils.l.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class m extends k implements CustomPushRender, CustomPushRerender {

    /* renamed from: k, reason: collision with root package name */
    private Long f12384k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f12385l = 0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12386m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12387n = false;

    private RemoteViews j() {
        RemoteViews g10 = g();
        if (this.f12387n) {
            int i10 = R.id.custom_title;
            g10.setBoolean(i10, "setSingleLine", false);
            int i11 = R.id.custom_title_native;
            g10.setBoolean(i11, "setSingleLine", false);
            g10.setInt(i10, "setMaxLines", 2);
            g10.setInt(i11, "setMaxLines", 2);
            g10.setInt(R.id.custom_message, "setMaxLines", 2);
            g10.setInt(R.id.custom_message_native, "setMaxLines", 2);
        }
        int i12 = R.id.custom_base_container;
        g10.setViewVisibility(i12, 0);
        g10.setOnClickPendingIntent(i12, null);
        PushNotificationData.RatingV1 ratingV1 = this.f12374b.getRatingV1();
        g10.setOnClickPendingIntent(R.id.custom_head_container, null);
        if (ratingV1 != null) {
            g10.setTextViewText(R.id.custom_title, new WEHtmlParserInterface().fromHtml(ratingV1.getBigContentTitle()));
            g10.setTextViewText(R.id.custom_message, new WEHtmlParserInterface().fromHtml(ratingV1.getMessage()));
            g10.setTextViewText(R.id.custom_title_native, new WEHtmlParserInterface().fromHtml(ratingV1.getBigContentTitle()));
            g10.setTextViewText(R.id.custom_message_native, new WEHtmlParserInterface().fromHtml(ratingV1.getMessage()));
            if (TextUtils.isEmpty(ratingV1.getSummary())) {
                g10.setViewVisibility(R.id.custom_summary_native, 8);
                g10.setViewVisibility(R.id.custom_summary, 8);
            } else {
                g10.setTextViewText(R.id.custom_summary, new WEHtmlParserInterface().fromHtml(ratingV1.getSummary()));
                g10.setTextViewText(R.id.custom_summary_native, new WEHtmlParserInterface().fromHtml(ratingV1.getSummary()));
            }
            g10.setInt(R.id.custom_container, "setBackgroundColor", this.f12374b.getBackgroundColor());
        }
        return g10;
    }

    private void k() {
        this.f12379g.setViewVisibility(R.id.app_name, 8);
        this.f12379g.setViewVisibility(R.id.custom_summary, 8);
        this.f12379g.setViewVisibility(R.id.custom_notification_time, 8);
        this.f12379g.setViewVisibility(R.id.custom_title, 8);
        this.f12379g.setViewVisibility(R.id.custom_message, 8);
        this.f12379g.setViewVisibility(R.id.rating_v1_submit, 8);
    }

    private void l() {
        this.f12379g.setViewVisibility(R.id.app_name_native, 8);
        this.f12379g.setViewVisibility(R.id.custom_summary_native, 8);
        this.f12379g.setViewVisibility(R.id.custom_notification_time_native, 8);
        this.f12379g.setViewVisibility(R.id.custom_title_native, 8);
        this.f12379g.setViewVisibility(R.id.custom_message_native, 8);
        this.f12379g.setViewVisibility(R.id.rating_v1_submit_native, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0226, code lost:
    
        if (r3 <= r12.f12385l.intValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0228, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02c9, code lost:
    
        r2.setImageViewBitmap(r8, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x022b, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x023c, code lost:
    
        if (r3 <= r12.f12385l.intValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024d, code lost:
    
        if (r3 <= r12.f12385l.intValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x025e, code lost:
    
        if (r3 <= r12.f12385l.intValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x026f, code lost:
    
        if (r3 <= r12.f12385l.intValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0280, code lost:
    
        if (r3 <= r12.f12385l.intValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0291, code lost:
    
        if (r3 <= r12.f12385l.intValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02a2, code lost:
    
        if (r3 <= r12.f12385l.intValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02b3, code lost:
    
        if (r3 <= r12.f12385l.intValue()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02c5, code lost:
    
        if (r3 <= r12.f12385l.intValue()) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x0213. Please report as an issue. */
    @Override // com.webengage.sdk.android.actions.render.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.render.m.d():void");
    }

    @Override // com.webengage.sdk.android.actions.render.k
    public void f() {
        HashMap hashMap = new HashMap();
        hashMap.put("accept", "image/webp");
        if (this.f12374b.getRatingV1() != null) {
            if (this.f12374b.getRatingV1().getImageUrl() != null) {
                com.webengage.sdk.android.utils.l.g a10 = a(new f.b(this.f12374b.getRatingV1().getImageUrl(), com.webengage.sdk.android.utils.l.e.GET, this.f12373a).a(6).a("landscape").a((Map<String, String>) hashMap).b(1).a());
                if (a10.n()) {
                    a10.b();
                } else {
                    StringBuilder sb2 = new StringBuilder("Exception: ");
                    sb2.append(a10.f());
                    sb2.append("\nURL: ");
                    sb2.append(a10.m());
                    sb2.append("\nResponseCode: ");
                    sb2.append(a10.i());
                    sb2.append("\nIsInputStreamNull: ");
                    sb2.append(a10.h() == null);
                    a(new ImageLoadException(sb2.toString()));
                    a10.a();
                }
            }
            if (this.f12374b.getRatingV1().getIconUrl() != null) {
                com.webengage.sdk.android.utils.l.g a11 = a(new f.b(this.f12374b.getRatingV1().getIconUrl(), com.webengage.sdk.android.utils.l.e.GET, this.f12373a).a(6).a("portrait").a((Map<String, String>) hashMap).b(1).a());
                if (a11.n()) {
                    a11.b();
                    return;
                }
                StringBuilder sb3 = new StringBuilder("Exception: ");
                sb3.append(a11.f());
                sb3.append("\nURL: ");
                sb3.append(a11.m());
                sb3.append("\nResponseCode: ");
                sb3.append(a11.i());
                sb3.append("\nIsInputStreamNull: ");
                sb3.append(a11.h() == null);
                a(new ImageLoadException(sb3.toString()));
                a11.a();
            }
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k
    public void h() {
        if (this.f12374b.getRatingV1().getImageUrl() != null) {
            this.f12377e.add(a(a(new f.b(this.f12374b.getRatingV1().getImageUrl(), com.webengage.sdk.android.utils.l.e.GET, this.f12373a).a(4).a())));
        } else {
            this.f12377e.add(null);
        }
        if (this.f12374b.getRatingV1().getIconUrl() == null) {
            this.f12377e.add(null);
        } else {
            this.f12377e.add(a(a(new f.b(this.f12374b.getRatingV1().getIconUrl(), com.webengage.sdk.android.utils.l.e.GET, this.f12373a).a(4).a())));
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRender
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            this.f12386m = true;
        }
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f12387n = true;
        }
        return super.onRender(context, pushNotificationData);
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRerender
    public boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle) {
        if (bundle != null) {
            this.f12384k = Long.valueOf(bundle.getLong("when"));
            this.f12385l = Integer.valueOf(bundle.getInt("current"));
        }
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            this.f12386m = true;
        }
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f12387n = true;
        }
        return super.onRerender(context, pushNotificationData, bundle);
    }
}
