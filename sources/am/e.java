package am;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import zi.j;

/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new j(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f764a;

    /* renamed from: b, reason: collision with root package name */
    public final String f765b;

    /* renamed from: c, reason: collision with root package name */
    public final String f766c;

    /* renamed from: d, reason: collision with root package name */
    public final String f767d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f768e;

    public e(String str, String str2, String str3, String str4, Uri uri) {
        this.f764a = str;
        this.f765b = str2;
        this.f766c = str3;
        this.f767d = str4;
        this.f768e = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f764a.equals(eVar.f764a)) {
            String str = eVar.f765b;
            String str2 = this.f765b;
            if (str2 != null ? str2.equals(str) : str == null) {
                String str3 = eVar.f766c;
                String str4 = this.f766c;
                if (str4 != null ? str4.equals(str3) : str3 == null) {
                    String str5 = eVar.f767d;
                    String str6 = this.f767d;
                    if (str6 != null ? str6.equals(str5) : str5 == null) {
                        Uri uri = eVar.f768e;
                        Uri uri2 = this.f768e;
                        if (uri2 == null) {
                            if (uri == null) {
                                return true;
                            }
                        } else if (uri2.equals(uri)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f764a.hashCode() * 31;
        int i10 = 0;
        String str = this.f765b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode4 + hashCode) * 31;
        String str2 = this.f766c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str3 = this.f767d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        Uri uri = this.f768e;
        if (uri != null) {
            i10 = uri.hashCode();
        }
        return i13 + i10;
    }

    public final String toString() {
        return "User{mProviderId='" + this.f764a + "', mEmail='" + this.f765b + "', mPhoneNumber='" + this.f766c + "', mName='" + this.f767d + "', mPhotoUri=" + this.f768e + UrlTreeKt.componentParamSuffixChar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f764a);
        parcel.writeString(this.f765b);
        parcel.writeString(this.f766c);
        parcel.writeString(this.f767d);
        parcel.writeParcelable(this.f768e, i10);
    }
}
