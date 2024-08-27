package ls;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.applinks.AppLinkData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class a0 implements Parcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f25109k = Pattern.compile("(\\.[^./]+$)");

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f25110a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f25111b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25112c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25113d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25114e;

    /* renamed from: f, reason: collision with root package name */
    public final String f25115f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25116g;

    /* renamed from: h, reason: collision with root package name */
    public final String f25117h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f25118i;

    /* renamed from: j, reason: collision with root package name */
    public Bitmap f25119j;

    public a0(Parcel parcel) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
        }
        try {
            jSONObject3 = new JSONObject(parcel.readString());
        } catch (JSONException unused2) {
            jSONObject2 = jSONObject;
            el.l.M("MixpanelAPI.InAppNotif", "Error reading JSON when creating InAppNotification from Parcel");
            jSONObject = jSONObject2;
            this.f25110a = jSONObject;
            this.f25111b = jSONObject3;
            this.f25112c = parcel.readInt();
            this.f25113d = parcel.readInt();
            this.f25114e = parcel.readInt();
            this.f25115f = parcel.readString();
            this.f25116g = parcel.readInt();
            this.f25117h = parcel.readString();
            this.f25119j = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
            ArrayList arrayList = new ArrayList();
            this.f25118i = arrayList;
            parcel.readList(arrayList, null);
        }
        this.f25110a = jSONObject;
        this.f25111b = jSONObject3;
        this.f25112c = parcel.readInt();
        this.f25113d = parcel.readInt();
        this.f25114e = parcel.readInt();
        this.f25115f = parcel.readString();
        this.f25116g = parcel.readInt();
        this.f25117h = parcel.readString();
        this.f25119j = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.f25118i = arrayList2;
        parcel.readList(arrayList2, null);
    }

    public static String d(String str, String str2) {
        Matcher matcher = f25109k.matcher(str);
        if (matcher.find()) {
            return matcher.replaceFirst(str2.concat("$1"));
        }
        return str;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("campaign_id", this.f25112c);
            jSONObject.put("message_id", this.f25113d);
            jSONObject.put("message_type", "inapp");
            jSONObject.put("message_subtype", b().toString());
        } catch (JSONException e10) {
            el.l.N("MixpanelAPI.InAppNotif", "Impossible JSON Exception", e10);
        }
        return jSONObject;
    }

    public abstract z b();

    public final boolean c(a aVar) {
        ArrayList arrayList = this.f25118i;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o oVar = (o) it.next();
                String str = oVar.f25273a;
                if (str.equals("$any_event") || aVar.f25106c.equals(str)) {
                    r0 r0Var = oVar.f25275c;
                    if (r0Var != null) {
                        try {
                            if (r0.f(r0.c((JSONObject) r0Var.f25297b, aVar.f25133b)).booleanValue()) {
                                return true;
                            }
                        } catch (Exception e10) {
                            el.l.N("MixpanelAPI.DisplayTrigger", "Error evaluating selector", e10);
                        }
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f25110a.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25110a.toString());
        parcel.writeString(this.f25111b.toString());
        parcel.writeInt(this.f25112c);
        parcel.writeInt(this.f25113d);
        parcel.writeInt(this.f25114e);
        parcel.writeString(this.f25115f);
        parcel.writeInt(this.f25116g);
        parcel.writeString(this.f25117h);
        parcel.writeParcelable(this.f25119j, i10);
        parcel.writeList(this.f25118i);
    }

    public a0(JSONObject jSONObject) {
        this.f25118i = new ArrayList();
        try {
            this.f25110a = jSONObject;
            this.f25111b = jSONObject.getJSONObject(AppLinkData.ARGUMENTS_EXTRAS_KEY);
            this.f25112c = jSONObject.getInt("id");
            this.f25113d = jSONObject.getInt("message_id");
            this.f25114e = jSONObject.getInt("bg_color");
            this.f25115f = yk.g.N("body", jSONObject);
            this.f25116g = jSONObject.optInt("body_color");
            this.f25117h = jSONObject.getString("image_url");
            this.f25119j = Bitmap.createBitmap(500, 500, Bitmap.Config.ARGB_8888);
            JSONArray optJSONArray = jSONObject.optJSONArray("display_triggers");
            int i10 = 0;
            while (optJSONArray != null) {
                if (i10 >= optJSONArray.length()) {
                    return;
                }
                this.f25118i.add(new o(optJSONArray.getJSONObject(i10)));
                i10++;
            }
        } catch (JSONException e10) {
            throw new Exception("Notification JSON was unexpected or bad", e10);
        }
    }
}
