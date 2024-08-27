package ls;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new zq.c(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f25273a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f25274b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f25275c;

    public o(JSONObject jSONObject) {
        try {
            this.f25273a = jSONObject.getString("event");
            JSONObject optJSONObject = jSONObject.optJSONObject("selector");
            this.f25274b = optJSONObject;
            this.f25275c = optJSONObject != null ? new r0(optJSONObject) : null;
        } catch (JSONException e10) {
            throw new Exception("Event triggered notification JSON was unexpected or bad", e10);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25273a);
        parcel.writeString(this.f25274b.toString());
    }

    public o(Parcel parcel) {
        JSONObject jSONObject;
        this.f25273a = parcel.readString();
        try {
            jSONObject = new JSONObject(parcel.readString());
        } catch (JSONException e10) {
            el.l.N("MixpanelAPI.DisplayTrigger", "Error parsing selector from display_trigger", e10);
            jSONObject = null;
        }
        this.f25274b = jSONObject;
        this.f25275c = jSONObject != null ? new r0(jSONObject) : null;
    }
}
