package com.webengage.sdk.android.actions.render;

import android.app.Notification;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;

/* loaded from: classes2.dex */
public class d extends k implements CustomPushRender {

    /* renamed from: k, reason: collision with root package name */
    private boolean f12322k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12323l = false;

    private RemoteViews j() {
        RemoteViews g10 = g();
        if (this.f12322k) {
            int i10 = R.id.custom_title;
            g10.setBoolean(i10, "setSingleLine", false);
            int i11 = R.id.custom_title_native;
            g10.setBoolean(i11, "setSingleLine", false);
            g10.setInt(i10, "setMaxLines", 2);
            g10.setInt(i11, "setMaxLines", 2);
        }
        int i12 = R.id.custom_message;
        g10.setInt(i12, "setMaxLines", 7);
        int i13 = R.id.custom_message_native;
        g10.setInt(i13, "setMaxLines", 7);
        g10.setViewVisibility(R.id.custom_base_container, 0);
        PushNotificationData.BigTextStyle bigTextStyleData = this.f12374b.getBigTextStyleData();
        if (bigTextStyleData != null) {
            g10.setTextViewText(R.id.custom_title, new WEHtmlParserInterface().fromHtml(this.f12374b.getTitle()));
            g10.setTextViewText(i12, new WEHtmlParserInterface().fromHtml(bigTextStyleData.getBigText()));
            g10.setTextViewText(R.id.custom_title_native, new WEHtmlParserInterface().fromHtml(this.f12374b.getTitle()));
            g10.setTextViewText(i13, new WEHtmlParserInterface().fromHtml(bigTextStyleData.getBigText()));
            if (TextUtils.isEmpty(this.f12374b.getContentSummary())) {
                g10.setViewVisibility(R.id.custom_summary, 8);
                g10.setViewVisibility(R.id.custom_summary_native, 8);
            } else {
                g10.setTextViewText(R.id.custom_summary, new WEHtmlParserInterface().fromHtml(bigTextStyleData.getSummary()));
                g10.setTextViewText(R.id.custom_summary_native, new WEHtmlParserInterface().fromHtml(bigTextStyleData.getSummary()));
            }
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
        if (this.f12374b.getBigTextStyleData() != null) {
            if (!this.f12376d && this.f12374b.getBackgroundColor() == Color.parseColor("#00000000")) {
                Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
                bigTextStyle.setBigContentTitle(new WEHtmlParserInterface().fromHtml(this.f12374b.getBigTextStyleData().getBigContentTitle()));
                bigTextStyle.bigText(new WEHtmlParserInterface().fromHtml(this.f12374b.getBigTextStyleData().getBigText()));
                if (!TextUtils.isEmpty(this.f12374b.getBigTextStyleData().getSummary())) {
                    bigTextStyle.setSummaryText(new WEHtmlParserInterface().fromHtml(this.f12374b.getBigTextStyleData().getSummary()));
                }
                this.f12378f.setStyle(bigTextStyle);
                return;
            }
            this.f12379g = j();
            RemoteViews remoteViews = new RemoteViews(this.f12373a.getPackageName(), R.layout.big_text);
            RemoteViews remoteViews2 = this.f12379g;
            int i10 = R.id.custom_base_container;
            remoteViews2.removeAllViews(i10);
            this.f12379g.addView(i10, remoteViews);
            if (Color.parseColor("#00000000") == this.f12374b.getBackgroundColor()) {
                l();
            } else {
                k();
            }
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k
    public void f() {
    }

    @Override // com.webengage.sdk.android.actions.render.k
    public void h() {
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRender
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            this.f12323l = true;
        }
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f12322k = true;
        }
        return super.onRender(context, pushNotificationData);
    }
}
