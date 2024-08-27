package ls;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h0 extends a0 {
    public static final Parcelable.Creator<h0> CREATOR = new zq.c(11);

    /* renamed from: l, reason: collision with root package name */
    public final String f25220l;

    /* renamed from: m, reason: collision with root package name */
    public final int f25221m;

    /* renamed from: n, reason: collision with root package name */
    public final int f25222n;

    public h0(Parcel parcel) {
        super(parcel);
        this.f25220l = parcel.readString();
        this.f25221m = parcel.readInt();
        this.f25222n = parcel.readInt();
    }

    @Override // ls.a0
    public final z b() {
        return z.f25367a;
    }

    @Override // ls.a0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f25220l);
        parcel.writeInt(this.f25221m);
        parcel.writeInt(this.f25222n);
    }

    public h0(JSONObject jSONObject) {
        super(jSONObject);
        try {
            this.f25220l = yk.g.N("cta_url", jSONObject);
            this.f25221m = jSONObject.getInt("image_tint_color");
            this.f25222n = jSONObject.getInt("border_color");
        } catch (JSONException e10) {
            throw new Exception("Notification JSON was unexpected or bad", e10);
        }
    }
}
