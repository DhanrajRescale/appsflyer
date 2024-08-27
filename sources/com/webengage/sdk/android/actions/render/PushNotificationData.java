package com.webengage.sdk.android.actions.render;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.webengage.sdk.android.Logger;
import com.webengage.sdk.android.WebEngage;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PushNotificationData extends b {
    private int accentColor;
    private String appName;
    private boolean autoExpand;
    private int backgroundColor;
    private JSONObject bigNotificationData;
    private BigPictureStyle bigPictureStyle;
    private BigTextStyle bigTextStyle;
    private List<CallToAction> callToActions;
    private CarouselV1 carouselV1;
    private JSONObject cta;
    private int currentIndex;
    private InboxStyle inboxStyle;
    private boolean isSticky;
    private Bitmap largeIcon;
    private RatingV1 ratingV1;
    private int smallIcon;
    private String style;

    /* loaded from: classes2.dex */
    public class BaseStyleData {
        private String bigContentTitle;
        private String message;
        private String summary;

        public BaseStyleData(JSONObject jSONObject) {
            this.bigContentTitle = null;
            this.message = null;
            this.summary = null;
            this.bigContentTitle = jSONObject.isNull("rt") ? PushNotificationData.this.getTitle() : jSONObject.optString("rt");
            this.message = jSONObject.isNull("rm") ? PushNotificationData.this.getContentText() : jSONObject.optString("rm");
            this.summary = jSONObject.isNull("rst") ? PushNotificationData.this.getContentSummary() : jSONObject.optString("rst");
        }

        public String getBigContentTitle() {
            return this.bigContentTitle;
        }

        public String getMessage() {
            return this.message;
        }

        public String getSummary() {
            return this.summary;
        }

        public void setBigContentTitle(String str) {
            this.bigContentTitle = str;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public void setSummary(String str) {
            this.summary = str;
        }
    }

    /* loaded from: classes2.dex */
    public class BigPictureStyle extends BaseStyleData {
        private String bigPictureUrl;

        public BigPictureStyle(JSONObject jSONObject) {
            super(jSONObject);
            this.bigPictureUrl = null;
            this.bigPictureUrl = jSONObject.isNull("image") ? null : jSONObject.optString("image");
        }

        public String getBigPictureUrl() {
            return this.bigPictureUrl;
        }

        public void setBigPictureUrl(String str) {
            this.bigPictureUrl = str;
        }
    }

    /* loaded from: classes2.dex */
    public class BigTextStyle extends BaseStyleData {
        private String bigText;

        public BigTextStyle(JSONObject jSONObject) {
            super(jSONObject);
            this.bigText = null;
            this.bigText = jSONObject.isNull("rm") ? PushNotificationData.this.getContentText() : jSONObject.optString("rm");
        }

        public String getBigText() {
            return this.bigText;
        }

        public void setBigText(String str) {
            this.bigText = str;
        }
    }

    /* loaded from: classes2.dex */
    public class CarouselV1 extends BaseStyleData {
        private final String MODE;
        private int autoScrollTime;
        private List<CarouselV1CallToAction> callToActions;
        private int size;

        public CarouselV1(JSONObject jSONObject) {
            super(jSONObject);
            this.callToActions = null;
            this.size = 0;
            this.autoScrollTime = -1;
            this.callToActions = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray != null) {
                this.size = optJSONArray.length();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null && !optJSONObject.isNull("id") && !optJSONObject.isNull("image")) {
                        this.callToActions.add(new CarouselV1CallToAction(optJSONObject.optString("id"), optJSONObject.optString("actionText"), optJSONObject.optString("actionLink"), optJSONObject.optString("image")));
                    }
                }
            }
            this.MODE = jSONObject.optString("mode", "landscape");
            this.autoScrollTime = jSONObject.optInt("ast", -1);
        }

        public int getAutoScrollTime() {
            return this.autoScrollTime;
        }

        public List<CarouselV1CallToAction> getCallToActions() {
            return this.callToActions;
        }

        public String getMODE() {
            return this.MODE;
        }

        public int getSize() {
            return this.size;
        }

        public void setAutoScrollTime(int i10) {
            this.autoScrollTime = i10;
        }

        public void setCallToActions(List<CarouselV1CallToAction> list) {
            this.callToActions = list;
        }
    }

    /* loaded from: classes2.dex */
    public class InboxStyle extends BaseStyleData {
        private List<String> lines;

        public InboxStyle(JSONObject jSONObject) {
            super(jSONObject);
            this.lines = null;
            JSONArray optJSONArray = jSONObject.isNull("lines") ? null : jSONObject.optJSONArray("lines");
            if (optJSONArray != null) {
                this.lines = new LinkedList();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    this.lines.add(optJSONArray.optString(i10));
                }
            }
        }

        public List<String> getInboxLines() {
            return this.lines;
        }

        public void setLines(List<String> list) {
            this.lines = list;
        }
    }

    /* loaded from: classes2.dex */
    public class RatingV1 extends BaseStyleData {
        private int contentBackgroundColor;
        private String contentMessage;
        private int contentTextColor;
        private String contentTitle;
        private String iconUrl;
        private String imageUrl;
        private int rateScale;
        private int rateValue;
        private CallToAction submitCTA;

        public RatingV1(JSONObject jSONObject) {
            super(jSONObject);
            this.contentBackgroundColor = Color.parseColor("#00000000");
            this.imageUrl = null;
            this.contentTitle = null;
            this.contentMessage = null;
            this.iconUrl = null;
            this.rateScale = 5;
            this.contentTextColor = Color.parseColor("#000000");
            this.submitCTA = null;
            this.rateValue = -1;
            if (jSONObject != null) {
                this.imageUrl = jSONObject.isNull("image") ? null : jSONObject.optString("image");
                this.iconUrl = jSONObject.isNull("icon") ? null : jSONObject.optString("icon");
                this.rateScale = jSONObject.optInt("rateScale", 5);
                JSONObject optJSONObject = jSONObject.optJSONObject("content");
                if (optJSONObject != null) {
                    this.contentTitle = optJSONObject.isNull("title") ? null : optJSONObject.optString("title");
                    this.contentMessage = optJSONObject.isNull("message") ? null : optJSONObject.optString("message");
                    if (!optJSONObject.isNull("textColor")) {
                        this.contentTextColor = Color.parseColor(optJSONObject.optString("textColor"));
                    }
                    if (!optJSONObject.isNull("bckColor")) {
                        try {
                            this.contentBackgroundColor = Color.parseColor(optJSONObject.optString("bckColor"));
                        } catch (Exception unused) {
                            Logger.e("WebEngage", "Error parsing bckColor. Not setting background color");
                        }
                    }
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("submitCTA");
                if (optJSONObject2 != null) {
                    this.submitCTA = new CallToAction(optJSONObject2.optString("id"), optJSONObject2.isNull("actionText") ? "Submit" : optJSONObject2.optString("actionText"), optJSONObject2.optString("actionLink"), false, false);
                } else {
                    this.submitCTA = new CallToAction(null, "Submit", null, false, false);
                }
            }
        }

        public int getContentBackgroundColor() {
            return this.contentBackgroundColor;
        }

        public String getContentMessage() {
            return this.contentMessage;
        }

        public int getContentTextColor() {
            return this.contentTextColor;
        }

        public String getContentTitle() {
            return this.contentTitle;
        }

        public String getIconUrl() {
            return this.iconUrl;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

        public int getRateScale() {
            return this.rateScale;
        }

        public int getRateValue() {
            return this.rateValue;
        }

        public CallToAction getSubmitCTA() {
            return this.submitCTA;
        }

        public void setRateValue(int i10) {
            this.rateValue = i10;
        }
    }

    public PushNotificationData(JSONObject jSONObject, Context context) {
        super(jSONObject, "system_tray", context);
        this.bigNotificationData = null;
        this.bigPictureStyle = null;
        this.bigTextStyle = null;
        this.inboxStyle = null;
        this.carouselV1 = null;
        this.ratingV1 = null;
        this.style = null;
        this.largeIcon = null;
        this.smallIcon = -1;
        this.appName = null;
        this.autoExpand = true;
        this.accentColor = -1;
        this.currentIndex = 0;
        this.isSticky = false;
        this.backgroundColor = Color.parseColor("#00000000");
        this.bigNotificationData = jSONObject.isNull("expandableDetails") ? null : jSONObject.optJSONObject("expandableDetails");
        this.callToActions = readCallToActions(jSONObject, context);
        this.accentColor = WebEngage.get().getWebEngageConfig().getAccentColor();
        int pushSmallIcon = WebEngage.get().getWebEngageConfig().getPushSmallIcon();
        this.smallIcon = pushSmallIcon;
        if (pushSmallIcon == -1) {
            this.smallIcon = context.getApplicationContext().getApplicationInfo().icon;
        }
        int pushLargeIcon = WebEngage.get().getWebEngageConfig().getPushLargeIcon();
        this.largeIcon = pushLargeIcon == -1 ? BitmapFactory.decodeResource(context.getApplicationContext().getResources(), context.getApplicationContext().getApplicationInfo().icon) : BitmapFactory.decodeResource(context.getApplicationContext().getResources(), pushLargeIcon);
        if (this.largeIcon == null) {
            Logger.d("WebEngage", "large icon is not available in the resources. Creating Bitmap from app icon");
            this.largeIcon = createBitmapFromDrawable(context.getPackageManager().getApplicationIcon(context.getApplicationInfo()));
        }
        if (this.appName == null) {
            try {
                this.appName = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
            } catch (Exception e10) {
                Logger.e("WebEngage", e10.toString() + " loading app name");
            }
        }
        this.isSticky = jSONObject.optBoolean("s", false);
        if (!jSONObject.isNull("bckColor")) {
            try {
                if (!TextUtils.isEmpty(jSONObject.getString("bckColor"))) {
                    this.backgroundColor = Color.parseColor(jSONObject.getString("bckColor"));
                    Logger.d("WebEngage", "BackGround color : " + this.backgroundColor);
                }
            } catch (Exception e11) {
                Logger.e("WebEngage", "Exception while parsing bckColor " + e11.toString());
                this.backgroundColor = Color.parseColor("#00000000");
                Logger.d("WebEngage", "BackGround color : " + this.backgroundColor);
            }
        }
        JSONObject jSONObject2 = this.bigNotificationData;
        if (jSONObject2 == null || jSONObject2.isNull("style")) {
            return;
        }
        String optString = this.bigNotificationData.optString("style");
        this.style = optString;
        if ("BIG_TEXT".equalsIgnoreCase(optString)) {
            this.bigTextStyle = new BigTextStyle(this.bigNotificationData);
            return;
        }
        if ("BIG_PICTURE".equalsIgnoreCase(this.style)) {
            this.bigPictureStyle = new BigPictureStyle(this.bigNotificationData);
            return;
        }
        if ("INBOX".equalsIgnoreCase(this.style)) {
            this.inboxStyle = new InboxStyle(this.bigNotificationData);
            return;
        }
        if ("CAROUSEL_V1".equalsIgnoreCase(this.style)) {
            CarouselV1 carouselV1 = new CarouselV1(this.bigNotificationData);
            this.carouselV1 = carouselV1;
            this.callToActions.addAll(carouselV1.getCallToActions());
        } else if ("RATING_V1".equalsIgnoreCase(this.style)) {
            RatingV1 ratingV1 = new RatingV1(this.bigNotificationData);
            this.ratingV1 = ratingV1;
            if (ratingV1.getSubmitCTA() != null) {
                this.callToActions.add(this.ratingV1.getSubmitCTA());
            }
        }
    }

    private Bitmap createBitmapFromDrawable(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<com.webengage.sdk.android.actions.render.CallToAction> readCallToActions(org.json.JSONObject r20, android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.webengage.sdk.android.actions.render.PushNotificationData.readCallToActions(org.json.JSONObject, android.content.Context):java.util.List");
    }

    public boolean equals(Object obj) {
        if (obj instanceof PushNotificationData) {
            return getExperimentId().equals(((PushNotificationData) obj).getExperimentId());
        }
        return false;
    }

    public int getAccentColor() {
        return this.accentColor;
    }

    public List<CallToAction> getActions() {
        List<CallToAction> list = this.callToActions;
        ArrayList arrayList = null;
        if (list != null && list.size() > 0) {
            for (CallToAction callToAction : this.callToActions) {
                if (callToAction != null && !callToAction.isPrimeAction() && callToAction.isNative()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(callToAction);
                }
            }
        }
        return arrayList;
    }

    public String getAppName() {
        return this.appName;
    }

    public boolean getAutoExpand() {
        return this.autoExpand;
    }

    public int getBackgroundColor() {
        return this.backgroundColor;
    }

    public BigPictureStyle getBigPictureStyleData() {
        return this.bigPictureStyle;
    }

    public BigTextStyle getBigTextStyleData() {
        return this.bigTextStyle;
    }

    public CallToAction getCallToActionById(String str) {
        List<CallToAction> list = this.callToActions;
        if (list == null || list.size() <= 0 || str == null || str.isEmpty()) {
            return null;
        }
        for (CallToAction callToAction : this.callToActions) {
            if (callToAction != null && str.equals(callToAction.getId())) {
                return callToAction;
            }
        }
        return null;
    }

    public List<CallToAction> getCallToActions() {
        return this.callToActions;
    }

    public CarouselV1 getCarouselV1Data() {
        return this.carouselV1;
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ String getChannelId() {
        return super.getChannelId();
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ String getContentSummary() {
        return super.getContentSummary();
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ String getContentText() {
        return super.getContentText();
    }

    public int getCurrentIndex() {
        return this.currentIndex;
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ Bundle getCustomData() {
        return super.getCustomData();
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ String getExperimentId() {
        return super.getExperimentId();
    }

    public InboxStyle getInboxStyleData() {
        return this.inboxStyle;
    }

    public Bitmap getLargeIcon() {
        return this.largeIcon;
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ int getLedColor() {
        return super.getLedColor();
    }

    public CallToAction getPrimeCallToAction() {
        List<CallToAction> list = this.callToActions;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (CallToAction callToAction : this.callToActions) {
            if (callToAction != null && callToAction.isPrimeAction()) {
                return callToAction;
            }
        }
        return null;
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ int getPriority() {
        return super.getPriority();
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ JSONObject getPushPayloadJSON() {
        return super.getPushPayloadJSON();
    }

    public RatingV1 getRatingV1() {
        return this.ratingV1;
    }

    public int getSmallIcon() {
        return this.smallIcon;
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ Uri getSound() {
        return super.getSound();
    }

    public WebEngageConstant.STYLE getStyle() {
        try {
            return WebEngageConstant.STYLE.valueOf(this.style);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ String getTitle() {
        return super.getTitle();
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ String getVariationId() {
        return super.getVariationId();
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ boolean getVibrateFlag() {
        return super.getVibrateFlag();
    }

    public int hashCode() {
        return getExperimentId().hashCode();
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ boolean isAmplified() {
        return super.isAmplified();
    }

    public boolean isBigNotification() {
        return this.bigNotificationData != null;
    }

    public boolean isCustomRender() {
        Bundle customData = getCustomData();
        return customData != null && customData.containsKey("we_custom_render") && Boolean.parseBoolean(customData.getString("we_custom_render"));
    }

    public boolean isSticky() {
        return this.isSticky;
    }

    public void setAccentColor(int i10) {
        this.accentColor = i10;
    }

    public void setAutoExpand(boolean z10) {
        this.autoExpand = z10;
    }

    public void setBackgroundColor(int i10) {
        this.backgroundColor = i10;
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ void setChannelId(String str) {
        super.setChannelId(str);
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ void setContentSummary(String str) {
        super.setContentSummary(str);
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ void setContentText(String str) {
        super.setContentText(str);
    }

    public void setCurrentIndex(int i10) {
        this.currentIndex = i10;
    }

    @Override // com.webengage.sdk.android.actions.render.b
    @Deprecated
    public /* bridge */ /* synthetic */ void setCustomData(Bundle bundle) {
        super.setCustomData(bundle);
    }

    public void setLargerIcon(Bitmap bitmap) {
        this.largeIcon = bitmap;
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ void setLedLight(int i10) {
        super.setLedLight(i10);
    }

    @Override // com.webengage.sdk.android.actions.render.b
    @Deprecated
    public /* bridge */ /* synthetic */ void setPriority(int i10) {
        super.setPriority(i10);
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ void setShouldRender(boolean z10) {
        super.setShouldRender(z10);
    }

    public void setSmallIcon(int i10) {
        this.smallIcon = i10;
    }

    @Override // com.webengage.sdk.android.actions.render.b
    @Deprecated
    public /* bridge */ /* synthetic */ void setSound(Uri uri) {
        super.setSound(uri);
    }

    public void setSticky(boolean z10) {
        this.isSticky = z10;
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ void setTitle(String str) {
        super.setTitle(str);
    }

    @Override // com.webengage.sdk.android.actions.render.b
    @Deprecated
    public /* bridge */ /* synthetic */ void setVibrateFlag(boolean z10) {
        super.setVibrateFlag(z10);
    }

    @Override // com.webengage.sdk.android.actions.render.b
    public /* bridge */ /* synthetic */ boolean shouldRender() {
        return super.shouldRender();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String property = System.getProperty("line.separator");
        sb2.append(getClass().getName() + " Object { " + property);
        StringBuilder sb3 = new StringBuilder(" Experiment Id : ");
        sb3.append(getExperimentId());
        sb3.append(property);
        sb2.append(sb3.toString());
        sb2.append(" Variation Id : " + getVariationId() + property);
        sb2.append(" Title : " + getTitle() + property);
        sb2.append(" Message : " + getContentText() + property);
        StringBuilder sb4 = new StringBuilder("Summary : ");
        sb4.append(getContentSummary() != null ? getContentSummary() : "null");
        sb4.append(property);
        sb2.append(sb4.toString());
        if (getPrimeCallToAction() != null) {
            sb2.append(" Main CTA : " + getPrimeCallToAction() + " ID : " + getPrimeCallToAction().getId() + property);
        }
        StringBuilder sb5 = new StringBuilder(" Custom Data : ");
        sb5.append(getCustomData() != null ? getCustomData().toString() : "null");
        sb5.append(property);
        sb2.append(sb5.toString());
        if (this.bigNotificationData != null) {
            sb2.append(" Expandable Details : " + this.bigNotificationData.toString() + property);
        }
        sb2.append(" Amplified: " + isAmplified() + property);
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }
}
