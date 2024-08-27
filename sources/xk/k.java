package xk;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<k> CREATOR = new zi.j(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f40409a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40410b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40411c;

    /* renamed from: d, reason: collision with root package name */
    public final String f40412d;

    /* renamed from: e, reason: collision with root package name */
    public final long f40413e;

    /* renamed from: f, reason: collision with root package name */
    public final long f40414f;

    /* renamed from: g, reason: collision with root package name */
    public final String f40415g;

    /* renamed from: h, reason: collision with root package name */
    public final String f40416h;

    /* renamed from: i, reason: collision with root package name */
    public final String f40417i;

    /* renamed from: j, reason: collision with root package name */
    public final String f40418j;

    /* renamed from: k, reason: collision with root package name */
    public final String f40419k;

    /* renamed from: l, reason: collision with root package name */
    public final String f40420l;

    /* renamed from: m, reason: collision with root package name */
    public final String f40421m;

    /* renamed from: n, reason: collision with root package name */
    public final Set f40422n;

    /* renamed from: o, reason: collision with root package name */
    public final String f40423o;

    /* renamed from: p, reason: collision with root package name */
    public final Map f40424p;

    /* renamed from: q, reason: collision with root package name */
    public final Map f40425q;

    /* renamed from: r, reason: collision with root package name */
    public final Map f40426r;

    /* renamed from: s, reason: collision with root package name */
    public final String f40427s;

    /* renamed from: t, reason: collision with root package name */
    public final String f40428t;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(new java.net.URL(r1).getHost(), "www.facebook.com") != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.k.<init>(java.lang.String, java.lang.String):void");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f40409a);
        jSONObject.put("iss", this.f40410b);
        jSONObject.put("aud", this.f40411c);
        jSONObject.put("nonce", this.f40412d);
        jSONObject.put("exp", this.f40413e);
        jSONObject.put("iat", this.f40414f);
        String str = this.f40415g;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f40416h;
        if (str2 != null) {
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        }
        String str3 = this.f40417i;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f40418j;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f40419k;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f40420l;
        if (str6 != null) {
            jSONObject.put(Scopes.EMAIL, str6);
        }
        String str7 = this.f40421m;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        Set set = this.f40422n;
        if (set != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) set));
        }
        String str8 = this.f40423o;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        Map map = this.f40424p;
        if (map != null) {
            jSONObject.put("user_age_range", new JSONObject(map));
        }
        Map map2 = this.f40425q;
        if (map2 != null) {
            jSONObject.put("user_hometown", new JSONObject(map2));
        }
        Map map3 = this.f40426r;
        if (map3 != null) {
            jSONObject.put("user_location", new JSONObject(map3));
        }
        String str9 = this.f40427s;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.f40428t;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (Intrinsics.a(this.f40409a, kVar.f40409a) && Intrinsics.a(this.f40410b, kVar.f40410b) && Intrinsics.a(this.f40411c, kVar.f40411c) && Intrinsics.a(this.f40412d, kVar.f40412d) && this.f40413e == kVar.f40413e && this.f40414f == kVar.f40414f && Intrinsics.a(this.f40415g, kVar.f40415g) && Intrinsics.a(this.f40416h, kVar.f40416h) && Intrinsics.a(this.f40417i, kVar.f40417i) && Intrinsics.a(this.f40418j, kVar.f40418j) && Intrinsics.a(this.f40419k, kVar.f40419k) && Intrinsics.a(this.f40420l, kVar.f40420l) && Intrinsics.a(this.f40421m, kVar.f40421m) && Intrinsics.a(this.f40422n, kVar.f40422n) && Intrinsics.a(this.f40423o, kVar.f40423o) && Intrinsics.a(this.f40424p, kVar.f40424p) && Intrinsics.a(this.f40425q, kVar.f40425q) && Intrinsics.a(this.f40426r, kVar.f40426r) && Intrinsics.a(this.f40427s, kVar.f40427s) && Intrinsics.a(this.f40428t, kVar.f40428t)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int g10 = jr.h.g(this.f40415g, v.e.c(this.f40414f, v.e.c(this.f40413e, jr.h.g(this.f40412d, jr.h.g(this.f40411c, jr.h.g(this.f40410b, jr.h.g(this.f40409a, 527, 31), 31), 31), 31), 31), 31), 31);
        int i10 = 0;
        String str = this.f40416h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (g10 + hashCode) * 31;
        String str2 = this.f40417i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.f40418j;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str4 = this.f40419k;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str5 = this.f40420l;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str6 = this.f40421m;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Set set = this.f40422n;
        if (set == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = set.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        String str7 = this.f40423o;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        Map map = this.f40424p;
        if (map == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = map.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        Map map2 = this.f40425q;
        if (map2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = map2.hashCode();
        }
        int i20 = (i19 + hashCode10) * 31;
        Map map3 = this.f40426r;
        if (map3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = map3.hashCode();
        }
        int i21 = (i20 + hashCode11) * 31;
        String str8 = this.f40427s;
        if (str8 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str8.hashCode();
        }
        int i22 = (i21 + hashCode12) * 31;
        String str9 = this.f40428t;
        if (str9 != null) {
            i10 = str9.hashCode();
        }
        return i22 + i10;
    }

    public final String toString() {
        String jSONObject = a().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f40409a);
        dest.writeString(this.f40410b);
        dest.writeString(this.f40411c);
        dest.writeString(this.f40412d);
        dest.writeLong(this.f40413e);
        dest.writeLong(this.f40414f);
        dest.writeString(this.f40415g);
        dest.writeString(this.f40416h);
        dest.writeString(this.f40417i);
        dest.writeString(this.f40418j);
        dest.writeString(this.f40419k);
        dest.writeString(this.f40420l);
        dest.writeString(this.f40421m);
        Set set = this.f40422n;
        if (set == null) {
            dest.writeStringList(null);
        } else {
            dest.writeStringList(new ArrayList(set));
        }
        dest.writeString(this.f40423o);
        dest.writeMap(this.f40424p);
        dest.writeMap(this.f40425q);
        dest.writeMap(this.f40426r);
        dest.writeString(this.f40427s);
        dest.writeString(this.f40428t);
    }

    public k(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        nl.n0.L(readString, "jti");
        this.f40409a = readString;
        String readString2 = parcel.readString();
        nl.n0.L(readString2, "iss");
        this.f40410b = readString2;
        String readString3 = parcel.readString();
        nl.n0.L(readString3, "aud");
        this.f40411c = readString3;
        String readString4 = parcel.readString();
        nl.n0.L(readString4, "nonce");
        this.f40412d = readString4;
        this.f40413e = parcel.readLong();
        this.f40414f = parcel.readLong();
        String readString5 = parcel.readString();
        nl.n0.L(readString5, "sub");
        this.f40415g = readString5;
        this.f40416h = parcel.readString();
        this.f40417i = parcel.readString();
        this.f40418j = parcel.readString();
        this.f40419k = parcel.readString();
        this.f40420l = parcel.readString();
        this.f40421m = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        this.f40422n = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.f40423o = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(iu.i.f20552a.getClass().getClassLoader());
        readHashMap = readHashMap instanceof HashMap ? readHashMap : null;
        this.f40424p = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        HashMap readHashMap2 = parcel.readHashMap(iu.c0.f20544a.getClass().getClassLoader());
        readHashMap2 = readHashMap2 instanceof HashMap ? readHashMap2 : null;
        this.f40425q = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(iu.c0.class.getClassLoader());
        readHashMap3 = readHashMap3 instanceof HashMap ? readHashMap3 : null;
        this.f40426r = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : null;
        this.f40427s = parcel.readString();
        this.f40428t = parcel.readString();
    }
}
