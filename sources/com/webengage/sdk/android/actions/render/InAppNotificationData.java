package com.webengage.sdk.android.actions.render;

import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class InAppNotificationData implements Parcelable {
    public static final Parcelable.Creator<InAppNotificationData> CREATOR = new a();
    private JSONObject data;
    private String experimentId;
    private InAppType inAppType;
    private String layoutId;
    private boolean render;
    private String variationId;

    /* loaded from: classes2.dex */
    public enum InAppType {
        BLOCKING,
        HEADER,
        FOOTER,
        MODAL
    }

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<InAppNotificationData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InAppNotificationData createFromParcel(Parcel parcel) {
            return new InAppNotificationData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public InAppNotificationData[] newArray(int i10) {
            return new InAppNotificationData[i10];
        }
    }

    private InAppNotificationData(Parcel parcel) {
        boolean z10 = true;
        this.render = true;
        this.inAppType = null;
        try {
            this.data = new JSONObject(parcel.readString());
            this.experimentId = parcel.readString();
            this.layoutId = parcel.readString();
            this.variationId = parcel.readString();
            if (parcel.readByte() == 0) {
                z10 = false;
            }
            this.render = z10;
            this.inAppType = (InAppType) parcel.readSerializable();
        } catch (Exception unused) {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.experimentId.equals(((InAppNotificationData) obj).getExperimentId());
    }

    public JSONObject getData() {
        return this.data;
    }

    public String getExperimentId() {
        return this.experimentId;
    }

    public InAppType getInAppType() {
        return this.inAppType;
    }

    public String getLayoutId() {
        return this.layoutId;
    }

    public String getVariationId() {
        return this.variationId;
    }

    public int hashCode() {
        return this.experimentId.hashCode();
    }

    public void setNotificationData(JSONObject jSONObject) {
        this.data = jSONObject;
    }

    public void setShouldRender(boolean z10) {
        this.render = z10;
    }

    public boolean shouldRender() {
        return this.render;
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
        sb2.append(" Data : " + getData().toString() + property);
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.data.toString());
        parcel.writeString(this.experimentId);
        parcel.writeString(this.layoutId);
        parcel.writeString(this.variationId);
        parcel.writeByte(this.render ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.inAppType);
    }

    public /* synthetic */ InAppNotificationData(Parcel parcel, a aVar) {
        this(parcel);
    }

    public InAppNotificationData(String str, String str2, String str3, String str4) {
        this.render = true;
        this.inAppType = null;
        if (str == null || str4 == null || str2 == null || str3 == null) {
            throw new IllegalArgumentException(v.e.j(v.e.l("InApp:experimentId: ", str, " data: ", str4, " variationId: "), str2, " layoutId: ", str3));
        }
        JSONObject jSONObject = new JSONObject(str4);
        if (jSONObject.isNull("status")) {
            throw new IllegalArgumentException("status object not found in notification response");
        }
        if (!jSONObject.optJSONObject("status").optBoolean("success", false)) {
            throw new IllegalArgumentException("success value found as false in notification response");
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("templateData");
        this.data = optJSONObject;
        this.experimentId = str;
        this.variationId = str2;
        this.layoutId = str3;
        JSONObject jSONObject2 = optJSONObject.getJSONObject("layoutAttributes");
        InAppType valueOf = jSONObject2.isNull("type") ? null : InAppType.valueOf(jSONObject2.optString("type"));
        this.inAppType = valueOf;
        if (valueOf == null) {
            throw new JSONException("Notification Type is NUll");
        }
    }
}
