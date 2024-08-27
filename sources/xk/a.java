package xk;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Date f40312a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f40313b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f40314c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f40315d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40316e;

    /* renamed from: f, reason: collision with root package name */
    public final h f40317f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f40318g;

    /* renamed from: h, reason: collision with root package name */
    public final String f40319h;

    /* renamed from: i, reason: collision with root package name */
    public final String f40320i;

    /* renamed from: j, reason: collision with root package name */
    public final Date f40321j;

    /* renamed from: k, reason: collision with root package name */
    public final String f40322k;

    /* renamed from: l, reason: collision with root package name */
    public static final Date f40309l = new Date(Long.MAX_VALUE);

    /* renamed from: m, reason: collision with root package name */
    public static final Date f40310m = new Date();

    /* renamed from: n, reason: collision with root package name */
    public static final h f40311n = h.FACEBOOK_APPLICATION_WEB;

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new zi.j(2);

    public /* synthetic */ a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, h hVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, hVar, date, date2, date3, "facebook");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f40316e);
        jSONObject.put("expires_at", this.f40312a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f40313b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f40314c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f40315d));
        jSONObject.put("last_refresh", this.f40318g.getTime());
        jSONObject.put("source", this.f40317f.name());
        jSONObject.put("application_id", this.f40319h);
        jSONObject.put("user_id", this.f40320i);
        jSONObject.put("data_access_expiration_time", this.f40321j.getTime());
        String str = this.f40322k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.a(this.f40312a, aVar.f40312a) && Intrinsics.a(this.f40313b, aVar.f40313b) && Intrinsics.a(this.f40314c, aVar.f40314c) && Intrinsics.a(this.f40315d, aVar.f40315d) && Intrinsics.a(this.f40316e, aVar.f40316e) && this.f40317f == aVar.f40317f && Intrinsics.a(this.f40318g, aVar.f40318g) && Intrinsics.a(this.f40319h, aVar.f40319h) && Intrinsics.a(this.f40320i, aVar.f40320i) && Intrinsics.a(this.f40321j, aVar.f40321j)) {
            String str = this.f40322k;
            String str2 = aVar.f40322k;
            if (str == null) {
                if (str2 == null) {
                    return true;
                }
            } else if (Intrinsics.a(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f40321j.hashCode() + jr.h.g(this.f40320i, jr.h.g(this.f40319h, (this.f40318g.hashCode() + ((this.f40317f.hashCode() + jr.h.g(this.f40316e, (this.f40315d.hashCode() + ((this.f40314c.hashCode() + ((this.f40313b.hashCode() + ((this.f40312a.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31), 31)) * 31;
        String str = this.f40322k;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("{AccessToken token:");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.isLoggingBehaviorEnabled(g0.f40371b)) {
            str = this.f40316e;
        } else {
            str = "ACCESS_TOKEN_REMOVED";
        }
        sb2.append(str);
        sb2.append(" permissions:[");
        sb2.append(TextUtils.join(", ", this.f40313b));
        sb2.append("]}");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
        return sb3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f40312a.getTime());
        dest.writeStringList(new ArrayList(this.f40313b));
        dest.writeStringList(new ArrayList(this.f40314c));
        dest.writeStringList(new ArrayList(this.f40315d));
        dest.writeString(this.f40316e);
        dest.writeString(this.f40317f.name());
        dest.writeLong(this.f40318g.getTime());
        dest.writeString(this.f40319h);
        dest.writeString(this.f40320i);
        dest.writeLong(this.f40321j.getTime());
        dest.writeString(this.f40322k);
    }

    public a(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, h hVar, Date date, Date date2, Date date3, String str) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        nl.n0.I(accessToken, "accessToken");
        nl.n0.I(applicationId, "applicationId");
        nl.n0.I(userId, "userId");
        Date date4 = f40309l;
        this.f40312a = date == null ? date4 : date;
        Set unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(if (permissions != null) HashSet(permissions) else HashSet())");
        this.f40313b = unmodifiableSet;
        Set unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(\n            if (declinedPermissions != null) HashSet(declinedPermissions) else HashSet())");
        this.f40314c = unmodifiableSet2;
        Set unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(\n            if (expiredPermissions != null) HashSet(expiredPermissions) else HashSet())");
        this.f40315d = unmodifiableSet3;
        this.f40316e = accessToken;
        hVar = hVar == null ? f40311n : hVar;
        if (str != null && str.equals(FacebookSdk.INSTAGRAM)) {
            int ordinal = hVar.ordinal();
            if (ordinal == 1) {
                hVar = h.INSTAGRAM_APPLICATION_WEB;
            } else if (ordinal == 4) {
                hVar = h.INSTAGRAM_WEB_VIEW;
            } else if (ordinal == 5) {
                hVar = h.INSTAGRAM_CUSTOM_CHROME_TAB;
            }
        }
        this.f40317f = hVar;
        this.f40318g = date2 == null ? f40310m : date2;
        this.f40319h = applicationId;
        this.f40320i = userId;
        this.f40321j = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.f40322k = str == null ? "facebook" : str;
    }

    public a(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f40312a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f40313b = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f40314c = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f40315d = unmodifiableSet3;
        String readString = parcel.readString();
        nl.n0.L(readString, "token");
        this.f40316e = readString;
        String readString2 = parcel.readString();
        this.f40317f = readString2 != null ? h.valueOf(readString2) : f40311n;
        this.f40318g = new Date(parcel.readLong());
        String readString3 = parcel.readString();
        nl.n0.L(readString3, "applicationId");
        this.f40319h = readString3;
        String readString4 = parcel.readString();
        nl.n0.L(readString4, "userId");
        this.f40320i = readString4;
        this.f40321j = new Date(parcel.readLong());
        this.f40322k = parcel.readString();
    }
}
