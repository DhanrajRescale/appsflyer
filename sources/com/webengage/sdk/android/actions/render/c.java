package com.webengage.sdk.android.actions.render;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.google.android.gms.common.util.GmsVersion;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.utils.WebEngageUtils;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;
import com.webengage.sdk.android.utils.l.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class c extends k implements CustomPushRender {

    /* renamed from: k, reason: collision with root package name */
    private boolean f12320k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12321l = false;

    private RemoteViews j() {
        RemoteViews g10 = g();
        if (this.f12320k) {
            int i10 = R.id.custom_title;
            g10.setBoolean(i10, "setSingleLine", false);
            int i11 = R.id.custom_title_native;
            g10.setBoolean(i11, "setSingleLine", false);
            g10.setInt(i10, "setMaxLines", 2);
            g10.setInt(i11, "setMaxLines", 2);
            g10.setInt(R.id.custom_message, "setMaxLines", 2);
            g10.setInt(R.id.custom_message_native, "setMaxLines", 2);
        }
        g10.setViewVisibility(R.id.custom_base_container, 0);
        PushNotificationData.BigPictureStyle bigPictureStyleData = this.f12374b.getBigPictureStyleData();
        if (bigPictureStyleData != null) {
            g10.setTextViewText(R.id.custom_title, new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getBigContentTitle()));
            g10.setTextViewText(R.id.custom_message, new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getMessage()));
            g10.setTextViewText(R.id.custom_title_native, new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getBigContentTitle()));
            g10.setTextViewText(R.id.custom_message_native, new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getMessage()));
            if (TextUtils.isEmpty(bigPictureStyleData.getSummary())) {
                g10.setViewVisibility(R.id.custom_summary, 8);
                g10.setViewVisibility(R.id.custom_summary_native, 8);
            } else {
                g10.setTextViewText(R.id.custom_summary, new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getSummary()));
                g10.setTextViewText(R.id.custom_summary_native, new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getSummary()));
            }
            g10.setImageViewResource(R.id.small_icon, this.f12374b.getSmallIcon());
        }
        if (!b()) {
            g10.setViewVisibility(R.id.push_base_margin_view, 0);
        }
        return g10;
    }

    private void k() {
        this.f12379g.setViewVisibility(R.id.app_name, 8);
        this.f12379g.setViewVisibility(R.id.custom_summary, 8);
        this.f12379g.setViewVisibility(R.id.custom_notification_time, 8);
        this.f12379g.setViewVisibility(R.id.custom_title, 8);
        this.f12379g.setViewVisibility(R.id.custom_message, 8);
    }

    private void l() {
        this.f12379g.setViewVisibility(R.id.app_name_native, 8);
        this.f12379g.setViewVisibility(R.id.custom_summary_native, 8);
        this.f12379g.setViewVisibility(R.id.custom_notification_time_native, 8);
        this.f12379g.setViewVisibility(R.id.custom_title_native, 8);
        this.f12379g.setViewVisibility(R.id.custom_message_native, 8);
    }

    @Override // com.webengage.sdk.android.actions.render.k
    public void d() {
        if (!this.f12374b.isBigNotification() || this.f12374b.getStyle() == null || this.f12374b.getBigPictureStyleData() == null) {
            return;
        }
        PushNotificationData.BigPictureStyle bigPictureStyleData = this.f12374b.getBigPictureStyleData();
        if (!this.f12376d && this.f12374b.getBackgroundColor() == Color.parseColor("#00000000")) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            bigPictureStyle.setBigContentTitle(new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getBigContentTitle()));
            bigPictureStyle.setSummaryText(new WEHtmlParserInterface().fromHtml(bigPictureStyleData.getMessage()));
            try {
                if (this.f12377e.size() > 0) {
                    bigPictureStyle.bigPicture(this.f12377e.get(0));
                    this.f12378f.setStyle(bigPictureStyle);
                    return;
                }
                return;
            } catch (Exception unused) {
                return;
            }
        }
        this.f12379g = j();
        RemoteViews remoteViews = new RemoteViews(this.f12373a.getPackageName(), R.layout.big_picture);
        if (this.f12377e.size() > 0) {
            int a10 = GmsVersion.VERSION_LONGHORN - (com.webengage.sdk.android.utils.d.a(this.f12374b.getLargeIcon()) + 20000);
            long j10 = 0;
            for (int i10 = 0; i10 < this.f12377e.size(); i10++) {
                j10 += com.webengage.sdk.android.utils.d.a(this.f12377e.get(i10));
            }
            if (Build.VERSION.SDK_INT >= 30 && j10 > a10) {
                Logger.d("WebEngage", "Big picture: Is Optimization required? true because totalSizeOfImages: " + j10 + " is greater than maxPossibleSizeOfBitmap: " + a10);
                List<Bitmap> list = this.f12377e;
                this.f12377e = com.webengage.sdk.android.utils.d.b(list, a10, list.size());
            }
            remoteViews.setImageViewBitmap(R.id.big_picture_image, this.f12377e.get(0));
        }
        RemoteViews remoteViews2 = this.f12379g;
        int i11 = R.id.custom_base_container;
        remoteViews2.removeAllViews(i11);
        this.f12379g.addView(i11, remoteViews);
        if (b()) {
            this.f12379g.setInt(R.id.big_picture_image, "setMaxHeight", WebEngageUtils.a(161.0f, this.f12373a));
        }
        if (this.f12321l) {
            k();
        } else {
            l();
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k
    public void f() {
    }

    @Override // com.webengage.sdk.android.actions.render.k
    public void h() {
        String bigPictureUrl;
        if (this.f12374b.getBigPictureStyleData() == null || (bigPictureUrl = this.f12374b.getBigPictureStyleData().getBigPictureUrl()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("accept", "image/webp");
        Bitmap a10 = a(a(new f.b(bigPictureUrl, com.webengage.sdk.android.utils.l.e.GET, this.f12373a).a(3).a("landscape").a((Map<String, String>) hashMap).a()));
        if (a10 != null) {
            this.f12377e.add(a10);
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRender
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            this.f12321l = true;
        }
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f12320k = true;
        }
        return super.onRender(context, pushNotificationData);
    }
}
