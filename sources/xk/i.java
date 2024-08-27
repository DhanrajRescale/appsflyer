package xk;

import android.os.Parcel;
import android.os.Parcelable;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<i> CREATOR = new zi.j(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f40397a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40398b;

    /* renamed from: c, reason: collision with root package name */
    public final l f40399c;

    /* renamed from: d, reason: collision with root package name */
    public final k f40400d;

    /* renamed from: e, reason: collision with root package name */
    public final String f40401e;

    public i(String token, String expectedNonce) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expectedNonce, "expectedNonce");
        nl.n0.I(token, "token");
        nl.n0.I(expectedNonce, "expectedNonce");
        List P = kotlin.text.w.P(token, new String[]{"."}, 0, 6);
        if (P.size() == 3) {
            String str = (String) P.get(0);
            String str2 = (String) P.get(1);
            String str3 = (String) P.get(2);
            this.f40397a = token;
            this.f40398b = expectedNonce;
            l lVar = new l(str);
            this.f40399c = lVar;
            this.f40400d = new k(str2, expectedNonce);
            try {
                String B = vl.b.B(lVar.f40431c);
                if (B != null) {
                    if (vl.b.q0(vl.b.A(B), str + '.' + str2, str3)) {
                        this.f40401e = str3;
                        return;
                    }
                }
            } catch (IOException | InvalidKeySpecException unused) {
            }
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        throw new IllegalArgumentException("Invalid IdToken string".toString());
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f40397a);
        jSONObject.put("expected_nonce", this.f40398b);
        l lVar = this.f40399c;
        lVar.getClass();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("alg", lVar.f40429a);
        jSONObject2.put("typ", lVar.f40430b);
        jSONObject2.put("kid", lVar.f40431c);
        jSONObject.put("header", jSONObject2);
        jSONObject.put("claims", this.f40400d.a());
        jSONObject.put(PaymentConstants.SIGNATURE, this.f40401e);
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Intrinsics.a(this.f40397a, iVar.f40397a) && Intrinsics.a(this.f40398b, iVar.f40398b) && Intrinsics.a(this.f40399c, iVar.f40399c) && Intrinsics.a(this.f40400d, iVar.f40400d) && Intrinsics.a(this.f40401e, iVar.f40401e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40401e.hashCode() + ((this.f40400d.hashCode() + ((this.f40399c.hashCode() + jr.h.g(this.f40398b, jr.h.g(this.f40397a, 527, 31), 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f40397a);
        dest.writeString(this.f40398b);
        dest.writeParcelable(this.f40399c, i10);
        dest.writeParcelable(this.f40400d, i10);
        dest.writeString(this.f40401e);
    }

    public i(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String readString = parcel.readString();
        nl.n0.L(readString, "token");
        this.f40397a = readString;
        String readString2 = parcel.readString();
        nl.n0.L(readString2, "expectedNonce");
        this.f40398b = readString2;
        Parcelable readParcelable = parcel.readParcelable(l.class.getClassLoader());
        if (readParcelable != null) {
            this.f40399c = (l) readParcelable;
            Parcelable readParcelable2 = parcel.readParcelable(k.class.getClassLoader());
            if (readParcelable2 != null) {
                this.f40400d = (k) readParcelable2;
                String readString3 = parcel.readString();
                nl.n0.L(readString3, PaymentConstants.SIGNATURE);
                this.f40401e = readString3;
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
