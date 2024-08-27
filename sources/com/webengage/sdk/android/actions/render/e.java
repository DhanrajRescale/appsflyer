package com.webengage.sdk.android.actions.render;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.google.android.gms.common.util.GmsVersion;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.PendingIntentFactory;
import com.webengage.sdk.android.R;
import com.webengage.sdk.android.actions.exception.ImageLoadException;
import com.webengage.sdk.android.actions.render.PushNotificationData;
import com.webengage.sdk.android.callbacks.CustomPushRender;
import com.webengage.sdk.android.callbacks.CustomPushRerender;
import com.webengage.sdk.android.utils.htmlspanner.WEHtmlParserInterface;
import com.webengage.sdk.android.utils.l.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
class e extends k implements CustomPushRender, CustomPushRerender {

    /* renamed from: k, reason: collision with root package name */
    private Long f12324k = null;

    /* renamed from: l, reason: collision with root package name */
    private int f12325l = 0;

    /* renamed from: m, reason: collision with root package name */
    private String f12326m = "right";

    /* renamed from: n, reason: collision with root package name */
    private int f12327n = 0;

    /* renamed from: o, reason: collision with root package name */
    private int f12328o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f12329p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f12330q = 0;

    /* renamed from: r, reason: collision with root package name */
    private boolean f12331r = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f12332s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f12333t = false;

    private Pair<Integer, Bitmap> a(int i10, int i11, int i12) {
        List<CarouselV1CallToAction> callToActions;
        if (this.f12374b.getCarouselV1Data() != null && (callToActions = this.f12374b.getCarouselV1Data().getCallToActions()) != null) {
            int i13 = i10;
            do {
                Bitmap a10 = a(a(new f.b(callToActions.get(i13).getImageURL(), com.webengage.sdk.android.utils.l.e.GET, this.f12373a).a(4).a()));
                if (a10 != null) {
                    return Pair.create(Integer.valueOf(i13), a10);
                }
                i13 = (i11 == 1 ? i13 + 1 : (i13 - 1) + i12) % i12;
            } while (i13 != i10);
        }
        return null;
    }

