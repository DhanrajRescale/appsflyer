package com.webengage.sdk.android.actions.render;

import android.content.Context;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.webengage.sdk.android.WebEngage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class b {
    private boolean amplified;
    private String channelId;
    private Bundle customData;
    private String experimentId;
    private JSONObject jsonObject;
    private int ledColor;
    private String license_code;
    private String message;
    private int priority;
    private boolean render;
    private Uri sound;
    private String summary;
    private String title;
    private String type;
    private String variationId;
    private boolean vibrate;

    public b(JSONObject jSONObject, String str, Context context) {
        this.title = null;
        this.message = null;
        this.summary = null;
        this.variationId = null;
        this.render = true;
        this.sound = null;
        this.type = null;
        this.customData = null;
        this.vibrate = false;
        this.ledColor = 0;
        this.experimentId = null;
        this.license_code = null;
        this.priority = 0;
        this.channelId = null;
        this.amplified = false;
        this.jsonObject = jSONObject;
        String string = jSONObject.isNull("rt") ? null : jSONObject.getString("rt");
        this.title = string;
        if (TextUtils.isEmpty(string)) {
            this.title = jSONObject.isNull("title") ? null : jSONObject.getString("title");
        }
        if (this.title == null) {
            this.title = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        }
        if (jSONObject.isNull("license_code")) {
            throw new JSONException("license_code is null");
        }
        this.license_code = jSONObject.getString("license_code");
        if (!WebEngage.get().getWebEngageConfig().getWebEngageKey().equalsIgnoreCase(this.license_code)) {
            throw new JSONException("license_code mismatch , received license_code : " + this.license_code + ", integrated license code : " + WebEngage.get().getWebEngageConfig().getWebEngageKey());
        }
        String string2 = jSONObject.isNull("rm") ? null : jSONObject.getString("rm");
        this.message = string2;
        if (TextUtils.isEmpty(string2)) {
            this.message = jSONObject.getString("message");
        }
        if (TextUtils.isEmpty(this.message)) {
            throw new JSONException("message is Null");
        }
        if (jSONObject.isNull("experimentId")) {
            throw new JSONException("experimentId is null");
        }
        this.summary = jSONObject.isNull("rst") ? null : jSONObject.getString("rst");
        this.experimentId = jSONObject.getString("experimentId");
        this.render = true;
        this.sound = null;
        this.vibrate = jSONObject.optBoolean("vib", false);
        this.ledColor = 0;
        if (!jSONObject.isNull("snd")) {
            int identifier = context.getResources().getIdentifier(jSONObject.optString("snd"), "raw", context.getPackageName());
            this.sound = identifier != 0 ? Uri.parse("android.resource://" + context.getPackageName() + "/" + identifier) : RingtoneManager.getDefaultUri(2);
        }
        this.priority = jSONObject.optInt("prt", 0);
        if (!jSONObject.isNull("chId")) {
            this.channelId = jSONObject.optString("chId");
        }
        if (jSONObject.isNull("identifier")) {
            throw new JSONException("Notification ID is Null");
        }
        this.variationId = jSONObject.getString("identifier");
        this.type = str;
        this.customData = new Bundle();
        JSONArray optJSONArray = jSONObject.isNull("custom") ? null : jSONObject.optJSONArray("custom");
        if (optJSONArray != null) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                try {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                    this.customData.putString(jSONObject2.getString("key"), jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                } catch (JSONException unused) {
                }
            }
        }
        this.amplified = jSONObject.optBoolean("amplified");
    }

    public String getChannelId() {
        return this.channelId;
    }

    public String getContentSummary() {
        return this.summary;
    }

    public String getContentText() {
        return this.message;
    }

    public Bundle getCustomData() {
        return this.customData;
    }

    public String getExperimentId() {
        return this.experimentId;
    }

    public int getLedColor() {
        return this.ledColor;
    }

    public String getNotificationType() {
        return this.type;
    }

    public int getPriority() {
        return this.priority;
    }

    public JSONObject getPushPayloadJSON() {
        return this.jsonObject;
    }

    public Uri getSound() {
        return this.sound;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVariationId() {
        return this.variationId;
    }

    public boolean getVibrateFlag() {
        return this.vibrate;
    }

    public boolean isAmplified() {
        return this.amplified;
    }

    public void setChannelId(String str) {
        this.channelId = str;
    }

    public void setContentSummary(String str) {
        this.summary = str;
    }

    public void setContentText(String str) {
        this.message = str;
    }

    @Deprecated
    public void setCustomData(Bundle bundle) {
        this.customData = bundle;
    }

    public void setLedLight(int i10) {
        this.ledColor = i10;
    }

    @Deprecated
    public void setPriority(int i10) {
        this.priority = i10;
    }

    public void setShouldRender(boolean z10) {
        this.render = z10;
    }

    @Deprecated
    public void setSound(Uri uri) {
        this.sound = uri;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Deprecated
    public void setVibrateFlag(boolean z10) {
        this.vibrate = z10;
    }

    public boolean shouldRender() {
        return this.render;
    }
}
