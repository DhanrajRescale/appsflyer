package com.webengage.sdk.android.actions.render;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.PendingIntentFactory;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.j0;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;
import com.webengage.sdk.android.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: c, reason: collision with root package name */
    protected int f12375c;

    /* renamed from: h, reason: collision with root package name */
    protected Long f12380h;

    /* renamed from: a, reason: collision with root package name */
    protected Context f12373a = null;

    /* renamed from: b, reason: collision with root package name */
    protected PushNotificationData f12374b = null;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f12376d = false;

    /* renamed from: e, reason: collision with root package name */
    protected List<Bitmap> f12377e = null;

    /* renamed from: f, reason: collision with root package name */
    protected Notification.Builder f12378f = null;

    /* renamed from: g, reason: collision with root package name */
    protected RemoteViews f12379g = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f12381i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f12382j = false;

    private RemoteViews b(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.app_name_native, 8);
        remoteViews.setViewVisibility(R.id.custom_summary_native, 8);
        remoteViews.setViewVisibility(R.id.custom_notification_time_native, 8);
        remoteViews.setViewVisibility(R.id.custom_title_native, 8);
        remoteViews.setViewVisibility(R.id.custom_message_native, 8);
        return remoteViews;
    }

    private void c() {
        Notification.Builder builder;
        String channelId = this.f12374b.getChannelId();
        if (Build.VERSION.SDK_INT >= 26) {
            if (channelId == null || !z.b(channelId, this.f12373a)) {
                channelId = "we_wk_push_channel";
            }
            builder = b4.f.b(this.f12373a, channelId);
        } else {
            builder = new Notification.Builder(this.f12373a);
        }
        this.f12378f = builder;
        this.f12378f.setVisibility(0);
        this.f12378f.setSmallIcon(this.f12374b.getSmallIcon());
        if (this.f12376d || this.f12381i) {
            this.f12378f.setCustomContentView(e());
        }
        this.f12378f.setContentTitle(new WEHtmlParserInterface().fromHtml(this.f12374b.getTitle())).setContentText(new WEHtmlParserInterface().fromHtml(this.f12374b.getContentText()));
        if (this.f12374b.getContentSummary() != null) {
            this.f12378f.setSubText(new WEHtmlParserInterface().fromHtml(this.f12374b.getContentSummary()));
        }
        if (this.f12374b.getLargeIcon() != null) {
            this.f12378f.setLargeIcon(this.f12374b.getLargeIcon());
        } else {
            Notification.Builder builder2 = this.f12378f;
            Context context = this.f12373a;
            builder2.setLargeIcon(Icon.createWithResource(context, context.getApplicationInfo().icon));
        }
        if (this.f12374b.isSticky()) {
            this.f12378f.setOngoing(true);
        }
    }

    private RemoteViews e() {
        RemoteViews g10 = g();
        g10.setViewVisibility(R.id.push_base_margin_view, 0);
        g10.setTextViewText(R.id.custom_title, new WEHtmlParserInterface().fromHtml(this.f12374b.getTitle()));
        g10.setTextViewText(R.id.custom_message, new WEHtmlParserInterface().fromHtml(this.f12374b.getContentText()));
        g10.setTextViewText(R.id.custom_title_native, new WEHtmlParserInterface().fromHtml(this.f12374b.getTitle()));
        g10.setTextViewText(R.id.custom_message_native, new WEHtmlParserInterface().fromHtml(this.f12374b.getContentText()));
        if (TextUtils.isEmpty(this.f12374b.getContentSummary())) {
            g10.setViewVisibility(R.id.custom_summary, 8);
            g10.setViewVisibility(R.id.custom_summary_native, 8);
        } else {
            g10.setTextViewText(R.id.custom_summary, new WEHtmlParserInterface().fromHtml(this.f12374b.getContentSummary()));
            g10.setTextViewText(R.id.custom_summary_native, new WEHtmlParserInterface().fromHtml(this.f12374b.getContentSummary()));
        }
        g10.setImageViewResource(R.id.small_icon, this.f12374b.getSmallIcon());
        if (this.f12380h == null) {
            this.f12380h = Long.valueOf(System.currentTimeMillis());
        }
        String format = DateFormat.getTimeFormat(this.f12373a).format(new Date());
        g10.setTextViewText(R.id.custom_notification_time, format);
        g10.setTextViewText(R.id.custom_notification_time_native, format);
        if (this.f12381i) {
            a(g10);
        } else {
            b(g10);
        }
        return g10;
    }

    private void i() {
        Notification build = this.f12378f.build();
        this.f12378f.setShowWhen(true);
        RemoteViews remoteViews = this.f12379g;
        if (remoteViews != null) {
            build = this.f12378f.setCustomBigContentView(remoteViews).build();
        }
        if (this.f12374b.getAccentColor() != -1) {
            build.color = this.f12374b.getAccentColor();
        }
        build.flags |= 24;
        NotificationManager notificationManager = (NotificationManager) this.f12373a.getSystemService("notification");
        try {
            notificationManager.notify(this.f12375c, build);
        } catch (SecurityException unused) {
            build.defaults = 5;
            notificationManager.notify(this.f12375c, build);
        }
    }

    public Bitmap a(com.webengage.sdk.android.utils.l.g gVar) {
        String str;
        if (gVar == null) {
            return null;
        }
        try {
            if (!gVar.n()) {
                Logger.e("WebEngage", "Could not download image " + gVar.m() + ", response code: " + gVar.i());
                gVar.a();
                return null;
            }
            try {
                return BitmapFactory.decodeStream(gVar.h());
            } catch (Exception e10) {
                e = e10;
                str = "Exception while decoding input stream to bitmap.";
                Logger.e("WebEngage", str, e);
                return null;
            } catch (OutOfMemoryError e11) {
                e = e11;
                str = "Error while decoding input stream to bitmap.";
                Logger.e("WebEngage", str, e);
                return null;
            }
        } finally {
            gVar.b();
        }
    }

    public abstract void d();

    public abstract void f();

    public RemoteViews g() {
        RemoteViews remoteViews = new RemoteViews(this.f12373a.getPackageName(), R.layout.push_base);
        if (this.f12373a.getApplicationInfo().targetSdkVersion >= 24) {
            if (this.f12382j) {
                remoteViews.setViewVisibility(R.id.custom_small_head_container, 8);
            } else {
                remoteViews.setViewVisibility(R.id.custom_small_head_container, 0);
                int smallIcon = this.f12374b.getSmallIcon();
                if (smallIcon != -1) {
                    remoteViews.setImageViewResource(R.id.small_icon, smallIcon);
                } else {
                    int i10 = R.id.small_icon;
                    Context context = this.f12373a;
                    remoteViews.setImageViewIcon(i10, Icon.createWithResource(context, context.getApplicationInfo().icon));
                }
                String appName = this.f12374b.getAppName();
                if (appName != null) {
                    remoteViews.setTextViewText(R.id.app_name, appName);
                    remoteViews.setTextViewText(R.id.app_name_native, appName);
                }
                if (this.f12380h == null) {
                    this.f12380h = Long.valueOf(System.currentTimeMillis());
                }
                this.f12378f.setWhen(this.f12380h.longValue());
                String format = DateFormat.getTimeFormat(this.f12373a).format(new Date());
                remoteViews.setTextViewText(R.id.custom_notification_time, format);
                remoteViews.setTextViewText(R.id.custom_notification_time_native, format);
            }
            if (this.f12382j) {
                remoteViews.setViewPadding(R.id.custom_head_container, !this.f12381i ? 0 : this.f12373a.getResources().getDimensionPixelSize(R.dimen.we_push_content_margin_colorbg), 0, 0, 0);
            }
            if (this.f12381i) {
                remoteViews.setInt(R.id.push_base_container, "setBackgroundColor", this.f12374b.getBackgroundColor());
            }
        } else {
            remoteViews.setViewVisibility(R.id.custom_small_head_container, 8);
        }
        if (this.f12374b.getLargeIcon() != null) {
            remoteViews.setImageViewBitmap(R.id.custom_icon, this.f12374b.getLargeIcon());
        } else {
            int i11 = R.id.custom_icon;
            Context context2 = this.f12373a;
            remoteViews.setImageViewIcon(i11, Icon.createWithResource(context2, context2.getApplicationInfo().icon));
        }
        remoteViews.setViewVisibility(R.id.push_base_margin_view, 8);
        return remoteViews;
    }

    public abstract void h();

    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        a(context, pushNotificationData);
        f();
        h();
        c();
        d();
        a();
        i();
        return true;
    }

    public boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle) {
        if (bundle != null) {
            this.f12380h = Long.valueOf(bundle.getLong("when"));
        }
        a(context, pushNotificationData);
        h();
        c();
        d();
        a();
        i();
        return true;
    }

    private RemoteViews a(RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.app_name, 8);
        remoteViews.setViewVisibility(R.id.custom_summary, 8);
        remoteViews.setViewVisibility(R.id.custom_notification_time, 8);
        remoteViews.setViewVisibility(R.id.custom_title, 8);
        remoteViews.setViewVisibility(R.id.custom_message, 8);
        return remoteViews;
    }

    public boolean b() {
        List<CallToAction> callToActions = this.f12374b.getCallToActions();
        if (callToActions == null || callToActions.size() <= 0) {
            return false;
        }
        for (CallToAction callToAction : callToActions) {
            if (!callToAction.isPrimeAction() && callToAction.isNative()) {
                return true;
            }
        }
        return false;
    }

    public com.webengage.sdk.android.utils.l.g a(com.webengage.sdk.android.utils.l.f fVar) {
        com.webengage.sdk.android.utils.l.g gVar = null;
        for (int i10 = 0; i10 < 5; i10++) {
            if (gVar != null) {
                gVar.a();
            }
            gVar = fVar.a();
            if (gVar.n() || gVar.i() >= 400) {
                break;
            }
        }
        return gVar;
    }

    private void a() {
        int i10;
        List<CallToAction> callToActions = this.f12374b.getCallToActions();
        if (callToActions != null && callToActions.size() > 0) {
            int i11 = 0;
            for (CallToAction callToAction : callToActions) {
                if (callToAction.isPrimeAction()) {
                    this.f12378f.setContentIntent(PendingIntentFactory.constructPushClickPendingIntent(this.f12373a, this.f12374b, callToAction, true));
                } else if (callToAction.isNative()) {
                    PendingIntent constructPushClickPendingIntent = PendingIntentFactory.constructPushClickPendingIntent(this.f12373a, this.f12374b, callToAction, true);
                    if (this.f12376d || this.f12381i) {
                        RemoteViews remoteViews = this.f12379g;
                        if (remoteViews != null) {
                            i11++;
                            if (i11 != 1) {
                                i10 = i11 != 2 ? i11 != 3 ? -1 : R.id.action3_native : R.id.action2_native;
                            } else {
                                int i12 = Build.VERSION.SDK_INT;
                                if (i12 <= 27) {
                                    remoteViews.setInt(R.id.action_list, "setBackgroundColor", Color.parseColor("#e8e8e8"));
                                }
                                if (this.f12373a.getApplicationInfo().targetSdkVersion >= 31 && i12 >= 31) {
                                    int dimensionPixelSize = this.f12373a.getResources().getDimensionPixelSize(R.dimen.we_push_content_margin_colorbg);
                                    RemoteViews remoteViews2 = this.f12379g;
                                    int i13 = R.id.actions;
                                    remoteViews2.setViewPadding(i13, dimensionPixelSize, 0, 0, 0);
                                    this.f12379g.setViewLayoutHeight(i13, this.f12373a.getResources().getDimension(R.dimen.we_push_action_list_height_template), 0);
                                }
                                this.f12379g.setViewVisibility(R.id.action_list, 0);
                                i10 = R.id.action1_native;
                            }
                            if (i10 != -1) {
                                this.f12379g.setViewVisibility(i10, 0);
                                this.f12379g.setTextViewText(i10, new WEHtmlParserInterface().fromHtml(callToAction.getText()));
                                this.f12379g.setOnClickPendingIntent(i10, constructPushClickPendingIntent);
                            }
                        }
                    } else {
                        this.f12378f.addAction(new Notification.Action.Builder((Icon) null, new WEHtmlParserInterface().fromHtml(callToAction.getText()), constructPushClickPendingIntent).build());
                    }
                }
            }
        }
        this.f12378f.setDeleteIntent(PendingIntentFactory.constructPushDeletePendingIntent(this.f12373a, this.f12374b));
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 26) {
            int[] iArr = {-2, -1, 0, 1, 2};
            if (5 < this.f12374b.getPriority() + 2) {
                this.f12378f.setPriority(iArr[this.f12374b.getPriority() + 2]);
            }
        }
        if (i14 < 26) {
            if (this.f12374b.getVibrateFlag() && com.webengage.sdk.android.utils.f.a("android.permission.VIBRATE", this.f12373a)) {
                this.f12378f.setDefaults(2);
            }
            if (this.f12374b.getSound() != null) {
                this.f12378f.setSound(this.f12374b.getSound());
            }
            if (this.f12374b.getLedColor() != 0) {
                this.f12378f.setLights(this.f12374b.getLedColor(), 500, CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
            }
        }
    }

    private void a(Context context, PushNotificationData pushNotificationData) {
        this.f12373a = context.getApplicationContext();
        this.f12374b = pushNotificationData;
        this.f12375c = pushNotificationData.getVariationId().hashCode();
        this.f12377e = new ArrayList();
        Bundle customData = pushNotificationData.getCustomData();
        this.f12376d = customData != null && customData.containsKey("we_push_custom") && Boolean.parseBoolean(customData.getString("we_push_custom"));
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            this.f12381i = true;
        }
        if (Build.VERSION.SDK_INT < 31 || context.getApplicationInfo().targetSdkVersion < 31) {
            return;
        }
        this.f12382j = true;
    }

    public void a(Exception exc) {
        WebEngage.startService(com.webengage.sdk.android.q.a(j0.f12603g, exc, this.f12373a), this.f12373a);
    }
}
