package ls;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c1 extends a0 {
    public static final Parcelable.Creator<c1> CREATOR = new zq.c(12);

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f25144l;

    /* renamed from: m, reason: collision with root package name */
    public final int f25145m;

    /* renamed from: n, reason: collision with root package name */
    public final String f25146n;

    /* renamed from: o, reason: collision with root package name */
    public final int f25147o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f25148p;

    public c1(Parcel parcel) {
        super(parcel);
        this.f25144l = parcel.createTypedArrayList(q.CREATOR);
        this.f25145m = parcel.readInt();
        this.f25146n = parcel.readString();
        this.f25147o = parcel.readInt();
        this.f25148p = parcel.readByte() != 0;
    }

    @Override // ls.a0
    public final z b() {
        return z.f25368b;
    }

    @Override // ls.a0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeTypedList(this.f25144l);
        parcel.writeInt(this.f25145m);
        parcel.writeString(this.f25146n);
        parcel.writeInt(this.f25147o);
        parcel.writeByte(this.f25148p ? (byte) 1 : (byte) 0);
    }

    public c1(JSONObject jSONObject) {
        super(jSONObject);
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("buttons");
            this.f25144l = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f25144l.add(new q((JSONObject) jSONArray.get(i10)));
            }
            this.f25145m = jSONObject.getInt("close_color");
            this.f25146n = yk.g.N("title", jSONObject);
            this.f25147o = jSONObject.optInt("title_color");
            this.f25148p = this.f25111b.getBoolean("image_fade");
        } catch (JSONException e10) {
            throw new Exception("Notification JSON was unexpected or bad", e10);
        }
    }
}
