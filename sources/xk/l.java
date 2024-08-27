package xk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class l implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new zi.j(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f40429a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40430b;

    /* renamed from: c, reason: collision with root package name */
    public final String f40431c;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (r4 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "typ"
            java.lang.String r1 = "kid"
            java.lang.String r2 = "alg"
            java.lang.String r3 = "encodedHeaderString"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            r10.<init>()
            nl.n0.I(r11, r3)
            r3 = 0
            byte[] r4 = android.util.Base64.decode(r11, r3)
            java.lang.String r5 = "decodedBytes"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r7 = kotlin.text.Charsets.UTF_8
            r6.<init>(r4, r7)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6b
            r4.<init>(r6)     // Catch: org.json.JSONException -> L6b
            java.lang.String r6 = r4.optString(r2)     // Catch: org.json.JSONException -> L6b
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)     // Catch: org.json.JSONException -> L6b
            int r7 = r6.length()     // Catch: org.json.JSONException -> L6b
            r8 = 1
            if (r7 <= 0) goto L3f
            java.lang.String r7 = "RS256"
            boolean r6 = kotlin.jvm.internal.Intrinsics.a(r6, r7)     // Catch: org.json.JSONException -> L6b
            if (r6 == 0) goto L3f
            r6 = r8
            goto L40
        L3f:
            r6 = r3
        L40:
            java.lang.String r7 = r4.optString(r1)     // Catch: org.json.JSONException -> L6b
            java.lang.String r9 = "jsonObj.optString(\"kid\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)     // Catch: org.json.JSONException -> L6b
            int r7 = r7.length()     // Catch: org.json.JSONException -> L6b
            if (r7 <= 0) goto L51
            r7 = r8
            goto L52
        L51:
            r7 = r3
        L52:
            java.lang.String r4 = r4.optString(r0)     // Catch: org.json.JSONException -> L6b
            java.lang.String r9 = "jsonObj.optString(\"typ\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r9)     // Catch: org.json.JSONException -> L6b
            int r4 = r4.length()     // Catch: org.json.JSONException -> L6b
            if (r4 <= 0) goto L63
            r4 = r8
            goto L64
        L63:
            r4 = r3
        L64:
            if (r6 == 0) goto L6b
            if (r7 == 0) goto L6b
            if (r4 == 0) goto L6b
            goto L6c
        L6b:
            r8 = r3
        L6c:
            if (r8 == 0) goto La3
            byte[] r11 = android.util.Base64.decode(r11, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r5)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = kotlin.text.Charsets.UTF_8
            r3.<init>(r11, r4)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r3)
            java.lang.String r2 = r11.getString(r2)
            java.lang.String r3 = "jsonObj.getString(\"alg\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r10.f40429a = r2
            java.lang.String r0 = r11.getString(r0)
            java.lang.String r2 = "jsonObj.getString(\"typ\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r10.f40430b = r0
            java.lang.String r11 = r11.getString(r1)
            java.lang.String r0 = "jsonObj.getString(\"kid\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r0)
            r10.f40431c = r11
            return
        La3:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid Header"
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.l.<init>(java.lang.String):void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (Intrinsics.a(this.f40429a, lVar.f40429a) && Intrinsics.a(this.f40430b, lVar.f40430b) && Intrinsics.a(this.f40431c, lVar.f40431c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40431c.hashCode() + jr.h.g(this.f40430b, jr.h.g(this.f40429a, 527, 31), 31);
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f40429a);
        jSONObject.put("typ", this.f40430b);
        jSONObject.put("kid", this.f40431c);
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "headerJsonObject.toString()");
        return jSONObject2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f40429a);
        dest.writeString(this.f40430b);
        dest.writeString(this.f40431c);
    }

    public l(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        nl.n0.L(readString, "alg");
        this.f40429a = readString;
        String readString2 = parcel.readString();
        nl.n0.L(readString2, "typ");
        this.f40430b = readString2;
        String readString3 = parcel.readString();
        nl.n0.L(readString3, "kid");
        this.f40431c = readString3;
    }
}
