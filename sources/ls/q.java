package ls;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new zq.c(10);

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f25288a;

    /* renamed from: b, reason: collision with root package name */
    public String f25289b;

    /* renamed from: c, reason: collision with root package name */
    public int f25290c;

    /* renamed from: d, reason: collision with root package name */
    public int f25291d;

    /* renamed from: e, reason: collision with root package name */
    public int f25292e;

    /* renamed from: f, reason: collision with root package name */
    public String f25293f;

    public q(JSONObject jSONObject) {
        this.f25288a = jSONObject;
        this.f25289b = jSONObject.getString("text");
        this.f25290c = jSONObject.getInt("text_color");
        this.f25291d = jSONObject.getInt("bg_color");
        this.f25292e = jSONObject.getInt("border_color");
        this.f25293f = jSONObject.getString("cta_url");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f25288a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25288a.toString());
        parcel.writeString(this.f25289b);
        parcel.writeInt(this.f25290c);
        parcel.writeInt(this.f25291d);
        parcel.writeInt(this.f25292e);
        parcel.writeString(this.f25293f);
    }
}