    private RemoteViews j() {
        RemoteViews g10 = g();
        if (this.f12333t) {
            g10.setInt(R.id.custom_message, "setMaxLines", 2);
            g10.setInt(R.id.custom_message_native, "setMaxLines", 2);
            int i10 = R.id.custom_title;
            g10.setBoolean(i10, "setSingleLine", false);
            int i11 = R.id.custom_title_native;
            g10.setBoolean(i11, "setSingleLine", false);
            g10.setInt(i10, "setMaxLines", 2);
            g10.setInt(i11, "setMaxLines", 2);
        }
        int i12 = R.id.custom_base_container;
        g10.setViewVisibility(i12, 0);
        g10.setOnClickPendingIntent(i12, null);
        PushNotificationData.CarouselV1 carouselV1Data = this.f12374b.getCarouselV1Data();
        if (carouselV1Data != null) {
            g10.setTextViewText(R.id.custom_title, new WEHtmlParserInterface().fromHtml(carouselV1Data.getBigContentTitle()));
            g10.setTextViewText(R.id.custom_message, new WEHtmlParserInterface().fromHtml(carouselV1Data.getMessage()));
            g10.setTextViewText(R.id.custom_title_native, new WEHtmlParserInterface().fromHtml(carouselV1Data.getBigContentTitle()));
            g10.setTextViewText(R.id.custom_message_native, new WEHtmlParserInterface().fromHtml(carouselV1Data.getMessage()));
            if (TextUtils.isEmpty(carouselV1Data.getSummary())) {
                g10.setViewVisibility(R.id.custom_summary, 8);
                g10.setViewVisibility(R.id.custom_summary_native, 8);
            } else {
                g10.setTextViewText(R.id.custom_summary, new WEHtmlParserInterface().fromHtml(carouselV1Data.getSummary()));
                g10.setTextViewText(R.id.custom_summary_native, new WEHtmlParserInterface().fromHtml(carouselV1Data.getSummary()));
            }
        }
        if (this.f12333t) {
            g10.setViewVisibility(R.id.custom_small_head_container, 8);
            g10.setViewPadding(R.id.custom_head_container, !this.f12332s ? 0 : this.f12373a.getResources().getDimensionPixelSize(R.dimen.we_push_content_margin_colorbg), 0, 0, 0);
        }
        if (this.f12332s) {
            g10.setInt(R.id.push_base_container, "setBackgroundColor", this.f12374b.getBackgroundColor());
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
        PushNotificationData.CarouselV1 carouselV1Data;
        int i10;
        WEHtmlParserInterface wEHtmlParserInterface;
        int i11;
        if (this.f12377e.size() != this.f12330q || (carouselV1Data = this.f12374b.getCarouselV1Data()) == null) {
            return;
        }
        Bundle customData = this.f12374b.getCustomData();
        if (this.f12324k == null) {
            this.f12324k = Long.valueOf(System.currentTimeMillis());
        }
        this.f12378f.setWhen(this.f12324k.longValue());
        boolean parseBoolean = customData != null ? Boolean.parseBoolean(customData.getString("we_dismiss")) : false;
        List<CarouselV1CallToAction> callToActions = carouselV1Data.getCallToActions();
        this.f12379g = j();
        RemoteViews remoteViews = new RemoteViews(this.f12373a.getPackageName(), R.layout.carousel_v1);
        Bundle bundle = new Bundle();
        bundle.putLong("when", this.f12324k.longValue());
        bundle.putBoolean("we_wk_render", true);
        PendingIntent constructCarouselBrowsePendingIntent = PendingIntentFactory.constructCarouselBrowsePendingIntent(this.f12373a, this.f12374b, this.f12327n, "right", "carousel_v1_right", bundle);
        PendingIntent constructCarouselBrowsePendingIntent2 = PendingIntentFactory.constructCarouselBrowsePendingIntent(this.f12373a, this.f12374b, this.f12327n, "left", "carousel_v1_left", bundle);
        remoteViews.setOnClickPendingIntent(R.id.next, constructCarouselBrowsePendingIntent);
        remoteViews.setOnClickPendingIntent(R.id.prev, constructCarouselBrowsePendingIntent2);
        remoteViews.setOnClickPendingIntent(R.id.carousel_portrait_2_container, constructCarouselBrowsePendingIntent);
        remoteViews.setOnClickPendingIntent(R.id.carousel_portrait_0_container, constructCarouselBrowsePendingIntent2);
        new ArrayList();
        List<Bitmap> list = this.f12377e;
        int a10 = GmsVersion.VERSION_LONGHORN - (com.webengage.sdk.android.utils.d.a(this.f12374b.getLargeIcon()) + 20000);
        Logger.d("WebEngage", "maxPossible " + a10);
        int i12 = 0;
        for (int i13 = 0; i13 < this.f12330q; i13++) {
            i12 += com.webengage.sdk.android.utils.d.a(this.f12377e.get(i13));
        }
        String str = "setFlipInterval";
        int i14 = 8;
        if ("portrait".equals(carouselV1Data.getMODE())) {
            Logger.d("WebEngage", "rendering manual carousel portrait mode ");
            if (this.f12374b.getCarouselV1Data().getAutoScrollTime() == -1 || !this.f12331r) {
                if (Build.VERSION.SDK_INT >= 30 && i12 > a10) {
                    list = com.webengage.sdk.android.utils.d.a(this.f12377e, a10, this.f12330q);
                }
                for (int i15 = 0; i15 < this.f12330q; i15++) {
                    if (i15 != 0) {
                        if (i15 == 1) {
                            remoteViews.setImageViewBitmap(R.id.carousel_portrait_1_image, list.get(i15));
                            remoteViews.setTextViewText(R.id.carousel_portrait_1_desc, new WEHtmlParserInterface().fromHtml(callToActions.get(this.f12327n).getText()));
                            PendingIntent constructPushClickPendingIntent = PendingIntentFactory.constructPushClickPendingIntent(this.f12373a, this.f12374b, callToActions.get(this.f12327n), parseBoolean);
                            remoteViews.setOnClickPendingIntent(R.id.carousel_portrait_1_container, constructPushClickPendingIntent);
                            this.f12379g.setOnClickPendingIntent(R.id.custom_head_container, constructPushClickPendingIntent);
                        } else if (i15 == 2) {
                            remoteViews.setImageViewBitmap(R.id.carousel_portrait_2_image, list.get(i15));
                            i10 = R.id.carousel_portrait_2_desc;
                            wEHtmlParserInterface = new WEHtmlParserInterface();
                            i11 = this.f12328o;
                        }
                    } else {
                        remoteViews.setImageViewBitmap(R.id.carousel_portrait_0_image, list.get(i15));
                        i10 = R.id.carousel_portrait_0_desc;
                        wEHtmlParserInterface = new WEHtmlParserInterface();
                        i11 = this.f12329p;
                    }
                    remoteViews.setTextViewText(i10, wEHtmlParserInterface.fromHtml(callToActions.get(i11).getText()));
                }
                remoteViews.setViewVisibility(R.id.carousel_body_landscape, 8);
            } else {
                Logger.d("WebEngage", "rendering auto carousel portrait mode ");
                int i16 = 0;
                for (int i17 = 0; i17 < this.f12377e.size(); i17++) {
                    i16 += com.webengage.sdk.android.utils.d.a(this.f12377e.get(i17)) * 3;
                }
                Logger.d("WebEngage", "totalSizeOfImages" + i16);
                if (Build.VERSION.SDK_INT >= 30 && i16 > a10) {
                    List<Bitmap> list2 = this.f12377e;
                    list = com.webengage.sdk.android.utils.d.b(list2, a10, list2.size());
                }
                remoteViews = new RemoteViews(this.f12373a.getPackageName(), R.layout.autocarousel);
                int i18 = 0;
                while (i18 < list.size()) {
                    int size = (list.size() + (i18 - 1)) % list.size();
                    int i19 = i18 + 1;
                    int size2 = i19 % list.size();
                    RemoteViews remoteViews2 = new RemoteViews(this.f12373a.getPackageName(), R.layout.autocarousel_item);
                    remoteViews2.setViewVisibility(R.id.carousel_body_landscape, i14);
                    remoteViews2.setImageViewBitmap(R.id.carousel_portrait_1_image, list.get(i18));
                    remoteViews2.setTextViewText(R.id.carousel_portrait_1_desc, new WEHtmlParserInterface().fromHtml(callToActions.get(i18).getText()));
                    remoteViews2.setImageViewBitmap(R.id.carousel_portrait_0_image, list.get(size));
                    remoteViews2.setTextViewText(R.id.carousel_portrait_0_desc, new WEHtmlParserInterface().fromHtml(callToActions.get(size).getText()));
                    remoteViews2.setImageViewBitmap(R.id.carousel_portrait_2_image, list.get(size2));
                    remoteViews2.setTextViewText(R.id.carousel_portrait_2_desc, new WEHtmlParserInterface().fromHtml(callToActions.get(size2).getText()));
                    int i20 = i18;
                    String str2 = str;
                    PendingIntent constructCarouselBrowsePendingIntent3 = PendingIntentFactory.constructCarouselBrowsePendingIntent(this.f12373a, this.f12374b, i20, "left", "autocarousel_v1_left", bundle);
                    PendingIntent constructCarouselBrowsePendingIntent4 = PendingIntentFactory.constructCarouselBrowsePendingIntent(this.f12373a, this.f12374b, i20, "right", "autocarousel_v1_right", bundle);
                    PendingIntent constructPushClickPendingIntent2 = PendingIntentFactory.constructPushClickPendingIntent(this.f12373a, this.f12374b, callToActions.get(i18), parseBoolean);
                    remoteViews2.setOnClickPendingIntent(R.id.prev, constructCarouselBrowsePendingIntent3);
                    remoteViews2.setOnClickPendingIntent(R.id.next, constructCarouselBrowsePendingIntent4);
                    remoteViews2.setOnClickPendingIntent(R.id.carousel_portrait_1_container, constructPushClickPendingIntent2);
                    this.f12379g.setOnClickPendingIntent(R.id.custom_head_container, constructPushClickPendingIntent2);
                    int i21 = R.id.carousel_v1_viewflipper;
                    remoteViews.addView(i21, remoteViews2);
                    remoteViews.setInt(i21, str2, this.f12374b.getCarouselV1Data().getAutoScrollTime());
                    str = str2;
                    i18 = i19;
                    i14 = 8;
                }
            }
        } else if ("landscape".equals(carouselV1Data.getMODE())) {
            if (this.f12374b.getCarouselV1Data().getAutoScrollTime() == -1 || this.f12331r) {
                Logger.d("WebEngage", "rendering manual carousel landscape mode ");
                remoteViews.setViewVisibility(R.id.carousel_body_portrait, 8);
                remoteViews.setImageViewBitmap(R.id.carousel_landscape_image, com.webengage.sdk.android.utils.d.a(this.f12377e.get(0), a10));
                remoteViews.setTextViewText(R.id.carousel_landscape_desc, new WEHtmlParserInterface().fromHtml(callToActions.get(this.f12327n).getText()));
                PendingIntent constructPushClickPendingIntent3 = PendingIntentFactory.constructPushClickPendingIntent(this.f12373a, this.f12374b, callToActions.get(this.f12327n), parseBoolean);
                remoteViews.setOnClickPendingIntent(R.id.carousel_landscape_container, constructPushClickPendingIntent3);
                this.f12379g.setOnClickPendingIntent(R.id.custom_head_container, constructPushClickPendingIntent3);
            } else {
                Logger.d("WebEngage", "rendering auto carousel landscape mode ");
                int i22 = 0;
                for (int i23 = 0; i23 < this.f12377e.size(); i23++) {
                    i22 += com.webengage.sdk.android.utils.d.a(this.f12377e.get(i23));
                }
                Logger.d("WebEngage", "totalSizeOfImages" + i22);
                if (Build.VERSION.SDK_INT >= 30 && i22 > a10) {
                    List<Bitmap> list3 = this.f12377e;
                    list = com.webengage.sdk.android.utils.d.b(list3, a10, list3.size());
                }
                remoteViews = new RemoteViews(this.f12373a.getPackageName(), R.layout.autocarousel);
                Logger.d("WebEngage", "validImageSize " + this.f12377e.size());
                Logger.d("WebEngage", "imageListSize " + list.size());
                int i24 = 0;
                while (i24 < list.size()) {
                    Logger.d("WebEngage", "adding text - " + callToActions.get(i24));
                    RemoteViews remoteViews3 = new RemoteViews(this.f12373a.getPackageName(), R.layout.autocarousel_item);
                    remoteViews3.setViewVisibility(R.id.carousel_body_portrait, 8);
                    remoteViews3.setImageViewBitmap(R.id.carousel_landscape_image, list.get(i24));
                    remoteViews3.setTextViewText(R.id.carousel_landscape_desc, new WEHtmlParserInterface().fromHtml(callToActions.get(i24).getText()));
                    int i25 = i24;
                    PendingIntent constructCarouselBrowsePendingIntent5 = PendingIntentFactory.constructCarouselBrowsePendingIntent(this.f12373a, this.f12374b, i25, "left", "autocarousel_v1_left", bundle);
                    List<Bitmap> list4 = list;
                    PendingIntent constructCarouselBrowsePendingIntent6 = PendingIntentFactory.constructCarouselBrowsePendingIntent(this.f12373a, this.f12374b, i25, "right", "autocarousel_v1_right", bundle);
                    PendingIntent constructPushClickPendingIntent4 = PendingIntentFactory.constructPushClickPendingIntent(this.f12373a, this.f12374b, callToActions.get(i24), parseBoolean);
                    remoteViews3.setOnClickPendingIntent(R.id.prev, constructCarouselBrowsePendingIntent5);
                    remoteViews3.setOnClickPendingIntent(R.id.next, constructCarouselBrowsePendingIntent6);
                    remoteViews3.setOnClickPendingIntent(R.id.carousel_landscape_container, constructPushClickPendingIntent4);
                    this.f12379g.setOnClickPendingIntent(R.id.custom_head_container, constructPushClickPendingIntent4);
                    int i26 = R.id.carousel_v1_viewflipper;
                    remoteViews.addView(i26, remoteViews3);
                    remoteViews.setInt(i26, "setFlipInterval", this.f12374b.getCarouselV1Data().getAutoScrollTime());
                    i24++;
                    list = list4;
                }
            }
        }
        RemoteViews remoteViews4 = this.f12379g;
        int i27 = R.id.custom_base_container;
        remoteViews4.removeAllViews(i27);
        if (this.f12332s) {
            k();
            remoteViews.setInt(R.id.carousel_v1_body, "setBackgroundColor", this.f12374b.getBackgroundColor());
            this.f12379g.setInt(R.id.custom_small_head_container, "setBackgroundColor", this.f12374b.getBackgroundColor());
            this.f12379g.setInt(R.id.custom_head_container, "setBackgroundColor", this.f12374b.getBackgroundColor());
            this.f12379g.setInt(R.id.custom_container, "setBackgroundColor", this.f12374b.getBackgroundColor());
        } else {
            l();
        }
        this.f12379g.addView(i27, remoteViews);
    }

    @Override // com.webengage.sdk.android.actions.render.k
    public void f() {
        if (this.f12374b.getCarouselV1Data() != null) {
            String mode = this.f12374b.getCarouselV1Data().getMODE();
            List<CarouselV1CallToAction> callToActions = this.f12374b.getCarouselV1Data().getCallToActions();
            if (callToActions != null) {
                Iterator<CarouselV1CallToAction> it = callToActions.iterator();
                while (it.hasNext()) {
                    String imageURL = it.next().getImageURL();
                    if (imageURL != null && !imageURL.isEmpty()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("accept", "image/webp");
                        com.webengage.sdk.android.utils.l.g a10 = a(new f.b(imageURL, com.webengage.sdk.android.utils.l.e.GET, this.f12373a).a(6).a(mode).a((Map<String, String>) hashMap).b(1).a());
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
                }
            }
            this.f12325l = this.f12374b.getCarouselV1Data().getSize() - 1;
        }
    }

    @Override // com.webengage.sdk.android.actions.render.k
    public void h() {
        Pair<Integer, Bitmap> a10;
        String mode = this.f12374b.getCarouselV1Data().getMODE();
        int size = this.f12374b.getCarouselV1Data().getSize();
        this.f12374b.getCarouselV1Data().getCallToActions();
        if (this.f12331r) {
            for (int i10 = 0; i10 < size; i10++) {
                Logger.d("WebEngage", "Adding " + size + " images to validImages");
                this.f12330q = size;
                this.f12377e.add((Bitmap) a(i10, -1, size).second);
            }
            return;
        }
        if ("portrait".equals(mode)) {
            this.f12330q = 3;
            if (!this.f12326m.equals("left")) {
                if (this.f12326m.equals("right")) {
                    Pair<Integer, Bitmap> a11 = a(this.f12325l, 1, size);
                    if (a11 != null) {
                        this.f12329p = ((Integer) a11.first).intValue();
                    }
                    Pair<Integer, Bitmap> a12 = a((this.f12329p + 1) % size, 1, size);
                    if (a12 != null) {
                        this.f12327n = ((Integer) a12.first).intValue();
                    }
                    Pair<Integer, Bitmap> a13 = a((this.f12327n + 1) % size, 1, size);
                    if (a11 != null) {
                        this.f12377e.add((Bitmap) a11.second);
                    }
                    if (a12 != null) {
                        this.f12377e.add((Bitmap) a12.second);
                    }
                    if (a13 != null) {
                        this.f12377e.add((Bitmap) a13.second);
                        this.f12328o = ((Integer) a13.first).intValue();
                        return;
                    }
                    return;
                }
                return;
            }
            a10 = a(this.f12325l, -1, size);
            if (a10 != null) {
                this.f12328o = ((Integer) a10.first).intValue();
            }
            Pair<Integer, Bitmap> a14 = a(((this.f12328o - 1) + size) % size, -1, size);
            if (a14 != null) {
                this.f12327n = ((Integer) a14.first).intValue();
            }
            Pair<Integer, Bitmap> a15 = a(((this.f12327n - 1) + size) % size, -1, size);
            if (a15 != null) {
                this.f12329p = ((Integer) a15.first).intValue();
                this.f12377e.add((Bitmap) a15.second);
            }
            if (a14 != null) {
                this.f12377e.add((Bitmap) a14.second);
            }
            if (a10 == null) {
                return;
            }
        } else {
            if (!"landscape".equals(mode)) {
                return;
            }
            this.f12330q = 1;
            if ("left".equals(this.f12326m)) {
                a10 = a(((this.f12325l - 1) + size) % size, -1, size);
                if (a10 == null) {
                    return;
                }
            } else if (!"right".equals(this.f12326m) || (a10 = a((this.f12325l + 1) % size, 1, size)) == null) {
                return;
            }
            this.f12327n = ((Integer) a10.first).intValue();
        }
        this.f12377e.add((Bitmap) a10.second);
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRender
    public boolean onRender(Context context, PushNotificationData pushNotificationData) {
        if (pushNotificationData.getCarouselV1Data().getAutoScrollTime() != -1) {
            this.f12331r = true;
        }
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            this.f12332s = true;
        }
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f12333t = true;
        }
        return super.onRender(context, pushNotificationData);
    }

    @Override // com.webengage.sdk.android.actions.render.k, com.webengage.sdk.android.callbacks.CustomPushRerender
    public boolean onRerender(Context context, PushNotificationData pushNotificationData, Bundle bundle) {
        if (bundle != null) {
            this.f12324k = Long.valueOf(bundle.getLong("when"));
            this.f12325l = bundle.getInt("current");
            this.f12326m = bundle.getString("navigation");
            this.f12331r = bundle.getBoolean("autcarousel_activated");
        }
        if (pushNotificationData.getBackgroundColor() != Color.parseColor("#00000000")) {
            this.f12332s = true;
        }
        if (Build.VERSION.SDK_INT >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            this.f12333t = true;
        }
        return super.onRerender(context, pushNotificationData, bundle);
    }
}
