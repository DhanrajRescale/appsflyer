package xk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final String f40390a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40391b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40392c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40393d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40394e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f40395f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f40396g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f40389h = h0.class.getSimpleName();

    @NotNull
    public static final Parcelable.Creator<h0> CREATOR = new zi.j(8);

    public h0(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        nl.n0.L(str, "id");
        this.f40390a = str;
        this.f40391b = str2;
        this.f40392c = str3;
        this.f40393d = str4;
        this.f40394e = str5;
        this.f40395f = uri;
        this.f40396g = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        String str5 = this.f40390a;
        if (((str5 == null && ((h0) obj).f40390a == null) || Intrinsics.a(str5, ((h0) obj).f40390a)) && ((((str = this.f40391b) == null && ((h0) obj).f40391b == null) || Intrinsics.a(str, ((h0) obj).f40391b)) && ((((str2 = this.f40392c) == null && ((h0) obj).f40392c == null) || Intrinsics.a(str2, ((h0) obj).f40392c)) && ((((str3 = this.f40393d) == null && ((h0) obj).f40393d == null) || Intrinsics.a(str3, ((h0) obj).f40393d)) && ((((str4 = this.f40394e) == null && ((h0) obj).f40394e == null) || Intrinsics.a(str4, ((h0) obj).f40394e)) && ((((uri = this.f40395f) == null && ((h0) obj).f40395f == null) || Intrinsics.a(uri, ((h0) obj).f40395f)) && (((uri2 = this.f40396g) == null && ((h0) obj).f40396g == null) || Intrinsics.a(uri2, ((h0) obj).f40396g)))))))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f40390a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i11 = 527 + i10;
        String str2 = this.f40391b;
        if (str2 != null) {
            i11 = (i11 * 31) + str2.hashCode();
        }
        String str3 = this.f40392c;
        if (str3 != null) {
            i11 = (i11 * 31) + str3.hashCode();
        }
        String str4 = this.f40393d;
        if (str4 != null) {
            i11 = (i11 * 31) + str4.hashCode();
        }
        String str5 = this.f40394e;
        if (str5 != null) {
            i11 = (i11 * 31) + str5.hashCode();
        }
        Uri uri = this.f40395f;
        if (uri != null) {
            i11 = (i11 * 31) + uri.hashCode();
        }
        Uri uri2 = this.f40396g;
        if (uri2 != null) {
            return (i11 * 31) + uri2.hashCode();
        }
        return i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        String uri;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f40390a);
        dest.writeString(this.f40391b);
        dest.writeString(this.f40392c);
        dest.writeString(this.f40393d);
        dest.writeString(this.f40394e);
        String str = null;
        Uri uri2 = this.f40395f;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        dest.writeString(uri);
        Uri uri3 = this.f40396g;
        if (uri3 != null) {
            str = uri3.toString();
        }
        dest.writeString(str);
    }

    public h0(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f40390a = jsonObject.optString("id", null);
        this.f40391b = jsonObject.optString("first_name", null);
        this.f40392c = jsonObject.optString("middle_name", null);
        this.f40393d = jsonObject.optString("last_name", null);
        this.f40394e = jsonObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME, null);
        String optString = jsonObject.optString("link_uri", null);
        this.f40395f = optString == null ? null : Uri.parse(optString);
        String optString2 = jsonObject.optString("picture_uri", null);
        this.f40396g = optString2 != null ? Uri.parse(optString2) : null;
    }

    public h0(Parcel parcel) {
        this.f40390a = parcel.readString();
        this.f40391b = parcel.readString();
        this.f40392c = parcel.readString();
        this.f40393d = parcel.readString();
        this.f40394e = parcel.readString();
        String readString = parcel.readString();
        this.f40395f = readString == null ? null : Uri.parse(readString);
        String readString2 = parcel.readString();
        this.f40396g = readString2 != null ? Uri.parse(readString2) : null;
    }
}
